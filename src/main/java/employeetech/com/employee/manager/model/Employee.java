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
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee () {}

    public  Employee(String name, String email , String title , String phone , String imageUrl, String employeeCode){
        this.name = name;
        this.email = email;
        this.title = title;
        this.employeeCode = employeeCode;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return  name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return  email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTitle(){
        return  title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;

    }
    public String getImageUrl(){
        return imageUrl;
    }

    public  void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }


}
