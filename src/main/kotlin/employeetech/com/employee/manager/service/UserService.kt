package employeetech.com.employee.manager.service

import employeetech.com.employee.manager.model.User
import employeetech.com.employee.manager.repo.UserRepo
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepo: UserRepo) {

    fun findByEmail(email: String): User? {
        return userRepo.findByEmail(email).orElse(null)
    }

    fun isEmailTaken(email: String): Boolean {
        return userRepo.findByEmail(email).isPresent
    }
}
