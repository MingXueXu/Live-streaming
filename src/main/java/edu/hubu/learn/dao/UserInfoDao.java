package edu.hubu.learn.dao;

import edu.hubu.learn.entity.UserInfo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
  @Modifying
  @Query(value = "select user_img_url from user_info where username = :username", nativeQuery = true)
  String getUserImgUrl(@Param("username") String username);

  @Modifying
  @Query(value = "select count(id) from user_info where username = :username and password = :password", nativeQuery = true)
  int login(@Param("username")String username, @Param("password") String password);

}
}
