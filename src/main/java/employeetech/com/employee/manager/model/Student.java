package employeetech.com.employee.manager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( nullable = false , updatable = false)

    private Long id;
    private String name;
    private String course;
    private String email;
    private Number age;

    public Student () {};

    public Student( String name , String course , String email , Number age){
        this.name = name ;
        this.course = course ;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail (){
        return  email;
    }

    public void  setEmail( String email){
        this.email = email;
    }

    public Number getAge (){
        return age;
    }

    public void setAge(Number age){
        this.age = age;
    }

    public String getCourse(){
        return  course;
    }

    public void setCourse(String course){
        this.course = course;
    }


}
