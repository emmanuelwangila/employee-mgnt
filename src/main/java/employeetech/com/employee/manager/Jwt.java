package employeetech.com.employee.manager;

import org.springframework.stereotype.Component;

@Component
public class Jwt {
     private String SECRET_KEY = "secret";

     private String extractUsername ( String token ){
         return  extractionClaim(token , Claims :: getSubject);
     }

     public Date extractExpiration (String token) {
         return  extractionClaim (token , Claims ::getExpiration);
     }
}
