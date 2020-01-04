package edu.hubu.learn.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String userImgUrl;

    private String personalizedSignature;

    private String personalizedLabels;

    private int age;

}