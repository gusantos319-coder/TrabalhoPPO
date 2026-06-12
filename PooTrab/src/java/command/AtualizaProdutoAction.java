/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.ServicoAtualizarDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Servico;

/**
 *
 * @author Usuario
 */
public class AtualizaProdutoAction implements ICommand{

    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "";
        ServicoAtualizarDAO sdao = new ServicoAtualizarDAO();
        Servico.ServicoBuilder s = new Servico.ServicoBuilder();        
        
        try {
            int id = Integer.parseInt(request.getParameter("txtid"));
            String tipo = request.getParameter("txtdescricao");
            String descricao = request.getParameter("txtdescricao");
            double preco = Double.parseDouble(request.getParameter("txtpreco"));
            String confirmPagamento = request.getParameter("txtconfirmPagamento");
            String dataGarantia = request.getParameter("txtdataGarantia");
            String dataExecucao = request.getParameter("txtdataExecucao");
            String clienteNome = request.getParameter("txtclienteNome");
            String clienteCpf = request.getParameter("txtclienteCpf");
            String clienteTelefone = request.getParameter("txtclienteTelefone");
            String clienteIdade = request.getParameter("txtclienteIdade");
            s.comId(id);
            s.comTipo(tipo);
            s.comDescricao(descricao);
            s.comPreco(preco);
            s.comConfirmPagamento(confirmPagamento);
            s.comDataGarantia(dataGarantia);
            s.comDataExecucao(dataExecucao);
            s.comClienteNome(clienteNome);
            s.comClienteCpf(clienteCpf);
            s.comClienteTelefone(clienteTelefone);
            s.comClienteIdade(clienteIdade);
            sdao.atualizar(s);
            msg = "Atualizado com sucesso.";
        } catch (NumberFormatException ex) {
            msg = "Erro ao Atualizar.";
        }
        request.setAttribute("msg", msg);
        return "resultado.jsp";
    }
}
