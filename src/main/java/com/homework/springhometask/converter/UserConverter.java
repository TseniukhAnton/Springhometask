package com.homework.springhometask.converter;

import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.User;

public class UserConverter {

    public UserDto convert(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        return dto;
    }
}
