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

public class AlumnoDAO {
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Conexion cn = new Conexion();
  int r;
  
  
  
  public Alumno Validar(String nombre, String contraseña) {
        Alumno alumno = new Alumno();
        String consulta = "SELECT*FROM Alumno WHERE nom_alumno=? AND contraseña=?";
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            rs.next();
            do {
                alumno.setIdAlumno(rs.getInt("id_alumno"));
                alumno.setDni(rs.getString("dni"));
                alumno.setNomAlumno(rs.getString("nom_alumno"));
                alumno.setApellAlumno(rs.getString("apell_alumno"));
                alumno.setFechaNac(rs.getString("fech_nacimiento"));
                alumno.setSexo(rs.getString("sexo"));
                alumno.setDireccion(rs.getString("direccion"));
            } while (rs.next());
            JOptionPane.showMessageDialog(null,"Ingreso exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alumno;
    }
  


public List Listar() {
        String consulta = "SELECT  * FROM Alumno";
        List<Alumno> lista = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("id_alumno"));
                alumno.setDni(rs.getString("dni"));
                alumno.setNomAlumno(rs.getString("nom_alumno"));
                alumno.setApellAlumno(rs.getString("apell_alumno"));
                alumno.setFechaNac(rs.getString("fech_nacimiento"));
                alumno.setSexo(rs.getString("sexo"));
                alumno.setDireccion(rs.getString("direccion"));
                lista.add(alumno);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    } 
  


 public int Agregar(Alumno alumno) {

        String sentencia = "INSERT INTO Alumno (dni,nom_alumno,apell_alumno,fech_nacimiento,sexo,direccion) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, alumno.getDni());
            ps.setString(2, alumno.getNomAlumno());
            ps.setString(3, alumno.getApellAlumno());
            ps.setString(4, alumno.getFechaNac());
            ps.setString(5, alumno.getSexo());
            ps.setString(6, alumno.getDireccion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public Alumno ListarPorId(int id) {
        Alumno alumno = new Alumno();
        String consulta = "SELECT * FROM Alumno WHERE id_alumno=" + id;
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getString(2));
                alumno.setNomAlumno(rs.getString(3));
                alumno.setApellAlumno(rs.getString(4));
                alumno.setFechaNac(rs.getString(5));
                alumno.setSexo(rs.getString(6));
                alumno.setDireccion(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alumno;

    }

    public int Actualizar(Alumno alumno) {
        String sentencia = "{call sp_ActualizarAlumno (?,?,?,?,?,?,?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, alumno.getDni());
            ps.setString(2, alumno.getNomAlumno());
            ps.setString(3, alumno.getApellAlumno());
            ps.setString(4, alumno.getFechaNac());
            ps.setString(5, alumno.getSexo());
            ps.setString(6, alumno.getDireccion());
            ps.setInt(7, alumno.getIdAlumno());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
          public List Buscar(String id){
      List<Alumno> lista = new ArrayList();  
        String consulta = "{call sp_BusquedaAlumno (?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.setString(1,id);
            rs = ps.executeQuery();
            while(rs.next()){
                 Alumno alumnolist = new Alumno();
                alumnolist.setIdAlumno(rs.getInt("id_alumno"));
                alumnolist.setDni(rs.getString("dni"));
                alumnolist.setNomAlumno(rs.getString("nom_alumno"));
                alumnolist.setApellAlumno(rs.getString("apell_alumno"));
                alumnolist.setFechaNac(rs.getString("fech_nacimiento"));
                alumnolist.setSexo(rs.getString("sexo"));
                alumnolist.setDireccion(rs.getString("direccion"));
                lista.add(alumnolist);
              }
        } catch (SQLException ex) {
          Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    

    public void Eliminar(int id) {

        String sql = "DELETE FROM Alumno WHERE id_alumno=" + id;
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}
