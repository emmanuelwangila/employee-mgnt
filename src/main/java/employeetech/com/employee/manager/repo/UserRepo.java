package employeetech.com.employee.manager.repo;

import employeetech.com.employee.manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Long> {
}
