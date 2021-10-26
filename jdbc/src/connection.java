import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {

            String url = "jdbc:sqlite:C:/Users/mrgui/Documents/GitHub/projetosPOO/bancoTeste.db";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Conexão realizada com sucesso.");

            try (Statement statement1 = conn.createStatement(); Statement statement2 = conn.createStatement()){

                String insert1 = "INSERT INTO Clientes(nome_cliente) VALUES('Fernando')";
                statement1.execute(insert1);

                String insert2 = "INSERT INTO Clientes(nome_cliente) VALUES('Lúcio')";
                statement2.execute(insert2);

            }catch (SQLException ex){

                ex.printStackTrace();

            }

        }catch(SQLException ex){

            ex.printStackTrace();
            System.out.println("Houve um problema ao conectar no banco de dados.");

        }
    }
}