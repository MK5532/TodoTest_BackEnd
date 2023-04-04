package com.example.Todo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Todo.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

	@Query("select t from TodoEntity t where t.userId = ?1")
	List<TodoEntity>findByUserId(String userId);
}
