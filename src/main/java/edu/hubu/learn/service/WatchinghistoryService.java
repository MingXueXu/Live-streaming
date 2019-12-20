package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.WatchinghistoryDao;
import edu.hubu.learn.entity.Watchinghistory;

@Service
public class WatchinghistoryService {

    @Autowired
    private WatchinghistoryDao dao;

    public Watchinghistory getWatchinghistory(Long id) {
        return dao.findById(id).get();
    }

    public List<Watchinghistory> getWatching_historys() {
        return dao.findAll(new Sort(Direction.DESC, "id"));
    }
    
}