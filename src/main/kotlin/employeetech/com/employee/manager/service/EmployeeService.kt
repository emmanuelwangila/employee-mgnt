package employeetech.com.employee.manager.service

import employeetech.com.employee.manager.model.Employee
import employeetech.com.employee.manager.repo.EmployeeRepo
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.UUID

@Service
@Transactional
class EmployeeService(private val employeeRepo: EmployeeRepo) {

    fun addEmployee(employee: Employee): Employee {
        val newEmployee = Employee(
            id = employee.id,
            name = employee.name,
            email = employee.email,
            title = employee.title,
            phone = employee.phone,
            imageUrl = employee.imageUrl,
            department = employee.department,
            employeeCode = UUID.randomUUID().toString()
        )
        return employeeRepo.save(newEmployee)
    }

    fun findAllEmployees(): List<Employee> {
        return employeeRepo.findAll()
    }

    fun updateEmployee(id: Long, employeeDetails: Employee): Employee? {
        return employeeRepo.findById(id).map { employee ->
            BeanUtils.copyProperties(employeeDetails, employee, "id", "employeeCode")
            employeeRepo.save(employee)
        }.orElse(null)
    }

    fun findEmployeeById(id: Long): Employee? {
        return employeeRepo.findById(id).orElse(null)
    }

    fun deleteEmployee(id: Long) {
        employeeRepo.deleteById(id)
    }
}
