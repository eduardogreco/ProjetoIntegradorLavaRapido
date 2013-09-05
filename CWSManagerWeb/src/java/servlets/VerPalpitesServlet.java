package servlets;

import daos.PalpiteDAO;
import beans.Palpite;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerPalpitesServlet extends HttpServlet {
   
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
        PalpiteDAO pdao = new PalpiteDAO();
        String selecao = request.getParameter("selecao");
        List<Palpite> todosPalpites = null;
        if(selecao == null)
            todosPalpites = pdao.listarTodosPalpites();
        else todosPalpites = pdao.listarTodosPalpitesPorSelecao(selecao);
        request.getSession().setAttribute("listaPalpites", todosPalpites);
        request.getRequestDispatcher("listaPalpites.jsp").forward(request, response);
    } 

}
