package employeetech.com.employee.manager.repo;

import employeetech.com.employee.manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<User, Long> {
    Optional <User> findByUsername (String username);
}
