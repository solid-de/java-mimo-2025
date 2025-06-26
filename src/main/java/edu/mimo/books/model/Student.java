package edu.mimo.books.model;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        super(firstName, lastName, Role.STUDENT_ROLE);
    }
}
