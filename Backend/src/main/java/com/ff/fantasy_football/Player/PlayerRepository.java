package com.ff.fantasy_football.Player;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Define methods not provided by the JPA Repository
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, String>{

    void deleteByName(String playerName);

    Optional<Player> findPlayerByName(String playerName); //optional to hanlde case where player isn't found
    
}
