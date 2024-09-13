package employeetech.com.employee.manager.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@JsonPOJOBuilder
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false , unique = true)
    private String firstName;

    private String lastName;

    @Column(nullable = false , unique = true)
    private  String password;

    @Column(nullable = false , unique = true)
    private String email;







}
