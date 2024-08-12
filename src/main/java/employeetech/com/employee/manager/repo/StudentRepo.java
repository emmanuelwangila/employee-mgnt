package employeetech.com.employee.manager.repo;

import employeetech.com.employee.manager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<Student, Long> {
}
