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
        
        <form name="f1" action="ManterServico" method="GET">

            <div><h1>Cadastro do Seviço Realizado</h1></div>
            Tipo do Servico <input type="text" name="txttipo" >  <BR> <BR>
            Descrição do Servico <input type="text" name="txtdescicao" >  <BR> <BR>
            Preco do Servico <input type="text" name="txtpreco">  <BR> <BR>
            Confirmacao do Pagamento <input type="text" name="txtconfirmPagamento">  <BR> <BR>
            Data do Pagamento <input type="text" name="txtdataGarantia">  <BR> <BR>
            Data da Execução  <input type="text" name="txtdataExecucao">  <BR> <BR>
            Nome do Cliente <input type="text" name="txtclienteNome">  <BR> <BR>
            CPF do Cliente <input type="text" name="txtclienteCpf">  <BR> <BR>
            Telefone do Cliente <input type="text" name="txtclienteTelefone">  <BR> <BR>
            Idade do Cliente <input type="text" name="txtclienteIdade">  <BR> <BR>
            
            <input type="submit" name="os" value="Cadastrar">
            <input type="submit" name="os" value="Deletar">
            <input type="submit" name="os" value="Atualizar">
            <input type="submit" name="os" value="consutarTodos">
            <input type="submit" name="os" value="consultaId">

        </form>

    </body>
</html>
