package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.File;

public interface FileDao extends JpaRepository<File, Long> {

}