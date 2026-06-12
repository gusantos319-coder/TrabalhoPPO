/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.ServicoCadastrarDAO;
import decorator.GarantiaEstendidaDecorator;
import decorator.NotificacaoEmailDecorator;
import decorator.UrgenciaDecorator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.IServico;
import model.Servico;

/**
 *
 * @author Usuario
 */
public class CadastraProdutoAction implements ICommand {
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String msg = "";
        ServicoCadastrarDAO sdao = new ServicoCadastrarDAO();
        Servico.ServicoBuilder s = new Servico.ServicoBuilder();        
        try {
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

            Servico servico = s.constroi();

            // Aplica os decorators de acordo com os adicionais selecionados no formulário
            IServico servicoDecorado = servico;

            if (request.getParameter("chkGarantiaEstendida") != null) {
                servicoDecorado = new GarantiaEstendidaDecorator(servicoDecorado);
            }
            if (request.getParameter("chkNotificacaoEmail") != null) {
                servicoDecorado = new NotificacaoEmailDecorator(servicoDecorado);
            }
            if (request.getParameter("chkUrgencia") != null) {
                servicoDecorado = new UrgenciaDecorator(servicoDecorado);
            }

            // Atualiza o serviço com os valores finais (descrição e preço) já decorados
            servico.setDescricao(servicoDecorado.getDescricao());
            servico.setPreco(servicoDecorado.getPreco());

            sdao.cadastrar(servico);
            msg = "Cadastrado com sucesso.";
            System.out.println("Cadastrado com sucesso.");
        } catch (NumberFormatException ex) {
            msg = "Erro ao cadastrar.";
        }
        request.setAttribute("msg", msg);
        return "resultado.jsp";
    }
    
}

