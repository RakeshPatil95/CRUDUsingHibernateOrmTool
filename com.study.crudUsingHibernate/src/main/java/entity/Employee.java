package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(length = 10)
    private String firstName;
	@Column(length = 10)
    private String lastName;
	@Column(length = 10)
    private Date birthDate;
	@Column(length = 10)
    private String department;
	@Column(length = 10)
    private double salary;

    // Constructors, getters, setters
    public Employee() {
    }

    public Employee(String firstName, String lastName, Date birthDate, String department, double salary) {
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
