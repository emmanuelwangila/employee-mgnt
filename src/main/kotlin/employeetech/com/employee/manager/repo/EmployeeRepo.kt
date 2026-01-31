package employeetech.com.employee.manager.repo

import employeetech.com.employee.manager.model.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepo : JpaRepository<Employee, Long>
