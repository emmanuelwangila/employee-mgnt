package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.Employee;
import employeetech.com.employee.manager.repo.EmployeeRepo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return  employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

     public Employee updateEmployee(Long id, Employee employeeDetails) {
        return employeeRepo.findById(id).map(employee -> {
            // copy properties from incoming object but preserve id and employeeCode
            BeanUtils.copyProperties(employeeDetails, employee, "id", "employeeCode");
            return employeeRepo.save(employee);
        }).orElse(null);
    }

    public Employee findEmployeeById(Long id){
        Optional<Employee> employeeOptional = employeeRepo.findById(id);
        return  employeeOptional.orElse(null);

    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);

    }




}
