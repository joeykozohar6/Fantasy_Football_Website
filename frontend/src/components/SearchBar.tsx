import React, { useState } from 'react';
import { 
    TextField, 
    Select, 
    MenuItem, 
    FormControl, 
    InputLabel,
    Box,
    SelectChangeEvent
} from '@mui/material';
import { Position } from '../types/Player';

interface SearchBarProps {
    onSearch: (name: string) => void;
    onPositionChange: (position: string) => void;
}

const SearchBar: React.FC<SearchBarProps> = ({ onSearch, onPositionChange }) => {
    const [searchTerm, setSearchTerm] = useState('');
    const [position, setPosition] = useState<string>('');

    const positions: Position[] = ['QB', 'RB', 'WR', 'TE', 'K', 'DST'];

    const handleSearchChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        const value = event.target.value;
        setSearchTerm(value);
        onSearch(value);
    };

    const handlePositionChange = (event: SelectChangeEvent) => {
        const value = event.target.value;
        setPosition(value);
        onPositionChange(value);
    };

    return (
        <Box sx={{ display: 'flex', gap: 2, mb: 3, p: 2 }}>
            <TextField
                label="Search Players"
                variant="outlined"
                value={searchTerm}
                onChange={handleSearchChange}
                sx={{ minWidth: 200 }}
            />
            <FormControl sx={{ minWidth: 120 }}>
                <InputLabel>Position</InputLabel>
                <Select
                    value={position}
                    label="Position"
                    onChange={handlePositionChange}
                >
                    <MenuItem value="">All</MenuItem>
                    {positions.map((pos) => (
                        <MenuItem key={pos} value={pos}>
                            {pos}
                        </MenuItem>
                    ))}
                </Select>
            </FormControl>
        </Box>
    );
};

export default SearchBar; 