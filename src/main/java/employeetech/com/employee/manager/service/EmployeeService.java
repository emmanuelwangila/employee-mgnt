package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.Employee;
import employeetech.com.employee.manager.repo.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        newEmployee.setId(employee.getId());
        newEmployee.setName(employee.getName());
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setTitle(employee.getTitle());
        newEmployee.setPhone(employee.getPhone());
        newEmployee.setImageUrl(employee.getImageUrl());
        newEmployee.setDepartment(employee.getDepartment());
        newEmployee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(newEmployee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            BeanUtils.copyProperties(employeeDetails, employee, "id", "employeeCode");
            return employeeRepo.save(employee);
        }
        return null;
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
