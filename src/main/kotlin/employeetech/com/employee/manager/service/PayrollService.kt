package employeetech.com.employee.manager.service

import employeetech.com.employee.manager.model.Payroll
import employeetech.com.employee.manager.repo.PayrollRepo
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class PayrollService(private val payrollRepo: PayrollRepo) {

    fun addNewPayroll(payroll: Payroll): Payroll {
        return payrollRepo.save(payroll)
    }

    fun updatePayroll(payroll: Payroll): Payroll {
        return payrollRepo.save(payroll)
    }

    fun getAllPayrolls(): List<Payroll> {
        return payrollRepo.findAll()
    }

    fun deletePayrolls(id: Long) {
        payrollRepo.deleteById(id)
    }
}
