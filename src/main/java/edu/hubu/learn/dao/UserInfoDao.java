package edu.hubu.learn.dao;

import edu.hubu.learn.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Long> {

  @Modifying
  @Query(value = "select user_img_url from user_info where username = :username", nativeQuery = true)
  String getUserImgUrl(@Param("username") String username);
}
