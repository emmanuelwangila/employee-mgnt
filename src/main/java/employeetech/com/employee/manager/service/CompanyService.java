package employeetech.com.employee.manager.service;

import employeetech.com.employee.manager.model.Company;
import employeetech.com.employee.manager.repo.CompanyRepo;

import java.util.List;

public class CompanyService {

    private final CompanyRepo companyRepo;

    public CompanyService(CompanyRepo companyRepo ) {this.companyRepo = companyRepo;}

   public List<Company> getAllCompanies (){
        return  companyRepo.findAll();
   }

   public Company addCompany (Company company){
        return  companyRepo.save(company);
   }

   public Company getCompanyById(Long id) {
       return companyRepo.findById(id)
               .orElseThrow(() -> new RuntimeException("Company not found"));
   }
}
