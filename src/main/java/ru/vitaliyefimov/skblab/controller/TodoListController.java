package ru.vitaliyefimov.skblab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vitaliyefimov.skblab.entity.TodoList;
import ru.vitaliyefimov.skblab.entity.dto.TodoListDto;
import ru.vitaliyefimov.skblab.service.TodoListService;

import java.util.Collection;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoListController {
    private final TodoListService todoListService;

    @PostMapping
    public TodoList saveTodoList(@RequestBody TodoListDto request) {
        return todoListService.save(request);
    }

    @GetMapping
    public Collection<TodoListDto> getAllTodoLists() {
        return todoListService.getAllTodoListsDto();
    }
}
