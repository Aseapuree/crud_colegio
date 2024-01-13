
package MODELOS;
public class Usuario {
 
   int codigo,edad;
   String dni,nombres, apellidoPaterno, apellidoMaterno, 
           sexo, telefono, direccion;
   String user,password;


    public Usuario(){
    
    }
    public Usuario(int codigo, String dni, String nombres, String apellidoPaterno, String apellidoMaterno, int edad, String sexo,String telefono,String direccion) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
     public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public String getUser(){
      return user;
    }
  
    public void setUser(String user){
      this.user = user;
    }
    
    public String getPassword(){
      return password;
    }
  
    public void setPassword(String password){
      this.password = password;
    }
    
}
