package employeetech.com.employee.manager.repo

import employeetech.com.employee.manager.model.Payroll
import org.springframework.data.jpa.repository.JpaRepository

interface PayrollRepo : JpaRepository<Payroll, Long>
