package com.example.Spring.Project.dao;

import com.example.Spring.Project.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    List<User> getAllUser();
    User getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);

}
