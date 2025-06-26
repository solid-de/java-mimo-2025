package edu.mimo.books.model;

public class Teacher extends Staff {

    public Teacher(String firstName, String lastName, int salary) {
        super(firstName, lastName, Role.TEACHER_ROLE, salary);
    }


}
