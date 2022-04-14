package com.homework.springhometask.repository;

import com.homework.springhometask.model.Event;
import com.homework.springhometask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> getUserEvents(User user);
}
