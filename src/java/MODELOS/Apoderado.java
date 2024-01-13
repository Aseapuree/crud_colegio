package MODELOS;

public class Apoderado {
  
  int id_apoderado,id_alumno;
  String dni_apoderado,nom_apoderado,apellApoderado,
          sexo,direccion,telefono;

  public Apoderado(){}

  public Apoderado(int id_apoderado, int id_alumno, String dni_apoderado, String nom_apoderado, String apellApoderado, String sexo, String direccion, String telefono) {
    this.id_apoderado = id_apoderado;
    this.id_alumno = id_alumno;
    this.dni_apoderado = dni_apoderado;
    this.nom_apoderado = nom_apoderado;
    this.apellApoderado = apellApoderado;
    this.sexo = sexo;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  public int getId_apoderado() {
    return id_apoderado;
  }

  public void setId_apoderado(int id_apoderado) {
    this.id_apoderado = id_apoderado;
  }

  public int getId_alumno() {
    return id_alumno;
  }

  public void setId_alumno(int id_alumno) {
    this.id_alumno = id_alumno;
  }

  public String getDni_apoderado() {
    return dni_apoderado;
  }

  public void setDni_apoderado(String dni_apoderado) {
    this.dni_apoderado = dni_apoderado;
  }

  public String getNom_apoderado() {
    return nom_apoderado;
  }

  public void setNom_apoderado(String nom_apoderado) {
    this.nom_apoderado = nom_apoderado;
  }

  public String getApellApoderado() {
    return apellApoderado;
  }

  public void setApellApoderado(String apellApoderado) {
    this.apellApoderado = apellApoderado;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }


  
}
