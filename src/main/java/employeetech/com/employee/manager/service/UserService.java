package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.User;
import employeetech.com.employee.manager.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService (UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Optional <User> findByUsername (String username) {
        return userRepo.findByUsername(username);
    }
}
