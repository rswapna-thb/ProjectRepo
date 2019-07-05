package com.thb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.thb.model.LeaveModel;
@Repository
public  interface LeaveRepository extends JpaRepository<LeaveModel,Long>{

}
