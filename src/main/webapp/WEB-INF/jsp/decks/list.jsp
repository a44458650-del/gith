<%@ page contentType="text/html; charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body><h2>티어덱 목록</h2><ul><c:forEach var="d" items="${decks}"><li><a href="/decks/${d.id}">${d.name}</a> - ${d.tier}</li></c:forEach></ul></body></html>
