<%@ page contentType="text/html; charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body><h2>시너지 목록</h2><ul><c:forEach var="t" items="${traits}"><li>${t.name} - ${t.effectDescription}</li></c:forEach></ul></body></html>
