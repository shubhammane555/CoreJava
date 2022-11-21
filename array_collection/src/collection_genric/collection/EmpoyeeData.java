package com.collection;


import java.util.ArrayList;
import java.util.List;

class Employee {
    protected long employeeId;
    protected String firstName;
    protected String lastName;
    
   

    Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

	
	 public String toString() 
	 { 
		 return "Employee [employeeId=" +employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]"; 
		 }
	 

    public boolean isEqual(Employee other) {
        if (other == null || !(other instanceof Employee)) {
            return false;
        }
        return this == other || (this.employeeId == other.employeeId && this.firstName.equals(other.firstName));
    }

}

public class EmpoyeeData {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Karan", "Seth"));
        employees.add(new Employee(2, "Shivam", "Khanna"));
        employees.add(new Employee(3, "Sagar", "Chaurasia"));
        employees.add(new Employee(1, "Karan", "Seth"));
        employees.forEach(System.out::println);
       
        System.out.println(employees.get(0).isEqual(employees.get(3)));
    }
}