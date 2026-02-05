package employeetech.com.employee.manager.repo;

import employeetech.com.employee.manager.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Long> {
}
