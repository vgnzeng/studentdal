package com.zeng.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.zeng.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
