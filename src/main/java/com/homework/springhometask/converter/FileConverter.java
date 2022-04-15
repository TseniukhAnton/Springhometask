package com.homework.springhometask.converter;


import com.homework.springhometask.dto.FileDto;
import com.homework.springhometask.model.File;

public class FileConverter {
    public FileDto convert(File file) {
        FileDto dto = new FileDto();
        dto.setId(file.getId());
        dto.setName(file.getName());
        return dto;
    }
}
