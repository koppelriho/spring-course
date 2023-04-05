package edu.sda.demo.service;

import edu.sda.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(){
        int age=20;
        if(age>18) {
            System.out.println("Student can be registered");
            studentRepository.saveStudent();
        }
    }
}
