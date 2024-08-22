package employeetech.com.employee.manager;

import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.service.PayrollService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payrolls")
public class PayrollResource {

    private final PayrollService payrollService;

    public  PayrollResource(PayrollService payrollService){
        this.payrollService = payrollService;
    }

    @GetMapping("/all")
    public  ResponseEntity <List<Payroll>> getAllPayrolls(){
        List<Payroll> payrolls = payrollService.getAllPayrolls(new Payroll());
        return  new ResponseEntity<>(payrolls , HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add")
    public ResponseEntity <List<Payroll>> addPayrolls(@RequestBody Payroll payroll){
        List<Payroll> addedPayrolls = payrollService.addNewPayroll(payroll);
        return new ResponseEntity<>(addedPayrolls , HttpStatusCode.valueOf(200));

    }

}
