import axios from 'axios';
import { Player } from '../types/Player';

const API_BASE_URL = 'http://localhost:8080';

export const api = {
    getAllPlayers: async (): Promise<Player[]> => {
        const response = await axios.get(`${API_BASE_URL}/player`);
        return response.data;
    },

    getPlayersByPosition: async (position: string): Promise<Player[]> => {
        const response = await axios.get(`${API_BASE_URL}/player?position=${position}`);
        return response.data;
    },

    searchPlayers: async (name: string): Promise<Player[]> => {
        const response = await axios.get(`${API_BASE_URL}/player?name=${name}`);
        return response.data;
    },

    addPlayer: async (player: Player): Promise<Player> => {
        const response = await axios.post(`${API_BASE_URL}/player`, player);
        return response.data;
    },

    updatePlayer: async (player: Player): Promise<Player> => {
        const response = await axios.put(`${API_BASE_URL}/player`, player);
        return response.data;
    },

    deletePlayer: async (playerName: string): Promise<void> => {
        await axios.delete(`${API_BASE_URL}/player/${playerName}`);
    }
}; 