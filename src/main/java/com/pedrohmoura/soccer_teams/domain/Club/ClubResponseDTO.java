package com.pedrohmoura.soccer_teams.domain.Club;

import java.util.UUID;

public record ClubResponseDTO(
        UUID id,
        String name,
        String country,
        String city,
        String stadium,
        String manager,
        String kitColor) {}
