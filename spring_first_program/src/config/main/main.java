package config.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_first_program.beans.student;
import spring_first_program.beans.config.SpringConfigFile;

public class main {
	
	public static void main(String[] args)
	{
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	
	student std =context.getBean(student.class);
	std.display();
		
	}
}
