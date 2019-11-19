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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getThumb_number() {
        return thumb_number;
    }

    public void setThumb_number(String thumb_number) {
        this.thumb_number = thumb_number;
    }

    public String getFlower_number() {
        return flower_number;
    }

    public void setFlower_number(String flower_number) {
        this.flower_number = flower_number;
    }

    public String getCollect_number() {
        return collect_number;
    }

    public void setCollect_number(String collect_number) {
        this.collect_number = collect_number;
    }

    public String getBroadcast_number() {
        return broadcast_number;
    }

    public void setBroadcast_number(String broadcast_number) {
        this.broadcast_number = broadcast_number;
    }
}