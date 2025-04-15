package com.pedrohmoura.soccer_teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrohmoura.soccer_teams.domain.Club.Club;
import com.pedrohmoura.soccer_teams.domain.Club.ClubRequestDTO;
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
}
