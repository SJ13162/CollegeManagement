package com.learning.simran.collegeManagement.services;

import com.learning.simran.collegeManagement.entities.AdmissionRecord;
import com.learning.simran.collegeManagement.entities.Student;
import com.learning.simran.collegeManagement.repositories.AdmissionRecordRepository;
import com.learning.simran.collegeManagement.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdmissionRecordService {

    @Autowired
    AdmissionRecordRepository admissionRecordRepository;

    @Autowired
    StudentRepository studentRepository;

    public AdmissionRecord addAdmission(AdmissionRecord admissionRecord, Long studentId) {
        Optional<Student> fetchedStudent = studentRepository.findById(studentId);

        return fetchedStudent.map(student -> {
            admissionRecord.setStudent(student);
            admissionRecordRepository.save(admissionRecord);
            return admissionRecord;
        }).orElse(null);
    }
}
