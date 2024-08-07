package com.example.demo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@Autowired
	private TodoRepo repo;
	
	@GetMapping("/todo")
	public List<Todo> getTodos() {
		return repo.findAll();
	}
	
	@PostMapping("/todo")
	public void addTodo(@RequestBody String todo) {
		Todo newTodo = new Todo(todo);
		System.out.println(todo);
		repo.save(newTodo);
	}
	
}
