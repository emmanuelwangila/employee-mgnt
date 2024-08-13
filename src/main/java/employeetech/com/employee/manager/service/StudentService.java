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

}
