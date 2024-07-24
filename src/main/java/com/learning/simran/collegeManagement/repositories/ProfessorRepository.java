package com.learning.simran.collegeManagement.repositories;

import com.learning.simran.collegeManagement.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
