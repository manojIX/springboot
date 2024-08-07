package com.example.demo.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TodoRepo extends JpaRepository<Todo, Integer>{
	
}
	