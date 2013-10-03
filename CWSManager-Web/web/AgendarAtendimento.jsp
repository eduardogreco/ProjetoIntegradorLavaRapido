<%-- 
    Document   : AgendarAtendimento
    Created on : 30/09/2013, 22:44:12
    Author     : eduardogreco
--%>
<%@page import="beans.Agendar"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <jsp:include page="includes/head.jsp" ></jsp:include>
        
         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.1/jquery.min.js" ></script>
		<!-- Inclus�o do Jquery Validate -->
		<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery.validate/1.6/jquery.validate.js" ></script>
		
		<!-- Valida��o do foruml�rio -->
		<script type="text/javascript">
			$(document).ready(function(){
				$('#meu_form').validate({
					rules:{ 
						nome:{ 
							required: true,
							minlength: 3
						},
						email: {
							required: true,
							email: true
						},
						veiculo: {
							required: true
						},
                                                data: {
							required: true
						},
                                                hora: {
							required: true
						},
						tipoServico:{
							required: true,
						},
						termos: "required"
					},
					messages:{
						nome:{ 
							required: " O campo nome é obrigatorio.",
							minlength: "O campo nome deve conter no mínimo 3 caracteres."
						},
						email: {
							required: " O campo email é obrigatorio.",
							email: "O campo email deve conter um email válido."
						},
						veiculo: {
							required: " O campo veiculo é obrigatorio.",
							
						},
						tipoServico:{
							required: "O campo tipo servico é obrigatorio.",
						},
                                                data:{
							required: "O campo data é obrigatorio.",
						},
                                                hora:{
							required: "O campo hora é obrigatorio.",
						}
					}
					
				});
			});
		</script>
    </head>
    
    <body>
          <div id="wrap">

             <jsp:include page="includes/menu.jsp"/>

            <!-- Begin page content -->
            <div class="container">
                <div class="page-header">
                    <h1>Agendar Atendimentos</h1>
                </div>
                <p class="lead">Caro cliente, agende seu serviço abaixo.</p>
                <form id="meu_form" action="" method="" >
		Nome:<br />
		<input type="text" name="nome" id="nome" /><br />
                <br />
		Email:<br />
		<input type="text" name="email" id="email" /><br />
                <br />
		Veiculo:<br />
		<input type="text" name="veiculo" id="veiculo" /><br />
		<br />
                Tipo de Serviço:<br />
		<input type="text" name="tipoServico" id="tipoServico" /><br />
                <br />
                Data:<br />
		<input type="text" name="data" id="data" /><br />
                <br />
                Horario:<br />
		<input type="text" name="hora" id="hora" /><br />
                <br />
                <input type="reset" value="Limpar" />
		<input type="submit" value="Agendar" />
	</form>

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
