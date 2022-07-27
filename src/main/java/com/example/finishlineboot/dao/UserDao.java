package com.example.finishlineboot.dao;


import com.example.finishlineboot.model.User;

import java.util.List;

public interface UserDao {
    void updateUser(Long id, User user);

    List<User> allUsers();

    void save(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);
}