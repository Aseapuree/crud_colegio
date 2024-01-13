<%-- 
    Document   : prueba
    Created on : 3 dic 2022, 17:59:37
    Author     : kioto
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>

<!doctype html>
<html >
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>Bootstrap demo</title>
  </head>
  <body>

    <div class="container-fluid my-3 ">

      <div class="row">
        
        <div class="col-sm-12 col-md-10 col-lg-8 col-xl-11">
          <div class="table-responsive">
            
          <h2>Listado de alumnos  </h2>
          <nav class="navbar bg-light">
              <div class="container-fluid">
                <form class="d-flex" role="search" action="Controlador?menu=Alumnos" method="POST">
                  <input class="form-control me-2" name="txtBuscar" type="search" aria-label="Search" value="${alumno.getIdAlumno()}">
                  <input class="btn btn-outline-success" type="submit" name="accion" value="Buscar">
                 </form>
                  </div>
                  <div class="container-fluid">
                    <form action="Controlador?menu=Alumnos">
                   
                      <button type="submit" name="accion" value="Exportar" class="btn">
                        <img>
                      </button>
                    </form>
                  </div>
            </nav>
          <table class="table table-striped">
            <thead>
              <tr>
                <th>ID</th>
                <th>DNI</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Fecha Nacimiento</th>
                <th>Sexo</th>
                <th>Direccion</th>
                <th>Acciones</th>
              </tr>

            </thead>
            <tbody class="table-group-divider">


              <c:forEach var="alumno" items="${alumnos}">
                <tr>
                  <th  scope="row">${alumno.getIdAlumno()}</th>
                  <td>${alumno.getDni()}</td>
                  <td>${alumno.getNomAlumno()}</td>
                  <td>${alumno.getApellAlumno()}</td>
                  <td>${alumno.getFechaNac()}</td>
                  <td>${alumno.getSexo()}</td>
                  <td>${alumno.getDireccion()}</td>

                  <td>
                    <a class="btn btn-warning"  href="Controlador?menu=Alumnos&accion=Cargar&id=${alumno.getIdAlumno()}">Editar</a>
                    <a class="btn btn-danger"  href="Controlador?menu=Alumnos&accion=Eliminar&id=${alumno.getIdAlumno()}">Eliminar</a>
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