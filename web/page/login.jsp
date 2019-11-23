<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>员工登录界面</title>
    
   <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">

</head>
<body class="hold-transition login-page" >

 <div class="login-box">
        <div class="login-logo">


            <a href="#">超市后台管理系统</a>


        </div>
        <!-- /.login-logo -->
        <div class="login-box-body">
            <p class="login-box-msg">登录系统</p>

            <form action="${pageContext.request.contextPath }/loginServlet" method="post">
                <div class="form-group has-feedback">
                    <input type="text" class="form-control" placeholder="账号" name="userid">
                    <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="password" class="form-control" placeholder="密码" name="password">
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>
                <div class="row">
                    <div class="col-xs-4">
                         <!--<div class="checkbox icheck"> -->
                             <!--&lt;!&ndash; 错误：选择框，未显示&ndash;&gt;-->
                            <!--<label><input type="checkbox"> 记住 下次自动登录</label>-->
                        <!--</div>-->
                    </div>
 
                    <!-- /.col -->
                    <div class="col-xs-4">
                        <button type="submit" class="btn btn-primary btn-block btn-flat" id="login">登录</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>

            <div class="social-auth-links text-center">
                <p>- 或者 -</p>
                <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-qq"></i> 腾讯QQ用户登录</a>
                <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-weixin"></i> 微信用户登录</a>
            </div>
            <!-- /.social-auth-links -->

            <!--<a href="#">忘记密码</a><br>-->
            <!-- <a href="all-admin-register.html" class="text-center">新用户注册</a> -->

        </div>
        <!-- /.login-box-body -->
    </div>
    <!-- /.login-box -->

    <!-- jQuery 2.2.3 -->
    <!-- Bootstrap 3.3.6 -->
    <!-- iCheck -->
    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="../plugins/iCheck/icheck.min.js"></script>
    <script>
        $(function() {
            $('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });

            // $("#login").click(function(){
            //     $.ajax({
            //         url:'loginServlet',
            //         success:function(data){
            //             var result = eval("(" + data + ")");   //此处需要这样获取到后端的json数据，虽然我也不知道为甚
            //             alert("ok");
            //
            //
            //         }
            //
            //     })
            // });
        });
    </script>

</body>
</html>