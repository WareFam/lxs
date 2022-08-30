<#include "/common/commoncss.ftl" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
    .thiscolor {
        display: inline-block;
        width: 20px;
        height: 20px;
        border-radius: 50%;
        margin-right: 10px;
    }

    .thiscolor:HOVER {
        cursor: pointer;
    }
</style>
<script type="text/javascript" src="js/common/tocolor.js"></script>
<link rel="stylesheet" href="css/controlpanel.css"/>
<link rel="stylesheet" href="css/common/skintheme.css"/>
<!-- <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"> -->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript">
    $(function () {
        var themeSkin = '${user.themeSkin}';
        if (themeSkin == "blue") {
            toblue();
        } else if (themeSkin == "green") {
            togreen();
        } else if (themeSkin == "yellow") {
            toyellow();
        } else if (themeSkin == "red") {
            tored();
        }
    });
</script>
<script type="text/javascript">
    function funblue() {
        console.log("点击变蓝了");
        parent.toblue();
        toblue();
    }

    function fungreen() {
        console.log("点击变绿了");
        parent.togreen();
        togreen();
    }

    function funyellow() {
        console.log("点击变黄了");
        parent.toyellow();
        toyellow();
    }

    function funred() {
        console.log("点击变红了");
        parent.tored();
        tored();
    }
</script>
<div class="head-show" style="position: relative; height: 76px;">
    <h3 style="display: inline-block; float: left;margin-left: 16px;">控制面板
        <div style="display: inline-block;margin-left: 20px;">
            <span class="thiscolor toblue" style="background-color:#00c0ef" onclick="funblue();"></span>
            <span class="thiscolor togreen" style="background-color:#00a65a" onclick="fungreen();"></span>
            <span class="thiscolor toyellow" style="background-color:#f39c12" onclick="funyellow();"></span>
            <span class="thiscolor tored" style="background-color:#dd4b39" onclick="funred();"></span>
        </div>
    </h3>
    <ol class="breadcrumb pull-right"
        style="float: right; margin-top: 20px; background: transparent;">
        <li><a href="#"> <span class="glyphicon glyphicon-home"></span>
                首页
            </a></li>
        <li class="active">控制面板</li>
    </ol>
</div>
<!--四个面板-->
<div class="container-fluid">
    <div class="row">
        <!--考勤签到-->
        <div class="col-md-3">
            <div id="refresh">
                <#include "signin.ftl">
            </div>
        </div>


    </div>
</div>

<script src="js/littlecalendar.js"></script>
<script src="js/highcharts/jquery.js"></script>
<script src="js/highcharts/highcharts.js"></script>
<script src="js/tongji.js"></script>
