package com.pedrohmoura.soccer_teams.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrohmoura.soccer_teams.domain.Club.Club;
import com.pedrohmoura.soccer_teams.domain.Club.ClubRequestDTO;
import com.pedrohmoura.soccer_teams.domain.Club.ClubResponseDTO;
import com.pedrohmoura.soccer_teams.services.ClubService;

@RestController
@RequestMapping("api/club")
public class ClubController {
    
    @Autowired
    private ClubService clubService;

    @PostMapping()
    public ResponseEntity<Club> create(@RequestBody ClubRequestDTO body) {
        Club club = clubService.createClub(body);   
        return ResponseEntity.ok(club);
    }

    @GetMapping()
    public ResponseEntity<List<ClubResponseDTO>> getAll() {
        List<ClubResponseDTO> clubs = clubService.getAllClubs();
        return ResponseEntity.ok(clubs);
    } 

    @PostMapping("/{id}")
    public ResponseEntity<Club> update(@RequestBody ClubRequestDTO body, @PathVariable UUID id) {
        Club updatedClub = clubService.updateClub(id, body);
        return ResponseEntity.ok(updatedClub);
    }
    
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> delete(@PathVariable UUID id) {
    //     clubService.deleteClub(id);
    //     return ResponseEntity.noContent().build();
    // }
}
