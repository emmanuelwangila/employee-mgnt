package employeetech.com.employee.manager.repo;


import  org.springframework.data.jpa.repository.JpaRepository;
import employeetech.com.employee.manager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
