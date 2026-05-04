<%@ page contentType="text/html; charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body><h1>TFT Deck Lab</h1><a href="/decks">덱 목록</a> | <a href="/builder">팀 빌더</a>
<h3>숨은 덱 추천</h3><ul><c:forEach var="d" items="${hiddenDecks}"><li>${d.name} (${d.tier})</li></c:forEach></ul></body></html>
