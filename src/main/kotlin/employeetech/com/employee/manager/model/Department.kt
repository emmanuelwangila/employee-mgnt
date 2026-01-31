package employeetech.com.employee.manager.model

import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "departments")
data class Department(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    val name: String? = null,

    @OneToMany(mappedBy = "department", cascade = [CascadeType.ALL])
    val employees: List<Employee>? = null
) : Serializable
