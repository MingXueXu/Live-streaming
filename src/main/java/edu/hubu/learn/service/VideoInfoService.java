package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.VideoInfoDao;
import edu.hubu.learn.entity.VideoInfo;
@Service
public class VideoInfoService {
    @Autowired
    private VideoInfoDao dao;

    public VideoInfo getVideoInfo(Long id) {
        return dao.findById(id).get();
    }
    public List<VideoInfo> getVideoInfos() {
        return dao.findAll(new Sort(Direction.DESC, "id"));//按照id降序排列获取到的数据
    }
}
