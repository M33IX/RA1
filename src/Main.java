import java.sql.*;

public class Main {

    public static final String DB_URL = "jdbc:h2:d:\\repos\\javarepos\\RA1\\db\\Main";
    public static final String DB_Driver = "org.h2.Driver";

    public static void main(String[] args) {
        try{Class.forName(DB_Driver);
            Connection connection = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to DB");
            //connection.close();
            //System.out.println("Disconnected from DB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }
    }
}