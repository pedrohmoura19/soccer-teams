package com.pedrohmoura.soccer_teams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrohmoura.soccer_teams.domain.Club.Club;
import com.pedrohmoura.soccer_teams.domain.Club.ClubRequestDTO;
import com.pedrohmoura.soccer_teams.domain.Club.ClubResponseDTO;
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

    public List<ClubResponseDTO> getAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream()
                .map(club -> new ClubResponseDTO(
                        club.getId(),
                        club.getName(),
                        club.getCountry(),
                        club.getCity(),
                        club.getStadium(),
                        club.getManager(),
                        club.getKitColor()))
                .toList();
    }

    // public void deleteClub(ClubRequestDTO body) {
    //     Club club = clubRepository.findById(body.id()).orElseThrow(() -> new RuntimeException("Club not found"));
    //     clubRepository.delete(club);
    // }
}
