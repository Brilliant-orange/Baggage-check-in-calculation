<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注</title>
<script language="javascript">
function aCheck1(){
document.getElementById("span1").style.display="block";
document.getElementById("span2").style.display="none";
}

function bCheck2(){
document.getElementById("span1").style.display="none";  
document.getElementById("span2").style.display="block";
}  
</script>
</head>
<body>
<input type="radio" name="ok1" value="ok1" onclick="aCheck1()" />显示“我是A”
<input type="radio" name="ok1" value="ok2" onclick="bCheck2()" />显示“我是B”   <br/> 
<span id="span1" style="display:block">我是A</span>
<span id="span2" style="display:none">我是B</span>
</body>
</html>