<%-- 
    Document   : agendarAtendimento
    Created on : 12/08/2013, 22:44:07
    Author     : EduardoGreco
--%>

<%@page import="forms.NovoPalpiteFormBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script language="javascript" type="text/javascript">
            function validaForm() {

                if (nome.value == "") {
                    alert("O campo [Nome] é obrigatorio.");
                    d.nome.focus();
                    return false;
                }

                if (d.endereco.value == "") {
                    alert("O campo [Endereço] é obrigatorio.");
                    d.endereco.focus();
                    return false;
                }

                if (d.cidade.value == "") {
                    alert("O campo [Cidade] é obrigatorio.");
                    d.cidade.focus();
                    return false;
                }

                if (d.uf.value == "") {
                    alert("O campo [UF] é obrigatorio.");
                    d.uf.focus();
                    return false;
                }

                if (d.telefone.value == "") {
                    alert("O campo [Telefone] é obrigatorio.");
                    d.telefone.focus();
                    return false;
                }

                //validar email
                if (d.email.value == "") {
                    alert("O campo [E-mail] é obrigatorio!");
                    d.email.focus();
                    return false;
                }
                //validar email(verificao de endereco eletronico)
                parte1 = d.email.value.indexOf("@");
                parte2 = d.email.value.indexOf(".");
                parte3 = d.email.value.length;
                if (!(parte1 >= 3 && parte2 >= 6 && parte3 >= 9)) {
                    alert("O campo [E-mail] deve ser conter um endereco eletronico!");
                    d.email.focus();
                    return false;
                }

                if (d.assunto.value == "") {
                    alert("O campo [Assunto] � obrigat�rio.");
                    d.assunto.focus();
                    return false;
                }

                if (d.mensagem.value == "") {
                    alert("O campo [Mensagem] � obrigat�rio.");
                    d.mensagem.focus();
                    return false;
                }

                if (d.sv2.selectedIndex === 0) {
                    alert("O campo [Servico] � obrigat�rio.");
                    d.mensagem.focus();
                    return false;
                }
                return true;
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<String> mensagens = (List<String>) session.getAttribute("mensagens");
            if (mensagens != null && !mensagens.isEmpty()) {
                out.println("<ul class=\"erro\">");
                for (String msg : mensagens) {
                    out.println("<li>" + msg + "</li>");
                }
                out.println("</ul>");
            }
            NovoPalpiteFormBean palpite = (NovoPalpiteFormBean) session.getAttribute("novoPalpite");
            String nome = "", telefone = "", email = "", data = "", campeao = "", vice = "";
            if (palpite != null) {
                nome = palpite.getNome();
                telefone = palpite.getTelefone();
                data = palpite.getDataDeNascimento();
                email = palpite.getEmail();
                campeao = palpite.getCampeao();
                vice = palpite.getVice();
            }
        %>
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
                <li class='has-sub'><a href='AgendarHorariosServlets'><span>Agendar</span></a>
                    <!--       <ul>
                               <li><a href='#'><span>About</span></a></li>
                               <li class='last'><a href='#'><span>Location</span></a></li>
                           </ul> -->
                </li>
                <li class='last'><a href='#'><span>Sair</span></a></li>
            </ul>
        </div>
<form action="NovoAgenda" method="post">
            Digite seus dados:<br/>
            Nome: <input name="nome" type="text" value="<%=nome%>" /><br/>
            E-mail: <input name="email" type="text" value="<%=email%>" /><br/>
            Telefone: <input name="telefone" type="text" value="<%=telefone%>" /><br/>
            Data de nascimento: <input name="dataDeNascimento" type="text" value="<%=data%>" /><br/>
            Campeão: <input name="campeao" type="text" value="<%=campeao%>" /><br/>
            Vice: <input name="vice" type="text" value="<%=vice%>" /><br/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
