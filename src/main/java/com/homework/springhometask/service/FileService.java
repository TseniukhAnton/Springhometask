package com.homework.springhometask.service;

import com.homework.springhometask.dto.FileDto;
import com.homework.springhometask.model.File;

import java.util.List;

public interface FileService {
    FileDto getById(Long id);

    void deleteById(Long id);

    List<FileDto> getAll();

    FileDto save(File file);
}
