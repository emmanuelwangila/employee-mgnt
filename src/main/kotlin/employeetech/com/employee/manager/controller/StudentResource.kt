package employeetech.com.employee.manager.controller

import employeetech.com.employee.manager.model.Student
import employeetech.com.employee.manager.service.StudentService
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("students")
class StudentResource(private val studentService: StudentService) {

    @GetMapping("/all")
    fun findAllStudents(): ResponseEntity<List<Student>> {
        val students = studentService.findAllStudents()
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(students)
    }

    @GetMapping("/id")
    fun getStudentById(@PathVariable("id") id: Long): ResponseEntity<Student> {
        val student = studentService.getStudentById(id)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(student)
    }

    @PutMapping("/update")
    fun updateStudent(@RequestBody student: Student): ResponseEntity<Student> {
        val updatedStudent = studentService.updateStudent(student)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(updatedStudent)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteStudent(@PathVariable("id") id: Long): ResponseEntity<Unit> {
        studentService.deleteStudent(id)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build()
    }

    @PostMapping("/add")
    fun addStudent(@RequestBody student: Student): ResponseEntity<Student> {
        val addedStudent = studentService.addStudent(student)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(addedStudent)
    }
}
