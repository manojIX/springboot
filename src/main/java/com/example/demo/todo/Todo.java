package com.example.demo.todo;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	
	@Override
	public String toString() {
		return "Todo [toString()=" + super.toString() + "]";
	}

	protected Todo() {}
	
	public Todo(String todo) {this.todo = todo;}
	
	@Nonnull
	String todo;

	public int getId() {
		return id;
	}

	public String getTodo() {
		return todo;
	}
	
	
}
