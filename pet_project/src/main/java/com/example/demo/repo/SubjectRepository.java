package com.example.demo.repo;

import com.example.demo.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
