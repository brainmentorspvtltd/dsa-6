package com.brainmentors.todo.repo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.utils.Constants;

// Singleton class - Design pattern
public class ToDoRepo implements IToDoRepo{
	private File file;
	private static ToDoRepo todoRepo; // null
	private ToDoRepo() throws IOException {
		file = new File(Constants.PATH);
		file.createNewFile();
	}
	public static ToDoRepo getInstance() throws IOException {
		if(todoRepo==null) {
			todoRepo = new ToDoRepo();
		}
		return todoRepo;
	}

	@Override
	public boolean addTask(ArrayList<ToDoDTO> tasks) throws IOException {
	
		FileOutputStream fo = null;
		ObjectOutputStream os = null;
		
		try {
		 fo =new FileOutputStream(file);
		 os = new ObjectOutputStream(fo);
		os.writeObject(tasks);
		}
		finally {
			if(os!=null) {
				os.close();
			}
			if(fo!=null) {
				fo.close();
			}
		}
		os.close();
		fo.close();
		return true;
	}

	@Override
	public ArrayList<ToDoDTO> printTasks() throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<ToDoDTO> list =new ArrayList<>();
		try(FileInputStream fs = new FileInputStream(file)){
			try(ObjectInputStream os = new ObjectInputStream(fs)){
				list = (ArrayList<ToDoDTO>)os.readObject();
			}
		}
		return list;
		
	}
	
	

}
