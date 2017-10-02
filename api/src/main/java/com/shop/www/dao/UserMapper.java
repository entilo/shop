package com.shop.www.dao;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.apache.ibatis.annotations.Param;

import com.shop.www.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getByList( List<User> userList);
}