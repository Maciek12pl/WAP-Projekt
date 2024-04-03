package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name = "referees")
public class Referee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "referee_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Referee() {
    }
}
