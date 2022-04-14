package com.homework.springhometask.service;

import com.homework.springhometask.model.Event;
import com.homework.springhometask.model.User;
import com.homework.springhometask.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getUserEvents(User user) {
        return eventRepository.getUserEvents(user);
    }

    @Override
    public Event getById(Long id) {
        return eventRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event save(Event event){
        eventRepository.save(event);
        return event;
    }

}
