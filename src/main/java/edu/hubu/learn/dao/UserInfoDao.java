package edu.hubu.learn.dao;

import edu.hubu.learn.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
   * 根据用户名获取用户头像
   * @param username 用户名
   * @return 头像路径
   */
  @Modifying
  @Query(value = "select user_img_url from user_info where username = :username", nativeQuery = true)
  String getUserImgUrl(@Param("username") String username);


}
