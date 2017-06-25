<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>AngularJS MVC Spring UPeU</title>  
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .email.ng-valid {
          background-color: lightgreen;
      }
      .email.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .email.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }

    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
  <body  class="ng-cloak">
      <div class="generic-container" ng-controller="UserController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">User Registration Form </span></div>
              <div class="formcontainer">
                  
                  
                          
        <c:out value="${mensaje}"/>       
        <h1>Administracion de Doctores!</h1>

        <div id="idFormulario" align="center">
            
        <form  id="formBuscar" action="buscarDoctor"  method="post" name="formBuscar" >
        <table align="center"  class="myform">
        
        <tr align="center">
        &nbsp;&nbsp;
        <td  style="color:black">
        Periodo <input type="text" class="myinput" id="dato" size="50" name="dato"  value="">
        
        <input  type="submit"  class="button2" value="Buscar" >&nbsp;
        </td>
        <td>
            <input  type="button" value="Nuevo" onclick="document.location.href='/BackendUPeU/formDiente'" class="btn btn-success" >&nbsp;   
        </td>
        </tr>
        </table>
        </form>
        </div> 
        
        

                  
                  
                  
              </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Users </span></div>
              <div class="tablecontainer">
                          <c:if test="${!empty ListaDoctor}">
                            <table border="1">
                                <tr>
                                    <th># Colegiatura</th>
                                    <th>Fecha Ing.</th>
                                    <th>Estado</th>
                                    <th>Nombre</th>
                                    <th>Apellidos</th>
                                    <th>DNI</th>
                                    <th>Opciones</th>
                                </tr>
                <c:forEach items="${ListaDoctor}" var= "dato">   
                <tr>
                    <td><c:out value="${dato.numeroColegio}"/></td>
                    <td><c:out value="${dato.fechaAlta}"/></td>
                    <td><c:out value="${dato.estado}"/></td>
                    <td><c:out value="${dato.idPersona.nombres}"/></td>                                    
                    <td><c:out value="${dato.idPersona.apellPaterno}"/> 
                        <c:out value="${dato.idPersona.apellMater}"/></td>
                    <td><c:out value="${dato.idPersona.dni}"/></td>
                    <td>
                        <a href="eliminarDoctor?id=${dato.idDoctor}">Eliminar</a>&emsp14;                                        
                    </td>
                </tr>
                </c:forEach>
                            </table>
                            Holasss
                        </c:if>
              </div>
          </div>
      </div>

  </body>
</html>