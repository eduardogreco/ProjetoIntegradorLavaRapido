/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.Agendar;
import daos.AgendarDAO;

/**
 *
 * @author eduardogreco
 */
public class GravarAgendamentos extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Agendar npfb = (Agendar) request.getSession().getAttribute("novoAgendamento");
        request.getSession().removeAttribute("novoAgendamento");


        Agendar u = new Agendar();
        u.setNome(npfb.getNome());
        u.setEmail(npfb.getEmail());
        u.setVeiculo(npfb.getVeiculo());
        u.setTipoServico(npfb.getTipoServico());
        u.setDataagenda(npfb.getDataagenda());
        u.setHora(npfb.getHora());
        AgendarDAO.insert(u);
        

        request.getSession().setAttribute("mensagem", "Obrigado pelo agendamento!");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
