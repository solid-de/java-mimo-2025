package edu.mimo.books.model;

public class Student extends Person {
    public Student(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setRole(Role.STUDENT_ROLE);
    }
}
