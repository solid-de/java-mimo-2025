package edu.mimo.books.model;

public class EqualsDemo {
    public static void main(String[] args) {
        

        Admin a = new Admin("Michael", null, 2000);
        a.setLastName("Brown");

        Admin b = new Admin("Michael", "Brown", 2100);

        Student student2 = new Student("Liam", "Wilson");

        System.out.println(a.equals(b));

        System.out.println(a.equals(student2));

        
    }

    static String getSuffix() {
        return "lo";
    }

    static int getJ(){
        return 100;
    }
}
