package com.example.Todo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Todo.model.TodoEntity;
import com.example.Todo.persistance.TodoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Optional<TodoEntity> create(final TodoEntity entity) {
		// Validations
		validate(entity);
		repository.save(entity);
		return repository.findById(entity.getId());
	}

	public void validate(final TodoEntity entity) {
		if (entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		if (entity.getUserId() == null) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
	}
}
