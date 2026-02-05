package employeetech.com.employee.manager.controller;

import employeetech.com.employee.manager.model.Department;
import employeetech.com.employee.manager.service.DepartmentService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentResource {
    private final DepartmentService departmentService;

    public DepartmentResource(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.findAllDepartments();
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(departments);
    }

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department newDepartment = departmentService.addDepartment(department);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(newDepartment);
    }

    @PutMapping("/update")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
        Department updatedDepartment = departmentService.updateDepartment(department);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(updatedDepartment);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
    }
}
