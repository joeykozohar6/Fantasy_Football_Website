package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 * Class to represent a running back in the databse
 */
@Entity
@DiscriminatorValue("RB")
public class RunningBack extends Player {
    private Double rushingAttempts;
    private Double rushingYards;
    private Double rushingTouchdowns;
    private Double fumblesLost;
    private Double rushingYardsPerAttempt;
    private Double longestRush;

    @Column(name = "rushes_20_plus_yards")
    private Double rushes20PlusYards;

    private Double receptions;
    private Double targets;
    private Double receivingYards;
    private Double yardsPerReception;
    private Double receivingTouchdowns;

    // Default constructor
    public RunningBack() {
    }

    // Parameterized constructor
    public RunningBack(String name, String position, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered, Double rushingAttempts, Double rushingYards, Double rushingTouchdowns, Double fumblesLost, Double rushingYardsPerAttempt, Double longestRush, Double rushes20PlusYards, Double receptions, Double targets, Double receivingYards, Double yardsPerReception, Double receivingTouchdowns) {
        super(name, position, gamesPlayed, fantasyPoints, fantasyPointsPerGame, percentRostered);
        this.rushingAttempts = rushingAttempts;
        this.rushingYards = rushingYards;
        this.rushingTouchdowns = rushingTouchdowns;
        this.fumblesLost = fumblesLost;
        this.rushingYardsPerAttempt = rushingYardsPerAttempt;
        this.longestRush = longestRush;
        this.rushes20PlusYards = rushes20PlusYards;
        this.receptions = receptions;
        this.targets = targets;
        this.receivingYards = receivingYards;
        this.yardsPerReception = yardsPerReception;
        this.receivingTouchdowns = receivingTouchdowns;
    }

    // Getters and Setters
    public Double getRushingAttempts() {
        return rushingAttempts;
    }

    public void setRushingAttempts(Double rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
    }

    public Double getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(Double rushingYards) {
        this.rushingYards = rushingYards;
    }

    public Double getRushingTouchdowns() {
        return rushingTouchdowns;
    }

    public void setRushingTouchdowns(Double rushingTouchdowns) {
        this.rushingTouchdowns = rushingTouchdowns;
    }

    public Double getFumblesLost() {
        return fumblesLost;
    }

    public void setFumblesLost(Double fumblesLost) {
        this.fumblesLost = fumblesLost;
    }

    public Double getRushingYardsPerAttempt() {
        return rushingYardsPerAttempt;
    }

    public void setRushingYardsPerAttempt(Double rushingYardsPerAttempt) {
        this.rushingYardsPerAttempt = rushingYardsPerAttempt;
    }

    public Double getLongestRush() {
        return longestRush;
    }

    public void setLongestRush(Double longestRush) {
        this.longestRush = longestRush;
    }

    public Double getRushes20PlusYards() {
        return rushes20PlusYards;
    }

    public void setRushes20PlusYards(Double rushes20PlusYards) {
        this.rushes20PlusYards = rushes20PlusYards;
    }

    public Double getReceptions() {
        return receptions;
    }

    public void setReceptions(Double receptions) {
        this.receptions = receptions;
    }

    public Double getTargets() {
        return targets;
    }

    public void setTargets(Double targets) {
        this.targets = targets;
    }

    public Double getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(Double receivingYards) {
        this.receivingYards = receivingYards;
    }

    public Double getYardsPerReception() {
        return yardsPerReception;
    }

    public void setYardsPerReception(Double yardsPerReception) {
        this.yardsPerReception = yardsPerReception;
    }

    public Double getReceivingTouchdowns() {
        return receivingTouchdowns;
    }

    public void setReceivingTouchdowns(Double receivingTouchdowns) {
        this.receivingTouchdowns = receivingTouchdowns;
    }

}
