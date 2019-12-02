package edu.hubu.learn.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "watchinghistory")
@Data
public class Watchinghistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String videoid;
    private String username;
}