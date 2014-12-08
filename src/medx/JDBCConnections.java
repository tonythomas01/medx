/*
 * Copyright (C) 2014 router
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package medx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author router
 */
public class JDBCConnections {
    private String DatabaseUserName;
    private String DatabasePassword;
    private static Connection conn;
    public JDBCConnections() {
        this.DatabaseUserName = "mypguser";
        this.DatabasePassword = "toor";
        try { 
            Class.forName( "org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/medx", DatabaseUserName, DatabasePassword );
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS DOCTOR( D_ID SERIAL, D_NAME VARCHAR(30),"
                    + " D_AGE INTEGER, D_GENDER VARCHAR(10), D_DEPARTMENT VARCHAR(30), D_JOININGYEAR INTEGER, D_ADDRESSLINE1 VARCHAR(60), "
                    + "D_ADDRESSLINE2 VARCHAR(60), D_PHONE INTEGER );";
            stmt.executeUpdate(sql);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    
    public static void createNewDoctorRecord( String DoctorName,Integer DoctorAge,
        String DoctorGender, String DoctorDepartment,Integer DoctorJoiningYear, String DoctorAddressLine1,
        String DoctorAddressLine2, Integer DoctorPhone) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO DOCTOR VALUES( DEFAULT,'"+DoctorName+"',"+DoctorAge+",'"+DoctorGender+"',"
                    + "'"+DoctorDepartment+"',"+DoctorJoiningYear+",'"+DoctorAddressLine1+"',"
                    + "'"+DoctorAddressLine2+"',"+DoctorPhone+");";
            System.out.println( sql );
            stmt.executeUpdate( sql );
            
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
    
    
}
