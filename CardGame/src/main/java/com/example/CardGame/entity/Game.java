package com.example.CardGame.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "game")
    private List<Player> players;

    @OneToOne
    private Deck deck;

    @OneToMany(mappedBy = "game")
    private List<Card> discardPile;

}
