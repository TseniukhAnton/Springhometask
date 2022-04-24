package com.homework.springhometask.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework.springhometask.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto{
    private Long id;
    private String username;
    //private String password;
}
