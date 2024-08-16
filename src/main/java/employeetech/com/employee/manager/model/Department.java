package employeetech.com.employee.manager.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String name;
    private List<Employee> employees;

    public Department department () {
        return null;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

}
