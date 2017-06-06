<%--
  Created by IntelliJ IDEA.
  User: cc_jhq
  Date: 2017/6/5
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div id="sidebar-nav" class="sidebar">
    <div class="sidebar-scroll">
        <nav>
            <ul class="nav">
                <li><a href="index.jsp" class="active"><i class="lnr lnr-home"></i> <span>总览</span></a></li>
                <li>
                    <a href="#subPages" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>学生管理</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                    <div id="subPages" class="collapse ">
                        <ul class="nav">
                            <li><a href="/pandect.jsp" class="">学生总览</a></li>
                            <li><a href="#" class="">添加学生</a></li>
                            <li><a href="#" class="">删除学生</a></li>
                        </ul>
                    </div>
                </li>
                <li>
                    <a href="#subPage" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>课程管理</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                    <div id="subPage" class="collapse ">
                        <ul class="nav">
                            <li><a href="#" class="">课程总览</a></li>
                            <li><a href="#" class="">添加课程</a></li>
                            <li><a href="#" class="">删除学生</a></li>
                        </ul>
                    </div>
                </li>
                <li><a href="#" class=""><i class="lnr lnr-text-format"></i> <span>个人中心</span></a></li>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
