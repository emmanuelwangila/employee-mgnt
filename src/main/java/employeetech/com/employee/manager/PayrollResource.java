package employeetech.com.employee.manager;

import employeetech.com.employee.manager.service.PayrollService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payrolls")
public class PayrollResource {

    private PayrollService payrollService;

    public  PayrollResource(PayrollService payrollService){
        this.payrollService = payrollService;
    }
}
