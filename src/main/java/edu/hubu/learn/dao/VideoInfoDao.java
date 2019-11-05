package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.VideoInfo;

public interface VideoInfoDao extends JpaRepository<VideoInfo,Long>{

}
