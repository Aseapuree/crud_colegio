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
public class ApoderadoDAO {
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Conexion cn = new Conexion();
  int r;
  
public List Listar() {
        String consulta = "SELECT * FROM Apoderado";
        List<Apoderado> lista = new ArrayList();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Apoderado apoderado = new Apoderado();
                apoderado.setId_apoderado(rs.getInt("id_apoderado"));
                apoderado.setDni_apoderado(rs.getString("dni_apoderado"));
                apoderado.setNom_apoderado(rs.getString("nom_apoderdo"));
                apoderado.setApellApoderado(rs.getString("apell_apoderado"));
                apoderado.setId_alumno(rs.getInt("id_alumno"));
                apoderado.setSexo(rs.getString("sexo"));
                apoderado.setDireccion(rs.getString("direccion"));
                apoderado.setTelefono(rs.getString("telefono"));
                lista.add(apoderado);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    } 

 public int Agregar (Apoderado apoderado) {

        String sentencia = "{call sp_AddApoderado(?,?,?,?,?,?,?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sentencia);
            
       
            ps.setString(1, apoderado.getDni_apoderado());
            ps.setString(2, apoderado.getNom_apoderado());
            ps.setString(3, apoderado.getApellApoderado());
            ps.setInt(4,apoderado.getId_alumno());
            ps.setString(5, apoderado.getSexo());
            ps.setString(6, apoderado.getDireccion());
            ps.setString(7, apoderado.getTelefono());
            ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
   
 public Apoderado ListarPorId(int id) {
        Apoderado apoderado = new Apoderado();
        String consulta = "SELECT * FROM Apoderado WHERE id_apoderado=" + id;
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                apoderado.setId_apoderado(rs.getInt("id_apoderado"));
                apoderado.setDni_apoderado(rs.getString(2));
                apoderado.setNom_apoderado(rs.getString(3));
                apoderado.setApellApoderado(rs.getString(4));
                apoderado.setId_alumno(rs.getInt(5));
                apoderado.setSexo(rs.getString(6));
                apoderado.setDireccion(rs.getString(7));
                apoderado.setTelefono(rs.getString(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return apoderado;

    }
public int Actualizar(Apoderado apoderado) {
        String sentencia = "{call sp_ActualizarApoderado(?,?,?,?,?,?,?,?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, apoderado.getDni_apoderado());
            ps.setString(2, apoderado.getNom_apoderado());
            ps.setString(3, apoderado.getApellApoderado());
            ps.setInt(4, apoderado.getId_alumno());
            ps.setString(5, apoderado.getSexo());
            ps.setString(6, apoderado.getDireccion());
            ps.setString(7, apoderado.getTelefono());
            ps.setInt(8, apoderado.getId_apoderado());
            ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

public void Eliminar(int id) {

        String sql = "DELETE FROM Apoderado WHERE id_apoderado=" + id;
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


      public List Buscar(String id){
      List<Apoderado> lista = new ArrayList();  
        String consulta = "{call sp_BusquedaApoderado(?)}";//PA
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
             ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                Apoderado apoderadolist = new Apoderado();
                apoderadolist.setId_apoderado(rs.getInt("id_apoderado"));
                apoderadolist.setDni_apoderado(rs.getString("dni_apoderado"));
                apoderadolist.setNom_apoderado(rs.getString("nom_apoderdo"));
                apoderadolist.setApellApoderado(rs.getString("apell_apoderado"));
                apoderadolist.setId_alumno(rs.getInt("id_alumno"));
                apoderadolist.setSexo(rs.getString("sexo"));
                apoderadolist.setDireccion(rs.getString("direccion"));
                apoderadolist.setTelefono(rs.getString("telefono"));
                lista.add(apoderadolist);
              }
        } catch (SQLException ex) {
          Logger.getLogger(ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}