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
import java.sql.ResultSetMetaData;
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
            String sqlDoc = "CREATE TABLE IF NOT EXISTS DOCTOR( D_ID SERIAL PRIMARY KEY, D_NAME VARCHAR(30),"
                    + " D_AGE INTEGER, D_GENDER VARCHAR(10), D_DEPARTMENT VARCHAR(30), D_JOININGYEAR INTEGER, D_ADDRESSLINE1 VARCHAR(60), "
                    + "D_ADDRESSLINE2 VARCHAR(60), D_PHONE INTEGER );";
            String sqlPatient = "CREATE TABLE IF NOT EXISTS PATIENT( P_ID SERIAL PRIMARY KEY, P_NAME VARCHAR(30),"
                    + "P_AGE INTEGER, P_GENDER VARCHAR(10), P_ADDRESSLINE1 VARCHAR(60), "
                    + "P_ADDRESSLINE2 VARCHAR(60), P_PHONE INTEGER );";
            String sqlAppoinment = "CREATE TABLE IF NOT EXISTS APPOINMENT( APP_ID SERIAL PRIMARY KEY, "
                    + "D_ID INTEGER  REFERENCES DOCTOR( D_ID ), "
                    + "P_ID INTEGER REFERENCES PATIENT( P_ID ));";
            String sqlAppoinmentDetails = "CREATE TABLE IF NOT EXISTS APPOINMENT_DETAILS( APP_ID INTEGER REFERENCES APPOINMENT(APP_ID), "
                    + "APP_DATE DATE, APP_TIME TIME, APP_BOOKINGTIMESTAMP TIMESTAMP DEFAULT CURRENT_TIMESTAMP , "
                    + "APP_DONE BOOLEAN DEFAULT FALSE )";
            String sqlDrugTable = "CREATE TABLE IF NOT EXISTS DRUG( DG_ID SERIAL PRIMARY KEY, "
                    + "DG_NAME VARCHAR(30), DG_MANUFACTURER VARCHAR(30), DG_RATE INTEGER, DG_MANUFACTURE_DATE DATE,"
                    + " DG_EXPIRY DATE, DG_INITAL_AVAIL INTEGER, DG_VENDRO VARCHAR(30) );";
            
            String sqlDateFormat = "SET datestyle = \"ISO, DMY\";";
            stmt.executeUpdate(sqlDoc);
            stmt.executeUpdate(sqlPatient);
            stmt.executeUpdate(sqlAppoinment);
            stmt.executeUpdate(sqlAppoinmentDetails);
            stmt.executeUpdate(sqlDrugTable);
            stmt.executeUpdate( sqlDateFormat );
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
    
    public static void createNewAppoinment( String PatientName, Integer DocId ) {
        try {
            Statement stmt = conn.createStatement();
            Integer patientId = getPatientId( PatientName );
            String sql = "INSERT INTO APPOINMENT VALUES( DEFAULT,"+DocId+","+patientId+");";
            stmt.executeUpdate( sql );
        }catch ( Exception e ) {
            e.printStackTrace();
        }
        
    }
    
    public static void createNewDrugRecord( String DGName, String Manufacturer, 
            Integer Rate, String ManufactureDate, String ExpiryDate, Integer IntialAvailability, String Vendor  ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO DRUG VALUES( DEFAULT,'"+DGName+"','"+Manufacturer+"',"
                    + ""+Rate+",'"+ManufactureDate+"','"+ExpiryDate+"',"+IntialAvailability+","
                    + "'"+Vendor+"');";
            stmt.executeUpdate( sql );
        }catch ( Exception e ) {
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
    
    public static String[] getDoctorNames() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT d_name from DOCTOR";
            int TotalSize = getNextDotorId()-1; // This would be the total number of Doctors
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            String[] allDoctors = new String[TotalSize];
            int i = 0;
            while ( rs.next() ) {
                allDoctors[i] = rs.getString("d_name");
                i++;
            }
            return allDoctors;      
        }catch ( Exception e ) {
            e.printStackTrace();
        }
      return null;
    }
    
    public static String[] getPatientNames( Integer doctorId ) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;
            Integer totalSize = getTotalNumberOfPatientsForADoctor( doctorId );
            String sql = "SELECT P_NAME FROM PATIENT WHERE P_ID IN "
                    + "( SELECT P_ID FROM APPOINMENT WHERE D_ID = "+doctorId+");";
            rs = stmt.executeQuery( sql );
            String[] allPatients = new String[ totalSize ];
            int i = 0;
            while ( rs.next() ) {
                allPatients[i] = rs.getString( "p_name" );
                i++;
            }
            return allPatients;     
        }catch ( Exception e ) {
            e.printStackTrace();
        }
      return null;
    }
    
    public static String[] getDrugNames( ) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;
            Integer totalSize = getTotalNumberOfDrugs();
            String sql = "SELECT DG_NAME FROM DRUG";
            rs = stmt.executeQuery( sql );
            String[] allDrugs = new String[ totalSize + 1];
            int i = 0;
            while ( rs.next() ) {
                allDrugs[i] = rs.getString( "dg_name" );
                i++;
            }
            return allDrugs;     
        }catch ( Exception e ) {
            e.printStackTrace();
        }
      return null;
    }
    
    public static Integer getTotalNumberOfPatientsForADoctor( Integer doctorId ) {
         try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT COUNT(*) AS numberofPatients FROM PATIENT WHERE P_ID IN "
                    + "( SELECT P_ID FROM APPOINMENT WHERE D_ID = "+doctorId+");";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "numberofPatients" );
            }
        }catch ( Exception e ) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static Integer getTotalNumberOfDrugs(  ) {
         try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT COUNT(*) AS numberofDrugs FROM DRUG;"; 
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "numberofDrugs" );
            }
        }catch ( Exception e ) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static Integer getNextPatientId() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT count(*) AS numberOfPatients from PATIENT";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "numberOfPatients" )+1;
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return 0;       
    }
    
    public static Integer getNextDrugId() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT count(*) AS numberOfDrugs from DRUG";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "numberOfDrugs" )+1;
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return 0;       
    }
    
    public static Integer getNextDotorId() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT count(*) AS numberOfDoctor from DOCTOR";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "numberOfDoctor" )+1;
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return -1;       
    }
    
    public Integer getDoctorId( String dname ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT D_ID from DOCTOR where D_NAME='"+ dname+"'";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt("D_ID");
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return -1; 
    }
    
    public static Integer getPatientId( String pname ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT P_ID from PATIENT where P_NAME='"+ pname+"'";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt("P_ID");
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return -1; 
    }
    
    public Integer getDoctorTotalAppoinments( Integer docId ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT count(*) as NUMBEROFAPPOINMENTS from APPOINMENT  where D_ID="+docId+";";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt("NUMBEROFAPPOINMENTS");
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return 0;
    }
    
     public static Integer getNextAppoinmentId() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT count(*) AS numberOfAppoinments from APPOINMENT";
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "numberOfAppoinments" )+1;
             }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return -1;       
    }
    
    public void addAppoinmentDetails( Integer appoinmentID, String appoinmentDate, String appoinmentTime ) {
         try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO APPOINMENT_DETAILS VALUES( "+appoinmentID+",'"+appoinmentDate+"','"+appoinmentTime+"');";
            stmt.executeUpdate(sql);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    
    public Integer getAppoinmentId( Integer doctorId, Integer patientId ) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT APP_ID FROM APPOINMENT WHERE D_ID = "+doctorId+" AND P_ID= "+patientId+";";
            ResultSet rs = stmt.executeQuery(sql);
            while( rs.next() ) {
                return rs.getInt( "APP_ID" );
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return -1;
    }

}
