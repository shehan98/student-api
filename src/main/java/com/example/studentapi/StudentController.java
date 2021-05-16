package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    //REST ENDPOINTS
    // create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

        repository.save(student);

        //todo: logic to save the student in the database

        /*
        System.out.println("name:" + student.name);
        System.out.println("age:" + student.age);
        System.out.println("tp:" + student.tp);

         */
    }

    // retrieve a student
    @GetMapping("/student/:id")
    public  Student getStudent(@PathVariable String id){

        return repository.get(id);
    }

    // delete a student
    @DeleteMapping("/student/:id")
    public Student deleteStudent(@PathVariable String id){

        return repository.delete(id);
    }

    // update a student
    @PutMapping("/student/:id")
    public void updateStudent(@RequestBody Student student, @PathVariable String id){

        repository.update(id, student);
    }
}