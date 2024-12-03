/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BioskopApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Microsoft
 */
public class koneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi()
    {
        if (koneksi == null)
        {
            try {
                String url = "jdbc:mysql://localhost:3306/bioskop";
                String user = "root";
                String password = "MysqLr1f##24";
                DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
        return koneksi;
    }
}
