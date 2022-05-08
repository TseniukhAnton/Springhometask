package com.homework.springhometask.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework.springhometask.model.BaseEntity;
import com.homework.springhometask.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto extends BaseEntity{
    private Long id;
    private String username;
    private String password;
    private List<Role> roles;
}
