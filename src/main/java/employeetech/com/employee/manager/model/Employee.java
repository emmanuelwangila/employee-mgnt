package employeetech.com.employee.manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import  java.io.Serializable;

@Entity
public class Employee implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String email;
    private String title;
    private  String phone;
    private String name;
    private  String imageUrl;
    private String employeeCode;

}
