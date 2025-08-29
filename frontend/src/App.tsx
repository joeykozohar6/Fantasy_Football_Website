import React, { useState, useEffect } from "react";
import { Container, Typography, Box } from "@mui/material";
import PlayerList from "./components/PlayerList";
import SearchBar from "./components/SearchBar";
import { Player } from "./types/Player";
import { api } from "./services/api";

function App() {
  const [players, setPlayers] = useState<Player[]>([]);
  const [filteredPlayers, setFilteredPlayers] = useState<Player[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchPlayers = async () => {
      try {
        const data = await api.getAllPlayers();
        setPlayers(data);
        setFilteredPlayers(data);
        setError(null);
      } catch (err) {
        setError("Failed to fetch players");
        console.error("Error fetching players:", err);
      } finally {
        setLoading(false);
      }
    };

    fetchPlayers();
  }, []);

  const handleSearch = async (name: string) => {
    if (name.trim() === "") {
      setFilteredPlayers(players);
      return;
    }
    try {
      const results = await api.searchPlayers(name);
      setFilteredPlayers(results);
    } catch (err) {
      console.error("Error searching players:", err);
    }
  };

  const handlePositionChange = async (position: string) => {
    if (!position) {
      setFilteredPlayers(players);
      return;
    }
    try {
      const results = await api.getPlayersByPosition(position); 
      setFilteredPlayers(results);
    } catch (err) {
      console.error("Error filtering by position:", err);
    }
  };

  return (
    <Container maxWidth="lg">
      <Box sx={{ my: 4 }}>
        <Typography variant="h3" component="h1" gutterBottom align="center">
          Fantasy Football Stats
        </Typography>
        <SearchBar
          onSearch={handleSearch}
          onPositionChange={handlePositionChange}
        />
        {error ? (
          <Typography color="error" align="center">
            {error}
          </Typography>
        ) : (
          <PlayerList players={filteredPlayers} loading={loading} />
        )}
      </Box>
    </Container>
  );
}

export default App;
