package edu.mimo.books.model;

public class Person {
    private String firstName;
    private String lastName;
    private Role role;

    public Person(String firstName, String lastName, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    

    
}
