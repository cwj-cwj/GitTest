package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yn2333
 * @Date 2020/03/03
 */
@Repository
public interface UserMapper {

    User Sel(@Param("user")User user);

    int Add(@Param("user")User user);

    int Update(@Param("user")User user);

    int Delete(@Param("user")User user);
}