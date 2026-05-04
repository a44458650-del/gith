<%@ page contentType="text/html;charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body class="container"><h2>관리</h2><form method="post">
<input name="name" placeholder="name"/>
<input name="description" placeholder="description/summary"/>
<input name="cost" placeholder="cost"/>
<input name="tier" placeholder="tier"/>
<input name="pickRate" placeholder="pickRate"/>
<input name="winRate" placeholder="winRate"/>
<input name="traits" placeholder="traits"/>
<label><input type="checkbox" name="hiddenPotential" value="true"/>hiddenPotential</label>
<button>등록</button></form>
<ul><c:forEach items="${items}" var="i"><li>${i.id} - ${i.name}</li></c:forEach></ul></body></html>
