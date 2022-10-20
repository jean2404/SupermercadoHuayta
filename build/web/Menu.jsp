<%-- 
    Document   : Menu
    Created on : 06-may-2021, 15:48:10
    Author     : sagit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet">
        <style>@import"estiloRegistro.css";</style>

    </head>
    <body>
        <div class="container">
            <div class="col-sm-6 mx-auto my-5">
                <p class="text-center tituloF">Menu Principal - Empleado</p>
                <% Object[] fil = (Object[]) session.getAttribute("fil");%>
                <div class="row">
                    <div class="col-sm-6">
                        <p>Codigo: <%= fil[0]%></p>
                    </div>
                    <div class="col-sm-6">
                        <p>Nombre: <%= fil[1]%></p>
                    </div>
                </div>   

            </div>

        </div>

        <div class="container-fluid">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">SuperMercado Jean</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Archivos
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Empleado</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="EmpleadoBuscar.jsp">Buscar</a>
                                <form class="dropdown-item" action="EmpleadoControl" method="post"><input type="submit" name="acc" value="Listar" /> </form>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Cliente</a>
                                <div class="dropdown-divider"></div>
                                <a href="ClienteGui.jsp" class="dropdown-item">Registro de Cliente</a>
                                <a class="dropdown-item" href="ClienteBuscar.jsp">Buscar</a>
                                <form class="dropdown-item" action="ClienteControl" method="post"><input type="submit" name="acc" value="Listar" /> </form>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Proveedor</a>
                                <div class="dropdown-divider"></div>
                                <a href="ProveedorGui.jsp" class="dropdown-item">Registro de Proveedor</a>
                                <a class="dropdown-item" href="ProveedorBuscar.jsp">Buscar</a>
                                <form class="dropdown-item" action="ProveedorControl" method="post"><input type="submit" name="acc" value="Listar" /> </form>

                            </div>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Procesos
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <form class="dropdown-item" action="PedidoControl" method="post">
                                    <input type="hidden" name="cod" value="<%= fil[0]%>" />
                                    <input type="submit" name="acc" value="Nuevo Pedido"/> 
                                </form>
                                <div class="dropdown-divider"></div>
                                <form class="dropdown-item" action="CompraControl" method="post">
                                    <input type="hidden" name="cod" value="<%= fil[0]%>" />
                                    <input type="submit" name="acc" value="Nueva Compra"/> 
                                </form>
                            </div>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Consultas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Articulos</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="ArticuloGui.jsp">Registro de Articulos</a>
                                <a class="dropdown-item" href="ArticuloBuscar.jsp">Buscar</a>
                                <form class="dropdown-item" action="ArticuloControl" method="post"><input type="submit" name="acc" value="Listar" /> </form>
                            </div>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Consultas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Existencias</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Otros</a>
                            </div>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="Portal.jsp">Salir</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

    </body>
</html>
