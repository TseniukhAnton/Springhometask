package com.homework.springhometask.rest;

import com.homework.springhometask.dto.FileDto;
import com.homework.springhometask.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/files/")
public class FileRestControllerV1 {
    private final FileService fileService;
    @Autowired
    public FileRestControllerV1(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<FileDto> getFileById(@PathVariable(name = "id") Long id){
        FileDto file = fileService.getById(id);
        if(file == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(file, HttpStatus.OK);
    }
}
