/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class ConexaoMySQL extends Conexao {

    public ConexaoMySQL() {
        this.url = "jdbc:mysql://localhost:3306/trab_poo";
        this.user = "root";
        this.password = "";
    }

    @Override
    public Connection conectar() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}