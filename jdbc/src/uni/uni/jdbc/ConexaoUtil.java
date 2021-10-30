package uni.jdbc;

import com.mysql.cj.protocol.Resultset;

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

        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoTeste","root","password");

    }

    public static void main(String[] args) {
        try {

            System.out.println(getInstance().getConnection());
            System.out.println("Conectado com sucesso!\n");

            Statement statement = conexaoUtil.getConnection().createStatement();

            ResultSet resultSet1 = statement.executeQuery("SELECT * FROM Clientes");

            ResultSet resultSet2 = statement.executeUpdate("INSERT INTO Clientes (nome, sobrenome) VALUES ('João', 'Costa')");
            ResultSet resultSet3 = statement.executeUpdate("INSERT INTO Clientes (nome, sobrenome) VALUES ('Maria', 'Clara')");

            while (resultSet1.next()){
                System.out.println(resultSet1.getString("nome"));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
