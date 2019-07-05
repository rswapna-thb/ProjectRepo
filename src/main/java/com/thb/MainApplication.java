/*Rev No|Date   |Userstory Id/bug Id|Person name |Comment                |
 * 1    |6/26/19|                   |Shibu       |created                |
 * 2    |6/27/19|getter/setter miss |Shibu       |added controller,models|
 * 3    |6/28/19|                   |Anil        |added controller,models|
 * 4    |7/1/19 |                   |Shibu & Anil|merging front and back |
 * 5    |7/2/19 |                   |Shibu & Anil|merged 3 components    |
 * 
 * */





package com.thb;
import com.thb.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import  org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages={"com.thb.model"})
@SpringBootApplication(scanBasePackages={
"com.thb.*"})
@EnableJpaRepositories("com.thb.repository")
//@ComponentScan(basePackageClasses = {com.thb.controller.c})
@EnableJpaAuditing
public class MainApplication {

	public static void main(String args[])
	{
		
		SpringApplication.run(MainApplication.class, args);
	}
}
