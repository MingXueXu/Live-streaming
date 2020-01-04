package edu.hubu.learn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.hubu.learn.entity.Watchinghistory;
@Repository
public interface WatchinghistoryDao extends JpaRepository<Watchinghistory, Long> {
    @Modifying
    @Query(value = "select * from watchinghistory",nativeQuery = true)//获取观看历史表内容
    List<Watchinghistory> selectAll();
}