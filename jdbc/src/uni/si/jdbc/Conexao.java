package uni.si.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    private static Conexao conexao;

    public static Conexao getInstance() {

        if (conexao == null) {
            conexao = new Conexao();
        }

        return conexao;

    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String database = "bancoTeste";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database,username,password);

    }

    public static void main(String[] args) {

        try {

            System.out.println(getInstance().getConnection());

        }catch (Exception e) {

            e.printStackTrace();

        }

        }

}
