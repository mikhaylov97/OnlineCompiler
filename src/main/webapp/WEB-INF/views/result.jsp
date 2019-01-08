<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online compiler</title>
    <link href="/resources/css/result.css" rel="stylesheet">
    <%--<link href="/resources/css/bootstrap.css" rel="stylesheet">--%>
    <%--<link href="/resources/css/font-awesome.min.css" rel="stylesheet">--%>
</head>
<body>
<div id="manage-address" class="container">
    <a href="/home">Go back</a>
    <div>
        <span>Here is your compiled result:</span>
        <div class="code-area">${compilationResult}</div>
    </div>
</div>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<%--<script src="/resources/js/bootstrap.min.js"></script>--%>
<%--<script src="/resources/js/jquery-3.1.1.min.js"></script>--%>
</body>
</html>
