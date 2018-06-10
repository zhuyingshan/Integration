<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
    function requestWebService() {
        var from;

        from = '<?xml version="1.0" encoding="utf-8"?>';
        from = from + '<soap:Envelope  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  xmlns:xsd="http://www.w3.org/2001/XMLSchema"  xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">';
        from = from + '<soap:Body>';
        from = from + '<Hello xmlns="http://webservice.roulandu.com/">';//这里就是发布的方法名和xml文档中的命名空间地址（图中画线部分）
        from = from + '</Hello>';
        from = from + '</soap:Body>';
        from = from + '</soap:Envelope>';

        var xmlhttp = new XMLHttpRequest();
        var URL="/servletService";
        xmlhttp.open("POST",URL, false);
        xmlhttp.setRequestHeader ("Content-Type","text/xml; charset=utf-8"); //SOAP 1.1为text/xml ； 1.2为 application/soap+xml
        xmlhttp.send(from);
        alert(from);//SOAP请求报文格式

        var text = xmlhttp.responseText;

        alert('结果'+'\n'+text); //SOAP响应报文格式
        document.getElementById("from").innerHTML = text;
    }
</script>
<form>
    <input type="text" name="name" />
    <input type="submit" value="submit" onclick="requestWebService()"/>
</form>
<div id="from"></div>

</body>
</html>