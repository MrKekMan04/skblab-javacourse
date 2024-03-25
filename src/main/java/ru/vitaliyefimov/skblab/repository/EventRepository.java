package ru.vitaliyefimov.skblab.repository;

import org.springframework.data.repository.CrudRepository;
import ru.vitaliyefimov.skblab.entity.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
}
