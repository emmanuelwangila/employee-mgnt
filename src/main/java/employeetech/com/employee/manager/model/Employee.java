package employeetech.com.employee.manager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    private String email;
    private String title;
    private String phone;
    private String name;
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;

    @Override
    public String toString() {
        return "Employee(id=" + id + ", name=" + name + ", email=" + email + 
               ", title=" + title + ", phone=" + phone + ", imageUrl=" + imageUrl + 
               ", employeeCode=" + employeeCode + ")";
    }
}
