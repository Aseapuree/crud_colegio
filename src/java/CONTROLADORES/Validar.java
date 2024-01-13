
package CONTROLADORES;

import MODELOS.Usuario;
import MODELOS.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet  {
  

  Usuario usuario = new Usuario();
  UsuarioDAO usuarioDAO = new UsuarioDAO();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
  
  
  
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
  
  
  @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            String nombre = request.getParameter("txtUsuario");
            String password = request.getParameter("txtPassword");
            usuario = usuarioDAO.Validar(nombre,password);
            System.out.print("dato"+usuario.getUser());
            if(usuario.getUser()!= null){
                System.out.print("dato1"+usuario.getUser());
                request.setAttribute("usuario", usuario);
                request.getRequestDispatcher("menu.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            

        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    
     @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
