package com.homework.springhometask.service;

import com.homework.springhometask.model.File;

import java.util.List;

public interface FileService {
    File getById(Long id);

    void deleteById(Long id);

    List<File> getAll();

    File save(File file);
}
