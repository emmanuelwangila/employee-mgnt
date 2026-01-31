package employeetech.com.employee.manager.controller

import employeetech.com.employee.manager.model.Payroll
import employeetech.com.employee.manager.service.PayrollService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("payrolls")
class PayrollResource(private val payrollService: PayrollService) {

    @GetMapping("/all")
    fun getAllPayrolls(): ResponseEntity<List<Payroll>> {
        val allPayrolls = payrollService.getAllPayrolls()
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(allPayrolls)
    }

    @PostMapping("/add")
    fun addPayroll(@RequestBody payroll: Payroll): ResponseEntity<Payroll> {
        val addedPayroll = payrollService.addNewPayroll(payroll)
        return ResponseEntity.status(HttpStatus.CREATED).body(addedPayroll)
    }

    @PutMapping("/update/{id}")
    fun updatePayroll(
        @PathVariable("id") id: Long,
        @RequestBody payroll: Payroll
    ): ResponseEntity<Payroll> {
        val updatedPayroll = payrollService.updatePayroll(payroll)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(updatedPayroll)
    }

    @DeleteMapping("/delete/{id}")
    fun deletePayroll(@PathVariable("id") id: Long): ResponseEntity<Unit> {
        payrollService.deletePayrolls(id)
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build()
    }
}
