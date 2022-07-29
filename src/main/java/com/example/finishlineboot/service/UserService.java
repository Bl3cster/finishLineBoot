package com.example.finishlineboot.service;


import com.example.finishlineboot.model.User;

import java.util.List;

public interface UserService {
    void updateUser(Long id, User user);

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

}