/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import beans.Palpite;
import daos.PalpiteDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EduardoGreco
 */
public class ConsultarHorariosServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PalpiteDAO pdao = new PalpiteDAO();
        String selecao = request.getParameter("selecao");
        List<Palpite> todosPalpites = null;
        if(selecao == null)
            todosPalpites = pdao.listarTodosPalpites();
        else todosPalpites = pdao.listarTodosPalpitesPorSelecao(selecao);
        request.getSession().setAttribute("listaPalpites", todosPalpites);
        request.getRequestDispatcher("listaHorarios.jsp").forward(request, response);
    }
}
