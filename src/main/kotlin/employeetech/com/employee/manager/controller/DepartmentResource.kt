package employeetech.com.employee.manager.controller

import employeetech.com.employee.manager.model.Department
import employeetech.com.employee.manager.service.DepartmentService
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("department")
class DepartmentResource(private val departmentService: DepartmentService) {

    @GetMapping("/all")
    fun getAllDepartments(): ResponseEntity<List<Department>> {
        val departments = departmentService.findAllDepartments()
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(departments)
    }

    @PostMapping("/add")
    fun addDepartment(@RequestBody department: Department): ResponseEntity<Department> {
        val newDepartment = departmentService.addDepartment(department)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(newDepartment)
    }

    @PutMapping("/update")
    fun updateDepartment(@RequestBody department: Department): ResponseEntity<Department> {
        val updatedDepartment = departmentService.updateDepartment(department)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(updatedDepartment)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteDepartment(@PathVariable id: Long): ResponseEntity<Unit> {
        departmentService.deleteDepartment(id)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build()
    }
}
