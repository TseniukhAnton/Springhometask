package com.homework.springhometask.converter;

import com.homework.springhometask.dto.AdminUserDto;
import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.User;

public class AdminUserConverter {
    public AdminUserDto convert(UserDto user) {
        AdminUserDto dto = new AdminUserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setRoles(user.getRoles());
        return dto;
    }
}
