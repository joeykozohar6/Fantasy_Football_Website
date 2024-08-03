import requests
import pandas as pd
import time
from bs4 import BeautifulSoup

# Starting URL for QB stats
start_url = "https://www.fantasypros.com/nfl/stats/qb.php?scoring=PPR"

# Fix column names to make data more readable
standard_columns = {
    'Player': 'Player',
    'position': 'Position',
    'PASSING_CMP': 'Passing Completions',
    'PASSING_ATT': 'Passing Attempts',
    'PASSING_PCT': 'Completion Percentage',
    'PASSING_YDS': 'Passing Yards',
    'PASSING_Y/A': 'Passing Yards per Attempt',
    'PASSING_TD': 'Passing Touchdowns',
    'PASSING_INT': 'Interceptions Thrown',
    'PASSING_SACKS': 'Sacks Taken',
    'RUSHING_ATT': 'Rushing Attempts',
    'RUSHING_YDS': 'Rushing Yards',
    'RUSHING_TD': 'Rushing Touchdowns',
    'MISC_FL': 'Fumbles Lost',
    'MISC_FPTS': 'Fantasy Points',
    'MISC_FPTS/G': 'Fantasy Points per Game',
    'MISC_ROST': 'Percent Rostered',
    'RUSHING_Y/A': 'Rushing Yards per Attempt',
    'RUSHING_LG': 'Longest Rush',
    'RUSHING_20+': 'Rushes 20+ Yards',
    'RECEIVING_REC': 'Receptions',
    'RECEIVING_TGT': 'Targets',
    'RECEIVING_YDS': 'Receiving Yards',
    'RECEIVING_Y/R': 'Yards per Reception',
    'RECEIVING_TD': 'Receiving Touchdowns',
    'RECEIVING_LG': 'Longest Reception',
    'RECEIVING_20+': 'Receptions 20+ Yards',
    'FG': 'Field Goals',
    'FGA': 'Field Goals Attempts',
    'PCT': 'Field Goal Percentage',
    'LG': 'Longest Field Goal',
    '1-19': 'Field Goals 1-19 Yards',
    '20-29': 'Field Goals 20-29 Yards',
    '30-39': 'Field Goals 30-39 Yards',
    '40-49': 'Field Goals 40-49 Yards',
    '50+': 'Field Goals 50+ Yards',
    'XPT': 'Extra Points Made',
    'XPA': 'Extra Points Attempted',
    'G': 'Games Played',
    'MISC_G': 'Games Played',
    'FPTS': 'Fantasy Points',
    'FPTS/G': 'Fantasy Points per Game',
    'ROST': 'Percent Rostered',
    'SACK': 'Sacks',
    'INT': 'Interceptions',
    'FR': 'Fumble Recoveries',
    'FF': 'Forced Fumbles',
    'DEF TD': 'Defensive Touchdowns',
    'SFTY': 'Safeties',
    'SPC TD': 'Special Teams Touchdowns'
}

# Function to get all position links from the navbar
def get_position_links(url):
    response = requests.get(url)
    soup = BeautifulSoup(response.content, 'lxml')
    navbar = soup.find('ul', class_='pills pills--horizontal desktop-pills')
    position_links = {a.text.strip(): a.get("href") for a in navbar.find_all('a') if a.get("href") and a.text.strip() in ['QB', 'RB', 'WR', 'TE', 'K', 'DST']}
    return position_links

# Function to clean and standardize the DataFrame
def clean_and_standardize_df(df):
    df.columns = ['_'.join(col).strip() if isinstance(col, tuple) else col for col in df.columns]
    df = df.drop(columns=[col for col in df.columns if 'rank' in col.lower() or 'position' in col.lower()], errors='ignore')
    df.rename(columns={df.columns[0]: 'Player'}, inplace=True)
    df.rename(columns=lambda col: standard_columns.get(col, col), inplace=True)
    return df

# Function to process the DataFrame and clean player names
def process_df(df, position):
    df = clean_and_standardize_df(df)
    if 'Percent Rostered' in df.columns:
        df['Percent Rostered'] = df['Percent Rostered'].str.rstrip('%').astype('float')
    if 'Player' in df.columns:
        df['Player'] = df['Player'].str.replace(r'\s*\(.*?\)\s*', '', regex=True)
    df['Position'] = position
    return df

# Get position links from the start URL
position_links = get_position_links(start_url)
positions = ['QB', 'RB', 'WR', 'TE', 'K', 'DST']

# Create a list to hold all position DataFrames
all_dfs = []

# Loop through each position link and fetch the table data
for position in positions:
    link = f"https://www.fantasypros.com/nfl/stats/{position.lower()}.php"
    tables = pd.read_html(link)
    position_df = process_df(tables[0], position)
    all_dfs.append(position_df)
    time.sleep(5)  # Try to avoid getting blocked

# Combine all DataFrames into one
combined_df = pd.concat(all_dfs, ignore_index=True)

# Make the first six columns the columns that are shared amongst all positions
shared_columns = ['Player', 'Position', 'Games Played', 'Fantasy Points', 'Fantasy Points per Game', 'Percent Rostered']
columns = shared_columns + [col for col in combined_df.columns if col not in shared_columns]
combined_df = combined_df[columns]

# Fill missing values with -1
combined_df.fillna(-1, inplace=True)

# Save the combined DataFrame to a new CSV file
combined_file_path = 'data/combined_stats.csv'
combined_df.to_csv(combined_file_path, index=False)
