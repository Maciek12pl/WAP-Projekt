package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "organizers")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizer_id")
    private long id;

    @Column(name = "hosted_tournaments")
    private List<Tournament> tournamentList;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
