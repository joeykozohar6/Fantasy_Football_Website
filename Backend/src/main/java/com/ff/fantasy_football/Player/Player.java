package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 *  Base class to represent a player in the database
 *  Holds stats that is shared between players
 */
@Entity
@Table(name = "fantasy_football_stats")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Position", discriminatorType = DiscriminatorType.STRING)
public class Player {
    @Id
    @Column(name = "player", unique = true) //Since there aren't any repeat players
    private String name;
    
    @Column(insertable = false, updatable = false)
    private String position;

    private Integer gamesPlayed;
    private Double fantasyPoints;
    private Double fantasyPointsPerGame;
    private Double percentRostered;

    // Default constructor
    public Player() {
    }

    // Parameterized constructor
    public Player(String name, String position, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered) {
        this.name = name;
        this.position = position;
        this.gamesPlayed = gamesPlayed;
        this.fantasyPoints = fantasyPoints;
        this.fantasyPointsPerGame = fantasyPointsPerGame;
        this.percentRostered = percentRostered;
    }

    // Getters and setters for all fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Double getFantasyPoints() {
        return fantasyPoints;
    }

    public void setFantasyPoints(Double fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }

    public Double getFantasyPointsPerGame() {
        return fantasyPointsPerGame;
    }

    public void setFantasyPointsPerGame(Double fantasyPointsPerGame) {
        this.fantasyPointsPerGame = fantasyPointsPerGame;
    }

    public Double getPercentRostered() {
        return percentRostered;
    }

    public void setPercentRostered(Double percentRostered) {
        this.percentRostered = percentRostered;
    }

}
    