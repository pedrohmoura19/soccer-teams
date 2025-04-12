package com.pedrohmoura.soccer_teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrohmoura.soccer_teams.domain.Player;
import com.pedrohmoura.soccer_teams.domain.PlayerRequestDTO;
import com.pedrohmoura.soccer_teams.services.PlayerService;

@RestController
@RequestMapping("api/player")
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;

    @PostMapping()
    public ResponseEntity<Player> create(@RequestBody PlayerRequestDTO body) {
        Player player = playerService.createPlayer(body);   
        return ResponseEntity.ok(player);
    }


}
