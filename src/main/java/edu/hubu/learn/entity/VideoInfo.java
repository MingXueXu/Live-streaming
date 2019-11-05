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

    private String thumb_number;

    private String flower_number;

    private String collect_number;
    
    private String broadcast_number;


}