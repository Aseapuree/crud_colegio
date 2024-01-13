<%-- 
    Document   : index
    Created on : 19 nov 2022, 2:00:08
    Author     : kioto
--%>

<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="CSS/estilos.css"/>
    <title>JSP Page</title>
  </head>
  <body>
    
    <form class="formulario" method="POST" action="Validar">
	<h1>BIENVENIDO</h1>
		<div class="contenedor">
			
		<div class="input-contenedor">
			<i class="fa-solid fa-user  icon"></i>
                        <input type="text" name="txtUsuario" placeholder="Ingresa el usuario">
		 </div>

			<div class="input-contenedor">
		<i class="fa-solid fa-lock icon"></i>
                <input type="password" name="txtPassword" placeholder="Ingresa la contraseña">
		 </div>
                  <input type="submit" name="accion" value="Ingresar" class="button">
	 </div>
	</form>
    
    
    
    

   <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  </body>
</html>
