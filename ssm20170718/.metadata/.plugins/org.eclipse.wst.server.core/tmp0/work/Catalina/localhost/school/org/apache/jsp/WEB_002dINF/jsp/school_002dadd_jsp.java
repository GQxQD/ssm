/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M20
 * Generated at: 2017-07-21 02:59:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class school_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/JavaEE/ssm/ssm20170718/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/school/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1500431085373L));
    _jspx_dependants.put("jar:file:/D:/JavaEE/ssm/ssm20170718/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/school/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = path + "/hui/";

      out.write("\r\n");
      out.write("<!--_meta 作为公共模版分离出去-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link rel=\"Bookmark\" href=\"/favicon.ico\" >\r\n");
      out.write("<link rel=\"Shortcut Icon\" href=\"/favicon.ico\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath );
      out.write("static/h-ui.admin/css/style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--/meta 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<title>添加用户 - H-ui.admin v3.1</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载\">\r\n");
      out.write("<meta name=\"description\" content=\"H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<article class=\"page-container\">\r\n");
      out.write("\t<form action=\"\" method=\"post\" class=\"form form-horizontal\" id=\"form-member-add\">\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>学校名称：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"username\" name=\"name\" maxlength=\"25\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>学校校长：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"president\" name=\"president\" maxlength=\"3\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>联系电话：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"tel\" name=\"tel\" maxlength=\"25\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>学校邮箱：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"email\" name=\"email\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>学校地址：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"address\" name=\"address\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>开学时间：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input onfocus=\"WdatePicker({ maxDate:'#F{$dp.$D(\\'datemax\\')||\\'%y-%M-%d\\'}' })\" type=\"text\" class=\"input-text Wdate\" value=\"\" placeholder=\"\" id=\"schoolDate\" name=\"schoolDate\" required=\"required\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- <div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>学校校长：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9 skin-minimal\">\r\n");
      out.write("\t\t\t\t<div class=\"radio-box\">\r\n");
      out.write("\t\t\t\t\t<input name=\"sex\" type=\"radio\" id=\"sex-1\" checked>\r\n");
      out.write("\t\t\t\t\t<label for=\"sex-1\">男</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"radio-box\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sex-2\" name=\"sex\">\r\n");
      out.write("\t\t\t\t\t<label for=\"sex-2\">女</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"radio-box\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"sex-3\" name=\"sex\">\r\n");
      out.write("\t\t\t\t\t<label for=\"sex-3\">保密</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>手机：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"mobile\" name=\"mobile\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>邮箱：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"input-text\" placeholder=\"@\" name=\"email\" id=\"email\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\">附件：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\"> <span class=\"btn-upload form-group\">\r\n");
      out.write("\t\t\t\t<input class=\"input-text upload-url\" type=\"text\" name=\"uploadfile\" id=\"uploadfile\" readonly nullmsg=\"请添加附件！\" style=\"width:200px\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void();\" class=\"btn btn-primary radius upload-btn\"><i class=\"Hui-iconfont\">&#xe642;</i> 浏览文件</a>\r\n");
      out.write("\t\t\t\t<input type=\"file\" multiple name=\"file-2\" class=\"input-file\">\r\n");
      out.write("\t\t\t\t</span> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\">所在城市：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\"> <span class=\"select-box\">\r\n");
      out.write("\t\t\t\t<select class=\"select\" size=\"1\" name=\"city\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\" selected>请选择城市</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">北京</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">上海</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">广州</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</span> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<label class=\"form-label col-xs-4 col-sm-3\">备注：</label>\r\n");
      out.write("\t\t\t<div class=\"formControls col-xs-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t<textarea name=\"beizhu\" cols=\"\" rows=\"\" class=\"textarea\"  placeholder=\"说点什么...最少输入10个字符\" onKeyUp=\"$.Huitextarealength(this,100)\"></textarea>\r\n");
      out.write("\t\t\t\t<p class=\"textarea-numberbar\"><em class=\"textarea-length\">0</em>/100</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t<div class=\"row cl\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3\">\r\n");
      out.write("\t\t\t\t<input class=\"btn btn-primary radius\" type=\"submit\" value=\"&nbsp;&nbsp;提交&nbsp;&nbsp;\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("static/h-ui/js/H-ui.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本--> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/My97DatePicker/4.8/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/jquery.validation/1.14.0/jquery.validate.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/jquery.validation/1.14.0/validate-methods.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("lib/jquery.validation/1.14.0/messages_zh.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('.skin-minimal input').iCheck({\r\n");
      out.write("\t\tcheckboxClass: 'icheckbox-blue',\r\n");
      out.write("\t\tradioClass: 'iradio-blue',\r\n");
      out.write("\t\tincreaseArea: '20%'\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#form-member-add\").validate({\r\n");
      out.write("\t\trules:{\r\n");
      out.write("\t\t\tusername:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tminlength:2,\r\n");
      out.write("\t\t\t\tmaxlength:16\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsex:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmobile:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tisMobile:true,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\temail:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\temail:true,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tuploadfile:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//onkeyup:false,\r\n");
      out.write("\t\t//focusCleanup:true,\r\n");
      out.write("\t\t//success:\"valid\",\r\n");
      out.write("\t\t//submitHandler:function(form){\r\n");
      out.write("\t\t\t//$(form).ajaxSubmit();\r\n");
      out.write("\t\t\t//var index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("\t\t\t//parent.$('.btn-refresh').click();\r\n");
      out.write("\t\t\t//parent.layer.close(index);\r\n");
      out.write("\t\t//}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script> \r\n");
      out.write("<!--/请在上方写此页面业务相关的脚本-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}