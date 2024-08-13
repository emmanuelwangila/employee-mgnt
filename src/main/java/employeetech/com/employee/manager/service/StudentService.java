package employeetech.com.employee.manager.service;


import employeetech.com.employee.manager.model.Student;
import employeetech.com.employee.manager.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
      public  final StudentRepo studentRepo;

      @Autowired
      public  StudentService(StudentRepo studentRepo) { this.studentRepo = studentRepo;}

    public Student addStudent( Student student ){
          return studentRepo.save(student);
    }

     public Student getStudentById(Long id){
          return  studentRepo.findById(id)
                  .orElseThrow(() -> new RuntimeException( "Student is not found"));
     }

     public Student updateStudent(Student student ){
          return  studentRepo.save(student);
     }
}
