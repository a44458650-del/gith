<%@ page contentType="text/html;charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body class="container"><h2>덱 목록</h2><ul><c:forEach items="${decks}" var="d"><li><a href="/decks/${d.id}">${d.name}</a> (${d.tier})</li></c:forEach></ul>
<h3>숨은 덱 추천</h3><ul><c:forEach items="${hiddenDecks}" var="d"><li>${d.name} - 승률 ${d.winRate}%</li></c:forEach></ul></body></html>
