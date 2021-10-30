package uni.si.jdbc;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*

create database bancoTeste

create table Clientes (

    id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome varchar(100),
    sobrenome varchar(100)

)

*/


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
        String password = "password";

        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database,username,password);
        System.out.println("Conexão feita com sucesso!");

        Statement statement = conexao.createStatement();
        ResultSet resultSet = statement.executeQuery("INSERT INTO Clientes (nome, sobrenome) VALUES ('João', Costa)");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("nome"));
        }

    }

    public static void main(String[] args) {

        try {

            System.out.println(getInstance().getConnection());

        }catch (Exception e) {

            e.printStackTrace();

        }

    }

}
