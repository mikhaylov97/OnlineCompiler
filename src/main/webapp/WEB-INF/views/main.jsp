<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online compiler</title>
    <%--<link href="/resources/css/bootstrap.css" rel="stylesheet">--%>
    <%--<link href="/resources/css/font-awesome.min.css" rel="stylesheet">--%>
</head>
<body>
<div id="manage-address" class="container">
    <form action="/compile" method="post">
        <span>Enter your code here and we will compile it for you:</span>
        <div class="code-area">
            <textarea name="code" cols="100" rows="35" placeholder="Enter your code..." ></textarea>
        </div>
        <div class="input-params">
            <textarea name="input-params" cols="100" rows="15" placeholder="Put here input params..."></textarea>
        </div>
        <input type="submit" value="Compile">
    </form>
</div>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<%--<script src="/resources/js/bootstrap.min.js"></script>--%>
<%--<script src="/resources/js/jquery-3.1.1.min.js"></script>--%>
</body>
</html>
