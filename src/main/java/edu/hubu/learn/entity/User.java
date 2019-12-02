package edu.hubu.learn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @moduleName UserInfo
 * @description 对应数据库 user 表，保存用户信息
 *
 * @author 杨睿
 */
@Data
@Entity
@Table(name = "user")
public class User {


    @Id
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String userImgUrl;

    private String sex;

    private String age;

    private String online;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl == null ? null : userImgUrl.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getonline() {
        return online;
    }

    public void setonline(String online) {
        this.online = online == null ? null : online.trim();
    }

}