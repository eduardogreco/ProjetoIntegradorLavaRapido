/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.Agendar;
import daos.AgendarDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eduardogreco
 */
public class VerAgendamentos extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        AgendarDAO pdao = new AgendarDAO();
        List<Agendar> todosPalpites = null;
            todosPalpites = pdao.listarTodosPalpites();
        request.getSession().setAttribute("listarAgendamentos", todosPalpites);
        request.getRequestDispatcher("listarAgendamentos.jsp").forward(request, response);
    } 
}
