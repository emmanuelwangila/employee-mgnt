package employeetech.com.employee.manager.repo

import employeetech.com.employee.manager.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepo : JpaRepository<Student, Long>
