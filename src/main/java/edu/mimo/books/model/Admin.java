package edu.mimo.books.model;

public class Admin extends Staff {
    

    public Admin(String firstName, String lastName, int salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setRole(Role.ADMIN_ROLE);
        this.setSalary(salary);
    }

    
}
