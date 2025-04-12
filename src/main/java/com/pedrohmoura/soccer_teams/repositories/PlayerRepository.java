package com.pedrohmoura.soccer_teams.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohmoura.soccer_teams.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, UUID>{
    
}
