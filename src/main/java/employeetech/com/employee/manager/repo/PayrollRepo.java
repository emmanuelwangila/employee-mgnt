package employeetech.com.employee.manager.repo;

import employeetech.com.employee.manager.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollRepo  extends JpaRepository<Payroll , Long> {
}
