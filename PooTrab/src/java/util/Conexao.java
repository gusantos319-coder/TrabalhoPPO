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
public abstract class Conexao {

    protected String url;
    protected String user;
    protected String password;

    public Connection conectar() throws Exception{
    return DriverManager.getConnection(url, user, password);
    };
}
