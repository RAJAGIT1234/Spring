<%@ page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<h1 style="color:red;text-align:center">Result page</h1>
     <b>${resultMsg} </b> <br>
     <b>Model class obj data :: ${modelData}</b>
     
  <br>
  <a href="customer"><img src="<c:url  value="/myresources/images/home.ico"/>"></a>     