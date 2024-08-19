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

    public Payroll () {}

    public Payroll(Double salary , LocalDate payDate, Employee employee){
        this.salary = salary;
        this.payDate = payDate;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
