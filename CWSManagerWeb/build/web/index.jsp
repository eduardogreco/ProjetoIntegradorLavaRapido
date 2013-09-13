<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<c:remove var="novoPalpite" />
<html>
    <head>
        <title>Bolão da copa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
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
        
        <hr>
    </body>
</html>