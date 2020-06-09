package hibernateProject.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Projects")
@Data
public class Project {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer projectId;
    @Column(name="description")
    String description;
    @Transient
    String transientField;

}
