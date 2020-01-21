<#macro common title>
<#assign base = request.contextPath />
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <title>${title}</title>
    <link rel="stylesheet" href="${base}/static/layui/css/layui.css">
    <script language="javascript" src="${base}/static/layui/layui.js" charset="utf-8"></script>
</head>

<body>
    <#nested>
</body>
</html>
</#macro>