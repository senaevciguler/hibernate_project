package hibernateProject.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "department")
public class Department {
    @Column(name="name")
    String name;
    @Id
    @GeneratedValue
    Integer departmentId;


}
