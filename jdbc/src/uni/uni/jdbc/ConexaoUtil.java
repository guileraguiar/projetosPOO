package uni.jdbc;
import java.sql.*;

/*

create database bancoTeste

use bancoTeste

create table Clientes (

    id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome varchar(100),
    sobrenome varchar(100)

)

*/


public class ConexaoUtil {

    private static ConexaoUtil conexaoUtil;

    public static ConexaoUtil getInstance() {

        if (conexaoUtil == null) {
            conexaoUtil = new ConexaoUtil();
        }
        return conexaoUtil;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoTeste","root","password");

    }

    public static void main(String[] args) {
        try {

            System.out.println(getInstance().getConnection());
            System.out.println("Conectado com sucesso!\n");

            Statement statement = conexaoUtil.getConnection().createStatement();

            ResultSet resultSet1 = statement.executeQuery("SELECT * FROM Clientes");
            ResultSet resultSet2 = statement.executeUpdate("INSERT INTO Clientes (nome, sobrenome) VALUES ('Maria', 'Clara')");
            ResultSet resultSet3 = statement.executeUpdate("UPDATE INTO Clientes SET nome = 'Marya' WHERE id_cliente = '1'");
            ResultSet resultSet4 = statement.executeUpdate("DELETE FROM Clientes WHERE id_cliente = '1'");('Maria', 'Clara')");

            while (resultSet1.next()){
                System.out.println(resultSet1);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
