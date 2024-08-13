package employeetech.com.employee.manager.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(nullable = false , updatable = false)

    public String name;
    public String location;
    public Number branches;
    public String phone;
    public Boolean debt;

    public Company () {}

    public  Company(String name , String location , Number branches , String phone , Boolean debt){
        this.name = name;
        this.location = location;
        this.branches = branches;
        this.phone = phone ;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone (){
        return  phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Number getBranches() {
        return branches;
    }

    public void setBranches(Number branches) {
        this.branches = branches;
    }

}
