package employeetech.com.employee.manager.repo

import employeetech.com.employee.manager.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UserRepo : JpaRepository<User, Long> {
    fun findByEmail(email: String): Optional<User>
}
