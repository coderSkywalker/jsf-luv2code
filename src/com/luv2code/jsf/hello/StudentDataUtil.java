package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;
	
	public StudentDataUtil() {
		loadSampleData();
	}

	private void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("John", "Doe", "USA", "john.doe@gmail.com"));
		students.add(new Student("Anna", "Jopek", "Poland", "anna.maria@gmail.com"));
		students.add(new Student("Wiera", "Kokina", "Russia", "wierakokina@gmail.com"));
		
	}

	public List<Student> getStudents() {
		return students;
	}
	
	

}
