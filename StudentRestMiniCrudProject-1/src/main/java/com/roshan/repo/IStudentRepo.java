package com.roshan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roshan.entity.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {


}
