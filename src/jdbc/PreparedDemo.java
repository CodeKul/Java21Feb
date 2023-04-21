package jdbc;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedDemo {

    public static void main(String[] args) {

        int id;
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id name and address");

        id = scanner.nextInt();
        name = scanner.next();
        address = scanner.next();

        try {
            String str = "insert into employee (id,name,address) values(?,?,?)";
            String update = "update employee  set name=?,address=? where id=?";
            PreparedStatement preparedStatement = Conn.getConn().prepareStatement(update);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setInt(3, id);

            int i = preparedStatement.executeUpdate();
            System.out.println("record inserted successfully " + i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
