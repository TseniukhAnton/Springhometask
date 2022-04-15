package com.homework.springhometask.service;

import com.homework.springhometask.converter.EventConverter;
import com.homework.springhometask.dto.EventDto;
import com.homework.springhometask.model.Event;
import com.homework.springhometask.model.User;
import com.homework.springhometask.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventConverter eventConverter;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
        this.eventConverter = new EventConverter();
    }

    public List<EventDto> getUserEvents(User user) {
        List<Event> events = eventRepository.getByUser(user);
        return events.stream().map(eventConverter::convert).collect(Collectors.toList());
    }

    @Override
    public EventDto getById(Long id) {
        Event event = eventRepository.getById(id);
        return eventConverter.convert(event);
    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<EventDto> getAll() {
        List<Event> events = eventRepository.findAll();
        return events.stream().map(eventConverter::convert).collect(Collectors.toList());
    }

    @Override
    public EventDto save(Event event) {
        eventRepository.save(event);
        return eventConverter.convert(event);
    }

}
