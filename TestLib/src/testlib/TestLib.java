/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlib;
import DBC.DbConnection;
import java.sql.*;
/**
 *
 * @author FCFM
 */
public class TestLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here

        DbConnection condb = new DbConnection();
        Connection con = condb.getConnected();
        
         // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT ID, Name, CountryCode FROM city";

        // execute the query, and get a java resultset
        try ( // create the java statement
                
                
                Statement st = con.createStatement()) {
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next())
            {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String countrycode = rs.getString("CountryCode");
                
                // print the results
                System.out.format("%s, %s, %s\n", id, name, countrycode);
            } 
        st.close();
        }


    }
    
}
