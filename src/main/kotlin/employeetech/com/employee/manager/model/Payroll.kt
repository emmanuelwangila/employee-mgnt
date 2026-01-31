package employeetech.com.employee.manager.model

import jakarta.persistence.*
import java.io.Serializable
import java.time.LocalDate

@Entity
@Table(name = "payrolls")
data class Payroll(
    @Id
    @GeneratedValue
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    val employee: Employee? = null,

    @Column(nullable = false, updatable = false)
    val salary: Double? = null,

    val payDate: LocalDate? = null
) : Serializable
