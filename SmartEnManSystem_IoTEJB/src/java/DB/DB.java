/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Thilini
 */
public class DB {
    private static Connection c;

    private static void SetUpConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/energy_analyzer?useSSL=false", "root", "Hazeem1998*");

    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            SetUpConnection();
        }
        c.createStatement().execute(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            SetUpConnection();
        }
        return c.createStatement().executeQuery(sql);

    }

    public static Connection getConn() {
        if (c == null) {
            try {
                SetUpConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return c;
    }
}
