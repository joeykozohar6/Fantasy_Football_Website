package com.ff.fantasy_football.Player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Class to handle http requests
 * Uses service class to preform "business logic"
 */
@RestController
@RequestMapping(path = "/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(@RequestParam(required = false) String name, 
                                    @RequestParam(required = false) String position) {
        if (name != null) {
            return playerService.getPlayerByName(name);
        } else if (position != null) {
            return playerService.getPlayerByPosition(position);
        }
        return playerService.getAllPlayers(); // default return all players if nothing passed in
    }

    @PostMapping  
    public ResponseEntity<Player> addPlayer(@RequestBody Player playerToAdd) {
        Player newPlayer = playerService.addPlayer(playerToAdd);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED); 
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player playerToUpdate) {
        Player newPlayer = playerService.updatePlayer(playerToUpdate);
        if (newPlayer != null) {
            return new ResponseEntity<>(newPlayer, HttpStatus.OK); 
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // player not found in database
    }

    /**
     * Delete a player from the database
     * @param playerName player to be deleted
     * @return A response entity describing if the deletion was successful 
     */
    @DeleteMapping("/{playerName}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName) {
        playerService.deletePlayer(playerName);
        return new ResponseEntity<>("Successfully deleted player", HttpStatus.OK);
    }
}
