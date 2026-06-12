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
public class ServicoAtualizarDAO {
       
 private final String TIPO_BANCO = "mysql"; // ou "postgres"

    public Connection getConnection() throws ClassNotFoundException, SQLException, Exception {
        Conexao cone = FabricaConexao.getConexao(TIPO_BANCO);
        return cone.conectar();
    }
    
  public void atualizar(Servico s) throws ClassNotFoundException, SQLException, Exception {
        Connection con = getConnection();
        PreparedStatement comando = con.prepareStatement("update servico set tipo= ? descricao = ? preco = ? confirmPagamento = ? dataGarantia = ? dataExecucao = ? clienteNome = ? clienteCpf = ? clienteTelefone = ? clienteIdade = ? where id = ?");
        comando.setString(1, s.getTipo());
        comando.setString(2, s.getDescricao());
        comando.setDouble(3, s.getPreco());
        comando.setString(4, s.getConfirmPagamento());
        comando.setString(5, s.getDataGarantia());
        comando.setString(6, s.getDataExecucao());
        comando.setString(7, s.getClienteNome());
        comando.setString(8, s.getClienteCpf());
        comando.setString(9, s.getClienteTelefone());
        comando.setString(10,s.getClienteIdade());
        comando.execute();
        con.close();
    }

    public void atualizar(Servico.ServicoBuilder s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
