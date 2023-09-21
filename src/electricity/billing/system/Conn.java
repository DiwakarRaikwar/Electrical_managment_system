
package electricity.billing.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        // To establish a connectin with jdbc , it used sql collector and jdbc. driver.class
     try {
          c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Indore@123");
          // Inc c-> the information gives to know the address of the sql thing:
          s = c.createStatement();
     }catch( Exception e){
         e.printStackTrace();
     }
     }
}
