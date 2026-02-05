package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.User;
import employeetech.com.employee.manager.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User findByEmail(String email) {
        return userRepo.findByEmail(email).orElse(null);
    }

    public boolean isEmailTaken(String email) {
        return userRepo.findByEmail(email).isPresent();
    }
}
