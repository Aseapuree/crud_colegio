<%-- 
    Document   : menu
    Created on : 1 dic 2022, 20:52:37
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
 <nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="menu.jsp">CRUD </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            MATRICULA
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="RegistrarMatricula.jsp">Registrar</a></li>
            <li><a class="dropdown-item" href="Controlador?menu=Principal&accion=Listar" target="miContenedor">Modificar</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            ALUMNO
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="RegistrarAlumno.jsp" target="miContenedor">Registrar</a></li>
            <li><a class="dropdown-item" href="Controlador?menu=Alumnos&accion=Listar" target="miContenedor">Modificar</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            APODERADO
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="RegistrarApoderado.jsp">Registrar</a></li>
            <li><a class="dropdown-item" href="Controlador?menu=Apoderado&accion=Listar" target="miContenedor">Modificar</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
    
    <div class="container-fluid">
      

      
      <iframe name="miContenedor" style="height:100vh; width:100%;" ></iframe> 
      
      
   </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>
