package com.learning.simran.collegeManagement.repositories;

import com.learning.simran.collegeManagement.entities.AdmissionRecord;
import com.learning.simran.collegeManagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdmissionRecordRepository extends JpaRepository<AdmissionRecord, Long> {

    AdmissionRecord findByStudent(Student student);
}
