package com.thb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.thb.dao.DepartmentServiceImpl;
import com.thb.model.Department;
//import com.thb.repository.DepartmentService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})
@RequestMapping("/Depat")
public class DepartmentController {

    @Autowired
   private DepartmentServiceImpl dao;

    @PostMapping
    public Department create(@RequestBody Department depart){
        return dao.create(depart);
    }

    @GetMapping(path = {"/{id}"})
    public Department findOne(@PathVariable("id") int id){
        return dao.findById(id);
    }
//
//    @PutMapping(path = {"/{id}"})
//    public Department update(@PathVariable("id") int id, @RequestBody Department depart){
//    	depart.setId(id);
//        return departmentService.update(depart);
//    }

//    @DeleteMapping(path ={"/{id}"})
//    public Department delete(@PathVariable("id") int id) {
//        return departmentService.delete(id);
//    }

    @GetMapping("/list")
    public List<Department> findAll(){
        return dao.findAll();
    }
    
  
    
}
