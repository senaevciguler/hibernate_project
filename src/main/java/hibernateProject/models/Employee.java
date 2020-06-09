package hibernateProject.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employees")
@Data
public class Employee {


    @Column(name = "firstName")
    String firstName;
    String lastName;
    @Id
    Integer employeeId;
    Date dateOfBirth;
    String phoneNumber;
    @Column(name = "email")
    String email;
    Integer salary;
    @ManyToMany
    @JoinTable(name = "departmentId")
    Department departments;
    Integer managerId;

}
