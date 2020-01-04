package edu.hubu.learn.entity;

import lombok.Data;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "video_info")

public class VideoInfo {
    @Id
    private long id;

    private String num;

    private String name;

    private String video_url;
    
    private String username;

    private String like_num;
    
    private Time time;

}