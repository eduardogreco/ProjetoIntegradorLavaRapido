package servlets;

import daos.PalpiteDAO;
import daos.UsuarioDAO;
import forms.NovoPalpiteFormBean;
import beans.Palpite;
import beans.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GravarPalpiteServlet extends HttpServlet {

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
        NovoPalpiteFormBean npfb = (NovoPalpiteFormBean) request.getSession().getAttribute("novoPalpite");
        request.getSession().removeAttribute("novoPalpite");

        Usuario u = new Usuario();
        u.setNome(npfb.getNome());
        u.setEmail(npfb.getEmail());
        u.setTelefone(npfb.getTelefone());
        u.setDataDeNascimento(npfb.getDataDeNascimento());
        UsuarioDAO.insert(u);

        Palpite p = new Palpite();
        p.setCampeao(npfb.getCampeao());
        p.setVice(npfb.getVice());
        p.setId_usuario(u.getId());
        PalpiteDAO.insert(p);

        request.getSession().setAttribute("mensagem", "Obrigado pelo palpite!");
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
