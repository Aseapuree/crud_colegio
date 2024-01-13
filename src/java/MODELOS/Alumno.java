package MODELOS;


public class Alumno {
  int id_alumno;
  String dni,nom_alumno,apell_alumno,
          fecha_nacimiento,sexo,direccion;
  public Alumno(){
  
  }


  public Alumno(int id_alumno,String dni,String nom_alumno,String apell_alumno,String fecha_nacimiento,String sexo,String direccion){
    this.id_alumno = id_alumno;
    this.dni = dni;
    this.nom_alumno = nom_alumno;
    this.apell_alumno = apell_alumno;
    this.fecha_nacimiento = fecha_nacimiento;
    this.sexo = sexo;
    this.direccion = direccion;
    
  
  
  }

  
  
  public int getIdAlumno(){
    return id_alumno;
  }
  
   public void setIdAlumno(int id_alumno){
     this.id_alumno = id_alumno;
  }
  
   
   public String getDni(){
     return dni;
   
   }
  
  public void setDni(String dni){
    this.dni = dni;
  }
  
  
  public String getNomAlumno(){
    return nom_alumno;
  }
  
  public void setNomAlumno(String nom_alumno){
    this.nom_alumno = nom_alumno;
  }
  
  public String getApellAlumno(){
    return apell_alumno;
  }
  
  public void setApellAlumno(String apell_alumno){
    this.apell_alumno = apell_alumno;
  }
  
  
  public String getFechaNac(){
    return fecha_nacimiento;
  
  }
  
  public void setFechaNac(String fecha_nacimiento){
    this.fecha_nacimiento = fecha_nacimiento;
  }
  
  public String getSexo(){
    return sexo ;
  }
  
  public void setSexo(String sexo){
    this.sexo = sexo;
  }
  
  
  public String getDireccion(){
    return direccion;
  }
  
  public void setDireccion(String direccion){
    this.direccion =direccion;
  }
}
