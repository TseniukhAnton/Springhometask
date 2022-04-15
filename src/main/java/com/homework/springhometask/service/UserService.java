package com.homework.springhometask.service;

import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.User;

import java.util.List;

public interface UserService {
    UserDto getById(Long id);

    void deleteById(Long id);

    List<UserDto> getAll();

    UserDto save(User user);

}
