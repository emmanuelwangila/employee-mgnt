package employeetech.com.employee.manager.repo;

import employeetech.com.employee.manager.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company, Long> {
}
