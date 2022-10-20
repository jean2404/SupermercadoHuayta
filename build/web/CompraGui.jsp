<%-- 
    Document   : CompraGui
    Created on : 23-may-2021, 22:36:16
    Author     : sagit
--%>

<%@page import="vista.CompraPresentador"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style>@import"estiloRegistro.css"</style>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <div class="col-sm-8 mx-auto my-5">
                <p class="text-center tituloF">Nota de Compra</p>
                <% CompraPresentador comPre = (CompraPresentador) session.getAttribute("comPre"); %>
                <%! String tot;%>
                <table class="table h6">
                    <% Object[] f1 = comPre.getFil();%>
                    <% tot = f1[2].toString();%>

                    <% Object[] f3 = comPre.getFil2();%>
                    <form action="CompraControl" method="post" >
                        <tr>
                            <td>Numero</td><td><input type="text" name="num" size="10" value="<%= f1[0]%>" /></td>
                            <td>Codigo:</td><td><input type="text" name="codPro" size="10" value="<%= f3[0]%>" /></td>
                            <td> <input type="submit" name="acc" value="Buscar" /> </td>
                        </tr>
                        <tr>
                            <td>Fecha</td><td><input type="text" name="fec" size="10" value="<%= f1[1]%>" /></td>  
                            <td>Nombre</td><td colspan="2"><input type="text" name="nom" size="20" value="<%= f3[1]%>" /></td>  
                        </tr>
                        <tr>
                            <td>Empleado</td><td><input type="text" name="cod" size="10" value="<%= f1[3]%>" /></td>
                            <td>Direccion</td><td colspan="2"><input type="text" name="dir" size="20" value="<%= f3[2]%>" /></td>  
                        </tr>
                    </form>
                </table>
                <table class="table h6">
                    <tr>
                        <% List lis = comPre.getLis(); %>
                        <td>Codigo</td>
                        <td>Nombre</td>
                        <td>Precio</td>
                        <td>Cantidad</td>
                        <td>Importe</td>
                        <td></td>
                    </tr>
                    <% for (int i = 0; i < lis.size(); i++) {
                    %>
                    <% Object[] f2 = (Object[]) lis.get(i);%>
                    <% tot = f2[5].toString();%>
                    <tr>
                    <form action="CompraControl" method="post">
                        <td><input type="text" name="cod" size="5" value="<%= f2[0]%>" /></td>
                        <td><input type="text" name="nom" size="10" value="<%= f2[1]%>" /></td>
                        <td><input type="text" name="pre" size="5" value="<%= f2[2]%>" /></td>
                        <td><input type="text" name="can" size="5" value="<%= f2[3]%>" /></td>
                        <td><input type="text" name="imp" size="5" value="<%= f2[4]%>" /></td>
                        <td><input type="submit" name="acc" size="5" value="Quitar" /></td>
                    </form>
                    </tr>
                    <% }%>
                </table>
                <table class="table">
                    <tr> 
                    <form action="CompraControl" method="post">
                        <td>

                            <input type="hidden" name="cod" value="<%= f1[3]%>" /> 
                            <input type="hidden" name="codPro" value="<%= f3[0]%>" /> 
                            <input type="submit" name="acc" value="Nueva Compra" />
                            <input type="submit" name="acc" value="Mas Articulos" />
                            <input type="submit" name="acc" value="Grabar" />

                        </td>
                        <td>
                            Total==><input type="text" name="tot" size="5" value="<%= tot%>" />
                        </td>
                    </form>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <a href="Menu.jsp" class="btn btn-secondary">Menu</a>
                        </td>
                    </tr>
                </table>
                <p class="h5">
                    <%= comPre.getMsg()%>    
                </p>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>


    </body>
</html>
