package com.thb.controller;
import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thb.*;
import com.thb.dao.EmployeeDAO;
import com.thb.model.Employee;
import com.thb.model.LeaveModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@CrossOrigin(origins ="*",maxAge = 36000)
@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
EmployeeDAO dao;
	 
    @Autowired
    private JavaMailSender sender;
	
	@PostMapping(path="/add" ,consumes=MediaType.APPLICATION_JSON)
	
	public Employee addUser(@RequestBody Employee emp)
	{
		home(emp.getEmail(),emp.getCrtPassword());
	//return
		
		file_upload();
		return dao.save(emp);
			//return "redirect:/upload.file_upload";

		  
	}
	
//	@PostMapping("/upload")
	public void  file_upload()
	{
	  System.out.println("hello world");
	}
	
	
	
	
    @ResponseBody
	String  home(String email,String pass) {
        try {
            sendEmail(email,pass);
            return "Email Sent!";
        }catch(Exception ex) {
            return "Error in sending email: "+ex;
        }
    }
   
	
	@GetMapping("/list")
	
	public List<Employee> getUser(Employee emp)
	{
		return dao.findall();
	}
	
	@GetMapping("/update")
	public Employee getid(@RequestParam("id") Long id)
	{
		return dao.findone(id);
	}
	
	
	@PostMapping("/leave")
	public LeaveModel addLeave(@RequestBody LeaveModel emp)
	{
	return	dao.saveLeave(emp);
	}
	
	
	@GetMapping("/login")
	public  Employee logged(@RequestParam("email") String email,@RequestParam("crtPassword") String password)
	{
		//System.out.println(email + " " +password);
		
		return dao.log(email, password);
	}
	
	//mail function
	   private void sendEmail(String email,String pass) throws Exception{
	        MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);
	         System.out.println();
	        helper.setTo(email);
	        helper.setText("Your user_name :"+email+"\npassword : "+pass);
	        helper.setSubject("wellcome to THB Family");
	        sender.send(message);
	    }
	
	
	
}
