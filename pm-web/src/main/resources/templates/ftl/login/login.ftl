<#include "../common/common.ftl">
<@common title="登录">
     <form class="layui-form" action="">
         <div class="layui-form-item">
             <label class="layui-form-label">用户名</label>
             <div class="layui-input-inline">
                 <input id="username" name="username" lay-verify="required" lay-reqtext="请输入用户名" autocomplete="off" placeholder="请输入用户名" class="layui-input">
             </div>
         </div>
         <div class="layui-form-item">
             <label class="layui-form-label">密 码</label>
             <div class="layui-input-inline">
                 <input id="password" name="password" lay-verify="required" lay-reqtext="请输入密码"  autocomplete="off" placeholder="请输入密码" class="layui-input">
             </div>
         </div>
         <div class="layui-form-item">
             <div class="layui-input-block">
                 <button type="submit" class="layui-btn" lay-submit="">立即提交</button>
                 <button type="reset" class="layui-btn layui-btn-primary">重置</button>
             </div>
         </div>
     </form>
</@common>
