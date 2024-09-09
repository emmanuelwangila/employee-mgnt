package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.User;
import employeetech.com.employee.manager.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserRepo userRepo ;

    @Autowired
    private  PasswordEncoder passwordEncoder;

    @Autowired
    public User registerUser (User user ) {
        user.setPassword(PasswordEncoder.encode(user.getPassword()));
        return  userRepo.save(user);
    }

    public User findByUsername( String username) {
        return  userRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
