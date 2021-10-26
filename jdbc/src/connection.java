import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Main {

    public static void main(String[] args) {

        try {

            String url = "jdbc:sqlite:C:/Users/mrgui/Documents/GitHub/projetosPOO/identifier.sqlite";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Conexão realizada com sucesso.");

            try (Statement statement1 = conn.createStatement(); Statement statement2 = conn.createStatement()){

                String insert1 = "INSERT INTO Clientes(nome_cliente) VALUES('Fernando')";
                statement1.execute(insert1);

                String insert2 = "INSERT INTO Clientes(nome_cliente) VALUES('Lúcio')";
                statement2.execute(insert2);

                String update1 = "UPDATE identifier SET nome_cliente = 'Lucas' WHERE id_cliente = 1";
                statement1.execute(update1);

                String update2 = "UPDATE identifier SET nome_cliente = 'Lucio' WHERE id_cliente = 2";
                statement2.execute(update2);

                String delete1 = "DELETE FROM identifier WHERE id = 1";
                statement1.execute(delete1);

                String delete2 = "DELETE FROM identifier WHERE id = 2";
                statement2.execute(delete2);

            }catch (SQLException ex){

                ex.printStackTrace();

            }

        }catch(SQLException ex){

            ex.printStackTrace();
            System.out.println("Houve um problema ao conectar no banco de dados.");

        }
    }
}