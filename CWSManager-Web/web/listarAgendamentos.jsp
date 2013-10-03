<%-- 
    Document   : listarAgendamentos
    Created on : 02/10/2013, 11:14:00
    Author     : eduardogreco
--%>

<%@page import="java.util.List"%>
<%@page import="beans.Agendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/head.jsp" ></jsp:include>
    </head>
    <body>
        <div id="wrap">

             <jsp:include page="includes/menu.jsp"/>
      <div class="container">
	<div class="row">
		<div class="span12">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>
							Cliente
						</th>
						<th>
							Veiculo
						</th>
						<th>
							Tipo Serviço
						</th>
						<th>
							Hora/Data
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							Eduardo Greco
						</td>
						<td>
							Corsa - AWU1893
						</td>
						<td>
							Lavagem Completa
						</td>
						<td>
							16:35 10/09/2013
						</td>
					</tr>
					<tr class="success">
						<td>
							Juliano Silva
						</td>
						<td>
							Golf - ADD1200
						</td>
						<td>
							Lavagem Simples
						</td>
						<td>
							13:25 09/09/2013
						</td>
					</tr>
					<tr class="error">
						<td>
							José Ferreira
						</td>
						<td>
							Uno - APO1245
						</td>
						<td>
							Lavagem Completa
						</td>
						<td>
							14:35 11/09/2013
						</td>
					</tr>
					<tr class="warning">
						<td>
							Carol Ferrari
						</td>
						<td>
							Cobalt - APU0981
						</td>
						<td>
							Lavagem Simples
						</td>
						<td>
							10:20 07/09/2013
						</td>
					</tr>
					<tr class="info">
						<td>
							Feli[pe da Silva
						</td>
						<td>
							Gol - AJK5332
						</td>
						<td>
							Lavagem Média
						</td>
						<td>
							08:00 06/09/2013
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
      </div>
    </body>
</html>
