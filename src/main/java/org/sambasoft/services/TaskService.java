package org.sambasoft.services;

import java.util.List;

import org.sambasoft.entities.Task;
import org.sambasoft.entities.User;
import org.sambasoft.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	public List<Task>  findUserTask(User user){
		
		return taskRepository.findByUser(user);
	}

}
