<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">


    </script>
    &lt;%&ndash;一个bootstrap的组件&ndash;%&gt;
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>
<title>商品的主页</title>
<html>
<body>
<h3>Hello World!</h3>
<h1>欢迎 <span style="color: #2b59ff; ">${customer.customerName} </span>登录!</h1>
<div class="mask" style="width: 1200px;margin: 0 auto">


    <div class="row">
        <c:forEach items="${goods}" var="good">
            <div class="col-md-3">

                <img src="js/test.jpg">
                <h1>${good.goodsName}</h1>
                <h2 style="color: #595959">$ ${good.goodsPrice}</h2>
                <p style="color: #7e7e7e; font-size: 12px">${good.goodsDesc}</p>
            </div>
        </c:forEach>
    </div>


</div>
</body>
</html>
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">


    </script>
    <%--一个bootstrap的组件--%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>
        .mask {
            width: 1200px;
            margin: 0 auto;
        }

        .col-md-3 {
            margin-bottom: 20px;
            text-align: center;
            background-color: #f8f9fa;
            padding: 20px;
            border-radius: 5px;
        }

        .col-md-3 img {
            width: 100%;
            /*max-height: 200px;*/
            object-fit: cover;
            border-radius: 5px;
        }

        .col-md-3 h1 {
            margin-top: 10px;
            font-size: 40px;
            font-weight: bolder;
            color: #333;
        }

        .col-md-3 h2 {
            margin-top: 5px;
            font-size: 16px;
            color: #555;
        }

        .col-md-3 p {
            margin-top: 5px;
            font-size: 14px;
            color: #777;
        }
    </style>
</head>
<title>商品的主页</title>
<html>
<body>
<h3>Hello World!</h3>
<h1>欢迎 <span style="color: #2b59ff; ">${customer.customerName} </span>登录!</h1>
<div class="mask">


    <div class="row">
        <c:forEach items="${goods}" var="good">
            <div class="col-md-3">

                <img src="js/test.jpg">
                <h1>${good.goodsName}</h1>
                <h2>$ ${good.goodsPrice}</h2>
                <p>${good.goodsDesc}</p>
            </div>
        </c:forEach>
    </div>


</div>
</body>
</html>