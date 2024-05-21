package com.example.todoapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoapp.Entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
