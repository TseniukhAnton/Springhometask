package com.homework.springhometask.converter;

import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDto convert(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setRoles(user.getRoles());
        return dto;
    }
}
