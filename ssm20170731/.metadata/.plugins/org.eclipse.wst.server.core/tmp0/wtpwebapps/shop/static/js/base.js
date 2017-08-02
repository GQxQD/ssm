var base_path = "http://127.0.0.1:8080/shop";

// v-navbar
Vue.component('v-navbar', {
    template:'<nav class="navbar navbar-inverse" id="navbar">\n' +
    '    <div class="container">\n' +
    '        <div class="navbar-header">\n' +
    '            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"\n' +
    '                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">\n' +
    '                <span class="sr-only">Toggle navigation</span>\n' +
    '                <span class="icon-bar"></span>\n' +
    '                <span class="icon-bar"></span>\n' +
    '                <span class="icon-bar"></span>\n' +
    '            </button>\n' +
    '            <a class="navbar-brand" href="#">在线商城</a>\n' +
    '        </div>\n' +
    '\n' +
    '        <!-- Collect the nav links, forms, and other content for toggling -->\n' +
    '        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">\n' +
    '            <ul class="nav navbar-nav">\n' +
    '                <li class="active"><a href="index.html">首页 <span class="sr-only">(current)</span></a></li>\n' +
    '                <li><a href="#">Link</a></li>\n' +
    '                <li class="dropdown">\n' +
    '                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"\n' +
    '                       aria-expanded="false">Dropdown <span class="caret"></span></a>\n' +
    '                    <ul class="dropdown-menu">\n' +
    '                        <li><a href="#">Action</a></li>\n' +
    '                        <li><a href="#">Another action</a></li>\n' +
    '                        <li><a href="#">Something else here</a></li>\n' +
    '                        <li role="separator" class="divider"></li>\n' +
    '                        <li><a href="#">Separated link</a></li>\n' +
    '                        <li role="separator" class="divider"></li>\n' +
    '                        <li><a href="#">One more separated link</a></li>\n' +
    '                    </ul>\n' +
    '                </li>\n' +
    '            </ul>\n' +
    '            <form class="navbar-form navbar-left">\n' +
    '                <div class="form-group">\n' +
    '                    <input class="form-control" placeholder="Search">\n' +
    '                </div>\n' +
    '                <button class="btn btn-default">搜索</button>\n' +
    '            </form>\n' +
    '            <ul class="nav navbar-nav navbar-right">\n' +
    '                <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> 请先登录！</a>\n' +
    '                </li>\n' +
    '                <li><a href="register.html">注册</a></li>\n' +
    '                <li class="dropdown">\n' +
    '                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"\n' +
    '                       aria-expanded="false"><span class="glyphicon glyphicon-cog"></span> 设置 <span\n' +
    '                            class="caret"></span></a>\n' +
    '                    <ul class="dropdown-menu">\n' +
    '                        <li><a href="#">个人中心</a></li>\n' +
    '                        <li><a href="#">Another action</a></li>\n' +
    '                        <li><a href="#">Something else here</a></li>\n' +
    '                        <li role="separator" class="divider"></li>\n' +
    '                        <li><a href="#">退出</a></li>\n' +
    '                    </ul>\n' +
    '                </li>\n' +
    '            </ul>\n' +
    '        </div>\n' +
    '    </div>\n' +
    '</nav>'
});