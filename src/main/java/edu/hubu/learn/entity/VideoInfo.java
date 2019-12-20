package edu.hubu.learn.entity;
import lombok.Data;

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
    
    private long user_id;

    private String like_num;

    private String collection;
    
    private int time;

}