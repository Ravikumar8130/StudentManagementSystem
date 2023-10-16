package com.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
