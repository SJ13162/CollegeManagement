package com.learning.simran.collegeManagement.repositories;

import com.learning.simran.collegeManagement.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
