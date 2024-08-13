package employeetech.com.employee.manager.service;


import employeetech.com.employee.manager.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
      public  final StudentRepo studentRepo;

      public  StudentService(StudentRepo studentRepo) { this.studentRepo = studentRepo;}

}
