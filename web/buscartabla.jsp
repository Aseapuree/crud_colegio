<%-- 
    Document   : buscartabla
    Created on : 4 dic 2022, 3:15:03
    Author     : kioto
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    
    <div class="col-sm-12 col-md-8 col-lg-8 col-xl-10">
          <div class="table-responsive">
            
                <form class="d-flex" role="search" action="Controlador?menu=Principal" method="POST">
                  <input class="form-control me-2" name="txtBuscar" type="search" aria-label="Search" value="${usuario.getCodigo()}">
                  <input class="btn btn-outline-success" type="submit" name="accion" value="Buscar">
                 </form>
               
            <table class="table table-striped" >
              <thead>
                <tr>
                  <th>Código</th>
                  <th>DNI</th>
                  <th>Nombres</th>
                  <th>Apellido Paterno</th>
                  <th>Apellido Materno</th>
                  <th>Edad</th>
                  <th>Sexo</th>
                  <th>Telefono</th>
                  <th>Direccion</th>
                  <th>Acciones</th>
                </tr>
              </thead>
              <tbody class="table-group-divider">


                <c:forEach var="usuario" items="${usuarios}">
                  <tr>
                    <th scope="row">${usuario.getCodigo()}</th>
                    <td>${usuario.getDni()}</td>
                    <td>${usuario.getNombres()}</td>
                    <td>${usuario.getApellidoPaterno()}</td>
                    <td>${usuario.getApellidoMaterno()}</td>
                    <td>${usuario.getEdad()}</td>
                    <td>${usuario.getSexo()}</td>
                    <td>${usuario.getTelefono()}</td>
                    <td>${usuario.getDireccion()}</td>
                    <td>
                      <a class="btn btn-warning" href="Controlador?menu=Principal&accion=Cargar&id=${usuario.getCodigo()}">Editar</a>
                      <a class="btn btn-danger" href="Controlador?menu=Principal&accion=Eliminar&id=${usuario.getCodigo()}">Eliminar</a>
                    </td>
                  </tr>
                </c:forEach>
              </tbody>

            </table>
                 
          </div>
              

        </div>
      <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    
  </body>
</html>
