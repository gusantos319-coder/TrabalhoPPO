/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Servico;
import util.Conexao;
import util.FabricaConexao;

/**
 *
 * @author Usuario
 */
public class ServicoDeletarDAO {
    
       
 private final String TIPO_BANCO = "mysql"; // ou "postgres"

    public Connection getConnection() throws ClassNotFoundException, SQLException, Exception {
        Conexao cone = FabricaConexao.getConexao(TIPO_BANCO);
        return cone.conectar();
    }
    
    public void deletar(Servico s) throws ClassNotFoundException, SQLException, Exception {
        Connection con = getConnection();
        PreparedStatement comando = con.prepareStatement("delete from servico where id = ?");
        comando.setInt(1, s.getId());
        comando.execute();
        con.close();

    }

    public void deletar(Servico.ServicoBuilder s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
