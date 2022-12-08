package com.example.pp313.dao;

import com.example.pp313.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void add(User user);

    void remove(User user);

    void edit(User user);

    User getById(long id);

    User findByUsername(String username);
}
