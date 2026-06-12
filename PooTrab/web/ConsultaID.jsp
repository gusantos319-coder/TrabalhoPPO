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
        <h1>Resultado Consultar By ID</h1>
        <%
            Servico s = (Servico) request.getAttribute("s");
        %>
        <%if (s.getTipo() != null) {%>
        
            ID <%out.print(s.getId());%><%out.print(s.getId());%><BR> <BR>
            Tipo do Servico <%out.print(s.getTipo());%><BR> <BR>
            Descrição do Servico<%out.print(s.getDescricao());%><BR> <BR>
            Preco do Servico <%out.print(s.getPreco());%> <BR> <BR>
            Confirmacao do Pagamento <%out.print(s.getConfirmPagamento());%> <BR> <BR>
            Data do Pagamento <%out.print(s.getDataGarantia());%> <BR> <BR>
            Data da Execução <%out.print(s.getDataExecucao());%>  <BR> <BR>
            Nome do Cliente <%out.print(s.getClienteNome());%>  <BR> <BR>
            CPF do Cliente <%out.print(s.getClienteCpf());%> <BR> <BR>
            Telefone do Cliente <%out.print(s.getClienteTelefone());%> <BR> <BR>
            Idade do Cliente <%out.print(s.getClienteIdade());%>  <BR> <BR>
            
        <%} else {%>
        <h2>Serviço não encontrado</h2>
        <%}%>
        
    </body>
</html>
