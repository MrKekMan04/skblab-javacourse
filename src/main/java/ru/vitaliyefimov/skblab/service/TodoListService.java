package ru.vitaliyefimov.skblab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vitaliyefimov.skblab.entity.TodoList;
import ru.vitaliyefimov.skblab.entity.dto.TodoListDto;
import ru.vitaliyefimov.skblab.repository.TodoListRepository;
import ru.vitaliyefimov.skblab.service.mapper.TodoListMapper;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class TodoListService {
    private final TodoListRepository todoListRepository;
    private final TodoListMapper todoListMapper;
    private final EventService eventService;

    public TodoList save(TodoListDto todoListDto) {
        TodoList entity = todoListMapper.mapToEntity(todoListDto);

        entity.setEvents(entity.getEvents().stream()
                .map(eventService::save)
                .toList());

        return todoListRepository.save(entity);
    }

    public List<TodoListDto> getAllTodoListsDto() {
        return StreamSupport.stream(todoListRepository.findAll().spliterator(), false)
                .map(todoListMapper::mapToDto)
                .toList();
    }
}
