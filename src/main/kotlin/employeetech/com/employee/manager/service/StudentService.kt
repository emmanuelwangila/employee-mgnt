package employeetech.com.employee.manager.service

import employeetech.com.employee.manager.model.Student
import employeetech.com.employee.manager.repo.StudentRepo
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class StudentService(private val studentRepo: StudentRepo) {

    fun addStudent(student: Student): Student {
        return studentRepo.save(student)
    }

    fun findAllStudents(): List<Student> {
        return studentRepo.findAll()
    }

    fun getStudentById(id: Long): Student {
        return studentRepo.findById(id)
            .orElseThrow { RuntimeException("Student was not found") }
    }

    fun updateStudent(student: Student): Student {
        return studentRepo.save(student)
    }

    fun deleteStudent(id: Long) {
        studentRepo.deleteById(id)
    }
}
