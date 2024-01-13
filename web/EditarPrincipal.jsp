<%-- 
    Document   : EditarPrincipal
    Created on : 4 dic 2022, 1:09:09
    Author     : kioto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>JSP Page</title>
  </head>
  <body>
    <div class="container-fluid row justify-content-center ">

     
        <div class="col-sm-12 col-md-2 col-lg-4 col-xl-4 py-4 bg-white ">
          <h2>Formulario de Registro</h2>
          <form action="Controlador?menu=Principal" method="POST">
            <div class="mb-3">
              <label for="nombre" class="form-label">ID</label>
              <input type="text" name="txtCodigo" class="form-control" id="nombre"  autofocus value="${usuarioSeleccionado.getCodigo()}"/>
            </div>
            <div class="mb-3">
              <label for="nombre" class="form-label">DNI</label>
              <input type="text" name="txtDni" class="form-control" id="nombre" autofocus value="${usuarioSeleccionado.getDni()}"/>
            </div>
            <div class="mb-3">
              <label for="nombre" class="form-label">Nombres</label>
              <input type="text" name="txtNombres"  class="form-control" id="nombre" autofocus value="${usuarioSeleccionado.getNombres()}"/>
            </div>
            <div class="mb-3">
              <label for="programadores" class="form-label">Apellidos Paterno</label>
              <input type="text" name="txtApellidoPaterno" class="form-control" id="programadores" value="${usuarioSeleccionado.getApellidoPaterno()}"/>
            </div>
            <div class="mb-3">
              <label for="programadores" class="form-label">Apellido Materno</label>
              <input type="text" name="txtApellidoMaterno" class="form-control" id="programadores" value="${usuarioSeleccionado.getApellidoMaterno()}"/>
            </div>
            <div class="mb-3">
              <label for="nombre" class="form-label">Edad</label>
              <input type="text" name="txtEdad" class="form-control" id="programadores" value="${usuarioSeleccionado.getEdad()}"/>
            </div>
            <div class="mb-3">
              <label for="nombre" class="form-label">Sexo</label>
              <input type="text" name="txtSexo" class="form-control" id="programadores" value="${usuarioSeleccionado.getSexo()}"/>
            </div>
            <div class="mb-3">
              <label for="txtTelefono" class="form-label">Telefono</label>
              <input type="text" name="txtTelefono" class="form-control" id="programadores" value="${usuarioSeleccionado.getTelefono()}"/>
            </div>
            <div class="mb-3">
              <label for="nombre" class="form-label">Direccion</label>
              <input type="text" name="txtDireccion" class="form-control" id="programadores" value="${usuarioSeleccionado.getDireccion()}"/>
            </div>
            <div class="d-grid gap-2">
              <input type="submit" name="accion" class="btn btn-success" value="Actualizar">
              <input  type="submit" class="btn btn-secondary" value="Limpiar">
            </div>
          </form>
        </div>
      </div>      
     <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


  </body>
</html>
