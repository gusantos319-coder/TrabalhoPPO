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
public class ConexaoPostgres extends Conexao {

    public ConexaoPostgres() {
        this.url = "jdbc:postgresql://localhost:5432/trab_poo";
        this.user = "postgres";
        this.password = "umc@2024";
    }

    @Override
    public Connection conectar() throws Exception {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}
