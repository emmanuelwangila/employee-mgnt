package employeetech.com.employee.manager;


import employeetech.com.employee.manager.service.PayrollService;

public class PayrollResource {

    private final PayrollService payrollService;

    public PayrollResource(PayrollService payrollService){
        this.payrollService = payrollService;
    }


}
