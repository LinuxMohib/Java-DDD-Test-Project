<!-- WEB-INF/views/booksContent.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Book List</h2>
<table class="table table-striped table-bordered">
    <thead class="table-dark">
        <tr>
            <th>#</th>
            <th>Title</th>
            <th>Author</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="book" items="${books}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>