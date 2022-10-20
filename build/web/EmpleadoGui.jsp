<%-- 
    Document   : EmpleadoGui
    Created on : 19-abr-2021, 2:06:56
    Author     : sagit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>@import"Stilo.css";</style>
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet">
        <style>@import"estiloRegistro.css";</style>
    </head>
    <body>
        <div class="container">
            <div class="col-sm-6 mx-auto my-5">
                <p class="text-center tituloF">Registro de Empleado<p>            	
                <form action="EmpleadoControl" method="post">
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Codigo</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="cod" value="">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Nombre</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="nom" value="">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Tipo</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="tip" value="">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Usuario</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="usu" value="">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-3 col-form-label lab">Password</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" name="pas">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-4 mx-auto">
                            <input type="submit" name="acc" class="btn btn-light" value="Grabar">
                            <a href="Portal.jsp" class="btn btn-light">Volver</a>
                        </div>
                    </div>

                </form> 
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>