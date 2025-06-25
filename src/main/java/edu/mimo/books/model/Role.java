package edu.mimo.books.model;

public enum Role {
    ADMIN_ROLE("admin"),
    TEACHER_ROLE("teacher"),
    STUDENT_ROLE("student");


    private final String label;

    Role(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    
}
