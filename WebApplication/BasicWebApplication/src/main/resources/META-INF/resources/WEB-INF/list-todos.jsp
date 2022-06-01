<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="jstl"%>
<head>
    <title> List Todos for ${name}!!</title>
</head>
<body>
<H1> Your Todos</H1>
<%--Here is the list of the Todos for ${name} are:--%>
<form method="get">
    <BR>

    <table>
        <thead>
        <tr>
            <th>Description</th>
            <th>TargetDate </th>
            <th>isDone</th>
        </tr>
        </thead>
        <tbody>
        <jstl:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>

            </tr>
        </jstl:forEach>

        </tbody>


    </table>

<%--    ${todos} !!--%>
    <BR>
    <a href="/add-todo">Add a Todo</a>
</form>

<%--My First JSP!! Welcome ${name} !!--%>
</body>
</html>