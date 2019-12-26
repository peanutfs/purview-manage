<#include "../common/common.ftl">
<#assign base = request.contextPath />
<@common title="登录">
<link rel="stylesheet" href="${base}/css/login.css">
<body>
<form class="layui-form">
    <div class="login-div">
        <button class="close" title="关闭">X</button>
        <div class="layui-form-mid layui-word-aux">
            <#--<img id="logoid" src="06.png" height="35">-->
                <#--<div class="logoid">登录</div>-->
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"><i class="layui-icon">&#xe66f;</i></label>
            <div class="layui-input-inline">
                <input type="text" name="username" id="username" lay-verify="required" lay-reqtext="请输入用户名" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"><i class="layui-icon">&#xe673;</i></label>
            <div class="layui-input-inline">
                <input type="password" name="password" id="password" lay-verify="required" lay-reqtext="请输入密码" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <#--<label class="layui-form-label">验证码</label>-->
            <#--<div class="layui-input-inline">-->
                <#--<input type="text" name="title" required  lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input verity">-->
            <#--</div>-->
            <#--<div class="layui-form-mid layui-word-aux">辅助文字</div>-->
        </div>


        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">登陆</button>
            </div>
        </div>
        <a href="" class="font-set">忘记密码?</a>  <a href="" class="font-set">立即注册</a>
    </div>
</form>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
                ,layer = layui.layer
                ,layedit = layui.layedit
                ,laydate = layui.laydate
                ,$ = layui.jquery;

        form.on('submit(formDemo)', function(data){
            $.post({
                url: "/login/login",
                type: "post",
                data: data.field,
                success: function(result){
                    if(result.code === '200'){
                        location.href = "/login/index";
                    }else {
                        layer.alert(result.msg)
                    }

                }
            });
            return false;
        });

    });



</script>
</body>
</@common>
