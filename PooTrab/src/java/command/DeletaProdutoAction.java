/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.ServicoDeletarDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Servico;

/**
 *
 * @author Usuario
 */
public class DeletaProdutoAction implements ICommand{
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "";
        ServicoDeletarDAO sdao = new ServicoDeletarDAO();
        Servico.ServicoBuilder s = new Servico.ServicoBuilder();
        
        try {
            int id = Integer.parseInt(request.getParameter("txtid"));
            s.comId(id);
            sdao.deletar(s);
            msg = "Deletado com sucesso.";
            System.out.println("Deletado com sucesso.");
        } catch (NumberFormatException ex) {
            msg = "Erro ao deletar.";
        }
        request.setAttribute("msg", msg);
        return "resultado.jsp";
    }
}
