package com.example.demo1.dao;

import com.example.demo1.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    //@Select("select id,user_name,user_pass from user where user_name = #{name}")
    @Results({
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "user_name", column = "user_name"),
                    @Result(property = "user_pass", column = "user_pass")
            })
    @SelectProvider(type=UserDaoProvider.class,method = "getUserByObject")
    UserEntity getUserByName(UserEntity userEntity);

    @Select("select id,user_name,user_pass from user where id = #{id}")
    @Results({
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "user_name", column = "user_name"),
                    @Result(property = "user_pass", column = "user_pass")
            })
    UserEntity getUserById(@Param("id") Long id);
}
