package org.sambasoft.repositories;

import org.sambasoft.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, String>{
 
}
