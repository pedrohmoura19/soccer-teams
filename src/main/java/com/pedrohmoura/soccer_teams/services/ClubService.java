package com.pedrohmoura.soccer_teams.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrohmoura.soccer_teams.domain.Club.Club;
import com.pedrohmoura.soccer_teams.domain.Club.ClubRequestDTO;
import com.pedrohmoura.soccer_teams.repositories.ClubRepository;

@Service
public class ClubService {
    
    @Autowired
    private ClubRepository clubRepository;

    public Club createClub(ClubRequestDTO body) {
        Club club = new Club();
        club.setName(body.name());
        club.setCountry(body.country());
        club.setCity(body.city());
        club.setStadium(body.stadium());
        club.setManager(body.manager());
        club.setKitColor(body.kitColor());
        return clubRepository.save(club);
    }
}
