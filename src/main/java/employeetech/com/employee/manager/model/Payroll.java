package employeetech.com.employee.manager.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "payrolls")
public class Payroll implements Serializable {

    @Id
    @GeneratedValue

    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id" , nullable = false)
    private Employee employee;

    @Column(nullable = false , updatable = false)
    private Double salary;

    private LocalDate payDate;
}
