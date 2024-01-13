package MODELOS;
import CONFIG.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class UsuarioDAO {
  
  
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int r;
    
    
    
    public Usuario Validar(String nombre, String contraseña) {
        Usuario usuario = new Usuario();
        String consulta = "SELECT nombre,contraseña FROM usuarios WHERE nombre=? AND contraseña=?";
        con = cn.Conexion();
        System.out.println(con);
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            rs.next();
            do {
                usuario.setUser(rs.getString("nombre"));
                usuario.setPassword(rs.getString("contraseña"));
            } while (rs.next());
            JOptionPane.showMessageDialog(null,"Ingreso exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }
    
    
    

    
    public List Listar() {
        String consulta = "{call sp_ListarTodo}";
        List<Usuario> lista = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("Codigo"));
                usuario.setDni(rs.getString("Dni"));
                usuario.setNombres(rs.getString("Nombres"));
                usuario.setApellidoPaterno(rs.getString("Apellido_Paterno"));
                usuario.setApellidoMaterno(rs.getString("Apellido_Materno"));
                usuario.setEdad(rs.getInt("Edad"));
                usuario.setSexo(rs.getString("Sexo"));
                usuario.setTelefono(rs.getString("Telefono"));
                usuario.setDireccion(rs.getString("Direccion"));
                lista.add(usuario);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    }

    public int Agregar(Usuario usuario) {

        String sentencia = "{call sp_AddMatricula(?,?,?,?,?,?,?,?,?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sentencia);
            ps.setInt(1, usuario.getCodigo());
            ps.setString(2, usuario.getDni());
            ps.setString(3, usuario.getNombres());
            ps.setString(4, usuario.getApellidoPaterno());
            ps.setString(5, usuario.getApellidoMaterno());
            ps.setInt(6, usuario.getEdad());
            ps.setString(7, usuario.getSexo());
            ps.setString(8,usuario.getTelefono());
            ps.setString(9,usuario.getDireccion());
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    
     public Usuario ListarPorId(int id) {
        Usuario usuario = new Usuario();
        String consulta = "{call sp_ListarPorID (?)}" ;/*PROCEDIMIENTO*/
        
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(consulta);
             ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario.setCodigo(rs.getInt(1));
                usuario.setDni(rs.getString(2));
                usuario.setNombres(rs.getString(3));
                usuario.setApellidoPaterno(rs.getString(4));
                usuario.setApellidoMaterno(rs.getString(5));
                usuario.setEdad(rs.getInt(6));
                usuario.setSexo(rs.getString(7));
                usuario.setTelefono(rs.getString(8));
                usuario.setDireccion(rs.getString(9));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;

    }
    
     public int ActualizarTodo(Usuario usuario) {
        String sentencia = "{call sp_ActualizarMatricula(?,?,?,?,?,?,?,?,?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, usuario.getDni());
            ps.setString(2, usuario.getNombres());
            ps.setString(3, usuario.getApellidoPaterno());
            ps.setString(4, usuario.getApellidoMaterno());
            ps.setInt(5, usuario.getEdad());
            ps.setString(6,usuario.getSexo());
            ps.setString(7,usuario.getTelefono());
            ps.setString(8,usuario.getDireccion());
            ps.setInt(9, usuario.getCodigo());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }


    
    public void Eliminar(int Codigo) {

        String sql = "DELETE FROM Matricula WHERE Codigo=" + Codigo;
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        public List Buscar(String id){
      List<Usuario> lista = new ArrayList();  
        String consulta = "{call sp_BusquedaMatricula (?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.setString(1,id);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuario usuariolist = new Usuario();
                usuariolist.setCodigo(rs.getInt("Codigo"));
                usuariolist.setDni(rs.getString("Dni"));
                usuariolist.setNombres(rs.getString("Nombres"));
                usuariolist.setApellidoPaterno(rs.getString("Apellido_Paterno"));
                usuariolist.setApellidoMaterno(rs.getString("Apellido_Materno"));
                usuariolist.setEdad(rs.getInt("Edad"));
                usuariolist.setSexo(rs.getString("Sexo"));
                usuariolist.setTelefono(rs.getString("Telefono"));
                usuariolist.setDireccion(rs.getString("Direccion"));
                lista.add(usuariolist);
              }
        } catch (SQLException ex) {
          Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
}
