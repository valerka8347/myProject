package Test;

import java.sql.*;

public class Run {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root",
                    "root");
            conn.close();//myProject
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
