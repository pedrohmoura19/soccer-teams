package com.pedrohmoura.soccer_teams.domain.Club;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "club")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Club {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String country;
    private String city;
    private String stadium;
    private String manager;
    private String kitColor;

}
