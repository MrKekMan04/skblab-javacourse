package ru.vitaliyefimov.skblab.service.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vitaliyefimov.skblab.entity.TodoList;
import ru.vitaliyefimov.skblab.entity.dto.TodoListDto;

@Service
@RequiredArgsConstructor
public class TodoListMapper {
    private final EventMapper eventMapper;

    public TodoListDto mapToDto(TodoList todoList) {
        return new TodoListDto(todoList.getName(), todoList.getEvents()
                .stream().map(eventMapper::mapToDto)
                .toList());
    }

    public TodoList mapToEntity(TodoListDto todoListDto) {
        return new TodoList()
                .setName(todoListDto.name())
                .setEvents(todoListDto.events().stream()
                        .map(eventMapper::mapToEntity)
                        .toList());
    }
}
