

package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 * Class to represent a defense/special team in the databse
 */
@Entity
@DiscriminatorValue("DST")
public class DST extends Player {
    private Integer sacks;

    @Column(name = "fumble_recoveries")
    private Integer fumblesRecovered;

    @Column(name = "forced_fumbles")
    private Integer fumblesForced;
    private Integer defensiveTouchdowns;
    private Integer safeties;

    @Column(name = "special_teams_touchdowns")
    private Integer specialTeamTouchdowns;

    // Default constructor
    public DST() {
    }

    // Parameterized constructor
    public DST(String name, String position, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered, Integer sacks, Integer fumblesRecovered, Integer fumblesForced, Integer defensiveTouchdowns, Integer safeties, Integer specialTeamTouchdowns) {
        super(name, position, gamesPlayed, fantasyPoints, fantasyPointsPerGame, percentRostered);
        this.sacks = sacks;
        this.fumblesRecovered = fumblesRecovered;
        this.fumblesForced = fumblesForced;
        this.defensiveTouchdowns = defensiveTouchdowns;
        this.safeties = safeties;
        this.specialTeamTouchdowns = specialTeamTouchdowns;
    }

    // Getters and Setters
    public Integer getSacks() {
        return sacks;
    }

    public void setSacks(Integer sacks) {
        this.sacks = sacks;
    }

    public Integer getFumblesRecovered() {
        return fumblesRecovered;
    }

    public void setFumblesRecovered(Integer fumblesRecovered) {
        this.fumblesRecovered = fumblesRecovered;
    }

    public Integer getFumblesForced() {
        return fumblesForced;
    }

    public void setFumblesForced(Integer fumblesForced) {
        this.fumblesForced = fumblesForced;
    }

    public Integer getDefensiveTouchdowns() {
        return defensiveTouchdowns;
    }

    public void setDefensiveTouchdowns(Integer defensiveTouchdowns) {
        this.defensiveTouchdowns = defensiveTouchdowns;
    }

    public Integer getSafeties() {
        return safeties;
    }

    public void setSafeties(Integer safeties) {
        this.safeties = safeties;
    }

    public Integer getSpecialTeamTouchdowns() {
        return specialTeamTouchdowns;
    }

    public void setSpecialTeamTouchdowns(Integer specialTeamTouchdowns) {
        this.specialTeamTouchdowns = specialTeamTouchdowns;
    }
}
