package com.pedrohmoura.soccer_teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrohmoura.soccer_teams.domain.Player;
import com.pedrohmoura.soccer_teams.services.PlayerService;

@RestController
@RequestMapping("player")
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;

    @PostMapping()
    public String createPlayer(@RequestBody Player player) {
        // playerService.savePlayer(player);
        return "Player created successfully!";
    }


}
