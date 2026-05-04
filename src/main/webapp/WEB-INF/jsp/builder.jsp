<%@ page contentType="text/html;charset=UTF-8" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><head><script src="https://code.jquery.com/jquery-3.7.1.min.js"></script></head>
<body class="container"><h2>팀 빌더</h2>
<c:forEach items="${champions}" var="c"><label><input type="checkbox" class="champ" value="${c.id}">${c.name}</label><br/></c:forEach>
<button id="calc">시너지 계산</button><pre id="result"></pre>
<script>$('#calc').click(function(){const ids=$('.champ:checked').map(function(){return Number($(this).val())}).get();$.ajax({url:'/api/synergies/calculate',method:'POST',contentType:'application/json',data:JSON.stringify(ids)}).done(function(r){$('#result').text(JSON.stringify(r,null,2));});});</script>
</body></html>
