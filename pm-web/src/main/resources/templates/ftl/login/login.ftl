<#include "../common/common.ftl">
<#assign base = request.contextPath />
<@common title="登录">
<link rel="stylesheet" href="${base}/static/css/login.css">
<body>
    <form class="layui-form">
        <div class="login-div">
            <div class="login_face"><img src="/static/images/face.jpg"></div>
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
                    <button class="layui-btn" lay-submit lay-filter="formLogin">登陆</button>
                </div>
            </div>
            <a href="" class="font-set">忘记密码?</a>  <a href="" class="font-set">立即注册</a>
        </div>
        <div id="light" hidden class="layui-fluid">
            <form class="layui-form" action="" style="padding: inherit;width: inherit;height: inherit;position: static;margin: auto;box-shadow: none">
                <div class="layui-form-item">
                    <label class="layui-form-label">请选择角色</label>
                    <div class="layui-input-block" id="roleList">
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="choseRoleSubmit">确定</button>
                    </div>
                </div>
            </form>
        </div>
    </form>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
                ,layer = layui.layer
                ,layedit = layui.layedit
                ,laydate = layui.laydate
                ,$ = layui.jquery;

        form.on('submit(formLogin)', function(data){
            $.post({
                url: "${base}/login",
                data: data.field,
                success: function(result){
                    if(result.code === '200'){
                        if(result.roleListSize > 1){
                            var roleListDiv = $("#roleList");
                            roleListDiv.empty();
                            var roles = result.roleList;
                            for (var i = 0; i < roles.length; i++) {
                                if (i === 0) {
                                    roleListDiv.append('<input type="radio" name="role"  title= "' + roles[i].roleName + '" value=" ' + roles[i].roleId + '" checked="" />')
                                } else {
                                    roleListDiv.append('<input type="radio" name="role"  title= "' + roles[i].roleName + '" value=" ' + roles[i].roleId + '" />')
                                }
                                layui.form.render();//刷新所有表单的渲染效果
                            }
                            layer.open(
                                    {
                                        type: 1,
                                        title: '请选择一个角色登录系统',
                                        content: $("#light"),
                                        area: '500px',
                                        offset: 'auto',
                                        skin: 'layui-layer-molv',
                                        shade: [0.8, '#393D49']
                                    }
                            )
                        } else {
                            location.href = "/index";
                        }

                    }else {
                        location.href = "${base}/index";
                        layer.alert(result.msg)
                    }

                }
            });
            return false;
        });

        form.on('submit(choseRoleSubmit)', function (data) {

            
        })

    });



</script>
</body>
</@common>
