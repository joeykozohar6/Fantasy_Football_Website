export interface Player {
    id?: number;
    name: string;
    position: string;
    gamesPlayed?: number;
    fantasyPoints?: number;
    fantasyPointsPerGame?: number;
    percentRostered?: number;
    // Add more fields as needed based on position
}

export type Position = 'QB' | 'RB' | 'WR' | 'TE' | 'K' | 'DST'; 