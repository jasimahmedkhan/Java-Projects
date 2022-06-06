<html>
<head>
    <title> Add Todos !!</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<div class="container">

<%--    <h4> Add Todo page for ${name}</h4>    --%>
    <form method="post">
        <fieldset class="form-group">
            <label>Description :</label>
            <input name="desc" type="text" class="form-control" required="required"/>
        </fieldset>
        <button type="submit" class="btn btn-success">Add</button>
    </form>
</div>

<%--My First JSP!! Welcome ${name} !!--%>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>