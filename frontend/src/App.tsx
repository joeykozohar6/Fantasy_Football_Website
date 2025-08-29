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

  const [name, setName] = useState("");
  const [position, setPosition] = useState("");

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

  const applyFilters = async (nextName: string, nextPos: string) => {
    setLoading(true);
    try {
      if (!nextName.trim() && !nextPos) {
        setFilteredPlayers(players); // nothing selected -> show all
      } else {
        const data = await api.getPlayers({
          name: nextName.trim() || undefined,
          position: nextPos || undefined,
        });
        setFilteredPlayers(data); // replace, don't append
      }
    } finally {
      setLoading(false);
    }
  };

  const handleSearch = async (val: string) => {
    setName(val);
    await applyFilters(val, position);
  };

  const handlePositionChange = async (pos: string) => {
    setPosition(pos);
    await applyFilters(name, pos);
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
