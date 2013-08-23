<%-- 
    Document   : index
    Created on : 08/08/2013, 22:34:30
    Author     : EduardoGreco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <link rel="stylesheet" type="text/css" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CWS Manager - Web</title>
    </head>
    <body>
        <div id='cssmenu'>
            <ul>
                <li class='active'><a href=''><span>Home</span></a></li>
                <li class='has-sub'><a href='ConsultarHorariosServlets'><span>Consultar Horários</span></a>
             <!--       <ul>
                        <li><a href='ConsultarHorariosServlets'><span>Widgets</span></a></li>
                        <li><a href='ConsultarHorariosServlets'><span>Menus</span></a></li>
                        <li class='last'><a href='#'><span>Products</span></a></li>
                    </ul> -->
                </li>
                <li class='has-sub'><a href='AgendarHorariosServlets'><span>Agendar</span></a>
          <!--          <ul>
                        <li><a href='#'><span>About</span></a></li>
                        <li class='last'><a href='#'><span>Location</span></a></li>
                    </ul> -->
                </li>
                <li class='last'><a href='#'><span>Sair</span></a></li>
            </ul>
        </div>
    </body>
</html>
