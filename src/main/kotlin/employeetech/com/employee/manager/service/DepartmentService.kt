package employeetech.com.employee.manager.service

import employeetech.com.employee.manager.model.Department
import employeetech.com.employee.manager.repo.DepartmentRepo
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class DepartmentService(private val departmentRepo: DepartmentRepo) {

    fun addDepartment(department: Department): Department {
        return departmentRepo.save(department)
    }

    fun findAllDepartments(): List<Department> {
        return departmentRepo.findAll()
    }

    fun updateDepartment(department: Department): Department {
        return departmentRepo.save(department)
    }

    fun deleteDepartment(id: Long) {
        departmentRepo.deleteById(id)
    }
}
