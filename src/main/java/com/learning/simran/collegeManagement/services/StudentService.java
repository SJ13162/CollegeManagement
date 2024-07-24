package com.learning.simran.collegeManagement.services;

import com.learning.simran.collegeManagement.entities.AdmissionRecord;
import com.learning.simran.collegeManagement.entities.Student;
import com.learning.simran.collegeManagement.repositories.AdmissionRecordRepository;
import com.learning.simran.collegeManagement.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AdmissionRecordRepository admissionRecordRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        AdmissionRecord admissionRecord = admissionRecordRepository.findByStudent(student.get());

        admissionRecordRepository.delete(admissionRecord);
    }
}
