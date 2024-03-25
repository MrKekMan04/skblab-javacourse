package ru.vitaliyefimov.skblab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vitaliyefimov.skblab.entity.Event;
import ru.vitaliyefimov.skblab.repository.EventRepository;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public Event save(Event event) {
        return eventRepository.save(event);
    }
}
