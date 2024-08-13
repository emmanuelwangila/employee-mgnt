package employeetech.com.employee.manager.service;


import employeetech.com.employee.manager.model.Student;
import employeetech.com.employee.manager.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {this.studentRepo = studentRepo;}

    public Student addStudent (Student student) {
        return  studentRepo.save(student);
    }

    public List<Student> findAllStudents (){
        return  studentRepo.findAll();
    }

    public  Student getStudentById(Long id) {
        return  studentRepo.findById(id)
                .orElseThrow(()-> new RuntimeException( "Student was not found ") );

    }

    public Student updateStudent (Student student){
        return  studentRepo.save(student);
    }

    public void deleteStudent (Long id){
        studentRepo.deleteById(id);
    }






}
