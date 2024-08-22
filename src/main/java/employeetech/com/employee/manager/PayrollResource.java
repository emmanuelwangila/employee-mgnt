package employeetech.com.employee.manager;

import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.service.PayrollService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payrolls")
public class PayrollResource {

    private final PayrollService payrollService;

    public  PayrollResource(PayrollService payrollService){
        this.payrollService = payrollService;
    }

    @GetMapping("/all")
    public Payroll getAllPayrolls(Payroll payroll){
        payrollService.getAllPayrolls(payroll);
        return new ResponseEntity<>( HttpStatusCode.valueOf(200) )
    }
}
