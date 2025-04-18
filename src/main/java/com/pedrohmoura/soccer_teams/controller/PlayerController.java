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

import com.pedrohmoura.soccer_teams.domain.Player;
import com.pedrohmoura.soccer_teams.domain.PlayerRequestDTO;
import com.pedrohmoura.soccer_teams.domain.PlayerResponseDTO;
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

    @GetMapping("/{id}")
    public ResponseEntity<PlayerResponseDTO> getPlayerById(@PathVariable UUID id) {
        PlayerResponseDTO player = playerService.getPlayerById(id);
        return ResponseEntity.ok(player);
    }

    @GetMapping
    public ResponseEntity<List<PlayerResponseDTO>> getPlayers() {
        List<PlayerResponseDTO> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/club/{clubId}")
    public ResponseEntity<List<PlayerResponseDTO>> getPlayersByClubId(@PathVariable UUID clubId) {
        List<PlayerResponseDTO> players = playerService.getPlayersByClubId(clubId);
        return ResponseEntity.ok(players);
    }
}
