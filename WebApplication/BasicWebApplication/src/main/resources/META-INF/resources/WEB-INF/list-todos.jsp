<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

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
                <th>Update</th>
                <th>Delete Record</th>
            </tr>
            </thead>
            <tbody>
            <jstl:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.desc}</td>
                    <td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
                    <td>${todo.isDone}</td>
                    <td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}"> Update</a> </td>
                    <td><a type="button" class="btn btn-danger" href="/delete-todo?id=${todo.id}"> Delete</a> </td>

                </tr>
            </jstl:forEach>

            </tbody>

        </table>

    <%--    ${todos} !!--%>
        <BR>
        <div class="container">
            <a  type="button" class="btn" href="/add-todo" >Add a Todo</a>
        </div>

    </form>
</div>

<%@ include file="common/footer.jsp"%>
