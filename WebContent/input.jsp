<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baggage check-in</title>
<script language="javascript">
function aCheck1(){
document.getElementById("baggageInfo").style.display="block";
document.getElementById("weightDomestic").style.display="block";
document.getElementById("currentPrice").style.display="block";
document.getElementById("cabin1").style.display="block";
document.getElementById("cabin1-1").style.display="block";
document.getElementById("cabin1-2").style.display="block";
document.getElementById("cabin1-3").style.display="block";
document.getElementById("cabin1-4").style.display="block";

document.getElementById("cabin2").style.display="none";
document.getElementById("cabin2-1").style.display="none";
document.getElementById("cabin2-2").style.display="none";
document.getElementById("cabin2-3").style.display="none";
document.getElementById("cabin2-4").style.display="none";
document.getElementById("baggageNum").style.display="none";
document.getElementById("number").style.display="none";
}

function aCheck2(){
document.getElementById("cabin2").style.display="block";
document.getElementById("cabin2-1").style.display="block";
document.getElementById("cabin2-2").style.display="block";
document.getElementById("baggageNum").style.display="block";
document.getElementById("number").style.display="block";
document.getElementById("cabin2-3").style.display="none";
document.getElementById("cabin2-4").style.display="none";

document.getElementById("baggageInfo").style.display="none";
document.getElementById("weightDomestic").style.display="none";
document.getElementById("currentPrice").style.display="none";
document.getElementById("cabin1").style.display="none";
document.getElementById("cabin1-1").style.display="none";
document.getElementById("cabin1-2").style.display="none";
document.getElementById("cabin1-3").style.display="none";
document.getElementById("cabin1-4").style.display="none";

}  

function aCheck3(){
	document.getElementById("baggageNum").style.display="block";
	document.getElementById("number").style.display="block";
  
	document.getElementById("baggageInfo").style.display="none";
	document.getElementById("weightDomestic").style.display="none";
	document.getElementById("currentPrice").style.display="none";
	document.getElementById("cabin1").style.display="none";
	document.getElementById("cabin1-1").style.display="none";
	document.getElementById("cabin1-2").style.display="none";
	document.getElementById("cabin1-3").style.display="none";
	document.getElementById("cabin1-4").style.display="none";
	document.getElementById("cabin2").style.display="none";
	document.getElementById("cabin2-1").style.display="none";
	document.getElementById("cabin2-2").style.display="none";
	document.getElementById("cabin2-3").style.display="none";
	document.getElementById("cabin2-4").style.display="none";
	} 
	
function aCheck4(){
	document.getElementById("cabin2").style.display="block";
	document.getElementById("cabin2-3").style.display="block";
	document.getElementById("cabin2-4").style.display="block";
	document.getElementById("baggageNum").style.display="block";
	document.getElementById("number").style.display="block";

	document.getElementById("baggageInfo").style.display="none";
	document.getElementById("weightDomestic").style.display="none";
	document.getElementById("currentPrice").style.display="none";
	document.getElementById("cabin1").style.display="none";
	document.getElementById("cabin1-1").style.display="none";
	document.getElementById("cabin1-2").style.display="none";
	document.getElementById("cabin1-3").style.display="none";
	document.getElementById("cabin1-4").style.display="none";
	document.getElementById("cabin2-1").style.display="none";
	document.getElementById("cabin2-2").style.display="none";
	}
var z=0;
function add(){
	var a=document.getElementById("totalNum").value;
	if(a!=z&&z!=0){
		var c=0;
		document.getElementById("number").style.display="none";
		while(c<z){
			var string1="baggage"+c+"weight:";
			var string2="baggage"+c+"weight";
			var string3="baggage"+c+"size:";
			var string4="baggage"+c+"size";
			var parent=document.getElementById("111");
			var child1=document.getElementById(string1);
			var child2=document.getElementById(string2);
			var child3=document.getElementById(string3);
			var child4=document.getElementById(string4);
			parent.removeChild(child1);
			parent.removeChild(child2);
			parent.removeChild(child3);
			parent.removeChild(child4);
			c++;
		}
		z=a;
	}
	var b=1;
	while(b<=a){
    var ipt1 = document.createElement("input");
    ipt1.setAttribute("type","text");
    ipt1.setAttribute("name","baggage"+b+"weight");
    var label1=document.createElement("label");
    label1.innerHTML = "baggage"+b+"weight:";
    var div1 = document.getElementById("111");
    var divA=document.createElement("div");
	var divB=document.createElement("div");
	divA.id="baggage"+b+"weight:";
    divB.id="baggage"+b+"weight";
	div1.appendChild(document.createElement("br"));
    divA.appendChild(label1);
    divB.appendChild(ipt1);
    div1.appendChild(divA);
    div1.appendChild(divB);
    
    
    var ipt2 = document.createElement("input");
    ipt2.setAttribute("type","text");
    ipt2.setAttribute("name","baggage"+b+"size");
    var label2=document.createElement("label");
    label2.innerHTML = "baggage"+b+"size:";
    var div2 = document.getElementById("111");
    var divC=document.createElement("div");
    var divD=document.createElement("div");
    divC.id="baggage"+b+"size:";
    divD.id="baggage"+b+"size";
    div2.appendChild(document.createElement("br"));
    divC.appendChild(label2);
    divD.appendChild(ipt2);
    div2.appendChild(divC);
    div2.appendChild(divD);
    
    b++;
	}
	
}
</script>
</head>
<body>
<h1 align='center'><font size='6' color='red'>中国南方航空公司行李托运费用查询</font></h1>
<form action="HandleServlet" method="POST" target="_blank">

<div style="width:1000px;height:280px">
<div style="width:1000px;height:40px">
<label><font size='4' color='blue'>国内航班：</font></label>
</div>

<div style="width:1000px;height:40px">
<label onclick="aCheck1()"><input type="radio" name="area" value="国内航班">国内</label>
</div>

<div style="width:1000px;height:40px">
<label><font size='4' color='blue'>国际航班：</font></label>
</div>

<div style="width:1000px;height:40px">
<label onclick="aCheck2()"><input type="radio" name="area" value="区域一">区域一（涉及日本、美洲、澳新、俄罗斯（<a href="1.jsp">注1</a>）、迪拜的航程，以及新加坡始发（<a href="1.jsp">注2</a>）与中国大陆间的航程）</label>
</div>

<div style="width:1000px;height:40px">
<label onclick="aCheck3()"><input type="radio" name="area" value="区域二">区域二（涉及中西亚（<a href="1.jsp">注3</a>）的航程）</label>
</div>

<div style="width:1000px;height:40px">
<label onclick="aCheck2()"><input type="radio" name="area" value="区域三">区域三（涉及内罗毕（<a href="1.jsp">注4</a>）及土耳其的航程）</label>
</div>

<div style="width:1000px;height:40px">
<label onclick="aCheck4()"><input type="radio" name="area" value="区域四">区域四（除涉及日本、美洲、澳新、俄罗斯（<a href="1.jsp">注1</a>）、迪拜、内罗毕、中西亚（<a href="1.jsp">注3</a>）及土耳其以外的国际/地区航程）</label>
</div>
</div>

<div id="baggageInfo" style="width:1000px;height:40px;display:none">
<label><font size='4' color='blue'>行李信息：</font></label>
</div>

<div id="weightDomestic" style="width:1000px;height:40px;display:none">
<label>重量(kg):<input type="text" name="weightDomestic"></label>
</div>

<div id="currentPrice" style="width:1000px;height:40px;display:none">
<label>经济舱当日价格(元):<input type="text" name="currentPrice"></label>
</div>

<div id="cabin1" style="width:1000px;height:40px;display:none">
<label><font size='4' color='blue'>舱位：</font></label>
</div>

<div id="cabin1-1" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="头等舱">头等舱</label>
</div>

<div id="cabin1-2" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="公务舱">公务舱</label>
</div>

<div id="cabin1-3" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="经济舱">经济舱</label>
</div>

<div id="cabin1-4" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="婴儿">婴儿</label>
</div>

<div id="cabin2" style="width:1000px;height:40px;display:none">
<label><font size='4' color='blue'>舱位：</font></label>
</div>

<div id="cabin2-1" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="头等舱、公务舱">头等舱、公务舱</label>
</div>

<div id="cabin2-2" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="明珠经济舱、经济舱">明珠经济舱、经济舱</label>
</div>

<div id="cabin2-3" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="头等舱">头等舱</label>
</div>

<div id="cabin2-4" style="width:1000px;height:40px;display:none">
<label><input type="radio" name="cabinType" value="公务舱、明珠经济舱、经济舱">公务舱、明珠经济舱、经济舱</label>
</div>

<div id="baggageNum" style="width:1000px;height:40px;display:none">
<label><font size='4' color='blue'>行李数量：</font></label>
</div>

<div id="number" style="display:none">
<div id="111">
<label>数量:</label><br>
<input id="totalNum" type="text" name="totalNum" value="" oninput="add()">
</div>
</div>

<div  align="center">
<input type="submit" style="width:75px;height:40px;font-size:25px;" value="查询" />
</div>
</form>

<div style="position:absolute;right:20px;top:0px">
<jsp:include page="webinfo.jsp" flush="true" />
</div>
</body>
</html>