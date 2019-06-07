<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online compiler</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/result.css" rel="stylesheet">
</head>
<body>
<div id="main-container" class="container">
    <div class="row col-md-6 offset-md-3 d-flex justify-content-center mt-3">
        <span class="header">Welcome to the Java online compiler!</span>
    </div>
    <div class="row mt-5">
        <div class="col-md-8 input">
            <span class="subheader">Put your code here:</span>
            <form id="main-form" class="mt-2">
                <div>
                    <textarea id="code-example" class="d-none">public class Test {public static void main(String[] args) throws Exception {System.out.println("Hello world!");} }</textarea>
                    <div id="editor"></div>
                    <input id="code" type="text" name="code" style="display: none;">
                </div>
                <div class="input-params mt-2">
                    <textarea name="input-params" cols="100" rows="3" placeholder="Put here input params..."></textarea>
                </div>
                <div class="button d-flex justify-content-center mt-4">
                    <input id="submit-btn" type="button" class="btn btn-dark" value="Compile">
                </div>
            </form>
        </div>
        <div class="col-md-4 output">
            <span>Compilation result:</span>
            <div class="output-code mt-2">
                <div class="d-flex justify-content-start">
                    <div class="arrow">&nbsp;>&nbsp;&nbsp;</div>
                    <div class="d-none compiling-message-process">Compiling your code...</div>
                    <div class="d-none compiling-message-result">Compilation result:</div>
                </div>
                <div id="compile-output" class="code-area"></div>
            </div>
        </div>
    </div>
</div>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/js/jquery-3.3.1.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/ace.js" type="text/javascript" charset="utf-8"></script>
<script src="/resources/js/theme-monokai.js" type="text/javascript" charset="utf-8"></script>
<script src="/resources/js/mode-java.js" type="text/javascript" charset="utf-8"></script>
<script src="/resources/js/ext-beautify.js" type="text/javascript" charset="utf-8"></script>
<script src="/resources/js/custom.js" type="text/javascript"></script>
</body>
</html>
