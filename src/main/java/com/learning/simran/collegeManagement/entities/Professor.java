package com.learning.simran.collegeManagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToMany(mappedBy = "professor")
    private List<Subject> subjects;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "professor_students", joinColumns = @JoinColumn(name = "professor_id"), inverseJoinColumns = @JoinColumn(name="student_id"))
    private List<Student> students;
}
