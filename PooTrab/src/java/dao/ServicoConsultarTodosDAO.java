/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Servico;
import util.Conexao;
import util.FabricaConexao;

/**
 *
 * @author Usuario
 */
public class ServicoConsultarTodosDAO {
       
 private final String TIPO_BANCO = "mysql"; // ou "postgres"

    public Connection getConnection() throws ClassNotFoundException, SQLException, Exception {
        Conexao cone = FabricaConexao.getConexao(TIPO_BANCO);
        return cone.conectar();
    }
    
    public List<Servico> consultarTodos(Servico s) throws ClassNotFoundException, SQLException, Exception {
        Connection con = getConnection();
        PreparedStatement comando = con.prepareStatement("select * from Servico");
        ResultSet ss = comando.executeQuery();

        List<Servico> lserv = new ArrayList<Servico>();
        while (ss.next()) {
        new Servico.ServicoBuilder()
            .comId(ss.getInt("id"))
            .comTipo(ss.getString("tipo"))
            .comDescricao(ss.getString("descricao"))
            .comPreco(ss.getDouble("preco"))
            .comConfirmPagamento(ss.getString("confirmPagamento"))
            .comDataGarantia(ss.getString("dataGarantia"))
            .comDataExecucao(ss.getString("dataExecucao"))
            .comClienteNome(ss.getString("clienteNome"))
            .comClienteCpf(ss.getString("clienteCpf"))
            .comClienteTelefone(ss.getString("clienteTelefone"))
            .comClienteIdade(ss.getString("clienteIdade"))
            .constroi();
        }
        return lserv;
    }

    public List<Servico> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
