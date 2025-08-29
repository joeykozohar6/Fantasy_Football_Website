import React from "react";
import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Paper,
  CircularProgress,
} from "@mui/material";
import { Player } from "../types/Player";

interface PlayerListProps {
  players: Player[];
  loading: boolean;
}

// all possible stat columns
const allColumns = [
  { key: "name", label: "Name" },
  { key: "position", label: "Position" },
  { key: "gamesPlayed", label: "Games Played" },
  { key: "fantasyPoints", label: "Fantasy Points" },
  { key: "fantasyPointsPerGame", label: "Points/Game" },
  { key: "percentRostered", label: "% Rostered" },
  //QB stats
  { key: "passingCompletions", label: "Pass Comp" },
  { key: "passingAttempts", label: "Pass Att" },
  { key: "completionPercentage", label: "Comp %" },
  { key: "passingYards", label: "Pass Yards" },
  { key: "passingYardsPerAttempt", label: "Yards/Att" },
  { key: "passingTouchdowns", label: "Pass TDs" },
  { key: "interceptionsThrown", label: "INTs" },
  { key: "sacksTaken", label: "Sacks" },
  //rushing stats
  { key: "rushingAttempts", label: "Rush Att" },
  { key: "rushingYards", label: "Rush Yards" },
  { key: "rushingTouchdowns", label: "Rush TDs" },
  { key: "fumblesLost", label: "Fumbles Lost" },
  { key: "rushingYardsPerAttempt", label: "Rush Y/A" },
  { key: "longestRush", label: "Longest Rush" },
  { key: "rushes20PlusYards", label: "20+ Yd Rushes" },
  //receiving stats
  { key: "receptions", label: "Receptions" },
  { key: "targets", label: "Targets" },
  { key: "receivingYards", label: "Rec Yards" },
  { key: "yardsPerReception", label: "Yards/Rec" },
  { key: "receivingTouchdowns", label: "Rec TDs" },
  { key: "longestReception", label: "Longest Rec" },
  { key: "receptions20PlusYards", label: "20+ Yd Recs" },
  //kicker stats
  { key: "fieldGoalsMade", label: "FG Made" },
  { key: "fieldGoalsAttempted", label: "FG Att" },
  { key: "fieldGoalPercentage", label: "FG %" },
  { key: "longestFieldGoal", label: "Longest FG" },
  { key: "oneToNineteenYards", label: "FG 1-19" },
  { key: "twentyToTwentyNineYards", label: "FG 20-29" },
  { key: "thirtyToThirtyNineYards", label: "FG 30-39" },
  { key: "fortyToFortyNineYards", label: "FG 40-49" },
  { key: "longerThanFiftyYards", label: "FG 50+" },
  { key: "extraPointsMade", label: "XP Made" },
  { key: "extraPointsAttempted", label: "XP Att" },
  //DST stats
  { key: "sacks", label: "Sacks" },
  { key: "fumblesRecovered", label: "Fum Rec" },
  { key: "fumblesForced", label: "Fum Forced" },
  { key: "defensiveTouchdowns", label: "Def TDs" },
  { key: "safeties", label: "Safeties" },
  { key: "specialTeamTouchdowns", label: "ST TDs" },
];

const PlayerList: React.FC<PlayerListProps> = ({ players, loading }) => {
  if (loading) {
    return (
      <div
        style={{ display: "flex", justifyContent: "center", padding: "20px" }}
      >
        <CircularProgress />
      </div>
    );
  }

  //only show columns that have at least one non-blank value
  const visibleColumns = allColumns.filter((col) =>
    players.some((player) => {
      const value = (player as any)[col.key];
      return (
        value !== undefined && value !== null && value !== "" && value !== "-"
      );
    })
  );

  return (
    <TableContainer
      component={Paper}
      key={`${players.length}-${players[0]?.position ?? "all"}`}
    >
      <Table size="small">
        <TableHead>
          <TableRow>
            {visibleColumns.map((col) => (
              <TableCell key={col.key}>{col.label}</TableCell>
            ))}
          </TableRow>
        </TableHead>
        <TableBody>
          {players.map((player) => (
            <TableRow
              key={
                player.id ??
                `${player.name}-${player.position}-${
                  (player as any).team ?? ""
                }`
              }
            >
              {visibleColumns.map((col) => (
                <TableCell key={col.key}>
                  {(player as any)[col.key] ?? "-"}
                </TableCell>
              ))}
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
};

export default PlayerList;
