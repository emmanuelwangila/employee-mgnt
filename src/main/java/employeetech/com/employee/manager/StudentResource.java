package employeetech.com.employee.manager;


import employeetech.com.employee.manager.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentResource {

    private final EmployeeService employeeService;

    public StudentResource(EmployeeService employeeService  ) {this.employeeService = employeeService;}

}
