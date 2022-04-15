package com.homework.springhometask.repository;

import com.homework.springhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //@Query("select b from User b where b.username = :username")
    User getByUsername(String username);

}
