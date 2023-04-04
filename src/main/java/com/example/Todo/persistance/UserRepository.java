package com.example.Todo.persistance;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Todo.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	UserEntity findByEmail(String email);
	Boolean existsByEmail(String email);
	UserEntity findByEmailAndPassword(String email, String password);
}
