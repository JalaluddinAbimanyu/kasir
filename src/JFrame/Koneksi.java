package JFrame;

import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class Koneksi {
    private static java.sql.Connection koneksi;
     
      public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
          try {
              String URL = "jdbc:mysql://localhost:3306/kasir";
              String USER = "root";
              String PASSWORD = "";
              
              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
              
              koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
          } catch(Exception e) {
              System.out.println("Error Membuat Koneksi");
            }  
        }
        return koneksi;
    }
}
