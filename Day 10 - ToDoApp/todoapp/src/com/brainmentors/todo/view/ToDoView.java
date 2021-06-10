package com.brainmentors.todo.view;
import static com.brainmentors.todo.utils.Constants.ADD_TASK;
import static com.brainmentors.todo.utils.Constants.EXIT;
import static com.brainmentors.todo.utils.Constants.PRINT_TASK;
import static com.brainmentors.todo.utils.MessageReader.getValue;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.repo.IToDoRepo;
import com.brainmentors.todo.repo.ToDoRepo;
public class ToDoView {
	private  static Scanner scanner = new Scanner(System.in);
	private static void addTask() {
		scanner.nextLine();
		System.out.println(getValue("input.taskname"));
		String name = scanner.nextLine();
		System.out.println(getValue("input.taskdesc"));
		String desc = scanner.nextLine();
		
		ToDoDTO todo = new ToDoDTO(name, desc);
		String result = getValue("record.notadded");
		//IToDoRepo repo = new ToDoRepo();
		try {
		IToDoRepo repo = ToDoRepo.getInstance();
		
		
		
		ArrayList<ToDoDTO> tasks = null;
		
		
			try {	
			 tasks = repo.printTasks(); // old task fetch from a file
			}
			catch(EOFException e) {
				System.out.println("File is Empty and add a new record in empty file");
			}
			 if(tasks!=null && tasks.size()>0) {
				tasks.add(todo);
			}
			else {
				tasks = new ArrayList<>();
				tasks.add(todo);
			}
			result = repo.addTask(tasks)?getValue("record.added"):getValue("record.notadded");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		
		
	}
	
	static void printAllTask() {
		
		try {
			IToDoRepo repo = ToDoRepo.getInstance();
			ArrayList<ToDoDTO> tasks = repo.printTasks();
			for(ToDoDTO task : tasks) {
				System.out.println(task);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		outer:
		while(true) {
		System.out.println(getValue("addtask"));
		System.out.println(getValue("deletetask"));
		System.out.println(getValue("updatetask"));
		System.out.println(getValue("searchtask"));
		System.out.println(getValue("printtask"));
		System.out.println(getValue("exittask"));
		System.out.println(getValue("choice"));
		
		int choice = scanner.nextInt();
		switch(choice) {
		case ADD_TASK:
			addTask();
			break;
		case PRINT_TASK:
			printAllTask();
			break;
		case EXIT:
			break outer;
		
			
		}
			
		}
		scanner.close();
		
	}

}
