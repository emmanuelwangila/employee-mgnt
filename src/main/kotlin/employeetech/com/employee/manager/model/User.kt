package employeetech.com.employee.manager.model

import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val firstName: String? = null,

    @Column(nullable = false)
    val lastName: String? = null,

    @Column(nullable = false, unique = true)
    val password: String? = null,

    @Column(nullable = false, unique = true)
    val email: String? = null,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
    val addresses: List<Address>? = null
) : Serializable
