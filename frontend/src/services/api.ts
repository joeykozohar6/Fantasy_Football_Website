import axios from "axios";
import { Player } from "../types/Player";

const API_BASE_URL = "http://localhost:8080";

export const api = {
  getAllPlayers: async (): Promise<Player[]> => {
    const { data } = await axios.get(`${API_BASE_URL}/player`);
    return data;
  },

  getPlayersByPosition: async (position: string): Promise<Player[]> => {
    const pos = encodeURIComponent(position.toLowerCase());
    const { data } = await axios.get(`${API_BASE_URL}/player?position=${pos}`);
    return data;
  },

  searchPlayers: async (name: string): Promise<Player[]> => {
    const q = encodeURIComponent(name);
    const { data } = await axios.get(`${API_BASE_URL}/player?name=${q}`);
    return data;
  },

  addPlayer: async (player: Player): Promise<Player> => {
    const { data } = await axios.post(`${API_BASE_URL}/player`, player);
    return data;
  },

  updatePlayer: async (player: Player): Promise<Player> => {
    const { data } = await axios.put(`${API_BASE_URL}/player`, player);
    return data;
  },

  deletePlayer: async (playerName: string): Promise<void> => {
    await axios.delete(
      `${API_BASE_URL}/player/${encodeURIComponent(playerName)}`
    );
  },
};
