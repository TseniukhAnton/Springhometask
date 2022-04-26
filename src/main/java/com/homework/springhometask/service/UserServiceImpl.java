package com.homework.springhometask.service;

import com.homework.springhometask.converter.UserConverter;
import com.homework.springhometask.dto.UserDto;
import com.homework.springhometask.model.Role;
import com.homework.springhometask.model.Status;
import com.homework.springhometask.model.User;
import com.homework.springhometask.repository.RoleRepository;
import com.homework.springhometask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final UserConverter userConverter;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,BCryptPasswordEncoder passwordEncoder, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.userConverter = userConverter;
    }

    @Override
    public UserDto register(User user) {
        Role roleUser = roleRepository.findByName("USER");
        List<Role> userRoles = new ArrayList<>();
        userRoles.add(roleUser);

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(userRoles);
        user.setStatus(Status.ACTIVE);

        User registeredUser = userRepository.save(user);

        return userConverter.convert(registeredUser);
    }

    @Override
    public UserDto getById(Long id) {
        User user = userRepository.getById(id);
        if (user == null){
            throw new UsernameNotFoundException("No user found!!!");
        }
        return userConverter.convert(user);
    }

    public UserDto getByUsername(String username) {
        User user = userRepository.getByUsername(username);
        return userConverter.convert(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(userConverter::convert).collect(Collectors.toList());
    }

    @Override
    public UserDto save(User user) {
        userRepository.save(user);
        return userConverter.convert(user);
    }

    @Override
    public UserDto update(User user, Role role) {
        List<Role> roles = user.getRoles();
        roles.add(role);
        userRepository.save(user);
        return userConverter.convert(user);
    }


}
