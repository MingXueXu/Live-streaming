package edu.hubu.learn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.hubu.learn.entity.Comment;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {
    @Modifying
    @Query(value = "select * from comment",nativeQuery = true)
    List<Comment> selectAll();
}