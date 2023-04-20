package jdbc;

import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {

        try {

            Statement statement = Conn.getConn().createStatement();

            String inert = "insert into employee(id,name,address) values(2,'Prajyot','Satara')";
            String update = "update employee set address='Sangali' where id = 2";
            String delete = "delete from employee where id= 2";
            int i = statement.executeUpdate(delete);

            System.out.println("record deleted successfully " + i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
