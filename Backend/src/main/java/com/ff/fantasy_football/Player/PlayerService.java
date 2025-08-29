package com.ff.fantasy_football.player;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

/**
 * Contains the "business logic" to do CRUD operations
 * Processes the data retrieved from the repository and gets it ready for the controller
 */
@Component 
public class PlayerService {
    private final PlayerRepository playerRep;

    @Autowired
    public PlayerService(PlayerRepository playerRep) {
        this.playerRep = playerRep;
    }

    /**
     * Get all players
     * @return All the players in the database
     */
    public List<Player> getAllPlayers() {
        return playerRep.findAll();
    }

      /**
     * Find all players at a specific position
     * @param positionName position the user wants
     * @return List of all players at that position
     */
    public List<Player> getPlayerByPosition(String positionName){
        return playerRep.findAll().stream().filter(player -> positionName.toLowerCase().equals(player.getPosition().toLowerCase())).collect(Collectors.toList());
    }

    /**
     * Find a specific player by their name
     * @param playerName Player to be searched for
     * @return List of players whose names contain the specified name
     */
    public List<Player> getPlayerByName(String playerName) {
        return playerRep.findAll().stream().filter(player -> player.getName().toLowerCase().contains(playerName.toLowerCase())).collect(Collectors.toList());
    }
    
    /**
     * Allow user to add a player to the database if needed ex. adding rookies
     * @param player The player to be added
     * @return The player that was added
     */
    public Player addPlayer(Player player) {
        playerRep.save(player);
        return player;
    }

    /**
     * Update a player 
     * @param player player to be updated
     * @return the player that was updated if they are present or null if they aren't
     */
    public Player updatePlayer(Player player) {
        Optional<Player> currPlayer = playerRep.findPlayerByName(player.getName());
        if (currPlayer.isPresent()) { // can't update player that isn't in the database
            Player toBeUpdated = currPlayer.get();
            toBeUpdated.setName(player.getName());
            playerRep.save(toBeUpdated);
            return toBeUpdated;
        }
        return null; // if player was not found
    }

    @Transactional // Will maintain data integrity during delete 
    /**
     * Allow user to delete a player ex. retiring players
     * @param playerName Name of player that will be deleted
     */
    public void deletePlayer(String playerName) {
        playerRep.deleteByName(playerName);
    }
}