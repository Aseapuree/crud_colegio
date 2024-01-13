<%-- 
    Document   : Apoderado
    Created on : 2 dic. 2022, 20:54:22
    Author     : JUAN
--%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>


  <head>
     <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
        <div class="col-sm-12 col-md-8 col-lg-8 col-xl-10">
          <div class="table-responsive">
            
          <h2>Listado de Apoderados</h2>
          <nav class="navbar bg-light">
              <div class="container-fluid">
                <form class="d-flex" role="search" action="Controlador?menu=Apoderado" method="POST">
                  <input class="form-control me-2" name="txtBuscar" type="search" aria-label="Search" value=${apoderado.getId_apoderado()}>
                  <input class="btn btn-outline-success" type="submit" name="accion" value="Buscar">
                 </form>
                  </div>
            </nav>
          <table class="table table-striped">
            <thead>
             <tr>
                <th>ID Apoderado</th>
                <th>Dni</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Sexo</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Acciones</th>
              </tr>

            </thead>
            <tbody class="table-group-divider">


            <c:forEach var="apoderado" items="${apoderados}">
                <tr>
                  <th scope="row">${apoderado.getId_apoderado()}</th>
                  <td>${apoderado.getDni_apoderado()}</td>
                  <td>${apoderado.getNom_apoderado()}</td>
                  <td>${apoderado.getApellApoderado()}</td>
                  <td>${apoderado.getSexo()}</td>
                  <td>${apoderado.getDireccion()}</td>
                  <td>${apoderado.getTelefono()}</td>
                  <td>
                    <a class="btn btn-warning" href="Controlador?menu=Apoderado&accion=Cargar&id=${apoderado.getId_apoderado()}">Editar</a>
                    <a class="btn btn-danger" href="Controlador?menu=Apoderado&accion=Eliminar&id=${apoderado.getId_apoderado()}">Eliminar</a>
                  </td>
                </tr>
              </c:forEach>
            </tbody>

          </table>
          </div>

        </div>


      </div>

    </div>

    
    
    

 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>

</html>
