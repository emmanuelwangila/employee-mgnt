package employeetech.com.employee.manager;


import employeetech.com.employee.manager.model.Employee;
import employeetech.com.employee.manager.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
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
        Employee newEmployee = employeeService.addEmployee(employee);
        return  new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

   // ...existing code...
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(id, employee);
        if (updatedEmployee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }
// ...existing code...

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
          employeeService.deleteEmployee(id);
        return  new ResponseEntity<>( HttpStatusCode.valueOf(200));

    }

}
