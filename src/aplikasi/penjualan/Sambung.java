/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.penjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dandy
 */
public class Sambung {
    private Connection c=null;
    private Statement st=null;
    private Baca baca;
    private String url;
    private String user;
    private String pass;
    
    
    public Sambung(){
        baca= new Baca();
        url="jdbc:mysql://"+baca.getHost()+"/"+baca.getDatabase();
        user=baca.getUsername();
        pass=baca.getPassword();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            //System.out.println("Class mySQL Tidak Ditemukan"+e);
            JOptionPane.showMessageDialog(null, "SQL TIDAK DITEMUKAN");
        }
    }
    public ResultSet ambilData (String q){
        ResultSet rs =null;
        try {
            c=DriverManager.getConnection(url,user,pass);
            st= c.createStatement();
            rs= st.executeQuery(q);
        } catch (SQLException e) {
            //System.out.println("Error Pengambilan Data:"+e);
            JOptionPane.showMessageDialog(null, "ERROR PENGAMBILAN DATA" +e);
        }
        return rs;
    }
    public boolean simpanData(String q){
        try {
            c=DriverManager.getConnection(url,user,pass);
            st=c.createStatement();
            st.execute(q);
            return true;
        } catch (SQLException e) {
            //System.out.println("Error Penyimpanan Data :"+e);
            JOptionPane.showMessageDialog(null, "ERROR PENYIMPANAN DATA"+e);
            return false;
        }
    }
}
