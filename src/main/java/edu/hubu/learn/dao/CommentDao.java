package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Long> {

}