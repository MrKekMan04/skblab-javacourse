--liquibase formatted sql

--changeset MrKekMan04:1
CREATE TABLE IF NOT EXISTS todo_list
(
    id   BIGINT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(64) NOT NULL,
    PRIMARY KEY (id)
);

--changeset MrKekMan04:2
CREATE TABLE IF NOT EXISTS event
(
    id   BIGINT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS todo_list_event
(
    todo_list_id BIGSERIAL REFERENCES todo_list (id) ON DELETE CASCADE,
    event_id     BIGSERIAL REFERENCES event (id),
    PRIMARY KEY (todo_list_id, event_id)
)