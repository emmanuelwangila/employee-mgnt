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

    public User () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword () {
        return  password;
    }

    public void setPassword ( String password) {
        this.password = password;
    }

    public String getEmail () {
        return  email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void  setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }
}
