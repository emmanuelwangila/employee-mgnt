package employeetech.com.employee.manager.model;

import jakarta.persistence.*;

import  java.io.Serializable;

@Entity
public class Employee implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    private String email;
    private String title;
    private  String phone;
    private String name;
    private  String imageUrl;
    private String employeeCode;

}
