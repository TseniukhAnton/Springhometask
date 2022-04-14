package com.homework.springhometask.service;

import com.homework.springhometask.model.File;
import com.homework.springhometask.model.User;
import com.homework.springhometask.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FileServiceImpl implements FileService{
    FileRepository fileRepository;

    @Autowired
    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public File getById(Long id) {
        return fileRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        fileRepository.deleteById(id);
    }

    public File getFileByName(String fileName, User user) {
        return fileRepository.getFileByName(fileName, user);
    }

    public List<File> getUserFiles(User user) {
        return fileRepository.getUserFiles(user);
    }

    @Override
    public List<File> getAll() {
        return fileRepository.findAll();
    }

    @Override
    public File save(File file) {
        fileRepository.save(file);
        return file;
    }

}
