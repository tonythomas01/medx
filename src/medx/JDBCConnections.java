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
import java.sql.ResultSet;
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
            String sqlDoc = "CREATE TABLE IF NOT EXISTS DOCTOR( D_ID SERIAL, D_NAME VARCHAR(30),"
                    + " D_AGE INTEGER, D_GENDER VARCHAR(10), D_DEPARTMENT VARCHAR(30), D_JOININGYEAR INTEGER, D_ADDRESSLINE1 VARCHAR(60), "
                    + "D_ADDRESSLINE2 VARCHAR(60), D_PHONE INTEGER );";
            String sqlPatient = "CREATE TABLE IF NOT EXISTS PATIENT( P_ID SERIAL, P_NAME VARCHAR(30),"
                    + "P_AGE INTEGER, P_GENDER VARCHAR(10), P_ADDRESSLINE1 VARCHAR(60), "
                    + "P_ADDRESSLINE2 VARCHAR(60), P_PHONE INTEGER );";
            stmt.executeUpdate(sqlDoc);
            stmt.executeUpdate(sqlPatient);
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
            stmt.executeUpdate( sql );
            
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet selectParticularDoctor( String DoctorName ) {
        try {
           Statement stmt = conn.createStatement();
           String sql = "SELECT * FROM DOCTOR WHERE d_name='"+DoctorName+"';";
           ResultSet rs = stmt.executeQuery(sql);
           while( rs.next() ) {
               return rs;
           }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void DeleteDoctorRecord( Integer DocId ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM DOCTOR WHERE d_id="+DocId+";";
            stmt.executeQuery(sql);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        
    }
    
    public static  void createNewPatientRecord( String PatientName, Integer PatientAge, String PatientGender,
                String PatientAddressLine1, String PatientAddressLine2, Integer PatientPhone ) {
        try { 
            String sql = "INSERT INTO PATIENT VALUES( DEFAULT,'"+PatientName+"',"+PatientAge+","
                     + "'"+PatientGender+"','"+PatientAddressLine1+"','"+PatientAddressLine2+"',"
                     + ""+PatientPhone+");";
            Statement stmt = conn.createStatement();
            stmt.executeQuery( sql );
        } catch ( Exception e ) {
            e.printStackTrace();
        }  
    }
        
    public static ResultSet selectParticularPatient( String PatientName ) {
        try {
           Statement stmt = conn.createStatement();
           String sql = "SELECT * FROM PATIENT WHERE p_name='"+PatientName+"';";
           ResultSet rs = stmt.executeQuery(sql);
           while( rs.next() ) {
               return rs;
           }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void DeletePatientRecord( Integer PatientId ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM PATIENT WHERE p_id="+PatientId+";";
            stmt.executeQuery(sql);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        
    }
}
