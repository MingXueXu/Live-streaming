package edu.hubu.learn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.hubu.learn.entity.VideoInfo;
@Repository
public interface VideoInfoDao extends JpaRepository<VideoInfo, Long> {
    @Modifying
    @Query(value = "select * from videoInfo",nativeQuery = true)
    List<VideoInfo> selectAll();
}
