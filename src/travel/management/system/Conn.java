

package travel.management.system;
import java.sql.*;
public class Conn {

    Connection c;
    Statement s;
 
   Conn() {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3305/travelmanagementsystem", "root", "ak@12345bc");
           s = c.createStatement();
           
       } catch(Exception e)
       {
           e.printStackTrace();
       }
       
    }
}