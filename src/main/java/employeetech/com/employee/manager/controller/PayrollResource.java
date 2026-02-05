package employeetech.com.employee.manager.controller;

import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.service.PayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payrolls")
public class PayrollResource {
    private final PayrollService payrollService;

    public PayrollResource(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Payroll>> getAllPayrolls() {
        List<Payroll> allPayrolls = payrollService.getAllPayrolls();
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(allPayrolls);
    }

    @PostMapping("/add")
    public ResponseEntity<Payroll> addPayroll(@RequestBody Payroll payroll) {
        Payroll addedPayroll = payrollService.addNewPayroll(payroll);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedPayroll);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Payroll> updatePayroll(
            @PathVariable("id") Long id,
            @RequestBody Payroll payroll) {
        Payroll updatedPayroll = payrollService.updatePayroll(payroll);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(updatedPayroll);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePayroll(@PathVariable("id") Long id) {
        payrollService.deletePayrolls(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
    }
}
