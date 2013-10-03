<%-- 
    Document   : Contato
    Created on : 01/10/2013, 14:13:14
    Author     : eduardogreco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/head.jsp"/>
        
        <script type="text/javascript" >
                $(document).ready(function() {
                 //    alert("Opa!"); //usar para saber se o JQuery carregou mesmo tipo um teste
                //    $("label").css("display", "inline-block")
                 //         .css("width", "10px");
                    $("#cpf").mask("999.999.999-99");
                    $("#datanasc").mask("99/99/9999");
                    $("#fone").mask("(099)-9999-9999");

                    $("input[type='button']").click(function() {

                        $(".obg").each(function() {
                            if ($(this).val() === "") {
                                alert("O Campo " + $(this).prev("label").text() + " É Obrigatorio");
                                $(this).focus();
                                return false;
                            }
                        });


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
                    <h1>Fale conosco</h1>
                </div>
                <p class="lead">Preencha os campos abaixo para entrar em contato.</p>
            </div>
            
             <div class="container">
	<div class="row">
		<div class="span12">
			<form>
				<fieldset>
             <label>Nome</label><input type="text" /> <label class="checkbox"><input type="checkbox" /> Check me out</label> <button type="submit" class="btn">Submit</button>
				</fieldset>
			</form>
		</div>
	</div>
</div>
            
            
        </div>
    </body>
</html>
