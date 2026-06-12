/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.ServicoConsultaIdDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Servico;

/**
 *
 * @author Usuario
 */
public class EditaProdutoAction implements ICommand{
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "";
        ServicoConsultaIdDAO sdao = new ServicoConsultaIdDAO();
        Servico.ServicoBuilder s = new Servico.ServicoBuilder();
        try {
            int id = Integer.parseInt(request.getParameter("txtid"));
            s.comId(id);
            Servico serv = sdao.consultaId(s);
            request.setAttribute("serv", serv);
        } catch (NumberFormatException ex) {
            msg = "Erro ao consultar";
            request.setAttribute("msg", msg);
        }
        return "formeditar.jsp";
    }
}
