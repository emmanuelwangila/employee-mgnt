package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService (UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
