package com.spring.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;

import com.spring.jdbc.entities.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Program Started");
//    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    		
    	ApplicationContext context= new AnnotationConfigApplicationContext(jdbcConfigJava.class);
    	StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
    	
//    	insert
//    	Student student= new Student();
//    	student.setCity("Rajshahi");
//    	student.setId(455);
//    	student.setName("Neimar");
//    	
//    	int result = studentdao.insert(student);
//    	System.out.println("Student Added:"+result);
    	
    
    	
    	//update
//    	Student student=new Student(); 
//    	student.setCity("Bogura");
//    	student.setName("dil");
//    	student.setId(1);
//    	int update =studentdao.change(student);
//    	System.out.println("Student Updated!"+update);   
//    	
    	
    	//delete
//    	int result=studentdao.delete(1);
//    	System.out.println("Informaition Deleted!"+result);
    	
    	//Select/Show
//    	Student show=studentdao.getStudent(123);
//    	System.out.println(studentdao.getStudent(123));    	    	
    
    	List<Student> students=studentdao.getAllStudents();
    	for(Student s: students) {
    		System.out.println(s);
    	}
    }
}
