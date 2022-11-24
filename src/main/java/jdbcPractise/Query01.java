package jdbcPractise;

import java.sql.*;

public class Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1) driver yukle
        Class.forName("org.postgresql.Driver");

        // baglantı olusutur
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","Z308183k");

        //3)statement
        Statement st=con.createStatement();

        //resultset
        ResultSet veri=st.executeQuery("select * from ogrenciler");

        //sonuçları al
        while(veri.next()){

          //// index kullanarak
          //System.out.println(veri.getInt(1) + veri.getString(2)+
          //        veri.getString(3)+veri.getString(4));

          //

          //// sutun ismi kullanarak
          //System.out.println(veri.getInt("okul_no") + veri.getString("ogrenci_ismi") +
          //        veri.getString("sinif") + veri.getString("cinsiyet"));

            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2),
                    veri.getString(3), veri.getString(4));// print f ile yapılan sout

        }
        //6 kapatma

    }
}