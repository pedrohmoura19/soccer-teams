package com.pedrohmoura.soccer_teams.domain;

import java.util.UUID;

public record PlayerRequestDTO(
    String name,
    String nationality,
    String position,
    int shirtNumber,
    int overallRate,
    int attack,
    int defence,
    UUID clubId
    ){}
