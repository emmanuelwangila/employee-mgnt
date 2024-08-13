package employeetech.com.employee.manager;


import employeetech.com.employee.manager.model.Student;
import employeetech.com.employee.manager.service.EmployeeService;
import employeetech.com.employee.manager.service.StudentService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentResource {

    private final StudentService studentService;

    public StudentResource(StudentService studentService) {this.studentService =  studentService;}

    public ResponseEntity<List<Student>> findAllStudents (){
        List<Student> students = studentService.findAllStudents();
        return  new ResponseEntity<>(students , HttpStatusCode.valueOf(200));
    }

    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
        Student student = studentService.getStudentById(id);
        return  new ResponseEntity<>( student , HttpStatusCode.valueOf(200));
    }

    public ResponseEntity<Student> updateStudents (@RequestBody Student student){
        Student updatedStudent = studentService.updateStudent( student );
        return  new ResponseEntity<>( updatedStudent , HttpStatusCode.valueOf(200));
    }

    public ResponseEntity<?> deleteStudents(@PathVariable("id") Long id ){
        studentService.deleteStudent(id);
        return  new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
