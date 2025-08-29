export interface Player {
    id?: number;
    name: string;
    position: string;
    gamesPlayed?: number;
    fantasyPoints?: number;
    fantasyPointsPerGame?: number;
    percentRostered?: number;
    
}

export type Position = 'QB' | 'RB' | 'WR' | 'TE' | 'K' | 'DST'; 