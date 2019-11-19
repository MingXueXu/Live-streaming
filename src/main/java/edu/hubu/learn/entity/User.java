package edu.hubu.learn.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @moduleName UserInfo
 * @description 对应数据库 user_info 表，保存用户信息
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

    private String city;

    private String years;

    private String academy;

    private String major;

    private String personalizedSignature;

    private String personalizedLabels;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getYears() {
        return years;
    }

    public void setYears(String Years) {
        this.years = years == null ? null : Years.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature == null ? null : personalizedSignature.trim();
    }

    public String getPersonalizedLables() {
        return personalizedLabels;
    }

    public void setPersonalizedLables(String personalizedLables) {
        this.personalizedLabels = personalizedLables == null ? null : personalizedLables.trim();
    }

	public void setAvatar(String fileName) {
	}
}