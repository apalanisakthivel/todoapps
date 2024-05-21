package com.example.todoapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapp.Entity.Todo;
import com.example.todoapp.Repository.TodoRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("api/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @PostMapping("/newtodo")
    public String AddTodo(@RequestBody Todo todo) {
        todoRepository.save(todo);
        return "new todo Added.!";
    }

    @GetMapping("/retrivetodo")
    public List<Todo> GetTodo() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    @DeleteMapping("/deletetodo")
    public void RemoveTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
    }

}
