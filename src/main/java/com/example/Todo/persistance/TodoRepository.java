package com.example.Todo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Todo.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

}
