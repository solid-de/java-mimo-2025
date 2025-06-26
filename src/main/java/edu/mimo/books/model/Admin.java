package edu.mimo.books.model;

public class Admin extends Staff {
    

    public Admin(String firstName, String lastName, int salary) {
        super(firstName, lastName, Role.ADMIN_ROLE, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Admin)) {
            return false;
        }
        Admin asAdmin = (Admin)obj;
        if(!this.getFirstName().equals(asAdmin.getFirstName())){//FIXME NPE
            return false;
        }
        if(!this.getLastName().equals(asAdmin.getLastName())){
            return false;
        }
        if(this.getSalary() != asAdmin.getSalary()){
            return false;
        }
        return true;
    }



    
}
