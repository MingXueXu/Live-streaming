package edu.hubu.learn.dao;

import edu.hubu.learn.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @moduleName UserInfoDao
 * @description user_info 对应的dao层，书写操作数据库的方法
 *
 * @Author 杨睿
 * @since 2019-10-07 20:53
 **/
@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
  /**
   * 在 JpaRepository 中封装了大量的单表操作的方法，详情自己看文档。
   */

  /**
   * 查询 user_info表中的所有数据
   * @return List<UserInfo>
   */
  @Modifying
  @Query(value = "select * from user_info",nativeQuery = true)
  List<UserInfo> selectAll();

}
