package employeetech.com.employee.manager.model

import jakarta.persistence.*
import java.io.Serializable

@Entity
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    val id: Long? = null,

    val name: String? = null,
    val course: String? = null,
    val email: String? = null,
    val age: Int? = null
) : Serializable
