package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.Payroll;
import employeetech.com.employee.manager.repo.PayrollRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PayrollService {
    private final PayrollRepo payrollRepo;

    public PayrollService(PayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public Payroll addNewPayroll(Payroll payroll) {
        return payrollRepo.save(payroll);
    }

    public Payroll updatePayroll(Payroll payroll) {
        return payrollRepo.save(payroll);
    }

    public List<Payroll> getAllPayrolls() {
        return payrollRepo.findAll();
    }

    public void deletePayrolls(Long id) {
        payrollRepo.deleteById(id);
    }
}
