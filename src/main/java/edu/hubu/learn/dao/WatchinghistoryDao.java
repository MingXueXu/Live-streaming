package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Watchinghistory;;

public interface WatchinghistoryDao extends JpaRepository<Watchinghistory, Long> {

}