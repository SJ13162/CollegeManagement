package com.learning.simran.collegeManagement.controllers;

import com.learning.simran.collegeManagement.entities.AdmissionRecord;
import com.learning.simran.collegeManagement.services.AdmissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class AdmissionRecordController {

    @Autowired
    AdmissionRecordService admissionRecordService;

    @PostMapping(path = "/student/{studentId}/admission")
    private ResponseEntity<AdmissionRecord> addAdmissionRecordForStudent(@RequestBody AdmissionRecord admissionRecord, @PathVariable Long studentId){
        return new ResponseEntity<>(admissionRecordService.addAdmission(admissionRecord, studentId), HttpStatus.CREATED);
    }
}
