package com.zeng.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zeng.student.dal.entities.Student;
import com.zeng.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		
		studentRepository.save(new Student("Guan", "Java Spring Boot", 89d));
	}

}
