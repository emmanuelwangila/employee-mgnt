package employeetech.com.employee.manager.controller

import employeetech.com.employee.manager.model.Employee
import employeetech.com.employee.manager.service.EmployeeService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("employee")
class EmployeeResource(private val employeeService: EmployeeService) {

    @GetMapping("/all")
    fun getAllEmployees(): ResponseEntity<List<Employee>> {
        val employees = employeeService.findAllEmployees()
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(employees)
    }

    @GetMapping("find/{id}")
    fun getEmployeeById(@PathVariable("id") id: Long): ResponseEntity<Employee> {
        val employee = employeeService.findEmployeeById(id)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(employee)
    }

    @PostMapping("/add")
    fun addEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        val newEmployee = employeeService.addEmployee(employee)
        return ResponseEntity.status(HttpStatus.CREATED).body(newEmployee)
    }

    @PutMapping("/update/{id}")
    fun updateEmployee(
        @PathVariable("id") id: Long,
        @RequestBody employee: Employee
    ): ResponseEntity<Employee> {
        val updatedEmployee = employeeService.updateEmployee(id, employee)
        return if (updatedEmployee != null) {
            ResponseEntity.status(HttpStatus.OK).body(updatedEmployee)
        } else {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
    }

    @DeleteMapping("/delete/{id}")
    fun deleteEmployee(@PathVariable("id") id: Long): ResponseEntity<Unit> {
        employeeService.deleteEmployee(id)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build()
    }
}
