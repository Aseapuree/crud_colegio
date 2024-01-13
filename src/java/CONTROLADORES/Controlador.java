package CONTROLADORES;
import MODELOS.Alumno;
import MODELOS.AlumnoDAO;
import MODELOS.Usuario;
import MODELOS.UsuarioDAO;
import MODELOS.Apoderado;
import MODELOS.ApoderadoDAO;
import java.io.IOException;

import java.text.NumberFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
  
    Alumno alumno = new Alumno ();
    AlumnoDAO alumnoDAO = new AlumnoDAO();
    int idAlumno;
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    int idUsuario;
    Apoderado apoderado = new Apoderado();
    ApoderadoDAO apoderadoDAO = new ApoderadoDAO();
    int idApoderado;
    NumberFormat formatoNumero1;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
       if (menu.equals("menu")) {
            request.getRequestDispatcher("menu.jsp").forward(request, response);
        }
        
        if (menu.equals("Principal")) {
           switch (accion) {
                case "Listar":
                    List lista = usuarioDAO.Listar();
                    request.setAttribute("usuarios", lista);
                 break;
                 
                case "Buscar":
                    String dato =request.getParameter("txtBuscar");
                    List<Usuario> se_lista = usuarioDAO.Buscar(dato);
            
                    request.setAttribute("usuarios",se_lista);
                    request.getRequestDispatcher("Principal.jsp").forward(request, response); 
                    break;
            
                    
                  case "Agregar":
                    int codigo = Integer.parseInt(request.getParameter("txtCodigo"));
                    String dni = request.getParameter("txtDni");
                    String nombres = request.getParameter("txtNombres");
                    String apellidoPaterno = request.getParameter("txtApellidoPaterno");
                    String apellidoMaterno = request.getParameter("txtApellidoMaterno");
                    int edad = Integer.parseInt(request.getParameter("txtEdad"));
                    String sexo = request.getParameter("txtSexo");
                    String telefono = request.getParameter("txtTelefono");
                    String direccion = request.getParameter("txtDireccion");
                    usuario.setCodigo(codigo);
                    usuario.setDni(dni);
                    usuario.setNombres(nombres);
                    usuario.setApellidoPaterno(apellidoPaterno);
                    usuario.setApellidoMaterno(apellidoMaterno);
                    usuario.setEdad(edad);
                    usuario.setSexo(sexo);
                    usuario.setTelefono(telefono);
                    usuario.setDireccion(direccion);
                    usuarioDAO.Agregar(usuario);
                    request.getRequestDispatcher("Controlador?menu=Principal&accion=Listar").forward(request, response);

                    break;

                 case "Cargar":

                    idUsuario = Integer.parseInt(request.getParameter("id"));
                    Usuario usuario = usuarioDAO.ListarPorId(idUsuario);
                    request.setAttribute("usuarioSeleccionado", usuario);
                    request.getRequestDispatcher("EditarPrincipal.jsp").forward(request, response);
                    break;
                case "Eliminar":

                    idUsuario = Integer.parseInt(request.getParameter("id"));
                    usuarioDAO.Eliminar(idUsuario);
                    request.getRequestDispatcher("Controlador?menu=Principal&accion=Listar").forward(request, response);

                    break;
                
                case "Actualizar":
                    Usuario usuario1 = new Usuario();
                    String dniUpdate = request.getParameter("txtDni");
                    String nombreUpdate = request.getParameter("txtNombres");
                    String apellPaternoUpdate = request.getParameter("txtApellidoPaterno");
                    String apellMaternoUpdate = request.getParameter("txtApellidoMaterno");
                    int edadUpdate = Integer.parseInt(request.getParameter("txtEdad"));
                    String sexoUpdate = request.getParameter("txtSexo");
                    String telefonoUpdate = request.getParameter("txtTelefono");
                    String direccionUpdate = request.getParameter("txtDireccion");
                    
                    usuario1.setDni(dniUpdate);
                    usuario1.setNombres(nombreUpdate);
                    usuario1.setApellidoPaterno(apellPaternoUpdate);
                    usuario1.setApellidoMaterno(apellMaternoUpdate);
                    usuario1.setEdad(edadUpdate);
                    usuario1.setSexo(sexoUpdate);
                    usuario1.setTelefono(telefonoUpdate);
                    usuario1.setDireccion(direccionUpdate);
                   
                    usuario1.setCodigo(idUsuario);
                    usuarioDAO.ActualizarTodo(usuario1);
                    
                    request.getRequestDispatcher("Controlador?menu=Principal&accion=Listar").forward(request, response);
                    break;
      
            }
            request.getRequestDispatcher("Principal.jsp").forward(request, response);       
        }
   
        
        if(menu.equals("Alumnos")){
        
          switch(accion){
            case "Listar":
                 List lista = alumnoDAO.Listar();
                    request.setAttribute("alumnos", lista);
                 break;
                 
            case "Buscar":
                    String dato =request.getParameter("txtBuscar");
                    List<Alumno> se_lista = alumnoDAO.Buscar(dato);
            
                    request.setAttribute("alumnos",se_lista);
                    request.getRequestDispatcher("Alumnos.jsp").forward(request, response); 
                    break;
            case "Agregar":
                   // int var =Integer.parseInt(request.getParameter("txtId"));
                    String dniAlumno = request.getParameter("txtDni");
                    String nomAlumno = request.getParameter("txtNomAlumno");
                    String apellAlumno = request.getParameter("txtApellAlumno");
                    String fechNac = request.getParameter("txtFechNac");
                    String sexo = request.getParameter("txtSexo");
                    String direccion = request.getParameter("txtDireccion");
                    //alumno.setIdAlumno(var);
                    alumno.setDni(dniAlumno);
                    alumno.setNomAlumno(nomAlumno);
                    alumno.setApellAlumno(apellAlumno);
                    alumno.setFechaNac(fechNac);
                    alumno.setSexo(sexo);
                    alumno.setDireccion(direccion);
                    alumnoDAO.Agregar(alumno);
                    request.getRequestDispatcher("Controlador?menu=Alumnos&accion=Listar").forward(request, response);

                    break;
                    
               case "Cargar":
                    idAlumno = Integer.parseInt(request.getParameter("id"));
                    Alumno alumno = alumnoDAO.ListarPorId(idAlumno);
                    request.setAttribute("alumnoSeleccionado", alumno);
                    request.getRequestDispatcher("EditarAlumno.jsp").forward(request, response);
                    break;
                    
                    
                case "Eliminar":
                    idAlumno = Integer.parseInt(request.getParameter("id"));
                    alumnoDAO.Eliminar(idAlumno);
                    request.getRequestDispatcher("Controlador?menu=Alumnos&accion=Listar").forward(request, response);
                    break;
                    
                case "Actualizar":
                    Alumno alumno1 = new Alumno();
                    String dniUpdate = request.getParameter("txtDni");
                    String nombreUpdate = request.getParameter("txtNomAlumno");
                    String apellidoUpdate = request.getParameter("txtApellAlumno");
                    String fechaUpdate = request.getParameter("txtFechNac");
                    String sexoUpdate = request.getParameter("txtSexo");
                    String direccionUpdate = request.getParameter("txtDireccion");
                    
                    alumno1.setDni(dniUpdate);
                    alumno1.setNomAlumno(nombreUpdate);
                    alumno1.setApellAlumno(apellidoUpdate);
                    alumno1.setFechaNac(fechaUpdate);
                    alumno1.setSexo(sexoUpdate);
                    alumno1.setDireccion(direccionUpdate);
                    alumno1.setIdAlumno(idAlumno);
                    alumnoDAO.Actualizar(alumno1);
                    request.getRequestDispatcher("Controlador?menu=Alumnos&accion=Listar").forward(request, response);
                    break;
                    
               
            }
            request.getRequestDispatcher("Alumnos.jsp").forward(request, response);
            
          
          }
        
        
         if(menu.equals("Apoderado")){
      switch(accion){
            case "Listar":
                 List lista = apoderadoDAO.Listar();
                    request.setAttribute("apoderados", lista);
                 break;
                 
                 
            case "Buscar":
                    String dato = request.getParameter("txtBuscar");
                    List<Apoderado> se_lista = apoderadoDAO.Buscar(dato);
            
                    request.setAttribute("apoderados",se_lista);
                    request.getRequestDispatcher("Apoderado.jsp").forward(request, response); 
                    break;
            
            case "Agregar":
                   // int id =Integer.parseInt(request.getParameter("txtAId")); 
                    String Dni_apoderado = request.getParameter("txtADni");
                    String Nom_apoderado = request.getParameter("txtANom_apoderado");
                    String ApellApoderado = request.getParameter("txtAApellApoderado");
                    int id_alum = Integer.parseInt(request.getParameter("txtIdAlumno"));
                    String sexo = request.getParameter("txtASexo");
                    String direccion = request.getParameter("txtADireccion");
                    String telefono = request.getParameter("txtTelefono");
                    //apoderado.setId_apoderado(id);
                    apoderado.setDni_apoderado(Dni_apoderado);
                    apoderado.setNom_apoderado(Nom_apoderado);
                    apoderado.setApellApoderado(ApellApoderado);
                    apoderado.setId_alumno(id_alum);
                    apoderado.setSexo(sexo);
                    apoderado.setDireccion(direccion);
                    apoderado.setTelefono(telefono);
                    apoderadoDAO.Agregar(apoderado);
                    request.getRequestDispatcher("Controlador?menu=Apoderado&accion=Listar").forward(request, response);

                    break;
                case "Eliminar":
                    idApoderado = Integer.parseInt(request.getParameter("id"));
                    apoderadoDAO.Eliminar(idApoderado);
                
                    request.getRequestDispatcher("Controlador?menu=Apoderado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    Apoderado apoderado1 = new Apoderado();
                    String dniUpdate = request.getParameter("txtADni");
                    String nombreUpdate = request.getParameter("txtANom_apoderado");
                    String apellidoUpdate = request.getParameter("txtAApellApoderado");
                    int id_alumno = Integer.parseInt(request.getParameter("txtIdAlumno"));
                    String sexoUpdate = request.getParameter("txtASexo");
                    String direccionUpdate = request.getParameter("txtADireccion");
                    String telefonoUpdate = request.getParameter("txtTelefono");
                    
                    apoderado1.setDni_apoderado(dniUpdate);
                    apoderado1.setNom_apoderado(nombreUpdate);
                    apoderado1.setApellApoderado(apellidoUpdate);
                    apoderado1.setId_alumno(id_alumno);
                    
                    apoderado1.setSexo(sexoUpdate);
                    apoderado1.setDireccion(direccionUpdate);
                    apoderado1.setTelefono(telefonoUpdate);
                   
                    apoderado1.setId_apoderado(idApoderado);
                    apoderadoDAO.Actualizar(apoderado1);
                    request.getRequestDispatcher("Controlador?menu=Apoderado&accion=Listar").forward(request, response);
                    break;
                case "Cargar":
                    idApoderado = Integer.parseInt(request.getParameter("id"));
                    Apoderado apoderado = apoderadoDAO.ListarPorId(idApoderado);
                    request.setAttribute("apoderadoSeleccionado", apoderado);
                    request.getRequestDispatcher("EditarApoderado.jsp").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Apoderado.jsp").forward(request, response);
            
          
          }
        
        
        
        
        
        
        
        
        }
       
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response); 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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