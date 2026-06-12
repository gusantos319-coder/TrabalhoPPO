/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.ServicoConsultarTodosDAO;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Servico;

/**
 *
 * @author Usuario
 */
public class ConsultaTodosProdutoAction implements ICommand{
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ServicoConsultarTodosDAO sdao = new ServicoConsultarTodosDAO();
        try {
            List<Servico> lserv = sdao.consultarTodos();
            request.setAttribute("lprod", lserv);
        } catch (NumberFormatException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
        return "resultadoconsultartodos.jsp";
    }
}
