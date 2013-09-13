<%@page import="forms.NovoPalpiteFormBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Bolão da Copa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <script type="text/javascript">

            /**
             * Comment
             */
            function validar() {
                if (form.nome.value == "") {
                    alert("Nome não pode ser vazio.");
                    form.nome.focus();
                    return false;
                }

                if (form.email.value == "") {
                    alert("Telefone não pode ser vazio.");
                    form.email.focus();
                    return false;
                }

                if (form.telefone.value == "") {
                    alert("E-mail não pode ser vazio.");
                    form.telefone.focus();
                    return false;
                }

                if (form.dataDeNascimento.value == "") {
                    alert("Endereço não pode ser vazio.");
                    form.dataDeNascimento.focus();
                    return false;
                }

                var selectedCombobox = (form.campeao.value);
                if (selectedCombobox == "-1") {
                    alert("Escolha um tipo de Serviço");
                    return false;
                }

                if (form.vice.value == "") {
                    alert("Horario não pode ser vazio.");
                    form.vice.focus();
                    return false;
                }


            }
        </script>
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
        <h1>Agendamento</h1>
        <hr>
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
        <table>
            <form name="form" action="NovoPalpiteServlet" method="post" onsubmit="return validar(this);">
                <fieldset>
                    <legend>Digite seus dados: </legend>

                    <p>Nome: <input name="nome" type="text" value="<%=nome%>" /><br/> </p>
                    <p>Telefone: <input name="email" type="text" value="<%=email%>" /><br/> </p>
                    <p>E-mail: <input name="telefone" type="text" value="<%=telefone%>" /><br/> </p>
                    <p>Endereço: <input name="dataDeNascimento" type="text" value="<%=data%>" /><br/> </p>
                    <p>Tipo de Serviço: <select name="campeao" type="text" value="<%=campeao%>" /><br/>
                    <option value="-1">Selecionar</option>
                    <option>Lavagem Completa</option>
                    <option>Lavagem Externa</option>
                    <option>Lavagem Interna</option>
                    </select>
                    </p>
                    <p>Horário: <input name="vice" type="text" value="<%=vice%>" /><br/> </p>
                    <input type="reset" value="Limpar"/>
                    <input type="submit" value="Enviar"/>
                </fieldset>
            </form>
        </table>
    </body>
</html>