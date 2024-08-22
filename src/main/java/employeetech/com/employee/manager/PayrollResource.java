package employeetech.com.employee.manager;


import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.service.PayrollService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PayrollResource {

    private final PayrollService payrollService;

    public PayrollResource(PayrollService payrollService){
        this.payrollService = payrollService;
    }

    public ResponseEntity<List<Payroll>> getAllPayrolls ( ){
        List<Payroll> allPayrolls = payrollService.getAllPayrolls();
        return new ResponseEntity<>(allPayrolls , HttpStatusCode.valueOf(200));

    }


}
