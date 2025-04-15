package com.pedrohmoura.soccer_teams.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohmoura.soccer_teams.domain.Club.Club;

public interface ClubRepository extends JpaRepository<Club, UUID> {
    // Custom query methods can be defined here if needed
    // For example, findByName(String name) or findByCity(String city)
    
}
