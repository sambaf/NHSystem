package org.sambasoft.repositories;

import java.util.List;

import org.sambasoft.entities.Task;
import org.sambasoft.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
}
