package ru.vitaliyefimov.skblab.service.mapper;

import org.springframework.stereotype.Service;
import ru.vitaliyefimov.skblab.entity.Event;
import ru.vitaliyefimov.skblab.entity.dto.EventDto;

@Service
public class EventMapper {
    public EventDto mapToDto(Event event) {
        return new EventDto(event.getName());
    }

    public Event mapToEntity(EventDto eventDto) {
        return new Event()
                .setName(eventDto.name());
    }
}
