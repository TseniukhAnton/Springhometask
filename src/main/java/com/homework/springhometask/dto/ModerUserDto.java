package com.homework.springhometask.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework.springhometask.model.Role;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModerUserDto {
    private Long id;
    private String username;
    private String password;
    private List<Role> roles;
}
