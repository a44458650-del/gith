<%@ page contentType="text/html; charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body><h2>챔피언 목록</h2><table border="1"><tr><th>ID</th><th>이름</th><th>코스트</th><th>시너지</th></tr><c:forEach var="c" items="${champions}"><tr><td>${c.id}</td><td>${c.name}</td><td>${c.cost}</td><td>${c.traits}</td></tr></c:forEach></table></body></html>
