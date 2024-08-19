package employeetech.com.employee.manager.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "payrolls")
public class Payroll implements Serializable {

    @Id
    @GeneratedValue

    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;
}
