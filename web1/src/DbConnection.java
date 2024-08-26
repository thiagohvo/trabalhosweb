import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

    public static void criaTabelaPessoa() {
        try {
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:postgresql://localhost:5433/web1",
                            "postgres",
                            "2404");
            Statement statement = connection.createStatement(

        );
            statement.executeUpdate("CREATE TABLE pessoa(nome VARCHAR(50))");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
