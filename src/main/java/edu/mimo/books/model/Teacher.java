package edu.mimo.books.model;

public class Teacher extends Staff {

    public Teacher(String firstName, String lastName, int salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setRole(Role.TEACHER_ROLE);
        this.setSalary(salary);
    }


}
