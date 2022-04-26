package com.homework.springhometask.rest;

import com.homework.springhometask.converter.ModerUserConverter;
import com.homework.springhometask.dto.ModerUserDto;
import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/moder/")
public class ModeratorRestControllerV1 {
    private final UserService userService;

    public ModeratorRestControllerV1(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "users/{id}")
    public ResponseEntity<ModerUserDto> getUserById(@PathVariable(name = "id") Long id) {
        UserDto user = userService.getById(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        ModerUserDto result = new ModerUserConverter().convert(user);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
