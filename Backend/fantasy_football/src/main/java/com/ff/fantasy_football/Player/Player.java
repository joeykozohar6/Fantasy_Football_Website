package com.ff.fantasy_football.Player;

import jakarta.persistence.*;

/**
 * Class to represent a player in the database
 */
@Entity
@Table(name = "fantasy_football_stats")
public class Player {
    @Id
    @Column(name = "player", unique = true) //Since there aren't any repeat players
    private String name;
    private String position;
    private int gamesPlayed;
    private Double fantasyPoints;
    private Double fantasyPointsPerGame;
    private Double percentRostered;
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
    private Double rushingYardsPerAttempt;
    private Double longestRush;
    private Double rushes20PlusYards;
    private Double receptions;
    private Double targets;
    private Double receivingYards;
    private Double yardsPerReception;
    private Double receivingTouchdowns;
    private Double longestReception;
    private Double receptions20PlusYards;
    private Double fieldGoals;
    private Double fieldGoalsAttempts;
    private Double fieldGoalPercentage;
    private Double longestFieldGoal;
    private Double fieldGoals1_19Yards;
    private Double fieldGoals20_29Yards;
    private Double fieldGoals30_39Yards;
    private Double fieldGoals40_49Yards;
    private Double fieldGoals50PlusYards;
    private Double extraPointsMade;
    private Double extraPointsAttempted;
    private Double sacks;
    private Double interceptions;
    private Double fumbleRecoveries;
    private Double forcedFumbles;
    private Double defensiveTouchdowns;
    private Double safeties;
    private Double specialTeamsTouchdowns;

    // Default constructor
    public Player() {
    }

    // Parameterized constructor
    public Player(String name, String position, int gamesPlayed, Double fantasyPoints, Double fantasyPointsPerGame,
                        Double percentRostered, Double passingCompletions, Double passingAttempts, Double completionPercentage,
                        Double passingYards, Double passingYardsPerAttempt, Double passingTouchdowns, Double interceptionsThrown,
                        Double sacksTaken, Double rushingAttempts, Double rushingYards, Double rushingTouchdowns, Double fumblesLost,
                        Double rushingYardsPerAttempt, Double longestRush, Double rushes20PlusYards, Double receptions, Double targets,
                        Double receivingYards, Double yardsPerReception, Double receivingTouchdowns, Double longestReception,
                        Double receptions20PlusYards, Double fieldGoals, Double fieldGoalsAttempts, Double fieldGoalPercentage,
                        Double longestFieldGoal, Double fieldGoals1_19Yards, Double fieldGoals20_29Yards, Double fieldGoals30_39Yards,
                        Double fieldGoals40_49Yards, Double fieldGoals50PlusYards, Double extraPointsMade, Double extraPointsAttempted,
                        Double sacks, Double interceptions, Double fumbleRecoveries, Double forcedFumbles, Double defensiveTouchdowns,
                        Double safeties, Double specialTeamsTouchdowns) {
        this.name = name;
        this.position = position;
        this.gamesPlayed = gamesPlayed;
        this.fantasyPoints = fantasyPoints;
        this.fantasyPointsPerGame = fantasyPointsPerGame;
        this.percentRostered = percentRostered;
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
        this.rushingYardsPerAttempt = rushingYardsPerAttempt;
        this.longestRush = longestRush;
        this.rushes20PlusYards = rushes20PlusYards;
        this.receptions = receptions;
        this.targets = targets;
        this.receivingYards = receivingYards;
        this.yardsPerReception = yardsPerReception;
        this.receivingTouchdowns = receivingTouchdowns;
        this.longestReception = longestReception;
        this.receptions20PlusYards = receptions20PlusYards;
        this.fieldGoals = fieldGoals;
        this.fieldGoalsAttempts = fieldGoalsAttempts;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.longestFieldGoal = longestFieldGoal;
        this.fieldGoals1_19Yards = fieldGoals1_19Yards;
        this.fieldGoals20_29Yards = fieldGoals20_29Yards;
        this.fieldGoals30_39Yards = fieldGoals30_39Yards;
        this.fieldGoals40_49Yards = fieldGoals40_49Yards;
        this.fieldGoals50PlusYards = fieldGoals50PlusYards;
        this.extraPointsMade = extraPointsMade;
        this.extraPointsAttempted = extraPointsAttempted;
        this.sacks = sacks;
        this.interceptions = interceptions;
        this.fumbleRecoveries = fumbleRecoveries;
        this.forcedFumbles = forcedFumbles;
        this.defensiveTouchdowns = defensiveTouchdowns;
        this.safeties = safeties;
        this.specialTeamsTouchdowns = specialTeamsTouchdowns;
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

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
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

    public Double getFieldGoals() {
        return fieldGoals;
    }

    public void setFieldGoals(Double fieldGoals) {
        this.fieldGoals = fieldGoals;
    }

    public Double getFieldGoalsAttempts() {
        return fieldGoalsAttempts;
    }

    public void setFieldGoalsAttempts(Double fieldGoalsAttempts) {
        this.fieldGoalsAttempts = fieldGoalsAttempts;
    }

    public Double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public void setFieldGoalPercentage(Double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public Double getLongestFieldGoal() {
        return longestFieldGoal;
    }

    public void setLongestFieldGoal(Double longestFieldGoal) {
        this.longestFieldGoal = longestFieldGoal;
    }

    public Double getFieldGoals1_19Yards() {
        return fieldGoals1_19Yards;
    }

    public void setFieldGoals1_19Yards(Double fieldGoals1_19Yards) {
        this.fieldGoals1_19Yards = fieldGoals1_19Yards;
    }

    public Double getFieldGoals20_29Yards() {
        return fieldGoals20_29Yards;
    }

    public void setFieldGoals20_29Yards(Double fieldGoals20_29Yards) {
        this.fieldGoals20_29Yards = fieldGoals20_29Yards;
    }

    public Double getFieldGoals30_39Yards() {
        return fieldGoals30_39Yards;
    }

    public void setFieldGoals30_39Yards(Double fieldGoals30_39Yards) {
        this.fieldGoals30_39Yards = fieldGoals30_39Yards;
    }

    public Double getFieldGoals40_49Yards() {
        return fieldGoals40_49Yards;
    }

    public void setFieldGoals40_49Yards(Double fieldGoals40_49Yards) {
        this.fieldGoals40_49Yards = fieldGoals40_49Yards;
    }

    public Double getFieldGoals50PlusYards() {
        return fieldGoals50PlusYards;
    }

    public void setFieldGoals50PlusYards(Double fieldGoals50PlusYards) {
        this.fieldGoals50PlusYards = fieldGoals50PlusYards;
    }

    public Double getExtraPointsMade() {
        return extraPointsMade;
    }

    public void setExtraPointsMade(Double extraPointsMade) {
        this.extraPointsMade = extraPointsMade;
    }

    public Double getExtraPointsAttempted() {
        return extraPointsAttempted;
    }

    public void setExtraPointsAttempted(Double extraPointsAttempted) {
        this.extraPointsAttempted = extraPointsAttempted;
    }

    public Double getSacks() {
        return sacks;
    }

    public void setSacks(Double sacks) {
        this.sacks = sacks;
    }

    public Double getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(Double interceptions) {
        this.interceptions = interceptions;
    }

    public Double getFumbleRecoveries() {
        return fumbleRecoveries;
    }

    public void setFumbleRecoveries(Double fumbleRecoveries) {
        this.fumbleRecoveries = fumbleRecoveries;
    }

    public Double getForcedFumbles() {
        return forcedFumbles;
    }

    public void setForcedFumbles(Double forcedFumbles) {
        this.forcedFumbles = forcedFumbles;
    }

    public Double getDefensiveTouchdowns() {
        return defensiveTouchdowns;
    }

    public void setDefensiveTouchdowns(Double defensiveTouchdowns) {
        this.defensiveTouchdowns = defensiveTouchdowns;
    }

    public Double getSafeties() {
        return safeties;
    }

    public void setSafeties(Double safeties) {
        this.safeties = safeties;
    }

    public Double getSpecialTeamsTouchdowns() {
        return specialTeamsTouchdowns;
    }

    public void setSpecialTeamsTouchdowns(Double specialTeamsTouchdowns) {
        this.specialTeamsTouchdowns = specialTeamsTouchdowns;
    }
}
    