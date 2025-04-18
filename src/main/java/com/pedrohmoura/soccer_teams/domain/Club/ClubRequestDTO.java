package com.pedrohmoura.soccer_teams.domain.Club;

public record ClubRequestDTO(
    String name,
    String country,
    String city,
    String stadium,
    String manager,
    String kitColor
) {
    
}
