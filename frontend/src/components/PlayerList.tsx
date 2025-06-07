import React from 'react';
import { 
    Table, 
    TableBody, 
    TableCell, 
    TableContainer, 
    TableHead, 
    TableRow, 
    Paper,
    Typography,
    CircularProgress
} from '@mui/material';
import { Player } from '../types/Player';

interface PlayerListProps {
    players: Player[];
    loading: boolean;
}

const PlayerList: React.FC<PlayerListProps> = ({ players, loading }) => {
    if (loading) {
        return (
            <div style={{ display: 'flex', justifyContent: 'center', padding: '20px' }}>
                <CircularProgress />
            </div>
        );
    }

    return (
        <TableContainer component={Paper}>
            <Table>
                <TableHead>
                    <TableRow>
                        <TableCell>Name</TableCell>
                        <TableCell>Position</TableCell>
                        <TableCell>Games Played</TableCell>
                        <TableCell>Fantasy Points</TableCell>
                        <TableCell>Points/Game</TableCell>
                        <TableCell>% Rostered</TableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                    {players.map((player) => (
                        <TableRow key={player.id}>
                            <TableCell>{player.name}</TableCell>
                            <TableCell>{player.position}</TableCell>
                            <TableCell>{player.gamesPlayed}</TableCell>
                            <TableCell>{player.fantasyPoints}</TableCell>
                            <TableCell>{player.fantasyPointsPerGame}</TableCell>
                            <TableCell>{player.percentRostered}%</TableCell>
                        </TableRow>
                    ))}
                </TableBody>
            </Table>
        </TableContainer>
    );
};

export default PlayerList; 