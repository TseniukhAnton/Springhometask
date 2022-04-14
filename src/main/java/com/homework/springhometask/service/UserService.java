package com.homework.springhometask.service;

import com.homework.springhometask.model.User;

import java.util.List;

public interface UserService {
    User getById(Long id);

    void deleteById(Long id);

    List<User> getAll();

    User save(User user);

}
