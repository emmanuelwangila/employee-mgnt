package employeetech.com.employee.manager;


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

    public DepartmentResource(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments (){
        List<Department> departments = departmentService.findAllDepartments();
        return new ResponseEntity<>(departments , HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add")
    public  ResponseEntity<Department> addDepartment(@RequestBody Department department){
        Department newDepartment = departmentService.addDepartment(department);
        return  new ResponseEntity<>(newDepartment , HttpStatusCode.valueOf(200));
    }

    @PutMapping("/update")
    public  ResponseEntity<Department> updateDepartment(@RequestBody Department department){
        Department updatedDepartment = departmentService.updateDepartment(department);
        return  new ResponseEntity<>(updatedDepartment , HttpStatusCode.valueOf(200));
    }


    @DeleteMapping("/delete/${id}")
    public ResponseEntity<?> deleteDepartment (@PathVariable Long id){
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
