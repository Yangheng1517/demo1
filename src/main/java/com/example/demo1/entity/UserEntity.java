package com.example.demo1.entity;

public class UserEntity {
    private Integer id;
    private  String user_name;
    private  String user_pass;

    public UserEntity(int id, String user_name, String user_pass) {
        this.id = id;
        this.user_name = user_name;
        this.user_pass = user_pass;
    }

    public UserEntity(String user_name, String user_pass) {
        this.user_name = user_name;
        this.user_pass = user_pass;
    }


    public UserEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}
