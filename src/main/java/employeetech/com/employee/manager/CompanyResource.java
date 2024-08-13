package employeetech.com.employee.manager;

import employeetech.com.employee.manager.model.Company;
import employeetech.com.employee.manager.service.CompanyService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("companies")
public class CompanyResource {

    private final CompanyService companyService;

    public  CompanyResource(CompanyService companyService) {this.companyService =  companyService;}

    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAllCompanies (){
        List<Company> company = companyService.getAllCompanies();
        return  new ResponseEntity<>(company, HttpStatusCode.valueOf(200));
    }
}
