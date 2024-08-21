package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.repo.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PayrollService {

    @Autowired
    private PayrollRepo payrollRepo;

    public PayrollService (PayrollRepo payrollRepo) {}
}
