package edu.mimo.books;

import java.util.List;

import edu.mimo.books.model.Admin;
import edu.mimo.books.model.Person;
import edu.mimo.books.model.Role;
import edu.mimo.books.model.Staff;
import edu.mimo.books.model.Student;
import edu.mimo.books.model.Teacher;

public class App {

    public static void main(String[] args) {

        allPersons().forEach(person -> {
            System.out.println("My role is: '" + person.getRole().getLabel() + "'");
        });
        
        allStaff().forEach(staff -> {
            if(Role.TEACHER_ROLE.equals(staff.getRole())){
                System.out.println("Bonus pour teacher");
            } 
            if(Role.ADMIN_ROLE.equals(staff.getRole())) {
                System.out.println("Bonus pour admin");
            }
        });



    }


    public static List<Staff> allStaff() {
        Admin admin = new Admin("Michael", "Brown", 2000);
        Teacher teacher = new Teacher("Sarah", "Johnson", 2400);
        return List.of(admin, teacher);
    }

    public static List<Person> allPersons() {
        Admin admin = new Admin("Michael", "Brown", 2000);
        Teacher teacher = new Teacher("Sarah", "Johnson", 2400);
        Student student1 = new Student("Emma", "Davis");
        Student student2 = new Student("Liam", "Wilson");

        return List.of(admin, teacher, student1, student2);
    }

}
