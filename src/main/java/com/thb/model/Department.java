package com.thb.model;

import javax.persistence.*;

@Entity
@Table(name = "DepartmentTable1")
public class Department {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   // @Column
//    private String firstName;
//   
//    @Column
//    private String email;
//    @Column
//    private String depatName;
//    
//    @Column
//    private String lastName;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getDepatName() {
//		return depatName;
//	}
//	public void setDepatName(String depatName) {
//		this.depatName = depatName;
//	}

    
    //for department portal
//    @Column
//    private String deptId;
//    @Column
//    private String deptName;
//    @Column
//    private String deptMange;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getDeptId() {
//		return deptId;
//	}
//	public void setDeptId(String deptId) {
//		this.deptId = deptId;
//	}
//	public String getDeptName() {
//		return deptName;
//	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//	public String getDeptMange() {
//		return deptMange;
//	}
//	public void setDeptMange(String deptMange) {
//		this.deptMange = deptMange;
//	}    
    
    //data from new project called dscreen
//    private String deptId;
//    private  String deptName;
//    private String deptManager;
//    private String empId;
//    private String empDesig;
//    private String loc;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getDeptId() {
//		return deptId;
//	}
//	public void setDeptId(String deptId) {
//		this.deptId = deptId;
//	}
//	public String getDeptName() {
//		return deptName;
//	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//	public String getDeptManager() {
//		return deptManager;
//	}
//	public void setDeptManager(String deptManager) {
//		this.deptManager = deptManager;
//	}
//	public String getEmpId() {
//		return empId;
//	}
//	public void setEmpId(String empId) {
//		this.empId = empId;
//	}
//	public String getEmpDesig() {
//		return empDesig;
//	}
//	public void setEmpDesig(String empDesig) {
//		this.empDesig = empDesig;
//	}
//	public String getLoc() {
//		return loc;
//	}
//	public void setLoc(String loc) {
//		this.loc = loc;
//	}
    @Column
     private String deptId;
    @Column
     private  String deptName;
    @Column
     private String deptManager;
    @Column
    private String empId;
    @Column
    private String empDesig;
    @Column
    private String loc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptManager() {
		return deptManager;
	}
	public void setDeptManager(String deptManager) {
		this.deptManager = deptManager;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
    
    
    
	
     
}
