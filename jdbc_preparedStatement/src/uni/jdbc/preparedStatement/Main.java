package uni.jdbc.preparedStatement;
import java.sql.*;

/*

CREATE DATABASE banco_Teste

USE banco_Teste

CREATE TABLE Clientes(
	id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome varchar (100)
);

*/

public class Main {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_Teste","root","password");

            //ADD
            String resultSet1 = "INSERT INTO Clientes(nome) VALUES(?)";
            String resultSet2 = "INSERT INTO Clientes(nome) VALUES(?)";

            //UPDATE
            String resultSet3 = "UPDATE Clientes SET nome = ? WHERE id = ?";
            String resultSet4 = "UPDATE Clientes SET nome = ? WHERE id = ?";

            //DELETE
            String resultSet5 = "DELETE FROM Clientes WHERE id = ?";
            String resultSet6 = "DELETE FROM Clientes WHERE id = ?";

            //SELECT
            String select = "Select * FROM Clientes";

            try (PreparedStatement pS = conn.prepareStatement(resultSet1 + resultSet2 + resultSet3 + resultSet4 + resultSet5 + resultSet6 + select)){

                //INSERT
                pS.setString(1, "João");
                pS.setString(2, "Maria");
                pS.execute(resultSet1 + resultSet2);

                //UPDATE
                pS.setString(1, "John");
                pS.setString(2, "Marya");
                pS.execute(resultSet3 + resultSet4);

                //DELETE
                pS.setString(1, "John");
                pS.setString(2, "Marya");
                pS.execute(resultSet5 + resultSet6 );

                //SELECT
                pS.execute(select);

            }catch (SQLException e){

                e.printStackTrace();

            }

        }catch(SQLException | ClassNotFoundException e){

            e.printStackTrace();

            System.out.println("Conexão falhou!");

        }
    }
}