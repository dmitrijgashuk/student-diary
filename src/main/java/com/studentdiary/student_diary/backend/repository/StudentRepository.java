package com.studentdiary.student_diary.backend.repository;

import com.studentdiary.student_diary.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByIsActiveTrue();
}
