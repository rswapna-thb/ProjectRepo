package com.thb.repository;
import com.thb.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
	@Query("SELECT u FROM Employee u WHERE u.email=?1 AND u.crtPassword=?2 ")
	 Employee checklog(String email,String password);
	
	
}
