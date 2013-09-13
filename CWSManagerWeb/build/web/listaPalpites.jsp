<%@page import="beans.Usuario"%>
<%@page import="daos.UsuarioDAO"%>
<%@page import="beans.Palpite"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Bolão 2010</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <link rel="stylesheet" type="text/css" href="table.css" />
    </head>
    <body>
         <div id='cssmenu'>
            <ul>
                <li class='active'><a href=''><span>Home</span></a></li>
                <li class='has-sub'><a href='VerPalpitesServlet'><span>Consultar Horários</span></a>
             <!--       <ul>
                        <li><a href='ConsultarHorariosServlets'><span>Widgets</span></a></li>
                        <li><a href='ConsultarHorariosServlets'><span>Menus</span></a></li>
                        <li class='last'><a href='#'><span>Products</span></a></li>
                    </ul> -->
                </li>
                <li class='has-sub'><a href='palpiteForm.jsp'><span>Agendar</span></a>
          <!--          <ul>
                        <li><a href='#'><span>About</span></a></li>
                        <li class='last'><a href='#'><span>Location</span></a></li>
                    </ul> -->
                </li>
                <li class='last'><a href='#'><span>Sair</span></a></li>
            </ul>
        </div>
        <h1>Lista de Horários</h1>
        <hr>
        <%
            List<Palpite> listaPalpites = (List<Palpite>) session.getAttribute("listaPalpites");
            if (listaPalpites == null || listaPalpites.isEmpty()) {
        %>
        Não há palpites!
        <% } else {
        %>
           <div class="CSSTableListaHr" style="width:1235px;height:620px;">
           <center>
        <table>
            <tr>
                <th class="esquerda">Cliente</th>
                <th>Tipo de Serviço</th>
                <th>Horário</th>
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
        </center>
        </div>
        <%
            }
        %>
    </body>
</html>
