package edu.mimo.books.model;

public class Staff extends Person implements HavingSalary {
    
    protected int salary;

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
