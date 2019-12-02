package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hubu.learn.entity.Collection;

@Repository
public interface CollectionDao extends JpaRepository<Collection, Long> {

}