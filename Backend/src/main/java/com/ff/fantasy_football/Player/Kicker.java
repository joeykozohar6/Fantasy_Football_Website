package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 * Class to represent a kicker in the databse
 */
@Entity
@DiscriminatorValue("K")
public class Kicker extends Player {

    @Column(name = "field_goals")
    private Integer fieldGoalsMade;

    @Column(name = "field_goals_attempts")
    private Integer fieldGoalsAttempted;

    private Double fieldGoalPercentage;
    private Integer longestFieldGoal;

    @Column(name = "field_goals_1_19_yards")
    private Integer oneToNineteenYards;

    @Column(name = "field_goals_20_29_yards")
    private Integer twentyToTwentyNineYards;

    @Column(name = "field_goals_30_39_yards")
    private Integer thirtyToThirtyNineYards;

    @Column(name = "field_goals_40_49_yards")
    private Integer fortyToFortyNineYards;

    @Column(name = "field_goals_50_plus_yards")
    private Integer longerThanFiftyYards;

    private Integer extraPointsMade;
    private Integer extraPointsAttempted;

    // Default constructor
    public Kicker() {
    }

    // Parameterized constructor
    public Kicker(String name, String position, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered, Integer fieldGoalsMade, Integer fieldGoalsAttempted, Double fieldGoalPercentage, Integer longestFieldGoal, Integer oneToNineteenYards, Integer twentyToTwentyNineYards, Integer thirtyToThirtyNineYards, Integer fortyToFortyNineYards, Integer longerThanFiftyYards, Integer extraPointsMade, Integer extraPointsAttempted) {
        super(name, position, gamesPlayed, fantasyPoints, fantasyPointsPerGame, percentRostered);
        this.fieldGoalsMade = fieldGoalsMade;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.longestFieldGoal = longestFieldGoal;
        this.oneToNineteenYards = oneToNineteenYards;
        this.twentyToTwentyNineYards = twentyToTwentyNineYards;
        this.thirtyToThirtyNineYards = thirtyToThirtyNineYards;
        this.fortyToFortyNineYards = fortyToFortyNineYards;
        this.longerThanFiftyYards = longerThanFiftyYards;
        this.extraPointsMade = extraPointsMade;
        this.extraPointsAttempted = extraPointsAttempted;
    }

    // Getters and Setters
    public Integer getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void setFieldGoalsMade(Integer fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public Integer getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    public void setFieldGoalsAttempted(Integer fieldGoalsAttempted) {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }

    public Double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public void setFieldGoalPercentage(Double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public Integer getLongestFieldGoal() {
        return longestFieldGoal;
    }

    public void setLongestFieldGoal(Integer longestFieldGoal) {
        this.longestFieldGoal = longestFieldGoal;
    }

    public Integer getOneToNineteenYards() {
        return oneToNineteenYards;
    }

    public void setOneToNineteenYards(Integer oneToNineteenYards) {
        this.oneToNineteenYards = oneToNineteenYards;
    }

    public Integer getTwentyToTwentyNineYards() {
        return twentyToTwentyNineYards;
    }

    public void setTwentyToTwentyNineYards(Integer twentyToTwentyNineYards) {
        this.twentyToTwentyNineYards = twentyToTwentyNineYards;
    }

    public Integer getThirtyToThirtyNineYards() {
        return thirtyToThirtyNineYards;
    }

    public void setThirtyToThirtyNineYards(Integer thirtyToThirtyNineYards) {
        this.thirtyToThirtyNineYards = thirtyToThirtyNineYards;
    }

    public Integer getFortyToFortyNineYards() {
        return fortyToFortyNineYards;
    }

    public void setFortyToFortyNineYards(Integer fortyToFortyNineYards) {
        this.fortyToFortyNineYards = fortyToFortyNineYards;
    }

    public Integer getLongerThanFiftyYards() {
        return longerThanFiftyYards;
    }

    public void setLongerThanFiftyYards(Integer longerThanFiftyYards) {
        this.longerThanFiftyYards = longerThanFiftyYards;
    }

    public Integer getExtraPointsMade() {
        return extraPointsMade;
    }

    public void setExtraPointsMade(Integer extraPointsMade) {
        this.extraPointsMade = extraPointsMade;
    }

    public Integer getExtraPointsAttempted() {
        return extraPointsAttempted;
    }

    public void setExtraPointsAttempted(Integer extraPointsAttempted) {
        this.extraPointsAttempted = extraPointsAttempted;
    }
}