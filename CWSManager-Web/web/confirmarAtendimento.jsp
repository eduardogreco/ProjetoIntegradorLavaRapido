<%-- 
    Document   : confirmarAtendimento
    Created on : 02/10/2013, 19:15:32
    Author     : eduardogreco
--%>

<%@page import="forms.NovoPalpiteFormBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% NovoPalpiteFormBean palpite = (NovoPalpiteFormBean) session.getAttribute("novoPalpite"); 
            String nome = palpite.getNome();
            String telefone = palpite.getTelefone();
            String email = palpite.getEmail();
            String data = palpite.getDataDeNascimento();
            String campeao = palpite.getCampeao();
            String vice = palpite.getVice();
        %>
        
        Nome: <%=nome%><br/>
        E-mail: <%=email%><br/>
        Telefone: <%=telefone%><br/>
        Data de nascimento: <%=data%><br/>
        Campeão: <%=campeao%><br/>
        Vice: <%=vice%><br/>
        <br/>
        <a href="GravarPalpiteServlet">Confirmar</a>
        <a href="palpiteForm.jsp">Modificar</a>
        <a href="index.jsp?cancelar=sim" >Cancelar</a>
        
    </body>
</html>
