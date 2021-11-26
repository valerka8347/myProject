/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static final String DB_URL = "jdbc:mysql://localhost:3306";


    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
            System.out.println("Подключение выполнено");
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC драйвер для СУБД не найден!");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL !");
        }
        


    }

}
*/
