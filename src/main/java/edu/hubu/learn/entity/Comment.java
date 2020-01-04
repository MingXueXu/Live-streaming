package edu.hubu.learn.entity;

import java.sql.Time;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "comment")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String videoid;
    private String username;
    private String comment;
    private Time time;
    
}