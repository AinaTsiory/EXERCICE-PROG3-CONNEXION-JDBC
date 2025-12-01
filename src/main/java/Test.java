import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "postgres";
        String password = "aina";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
