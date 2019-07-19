package com.example.demo1.dao;

import com.example.demo1.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


public class UserDaoProvider {

    public String getUserByObject(UserEntity userEntity) {
        return new SQL() {{
            SELECT("id,user_name,user_pass");
            FROM("user");
            if (!StringUtils.isEmpty(userEntity.getUser_name())) {
                WHERE("user_name = #{user_name}");
            }
            if (!StringUtils.isEmpty(userEntity.getId())) {
                WHERE("id = #{id}");
            }

        }}.toString();
    }
}
