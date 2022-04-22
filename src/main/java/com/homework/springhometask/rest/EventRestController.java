package com.homework.springhometask.rest;

import com.homework.springhometask.dto.EventDto;
import com.homework.springhometask.dto.FileDto;
import com.homework.springhometask.service.EventService;
import com.homework.springhometask.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/events")
public class EventRestController {
    private final EventService eventService;
    @Autowired
    public EventRestController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<EventDto> getEventById(@PathVariable(name = "id") Long id){
        EventDto event = eventService.getById(id);
        if(event == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(event, HttpStatus.OK);
    }
}
