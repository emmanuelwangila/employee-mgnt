package employeetech.com.employee.manager;

import employeetech.com.employee.manager.service.CompanyService;

public class CompanyResource {

    private final CompanyService companyService;

    public  CompanyResource(CompanyService companyService) {this.companyService =  companyService;}
}
