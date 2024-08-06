package employeetech.com.employee.manager;


import employeetech.com.employee.manager.model.Employee;
import employeetech.com.employee.manager.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return  new ResponseEntity<>(employees , HttpStatusCode.valueOf(200));

    }

    @GetMapping("find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")  Long id){
       Employee employee = employeeService.findEmployeeById( id);
        return  new ResponseEntity<>(employee, HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee new_employee = employeeService.addEmployee(new Employee());
        return  new ResponseEntity<>(new_employee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee( @RequestBody Employee employee){
        Employee update_employee = employeeService.updateEmployee(employee);
        return  new ResponseEntity<>(update_employee, HttpStatusCode.valueOf(200));

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
          employeeService.deleteEmployee(id);
        return  new ResponseEntity<>( HttpStatusCode.valueOf(200));

    }

}
