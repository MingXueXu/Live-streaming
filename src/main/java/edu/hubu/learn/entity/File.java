package edu.hubu.learn.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "file")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}