package com.ff.fantasy_football.player;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 *  Base class to represent a player in the database
 *  Holds stats that is shared between players
 */
@Entity
@Table(name = "fantasy_football_stats")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Position", discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type"
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Quarterback.class, name = "QB"),
  @JsonSubTypes.Type(value = RunningBack.class, name = "RB"),
  @JsonSubTypes.Type(value = WideReceiver.class, name = "WR"),
  @JsonSubTypes.Type(value = TightEnd.class, name = "TE"),
  @JsonSubTypes.Type(value = Kicker.class, name = "K"),
  @JsonSubTypes.Type(value = DST.class, name = "DST")
})
public class Player {
    @Id
    @Column(name = "player", unique = true) //Since there aren't any repeat players
    private String name;
    
    private Integer gamesPlayed;
    private Double fantasyPoints;
    private Double fantasyPointsPerGame;
    private Double percentRostered;

    // Default constructor
    public Player() {
    }

    // Parameterized constructor
    public Player(String name, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered) {
        this.name = name;
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
        jakarta.persistence.DiscriminatorValue dv = this.getClass().getAnnotation(jakarta.persistence.DiscriminatorValue.class);
        return dv != null ? dv.value() : null;
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
    