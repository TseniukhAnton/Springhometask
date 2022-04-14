package com.homework.springhometask.service;

import com.homework.springhometask.model.Event;

import java.util.List;

public interface EventService {
    Event getById(Long id);

    void deleteById(Long id);

    List<Event> getAll();

    Event save(Event event);
}
