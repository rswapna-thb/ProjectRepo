package com.thb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thb.model.Department;

import java.util.List;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

//    void delete(Department depart);
//
//    List<Department> findAll();
//
//    Department findOne(int id);
//
//    Department save(Department depart);
}
