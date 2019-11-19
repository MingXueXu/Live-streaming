package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.FileDao;
import edu.hubu.learn.entity.File;

@Service
public class FileService {

    @Autowired
    private FileDao dao;

    public File getFile(Long id) {
        return dao.findById(id).get();
    }

    public List<File> getFiles() {
        return dao.findAll(new Sort(Direction.DESC, "id"));
    }
    
}