package com.example.studentapi;

import java.util.Optional;

public interface StudentRepository {

    void save(Student student);

    Student get(String id);

    Student delete(String id);

    void update(String id, Student student);

}
