package com.pedrohmoura.soccer_teams.domain;

import java.util.UUID;

import com.pedrohmoura.soccer_teams.domain.Club.Club;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "player")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String nationality;
    private String position;
    private int shirtNumber;
    private int overallRate;
    private int attack;
    private int defence;

    @ManyToOne()
    private Club club;
}
