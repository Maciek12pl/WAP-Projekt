package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Player_id")
    private long player_id;

    @Column(name = "ELO_rating")
    private long elo_rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public long getElo_rating() {
        return elo_rating;
    }


    public long getId() {
        return player_id;
    }

    public void setId(long player_id) {
        this.player_id = player_id;
    }

    public void setElo_rating(long elo_rating) {
        this.elo_rating = elo_rating;
    }

    public Player(long elo_rating) {
        this.elo_rating = elo_rating;
    }

    public Player() {
    }
}
