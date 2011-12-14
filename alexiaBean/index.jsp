<%-- 
    Document   : index
    Created on : 11 Δεκ 2011, 10:26:06 μμ
    Author     : alexiaKourfali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="alexia.*"%>
<jsp:useBean id="basket" class="alexia.MyJavaBean" scope="session"/>
<jsp:setProperty name="shopping" property="*"/>
<!DOCTYPE html>



<html>
    <head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <title>Kourfali Alexia:  Project 3 part2</title>
        <script type="text/javascript" src="chrome.js"></script>    <%--???????--%>
    </head>
    <body>  
   

<form method="post" action="index.jsp">
<table border="8">
    <tr>
      <th>Item</th>
      <th>Price</th>
      <th>Quantity</th>
      <th>Total</th>
    </tr>
    
    <tr>
      <td>Café</td>
          <td><jsp:getProperty name="shopping" property="FirstPrice"/></td>
          <td><input type = "text" size="2" name="txtFirstQ" maxlength="3" class="textField" value="<jsp:getProperty name="basket" property="FirstQuantity"/>"/></td>     
          <td><jsp:getProperty name="shopping" property="Sum1"/></td>
    </tr>

    
        <tr>
      <td>Azúcar</td>
          <td><jsp:getProperty name="shopping" property="SecondPrice"/></td>
          <td><input type = "text" size="2" name="txtSecondQ" maxlength="3" class="textField" value="<jsp:getProperty name="shopping" property="SecondQuantity"/>"/></td>     
          <td><jsp:getProperty name="shopping" property="Sum2"/></td>
    </tr>
    
        <tr>
      <td>Agua</td>
          <td><jsp:getProperty name="shopping" property="ThirdPrice"/></td>
          <td><input type = "text" size="2" name="txtThirdQ" maxlength="3" class="textField" value="<jsp:getProperty name="shopping" property="ThirdQuantity"/>"/></td>     
          <td><jsp:getProperty name="shopping" property="Sum3"/></td>
    </tr>
    

    <tr>
      <td>Total</td>  
          <td></td>
          <td></td>
          <td><jsp:getProperty name="shopping" property="Total"/></td>

    </tr>
    

</table>
 
    <input type="Submit" value="calculate Total cost" name="calculate Total cost" />   

    
<p><b>Enter Your Name: </b><input type="text" name="name"><br> 
<input type="submit" value="Submit">     
    
 <%--*****************************************************************************
 *   http://www.herongyang.com/jsp/cookie.html    http://www.techfaq360.com/viewTutorial.jsp?tutorialId=131             http://docs.oracle.com/javaee/1.3/api/javax/servlet/http/Cookie.html                                                              *
 *                              cookies http://www.roseindia.net/jsp/jspcookies.shtml                                        *
 *        http://blogs.oracle.com/CoreJavaTechTips/entry/cookie_handling_in_java_se                                                                      *
 *****************************************************************************--%>   
    
 

</form>
      




<%--*****************************************************************************
 *                                                                              *
 *                              extra buttons                                   *
 *                                                                              *
 *****************************************************************************--%>
<a href="http://dl.dropbox.com/u/16170471/report_kourfali.pdf" target="_blank">?</a>
<a href="http://dl.dropbox.com/u/16170471/alexiaScript.zip" target="_blank">!1</a>
<a href="http://dl.dropbox.com/u/16170471/alexiaBean.zip" target="_blank">!2</a>


</body> 
</html>         
