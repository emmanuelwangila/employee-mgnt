package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.repo.DepartmentRepo;

public class DepartmentService {

    public DepartmentRepo departmentRepo;

    public DepartmentService( DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }
}
