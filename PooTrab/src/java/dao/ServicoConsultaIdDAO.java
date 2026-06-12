/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Servico;
import util.Conexao;
import util.FabricaConexao;

/**
 *
 * @author Usuario
 */
public class ServicoConsultaIdDAO {
       
 private final String TIPO_BANCO = "mysql"; // ou "postgres"

    public Connection getConnection() throws ClassNotFoundException, SQLException, Exception {
        Conexao cone = FabricaConexao.getConexao(TIPO_BANCO);
        return cone.conectar();
    }
       public Servico consultaId(Servico s) throws ClassNotFoundException, SQLException, Exception {
        Connection con = getConnection();
        PreparedStatement comando = con.prepareStatement("select * from Servico where id = ?");
        comando.setInt(1, s.getId());
        ResultSet ss = comando.executeQuery();
        Servico lserv = new Servico();
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

    public Servico consultaId(Servico.ServicoBuilder s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}