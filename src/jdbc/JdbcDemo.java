package jdbc;

//Driver registering
//connection establishment
//statement creation
//statement execution

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafeb21", "root3", "password");

            Statement statement = connection.createStatement();

            String str = "select * from employee";

            ResultSet rs = statement.executeQuery(str);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
