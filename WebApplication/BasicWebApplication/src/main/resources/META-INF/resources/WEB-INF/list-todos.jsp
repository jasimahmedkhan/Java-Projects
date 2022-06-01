<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="jstl"%>
<head>
    <title> List Todos for ${name}!!</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <H1> Your Todos</H1>
    <%--Here is the list of the Todos for ${name} are:--%>
    <form method="get">
        <BR>

        <table class="table table-striped" >
            <thead>
            <tr>

                <th>ID</th>
                <th>Description</th>
                <th>Target Date </th>
                <th>Is it Done?</th>
                <th>Delete Record</th>
            </tr>
            </thead>
            <tbody>
            <jstl:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a type="button" class="btn btn-danger" href="/delete-todo?id=${todo.id}"> Delete</a> </td>

                </tr>
            </jstl:forEach>

            </tbody>


        </table>

    <%--    ${todos} !!--%>
        <BR>
        <div>
            <a  type="button" class="btn" href="/add-todo" >Add a Todo</a>
        </div>

    </form>
</div>

<%--My First JSP!! Welcome ${name} !!--%>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>