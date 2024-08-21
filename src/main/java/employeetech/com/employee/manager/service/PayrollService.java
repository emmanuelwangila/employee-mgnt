package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.repo.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PayrollService {

    @Autowired
    private final PayrollRepo payrollRepo;

    public PayrollService (PayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public Payroll addNewPayroll(Payroll payroll){
        return payrollRepo.save(payroll);
    }
}
