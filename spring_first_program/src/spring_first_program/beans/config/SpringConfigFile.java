package spring_first_program.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring_first_program.beans.student;

@Configuration
public class SpringConfigFile {

	@Bean
	public student stdid1() {
		student std= new student();
		
		std.setName("tejas");
		std.setRollno(101);
		std.setEmail("tejas@gmail.com");
		return std;
		
	}
}
