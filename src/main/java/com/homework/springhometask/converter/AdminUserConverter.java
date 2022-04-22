package com.homework.springhometask.converter;

import com.homework.springhometask.dto.AdminUserDto;
import com.homework.springhometask.model.User;

public class AdminUserConverter {
    public AdminUserDto convert(User user) {
        AdminUserDto dto = new AdminUserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setStatus(user.getStatus().name());
        return dto;
    }
}
