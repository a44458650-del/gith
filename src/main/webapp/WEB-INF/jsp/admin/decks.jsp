<%@ page contentType="text/html; charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body><h2>관리자 덱</h2><ul><c:forEach var="i" items="${items}"><li>${i.id} - ${i.name}</li></c:forEach></ul></body></html>
