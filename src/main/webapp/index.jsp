<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 08/11/2021
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/Servlet" method="post">
    <h1>Product Discount Calculator</h1>
    <input type="text" name="ProductDescription" placeholder="Mô tả sản phẩm">
    </br>
    <input type="number" name="ListPrice" placeholder="Giá niêm yết của sản phẩm">
    </br>
    <input type="number" name="DiscountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)">
    <input type="submit" value="Tính toán">
  </form>
  </body>
</html>
