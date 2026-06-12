<%@page import="java.util.List"%>
<%@page import="controller.ManterServico"%>
<%@page import="model.Servico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TopInformatica</title>
       <style>
       body{
            font-family: Arial, Helvetica, sans-serif;
            color: #fff;
            background: #31164B;
        }
</style>
    </head>
    <body>

        <h1>Todos os Serviços</h1>
        <%
            List<Servico> lserv = (List<Servico>) request.getAttribute("lserv");
        %>


        <table border="1">
            <tr>
                <th>ID</th>
                <th>Tipo Servico</th>
                <th>Descricao Produto</th>
                <th>Preco do Servico</th>
                <th>Confirmacao do Pagamento</th>
                <th>Data do Pagamento</th>
                <th>Data da Execução</th>
                <th>Nome do Cliente</th>
                <th>CPF do Cliente</th>
                <th>Telefone do Cliente</th>
                <th>Idade do Cliente</th>
                <th>Remover</th>
                <th>Editar</th>
            </tr>

            <%for ( Servico s : lserv) {%>
            <tr>                
                <td><%out.print(s.getId());%></td>
                <td><%out.print(s.getTipo());%></td>
                <td><%out.print(s.getDescricao());%></td>
                <td><%out.print(s.getPreco());%></td>
                <td><%out.print(s.getConfirmPagamento());%></td>
                <td><%out.print(s.getDataGarantia());%></td>
                <td><%out.print(s.getDataExecucao());%></td>
                <td><%out.print(s.getClienteNome());%></td>
                <td><%out.print(s.getClienteCpf());%></td>
                <td><%out.print(s.getClienteTelefone());%></td>
                <td><%out.print(s.getClienteIdade());%></td>


            </tr>
            <%}%>

        </table>

    </body>
</html>
