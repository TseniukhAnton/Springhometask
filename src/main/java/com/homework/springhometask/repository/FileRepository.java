package com.homework.springhometask.repository;

import com.homework.springhometask.model.File;
import com.homework.springhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<File, Long> {
    List<File> getUserFiles(User user);
    File getFileByName(String fileName, User user);
}
