package edu.hubu.learn.web.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @moduleName: BaseService
 * @description: 底层 Service
 * @author: 杨睿
 * @since: 2019-12-03 17:14
 **/
public class BaseService<T, ID> {
    @Autowired
    JpaRepository<T, ID> baseDao;

    /**
     * 查询全部实例
     * @return PageBean
     */
    public List<T> selectAll(){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return baseDao.findAll(sort);
    }

    /**
     * 根据Id查询单个实例
     */
    public T selectById(ID id){
        return baseDao.findById(id).get();
    }

    /**
     * 根据id删除实例
     * @param id 实例的id值
     * @return boolean
     */
    public boolean deleteById(ID id){
        baseDao.deleteById(id);
        return true;
    }

    /**
     * 插入/更新实例
     * @param t 实例
     * @return Object
     */
    public Object insert(T t){
        return baseDao.save(t);
    }

}
