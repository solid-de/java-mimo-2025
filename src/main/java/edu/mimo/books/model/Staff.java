package edu.mimo.books.model;

public class Staff extends Person implements HavingSalary {
    
    protected int salary;

    public Staff(String firstName, String lastName, Role role, int salary) {
        super(firstName, lastName, role);
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
