package employeetech.com.employee.manager;


import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.service.PayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PayrollResource {

    private final PayrollService payrollService;

    public PayrollResource(PayrollService payrollService){
        this.payrollService = payrollService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Payroll>> getAllPayrolls ( ){
        List<Payroll> allPayrolls = payrollService.getAllPayrolls();
        return new ResponseEntity<>(allPayrolls , HttpStatusCode.valueOf(200));

    }

    @PostMapping("/add ")
    public ResponseEntity<Payroll>  addAllPayrolls (@RequestBody Payroll payroll){
        Payroll addedPayroll = payrollService.addNewPayroll(payroll);
        return  new ResponseEntity<>(addedPayroll , HttpStatus.CREATED);
    }


}
