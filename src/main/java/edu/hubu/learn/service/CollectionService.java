package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.CollectionDao;
import edu.hubu.learn.entity.Collection;

@Service
public class CollectionService {

    @Autowired
    private CollectionDao dao;

    public Collection getCollection(Long id) {
        return dao.findById(id).get();
    }

    public List<Collection> getCollections() {
        return dao.findAll(new Sort(Direction.DESC, "id"));//按照id降序排列获取到的数据
    }
    
}