<%-- 
    Document   : RegistrarApoderado
    Created on : 4 dic 2022, 1:43:08
    Author     : kioto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>APODERADO</title>
  </head>


<body>
     <div class="container-fluid row justify-content-center  ">

        <div class="col-sm-12 col-md-2 col-lg-4 col-xl-4 py-4 bg-white ">
          <h2>REGISTRO APODERADO</h2>
          <form action="Controlador?menu=Apoderado" method="POST">
            
            <div class="mb-3">
              <label for="nombre" class="form-label">DNI</label>
              <input type="text" name="txtADni" class="form-control" id="nombre" autofocus value="${apoderadoSeleccionado.getDni_apoderado()}"/>
            </div>
            <div class="mb-3">
              <label for="nombre" class="form-label">Nombres</label>
              <input type="text" name="txtANom_apoderado"  class="form-control" id="nombre" autofocus value="${apoderadoSeleccionado.getNom_apoderado()}"/>
            </div>
            <div class="mb-3">
              <label for="programadores" class="form-label">Apellidos</label>
              <input type="text" name="txtAApellApoderado" class="form-control" id="programadores"  value="${apoderadoSeleccionado.getApellApoderado()}"/>
            </div>
             <div class="mb-3">
              <label for="programadores" class="form-label">ID Alumno</label>
              <input type="text" name="txtIdAlumno" class="form-control" id="programadores"  value="${apoderadoSeleccionado.getId_alumno()}"/>
            </div>
            <div class="mb-3">
              <label for="programadores" class="form-label">Sexo</label>
              <input type="text" name="txtASexo" class="form-control" id="programadores" value="${apoderadoSeleccionado.getSexo()}"/>
            </div>
            <div class="mb-3">
              <label for="programadores" class="form-label">Direccion</label>
              <input type="text" name="txtADireccion" class="form-control" id="programadores" value="${apoderadoSeleccionado.getDireccion()}"/>
            </div>
            <div class="mb-3">
              <label for="programadores" class="form-label">Telefono</label>
              <input type="text" name="txtTelefono" class="form-control" id="programadores" value="${apoderadoSeleccionado.getTelefono()}"/>
            </div>
            <div class="d-grid gap-2">
              <input type="submit" name="accion" class="btn btn-success" value="Agregar">
              <input type="submit" class="btn btn-secondary" value="Limpiar" >
            </div>
          </form>
        </div>
    <a href="menu.jsp">Regresar a la pagina principal</a>
     </div>   
            

 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
 
</body>  
</html>
