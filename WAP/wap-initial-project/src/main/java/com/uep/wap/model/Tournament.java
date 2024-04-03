package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name = "tournaments")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tournament_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private String date;

    @Column(name = "place")
    private String place;

    @Column(name = "game_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long game_id;

}
