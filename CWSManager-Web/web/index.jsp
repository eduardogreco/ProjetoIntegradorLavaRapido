<%-- 
    Document   : index
    Created on : 30/09/2013, 22:39:30
    Author     : eduardogreco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/head.jsp"/>
    </head>
    <body>
         <div id="wrap">

             <jsp:include page="includes/menu.jsp"/>

            <!-- Begin page content -->
            <div class="container">
                <div class="page-header">
                    <h1>Bem-vindo ao CWS-Manager</h1>
                </div>
                <p class="lead">Caro cliente, agende seu serviço no menu acima.</p>
            </div>
        </div>
             <div id="footer">
            <div class="container">
                <p class="text-muted credit">Desenvolvido por <a href="#">Eduardo Greco/Raphael Lira</a>.</p>
            </div>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
