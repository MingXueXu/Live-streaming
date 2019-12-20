package edu.hubu.learn.web.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class BaseService<T, ID> {
    @Autowired
    JpaRepository<T, ID> baseDao;

    public List<T> selectAll(){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return baseDao.findAll(sort);
    }

    public T selectById(ID id){
        return baseDao.findById(id).get();
    }

    public boolean deleteById(ID id){
        baseDao.deleteById(id);
        return true;
    }

    public Object insert(T t){
        return baseDao.save(t);
    }

}
