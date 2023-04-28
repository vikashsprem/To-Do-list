package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class TodoService {

	private static List<Todo>  todos =new ArrayList<Todo>();
	public static int count=0;
	static {
		todos.add(new Todo(++count, "in28minutes","Learn AWS1", 
							LocalDate.now().plusYears(1), false ));
		todos.add(new Todo(++count, "in28minutes","Learn DevOps1",
				LocalDate.now().plusYears(2), false ));
		todos.add(new Todo(++count, "in28minutes","Learn Full Stack Development1", 
				LocalDate.now().plusYears(3), false ));
	}
	public List<Todo> findByUsername(String username) {
		Predicate<? super Todo> predicate = 
				todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String username,String descripiton,LocalDate targetDate,boolean done) {
		Todo todo = new Todo(++count,username,descripiton,targetDate,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId()== id;
		todos.removeIf(predicate);
	}


	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId()== id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
		
	}
	
}