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
         <h1>Atualizar</h1>
        <%
            Servico s = (Servico) request.getAttribute("s");
        %>
        <%if (s.getTipo()!= null) {%>

        <form name="f1" action="ManterServico" method="GET">
            ID <%out.print(s.getId());%> <input type="hidden" name="txtid" value="<%out.print(s.getId());%>"> <BR> <BR>
            Tipo do Servico <input type="text" name="txttipo" value="<%out.print(s.getTipo());%>">  <BR> <BR>
            Descrição do Servico <input type="text" name="txtdescicao" value="<%out.print(s.getDescricao());%>">  <BR> <BR>
            Preco do Servico <input type="text" name="txtpreco" value="<%out.print(s.getPreco());%>">  <BR> <BR>
            Confirmacao do Pagamento <input type="text" name="txtconfirmPagamento" value="<%out.print(s.getConfirmPagamento());%>">  <BR> <BR>
            Data do Pagamento <input type="text" name="txtdataGarantia" value="<%out.print(s.getDataGarantia());%>">  <BR> <BR>
            Data da Execução  <input type="text" name="txtdataExecucao" value="<%out.print(s.getDataExecucao());%>">  <BR> <BR>
            Nome do Cliente <input type="text" name="txtclienteNome" value="<%out.print(s.getClienteNome());%>">  <BR> <BR>
            CPF do Cliente <input type="text" name="txtclienteCpf" value="<%out.print(s.getClienteCpf());%>">  <BR> <BR>
            Telefone do Cliente <input type="text" name="txtclienteTelefone" value="<%out.print(s.getClienteTelefone());%>">  <BR> <BR>
            Idade do Cliente <input type="text" name="txtclienteIdade" value="<%out.print(s.getClienteIdade());%>">  <BR> <BR>
            
             
            <input type="submit" name="os" value="confirmarATT">
        </form>
        <%} else {%>
        <h2>Serviço não encontrado.</h2>
        <%}%>
    </body>
</html>
