package ru.vitaliyefimov.skblab.entity.dto;

import java.util.List;

public record TodoListDto(
        String name,
        List<EventDto> events
) {
}
