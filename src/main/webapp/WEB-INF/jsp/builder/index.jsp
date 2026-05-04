<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><script src="https://code.jquery.com/jquery-3.7.1.min.js"></script></head><body>
<h2>팀 빌더</h2><p>쉼표로 챔피언 ID 입력</p><input id="ids"><button id="calc">시너지 계산</button><pre id="result"></pre>
<script>$('#calc').click(function(){const ids=$('#ids').val().split(',').map(v=>Number(v.trim())).filter(Boolean);$.ajax({url:'/api/builder/synergy',method:'POST',contentType:'application/json',data:JSON.stringify(ids)}).done(r=>$('#result').text(JSON.stringify(r,null,2)));});</script>
</body></html>
