package com.pedrohmoura.soccer_teams.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrohmoura.soccer_teams.domain.Player;
import com.pedrohmoura.soccer_teams.domain.PlayerRequestDTO;
import com.pedrohmoura.soccer_teams.repositories.PlayerRepository;
import com.pedrohmoura.soccer_teams.domain.PlayerResponseDTO;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    
    public Player createPlayer(PlayerRequestDTO data) {
        Player player = new Player();
        player.setName(data.name());
        player.setNationality(data.nationality());
        player.setPosition(data.position());
        player.setShirtNumber(data.shirtNumber());
        player.setOverallRate(data.overallRate());
        player.setAttack(data.attack());
        player.setDefence(data.defence());

        playerRepository.save(player);
        
        return player;
    }

    public List<PlayerResponseDTO> getAllPlayers() {
        List<Player> players = playerRepository.findAll();
        return players.stream()
                .map(player -> new PlayerResponseDTO(
                        player.getId(),
                        player.getName(),
                        player.getNationality(),
                        player.getPosition(),
                        player.getShirtNumber(),
                        player.getOverallRate(),
                        player.getAttack(),
                        player.getDefence()))
                .collect(Collectors.toList());
    }
}
