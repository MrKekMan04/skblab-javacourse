package ru.vitaliyefimov.skblab.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vitaliyefimov.skblab.entity.TodoList;

public interface TodoListRepository extends CrudRepository<TodoList, Long> {
}
