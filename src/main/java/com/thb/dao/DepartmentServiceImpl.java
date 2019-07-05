package com.thb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thb.model.Department;
import com.thb.repository.DepartmentRepository;


import java.util.List;

@Service
public class DepartmentServiceImpl  {
//implements DepartmentService
    @Autowired
    private DepartmentRepository repository;

    
    public Department create(Department user) {
        return repository.save(user);
    }
    
    public List<Department> findAll() {
      return repository.findAll();
    }
    
    
    public Department findById(int id) {
      return repository.getOne(id);
    	}

//  

//

//    //@Override
//    public Department update(Department user) {
//        return repository.save(user);
//    }
}
