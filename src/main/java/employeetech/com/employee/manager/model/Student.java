package employeetech.com.employee.manager.model;

import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
public class Student implements Serializable {

    private Long id;
    private String name;
    private String course;
    private String email;
    private Number age;

}
