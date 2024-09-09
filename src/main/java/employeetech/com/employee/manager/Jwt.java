package employeetech.com.employee.manager;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.function.Function;

@Component
public class Jwt {
     private String SECRET_KEY = "secret";

     private String extractUsername ( String token ){
         return  extractionClaim(token , Claims :: getSubject);
     }{

    }

     public Date extractExpiration (String token) {
         return  extractionClaim (token , Claims ::getExpiration);
     }

     public <T> T extractionClaim (String token , Function<Claims , T> ClaimsResolver) {
         final Claims claims = extractAllClaims(token);
         return ClaimsResolver.apply(claims);

     }

     private Claims extractAllClaims(String token ) {
         return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
     }
}
