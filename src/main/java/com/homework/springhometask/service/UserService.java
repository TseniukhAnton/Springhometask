package com.homework.springhometask.service;

import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.User;

import java.util.List;

public interface UserService {

    UserDto register(User user);

    UserDto getById(Long id);

    UserDto getByUsername(String username);

    void deleteById(Long id);

    List<UserDto> getAll();

    UserDto save(User user);

}
