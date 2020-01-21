<#assign base = request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="${base}/static/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">layui 后台布局</div>

        <ul class="layui-nav layui-layout-right">
            <#--<li class="layui-nav-item">-->
                <#--<a href="javascript:;"><cite class="adminName"><@shiro.principal property="username"/></cite></a>-->
                <#--<dl class="layui-nav-child">-->
                    <#--<dd><a href="">基本资料</a></dd>-->
                    <#--<dd><a href="">安全设置</a></dd>-->
                <#--</dl>-->
            <#--</li>-->
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>


    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <div class="user-photo">
                    <p>你好！<span class="username"><@shiro.principal property="accountName"/></span>，欢迎登录</p>
                </div>
                <div class="layui-side-scroll">
                    <ul class="layui-nav layui-nav-tree">
                        <li class="layui-nav-item layui-this">
                            <a href="javascript:;" data-url="${base}/home"><cite>后台首页</cite></a>
                        </li>
                    </ul>
                </div>
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">所有商品</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="javascript:;">列表三</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">发布商品</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div class="layui-tab-content" style="top:41px; position:absolute; bottom:0; width:100%; padding:0;">
            <#--<div class="layui-tab-item layui-show">-->
                <iframe src="${base}/home"></iframe>
            <#--</div>-->
        </div>


    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="${base}/static/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>