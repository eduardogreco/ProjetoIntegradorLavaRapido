<%-- 
    Document   : listaHorarios
    Created on : 12/08/2013, 22:21:45
    Author     : EduardoGreco
--%>

<%@page import="java.util.List"%>
<%@page import="daos.UsuarioDAO"%>
<%@page import="beans.Palpite"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
         <div id='cssmenu'>
            <ul>
                <li class='active'><a href='index.jsp'><span>Home</span></a></li>
                <li class='has-sub'><a href='ConsultarHorariosServlets'><span>Consultar Horários</span></a>
       <!--             <ul>
                        <li><a href='ConsultarHorariosServlets'><span>Widgets</span></a></li>
                        <li><a href='ConsultarHorariosServlets'><span>Menus</span></a></li>
                        <li class='last'><a href='#'><span>Products</span></a></li>
                    </ul> -->
                </li>
                <li class='has-sub'><a href='#'><span>Agendar</span></a>
             <!--       <ul>
                        <li><a href='#'><span>About</span></a></li>
                        <li class='last'><a href='#'><span>Location</span></a></li>
                    </ul> -->
                </li>
                <li class='last'><a href='#'><span>Sair</span></a></li>
            </ul>
        </div>
        <h1>Palpites da copa</h1>
        <hr>
        <%
            List<Palpite> listaPalpites = (List<Palpite>) session.getAttribute("listaPalpites");
            if (listaPalpites == null || listaPalpites.isEmpty()) {
        %>
        Não há palpites!
        <% } else {
        %>
        <table>
            <tr>
                <th class="esquerda">Usuário</th>
                <th>Campeão</th>
                <th>Vice</th>
            </tr>
            <%
                for (Palpite p : listaPalpites) {
                    out.println("<tr>");
                    out.println("<td class=\"esquerda\">"+UsuarioDAO.find(p.getId_usuario()).getNome()+"</td>");
                    out.println("<td>"+p.getCampeao()+"</td>");
                    out.println("<td>"+p.getVice()+"</td>");
                    out.println("</tr>");
                }
            %>
        </table>
        <%
            }
        %>
    </body>
</html>
