<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>


<div class="container">

<%--    <h4> Add Todo page for ${name}</h4>    --%>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="form-group">
            <form:label path="desc">Description :</form:label>
            <form:input path="desc" type="text" class="form-control" required="required"/>
            <form:errors path="desc" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="targetDate">Target Date :</form:label>
            <form:input path="targetDate" type="text" class="form-control" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="isDone">Is Done </form:label>
            <form:input path="isDone" type="text" class="form-control" required="required"/>
            <form:errors path="isDone" cssClass="text-warning"/>
        </fieldset>

        <button type="submit" class="btn btn-success">Add</button>
    </form:form>
</div>

<%@ include file="common/footer.jsp"%>
