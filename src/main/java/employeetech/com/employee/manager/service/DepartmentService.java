package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.repo.DepartmentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DepartmentService {

    private final DepartmentRepo departmentRepo;

//    dependency injection .
    @Autowired
    public DepartmentService( DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }
}
