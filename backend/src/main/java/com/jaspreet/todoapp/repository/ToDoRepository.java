package com.jaspreet.todoapp.repository;

import com.jaspreet.todoapp.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
