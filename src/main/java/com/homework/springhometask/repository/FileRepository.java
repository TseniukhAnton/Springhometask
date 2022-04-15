package com.homework.springhometask.repository;

import com.homework.springhometask.model.File;
import com.homework.springhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FileRepository extends JpaRepository<File, Long> {
    //@Query("select b from File b where b.user = :user")
    List<File> getByUser(User user);
    //@Query("select b from File b where b.name = :name")
    File getByNameAndUser(String name, User user);
}
