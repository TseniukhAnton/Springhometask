package com.homework.springhometask.converter;


import com.homework.springhometask.dto.EventDto;
import com.homework.springhometask.model.Event;
import org.springframework.stereotype.Component;

@Component
public class EventConverter {
    public EventDto convert(Event event) {
        EventDto dto = new EventDto();
        dto.setId(event.getId());
        dto.setEventName(event.getEventName());
        return dto;
    }
}
