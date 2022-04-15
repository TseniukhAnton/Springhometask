package com.homework.springhometask.service;

import com.homework.springhometask.dto.EventDto;
import com.homework.springhometask.model.Event;

import java.util.List;

public interface EventService {
    EventDto getById(Long id);

    void deleteById(Long id);

    List<EventDto> getAll();

    EventDto save(Event event);
}
