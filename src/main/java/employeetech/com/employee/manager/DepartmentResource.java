package employeetech.com.employee.manager;


import employeetech.com.employee.manager.model.Department;
import employeetech.com.employee.manager.service.DepartmentService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
