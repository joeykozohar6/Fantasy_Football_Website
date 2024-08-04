package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 * Class to represent a quarterback in the databse
 */
@Entity
@DiscriminatorValue("QB")
public class Quarterback extends Player {

    private Double passingCompletions;
    private Double passingAttempts;
    private Double completionPercentage;
    private Double passingYards;
    private Double passingYardsPerAttempt;
    private Double passingTouchdowns;
    private Double interceptionsThrown;
    private Double sacksTaken;
    private Double rushingAttempts;
    private Double rushingYards;
    private Double rushingTouchdowns;
    private Double fumblesLost;

    // Default constructor
    public Quarterback() {
    }

    // Parameterized constructor
    public Quarterback(String name, String position, Integer gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame, Double percentRostered, Double passingCompletions, Double passingAttempts, Double completionPercentage, Double passingYards, Double passingYardsPerAttempt, Double passingTouchdowns, Double interceptionsThrown, Double sacksTaken, Double rushingAttempts, Double rushingYards, Double rushingTouchdowns, Double fumblesLost) {
        super(name, position, gamesPlayed, fantasyPoints, fantasyPointsPerGame, percentRostered);
        this.passingCompletions = passingCompletions;
        this.passingAttempts = passingAttempts;
        this.completionPercentage = completionPercentage;
        this.passingYards = passingYards;
        this.passingYardsPerAttempt = passingYardsPerAttempt;
        this.passingTouchdowns = passingTouchdowns;
        this.interceptionsThrown = interceptionsThrown;
        this.sacksTaken = sacksTaken;
        this.rushingAttempts = rushingAttempts;
        this.rushingYards = rushingYards;
        this.rushingTouchdowns = rushingTouchdowns;
        this.fumblesLost = fumblesLost;
    }

    // Getters and Setters
    public Double getPassingCompletions() {
        return passingCompletions;
    }

    public void setPassingCompletions(Double passingCompletions) {
        this.passingCompletions = passingCompletions;
    }

    public Double getPassingAttempts() {
        return passingAttempts;
    }

    public void setPassingAttempts(Double passingAttempts) {
        this.passingAttempts = passingAttempts;
    }

    public Double getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(Double completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public Double getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(Double passingYards) {
        this.passingYards = passingYards;
    }

    public Double getPassingYardsPerAttempt() {
        return passingYardsPerAttempt;
    }

    public void setPassingYardsPerAttempt(Double passingYardsPerAttempt) {
        this.passingYardsPerAttempt = passingYardsPerAttempt;
    }

    public Double getPassingTouchdowns() {
        return passingTouchdowns;
    }

    public void setPassingTouchdowns(Double passingTouchdowns) {
        this.passingTouchdowns = passingTouchdowns;
    }

    public Double getInterceptionsThrown() {
        return interceptionsThrown;
    }

    public void setInterceptionsThrown(Double interceptionsThrown) {
        this.interceptionsThrown = interceptionsThrown;
    }

    public Double getSacksTaken() {
        return sacksTaken;
    }

    public void setSacksTaken(Double sacksTaken) {
        this.sacksTaken = sacksTaken;
    }

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

}