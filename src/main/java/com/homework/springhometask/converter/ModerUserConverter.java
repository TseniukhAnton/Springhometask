package com.homework.springhometask.converter;

import com.homework.springhometask.dto.AdminUserDto;
import com.homework.springhometask.dto.ModerUserDto;
import com.homework.springhometask.model.User;

public class ModerUserConverter {
    public ModerUserDto convert(User user) {
        ModerUserDto dto = new ModerUserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setStatus(user.getStatus().name());
        return dto;
    }
}
