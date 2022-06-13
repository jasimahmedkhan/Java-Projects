<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>


<span style="color: red">${errorMessage}</span>
<form method="post">
    Name:
    <label>
        <input type="text" name="name" />
    </label>
    Password:
    <label>
        <input type="password" name="password" />
    </label>
    <input type="submit" />
</form>

<%@ include file="common/footer.jsp"%>
