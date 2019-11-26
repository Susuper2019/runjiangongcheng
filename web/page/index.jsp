<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html>
<html>
<head>
  <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">




    <title>库存数据</title>
    <meta name="description" content="库存数据">
    <meta name="keywords" content="库存数据">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/morris/morris.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/select2/select2.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="<%=basePath%>/css/style.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="<%=basePath%>/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>
<body class="hold-transition skin-purple sidebar-mini">
<div class="wrapper">

        <!-- 页面头部 -->
        <header class="main-header">


            <!-- Logo -->
            <a href="all-admin-index.html" class="logo">
                <!-- mini logo for sidebar mini 50x50 pixels -->
                <span class="logo-mini"><b>数据</b></span>
                <!-- logo for regular state and mobile devices -->
                <span class="logo-lg"><b>超市</b>后台管理</span>
            </a>


            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top">
                <!-- Sidebar toggle button-->
                <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <!-- Messages: style can be found in dropdown.less-->
                        <li class="dropdown messages-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-envelope-o"></i>
                        <span class="label label-success">4</span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="header">你有4个邮件</li>
                                <li>
                                    <!-- inner menu: contains the actual data -->
                                    <ul class="menu">
                                        <li>
                                            <!-- start message -->
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                                </div>
                                                <h4>
                                                    系统消息
                                                    <small><i class="fa fa-clock-o"></i> 5 分钟前</small>
                                                </h4>
                                                <p>欢迎登录系统?</p>
                                            </a>
                                        </li>
                                        <!-- end message -->
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                                </div>
                                                <h4>
                                                    团队消息
                                                    <small><i class="fa fa-clock-o"></i> 2 小时前</small>
                                                </h4>
                                                <p>你有新的任务了</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                                </div>
                                                <h4>
                                                    Developers
                                                    <small><i class="fa fa-clock-o"></i> Today</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                                </div>
                                                <h4>
                                                    Sales Department
                                                    <small><i class="fa fa-clock-o"></i> Yesterday</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <div class="pull-left">
                                                    <img src="../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                                </div>
                                                <h4>
                                                    Reviewers
                                                    <small><i class="fa fa-clock-o"></i> 2 days</small>
                                                </h4>
                                                <p>Why not buy a new awesome theme?</p>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer"><a href="#">See All Messages</a></li>
                            </ul>
                        </li>
                        <!-- Notifications: style can be found in dropdown.less -->
                        <li class="dropdown notifications-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-bell-o"></i>
                        <span class="label label-warning">10</span>
                    </a>
                            <ul class="dropdown-menu">
                                <li class="header">你有10个新消息</li>
                                <li>
                                    <!-- inner menu: contains the actual data -->
                                    <ul class="menu">
                                        <li>
                                            <a href="#">
                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today
                                    </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                        <i class="fa fa-warning text-yellow"></i> Very long description here that may not
                                        fit into the page and may cause design problems
                                    </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                        <i class="fa fa-users text-red"></i> 5 new members joined
                                    </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                        <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                                    </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                        <i class="fa fa-user text-red"></i> You changed your username
                                    </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="footer"><a href="#">View all</a></li>
                            </ul>
                        </li>
                        <!-- Tasks: style can be found in dropdown.less -->
                        <li class="dropdown tasks-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-flag-o"></i>
                        <span class="label label-danger">9</span>
                    </a>
                            <ul class="dropdown-menu">
                                <li class="header">你有9个新任务</li>
                                <li>
                                    <!-- inner menu: contains the actual data -->
                                    <ul class="menu">
                                        <li>
                                            <!-- Task item -->
                                            <a href="#">
                                                <h3>
                                                    Design some buttons
                                                    <small class="pull-right">20%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">20% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <!-- end task item -->
                                        <li>
                                            <!-- Task item -->
                                            <a href="#">
                                                <h3>
                                                    Create a nice theme
                                                    <small class="pull-right">40%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">40% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <!-- end task item -->
                                        <li>
                                            <!-- Task item -->
                                            <a href="#">
                                                <h3>
                                                    Some task I need to do
                                                    <small class="pull-right">60%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">60% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <!-- end task item -->
                                        <li>
                                            <!-- Task item -->
                                            <a href="#">
                                                <h3>
                                                    Make beautiful transitions
                                                    <small class="pull-right">80%</small>
                                                </h3>
                                                <div class="progress xs">
                                                    <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                        <span class="sr-only">80% Complete</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                        <!-- end task item -->
                                    </ul>
                                </li>
                                <li class="footer">
                                    <a href="#">View all tasks</a>
                                </li>
                            </ul>
                        </li>
                        <!-- User Account: style can be found in dropdown.less -->
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="../img/user2-160x160.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">张猿猿</span>
                    </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header">
                                    <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                    <p>
                                        张猿猿 - 数据管理员
                                        <small>最后登录 11:20AM</small>
                                    </p>
                                </li>
                                <!-- Menu Body 
                        <li class="user-body">
                            <div class="row">
                                <div class="col-xs-4 text-center">
                                    <a href="#">Followers</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">Sales</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">Friends</a>
                                </div>
                            </div>
                        </li>-->
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="#" class="btn btn-default btn-flat">修改密码</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="#" class="btn btn-default btn-flat">注销</a>
                                    </div>
                                </li>
                            </ul>
                        </li>

                    </ul>
                </div>
            </nav>
        </header>
        <!-- 页面头部 /-->


        <!-- 导航侧栏 -->
        <aside class="main-sidebar">
            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar">
                <!-- Sidebar user panel -->
                <div class="user-panel">
                    <div class="pull-left image">
                        <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                    </div>
                    <div class="pull-left info">
                        <p>张猿猿</p>
                        <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                    </div>
                </div>
                

                <!-- sidebar menu: : style can be found in sidebar.less -->
                <ul class="sidebar-menu">
                    <li class="header">菜单</li>

                    <li id="admin-index"><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

                    <!-- 菜单 -->
                    <li class="treeview">
                        <a href="#">
                    <i class="fa fa-folder"></i> <span>库存管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                          <ul class="treeview-menu">
                          <li id="admin-login">
                                <a href="ProductManage.jsp">
                            <i class="fa fa-circle-o"></i> 库存数据信息列表 </a>
                            </li>
							
							 <li id="admin-login">
                                <a href="yuangongjiemian.jsp">
                            <i class="fa fa-circle-o"></i> 员工信息 </a>
                            </li>
							
							<li id="admin-login">
                                <a href="huiyuanxinxi.jsp">
                            <i class="fa fa-circle-o"></i> 会员信息 </a>
                            </li>
							
							 <li id="all-order-manage-list.html">
                                <a href="orderMessage.jsp">
                            <i class="fa fa-circle-o"></i> 清单
                        </a>
                            </li>
                        <li id="admin-invoice">
                                <a href="fapiao.html">
                            <i class="fa fa-circle-o"></i> 发票
                        </a>
                            </li>

                            <li id="admin-invoice-print">
                                <a href="all-admin-invoice-print.html">
                            <i class="fa fa-circle-o"></i> 发票打印
                        </a>
                            </li>
							
							
							
							
							
                        </ul> 
						
                    </li>

					 <!-- 菜单 -->
                </ul>
            </section>
            <!-- /.sidebar -->
        </aside>
        <!-- 导航侧栏 /-->

        <!-- 内容区域 -->
        <!-- @@master = admin-layout.html-->
        <!-- @@block = content -->

        <div class="content-wrapper">
                <form action="<%=basePath%>/Product/showIndexMessage">
                    <div class="has-feedback col-sm-3">

                        <input type="text" class="form-control input-sm " placeholder="输入商品名称来搜索" name="c_name" id="c_name"></input>
                        <%--<input type="submit" value="查询"/>--%>
                        <input type="submit" value="提交" >
                    </div>
                </form>
            <table id="dataList" class="table table-bordered table-striped table-hover dataTable">

                <tbody>



                        <c:forEach items="${commodities}" var="commodities" varStatus="status">
                            <c:if test="${(status.count-1)%4==0}">
                                <tr>
                            </c:if>
                        <td><img src="${commodities.c_picture}"  style="width: 120px;height: 120px" ><br/>
                            ${commodities.c_name}<br/>${commodities.c_sellprice}<br/>${commodities.c_place}<br/></td>
                                <c:if test="${(status.count)%4==0}">
                                 </tr>
                                </c:if>
                                <c:if test="${status.last}">
                                    </tr>
                                </c:if>
                        </c:forEach>

                </tbody>

            </table>
            

        </div>
        <!-- @@close -->
        <!-- 内容区域 /-->

        <!-- 底部导航 -->
        <footer class="main-footer">
            <div class="pull-right hidden-xs">
                <b>Version</b> 1.0.8
            </div>
            <strong>Copyright &copy; 2019-2020 <a href="http://www.itcast.cn">超市后台管理系统</a>.</strong> Faighting！
        </footer>
        <!-- 底部导航 /-->

    </div>


<script src="<%=basePath%>/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="<%=basePath%>/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="<%=basePath%>/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="<%=basePath%>/plugins/raphael/raphael-min.js"></script>
<script src="<%=basePath%>/plugins/morris/morris.min.js"></script>
<script src="<%=basePath%>/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="<%=basePath%>/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="<%=basePath%>/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="<%=basePath%>/plugins/knob/jquery.knob.js"></script>
<script src="<%=basePath%>/plugins/daterangepicker/moment.min.js"></script>
<script src="<%=basePath%>/plugins/daterangepicker/daterangepicker.js"></script>
<script src="<%=basePath%>/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="<%=basePath%>/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="<%=basePath%>/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="<%=basePath%>/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="<%=basePath%>/plugins/fastclick/fastclick.js"></script>
<script src="<%=basePath%>/plugins/iCheck/icheck.min.js"></script>
<script src="<%=basePath%>/plugins/adminLTE/js/app.min.js"></script>
<script src="<%=basePath%>/plugins/treeTable/jquery.treetable.js"></script>
<script src="<%=basePath%>/plugins/select2/select2.full.min.js"></script>
<script src="<%=basePath%>/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="<%=basePath%>/plugins/ckeditor/ckeditor.js"></script>
<script src="<%=basePath%>/plugins/input-mask/jquery.inputmask.js"></script>
<script src="<%=basePath%>/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="<%=basePath%>/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="<%=basePath%>/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="<%=basePath%>/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="<%=basePath%>/plugins/chartjs/Chart.min.js"></script>
<script src="<%=basePath%>/plugins/flot/jquery.flot.min.js"></script>
<script src="<%=basePath%>/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="<%=basePath%>/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="<%=basePath%>/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="<%=basePath%>/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="<%=basePath%>/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <script>


        <%--function select(){--%>
            <%--alert("select");--%>
            <%--var c_name = document.getElementById("c_name").value;--%>
            <%--alert(c_name);--%>
            <%--document.formTest.action="<%=basePath%>/Product/showIndexMessage?c_name="+c_name;--%>
            <%--document.formTest.submit();--%>
        <%--}--%>

        $(document).ready(function() {
            // 选择框
            $(".select2").select2();

            // WYSIHTML5编辑器
            $(".textarea").wysihtml5({
                locale: 'zh-CN'
            });
        });


        // 设置激活菜单
        function setSidebarActive(tagUri) {
            var liObj = $("#" + tagUri);
            if (liObj.length > 0) {
                liObj.parent().parent().addClass("active");
                liObj.addClass("active");
            }
        }


        $(document).ready(function() {

            // 激活导航位置
            setSidebarActive("admin-datalist");

            // 列表按钮 
            $("#dataList td input[type='checkbox']").iCheck({
                checkboxClass: 'icheckbox_square-blue',
                increaseArea: '20%'
            });
            // 全选操作 
            $("#selall").click(function() {
                var clicks = $(this).is(':checked');
                if (!clicks) {
                    $("#dataList td input[type='checkbox']").iCheck("uncheck");
                } else {
                    $("#dataList td input[type='checkbox']").iCheck("check");
                }
                $(this).data("clicks", !clicks);
            });
        });
    </script>

</body>
</html>