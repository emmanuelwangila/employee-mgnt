package employeetech.com.employee.manager.model

import jakarta.persistence.*
import java.io.Serializable

@Entity
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    val department: Department? = null,

    val email: String? = null,
    val title: String? = null,
    val phone: String? = null,
    val name: String? = null,
    val imageUrl: String? = null,

    @Column(nullable = false, updatable = false)
    val employeeCode: String? = null
) : Serializable {

    override fun toString(): String {
        return "Employee(id=$id, name=$name, email=$email, title=$title, phone=$phone, imageUrl=$imageUrl, employeeCode=$employeeCode)"
    }
}
