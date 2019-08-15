<%--
  Created by IntelliJ IDEA.
  User: aluno
  Date: 8/15/2019
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
  <div>
    <nav class="navbar navbar-dark bg-dark">
      <a class="navbar-brand" href="">Login</a>
    </nav>
    <div class="container">
      <form method="post" action="/login_war_exploded/Login">
        <div class="form-group">
          <label for="inputMatricula">Matricula</label>
          <input type="text" class="form-control" id="inputMatricula"
                 placeholder="Entre com a matricula" name="matricula">
        </div>
        <div class="form-group">
          <label for="Password">Senha</label>
          <input type="password" class="form-control" id="Password" aria-describedby="passwordHelp"
                 placeholder="Enter password" name="password">
        </div>
        <input type="submit" value="Enviar" class="btn btn-primary">
        <input type="reset" value="Limpar" class="btn btn-primary">
      </form>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
          integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
          crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
          integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
          crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
          integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
          crossorigin="anonymous"></script>
  </body>
</html>
