package edu.hubu.learn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.hubu.learn.entity.Collection;

@Repository
public interface CollectionDao extends JpaRepository<Collection, Long> {
    @Modifying
    @Query(value = "select * from collection",nativeQuery = true)//获取收藏表内容
    List<Collection> selectAll();
}