package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 * Class to represent a wide receiver in the databse
 */
@Entity
@DiscriminatorValue("WR")
public class WideReceiver extends Player {
    private Double rushingAttempts;
    private Double rushingYards;
    private Double rushingTouchdowns;
    private Double fumblesLost;

    private Double receptions;
    private Double targets;
    private Double receivingYards;
    private Double yardsPerReception;
    private Double receivingTouchdowns;
    private Double longestReception;
    @Column(name = "receptions_20_plus_yards")
    private Double receptions20PlusYards;

    // Default constructor
    public WideReceiver() {
    }

    // Parameterized constructor
    public WideReceiver(String name, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered, Double rushingAttempts, Double rushingYards, Double rushingTouchdowns, Double fumblesLost, Double receptions, Double targets, Double receivingYards, Double yardsPerReception, Double receivingTouchdowns, Double longestReception, Double receptions20PlusYards) {
        super(name, gamesPlayed, fantasyPoints, fantasyPointsPerGame, percentRostered);
        this.rushingAttempts = rushingAttempts;
        this.rushingYards = rushingYards;
        this.rushingTouchdowns = rushingTouchdowns;
        this.fumblesLost = fumblesLost;
        this.receptions = receptions;
        this.targets = targets;
        this.receivingYards = receivingYards;
        this.yardsPerReception = yardsPerReception;
        this.receivingTouchdowns = receivingTouchdowns;
        this.longestReception = longestReception;
        this.receptions20PlusYards = receptions20PlusYards;
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

    public Double getLongestReception() {
        return longestReception;
    }

    public void setLongestReception(Double longestReception) {
        this.longestReception = longestReception;
    }

    public Double getReceptions20PlusYards() {
        return receptions20PlusYards;
    }

    public void setReceptions20PlusYards(Double receptions20PlusYards) {
        this.receptions20PlusYards = receptions20PlusYards;
    }
}