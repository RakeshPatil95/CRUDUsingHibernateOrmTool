package dto;

import java.util.Date;

public class EmployeeDto {
	 private Long id;
	    private String firstName;
	    private String lastName;
	    private Date birthDate;
	    private String department;
	    private double salary;

	    // Constructors, getters, setters
	    public EmployeeDto() {
	    }

	    public EmployeeDto(String firstName, String lastName, Date birthDate, String department, double salary) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.birthDate = birthDate;
	        this.department = department;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
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

	    public Date getBirthDate() {
	        return birthDate;
	    }

	    public void setBirthDate(Date birthDate) {
	        this.birthDate = birthDate;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // toString() method
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", birthDate=" + birthDate +
	                ", department='" + department + '\'' +
	                ", salary=" + salary +
	                '}';
	    }

}
