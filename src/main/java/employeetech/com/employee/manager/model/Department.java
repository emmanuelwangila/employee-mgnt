package employeetech.com.employee.manager.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany( mappedBy = "department" , cascade = CascadeType.ALL)
    private List<Employee> employees ;

    public Department () {}

    public Department (String name){
        this.name = name;

    }

    public String getName(){
        return  name;
    }

    public void setName( String name){
        this.name = name;
    }
}
