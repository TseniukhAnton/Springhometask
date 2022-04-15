package com.homework.springhometask.service;

import com.homework.springhometask.converter.FileConverter;
import com.homework.springhometask.dto.FileDto;
import com.homework.springhometask.model.File;
import com.homework.springhometask.model.User;
import com.homework.springhometask.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileServiceImpl implements FileService {
    private final FileRepository fileRepository;
    private final FileConverter fileConverter;

    @Autowired
    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
        this.fileConverter = new FileConverter();
    }

    @Override
    public FileDto getById(Long id) {
        File file = fileRepository.getById(id);
        return fileConverter.convert(file);
    }

    @Override
    public void deleteById(Long id) {
        fileRepository.deleteById(id);
    }

    public FileDto getByNameAndUser(String fileName, User user) {
        File file = fileRepository.getByNameAndUser(fileName, user);
        return fileConverter.convert(file);
    }

    public List<FileDto> getUserFiles(User user) {
        List<File> files = fileRepository.getByUser(user);
        return files.stream().map(fileConverter::convert).collect(Collectors.toList());
    }

    @Override
    public List<FileDto> getAll() {
        List<File> files = fileRepository.findAll();
        return files.stream().map(fileConverter::convert).collect(Collectors.toList());
    }

    @Override
    public FileDto save(File file) {
        fileRepository.save(file);
        return fileConverter.convert(file);
    }

}
