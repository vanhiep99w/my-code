/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.29
 * Generated at: 2019-12-14 13:00:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.bean.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/templates/admin/inc/footer.jsp", Long.valueOf(1576113821000L));
    _jspx_dependants.put("/templates/admin/inc/header.jsp", Long.valueOf(1576142851297L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.bean.User");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"profile\" href=\"http://gmpg.org/xfn/11\">\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/css/coin-slider.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/css/custom.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/animate/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/select2/select2.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/css/util.css\">\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/js/coin-slider.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/ckeditor/ckeditor.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://preview.themezee.com/chronus/wp-content/cache/min/79/55bc2c57ad9dc382cf75ecd50907a232.css\" data-minify=\"1\" />\n");
      out.write("    <link rel='dns-prefetch' href='//s.w.org' />\n");
      out.write("    <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Chronus &raquo; Feed\" href=\"https://preview.themezee.com/chronus/feed/\" />\n");
      out.write("    <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Chronus &raquo; Comments Feed\" href=\"https://preview.themezee.com/chronus/comments/feed/\" />\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        img.wp-smiley,\n");
      out.write("        img.emoji {\n");
      out.write("            display: inline!important;\n");
      out.write("            border: none!important;\n");
      out.write("            box-shadow: none!important;\n");
      out.write("            height: 1em!important;\n");
      out.write("            width: 1em!important;\n");
      out.write("            margin: 0 .07em!important;\n");
      out.write("            vertical-align: -0.1em!important;\n");
      out.write("            background: none!important;\n");
      out.write("            padding: 0!important\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("        border: 1px solid rgba(0,0,0,.075);}\n");
      out.write("    </style>\n");
      out.write("    <script type='text/javascript'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var chronus_menu_title = \"<svg class=\\\"icon icon-menu\\\" aria-hidden=\\\"true\\\" role=\\\"img\\\"> <use xlink:href=\\\"https:\\/\\/preview.themezee.com\\/chronus\\/wp-content\\/themes\\/chronus\\/assets\\/icons\\/genericons-neue.svg#menu\\\"><\\/use> <\\/svg>Menu\"; /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <link rel='https://api.w.org/' href='https://preview.themezee.com/chronus/wp-json/' />\n");
      out.write("    <link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"https://preview.themezee.com/chronus/xmlrpc.php?rsd\" />\n");
      out.write("    <link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"https://preview.themezee.com/chronus/wp-includes/wlwmanifest.xml\" />\n");
      out.write("    <meta name=\"generator\" content=\"WordPress 5.0.3\" />\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/templates/admin/js/main.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        (function(i, s, o, g, r, a, m) {\n");
      out.write("            i['GoogleAnalyticsObject'] = r;\n");
      out.write("            i[r] = i[r] || function() {\n");
      out.write("                (i[r].q = i[r].q || []).push(arguments)\n");
      out.write("            }, i[r].l = 1 * new Date();\n");
      out.write("            a = s.createElement(o),\n");
      out.write("                m = s.getElementsByTagName(o)[0];\n");
      out.write("            a.async = 1;\n");
      out.write("            a.src = g;\n");
      out.write("            m.parentNode.insertBefore(a, m)\n");
      out.write("        })(window, document, 'script', '//www.google-analytics.com/analytics.js', '__gaTracker');\n");
      out.write("\n");
      out.write("        __gaTracker('create', 'UA-4734666-2', 'auto');\n");
      out.write("        __gaTracker('set', 'forceSSL', true);\n");
      out.write("        __gaTracker('set', 'anonymizeIp', true);\n");
      out.write("        __gaTracker('require', 'displayfeatures');\n");
      out.write("        __gaTracker('send', 'pageview');\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"home blog\"><a class=\"skip-link screen-reader-text\" href=\"#content\">Skip to content</a>\n");
      out.write("    <div id=\"page\" class=\"hfeed site\">\n");
      out.write("        <header id=\"masthead\" class=\"site-header clearfix\" role=\"banner\">\n");
      out.write("            <div class=\"header-main container clearfix\">\n");
      out.write("            ");
 User userLogin= (User) session.getAttribute("userInfo"); 
      out.write("<div style=\"padding: 15px 50px 5px 50px;float: right;font-size: 16px;\">Xin chào ");
      out.print(userLogin.getUsername() );
      out.write("<b> &nbsp; <a href=\"");
      out.print(request.getContextPath() );
      out.write("/auth/logout\" title=\"Đăng xuất\" style=\"color: white\" class=\"btn btn-danger\">Đăng xuất</a> </b>\n");
      out.write("            </div>\n");
      out.write("                <div id=\"logo\" class=\"site-branding clearfix\">\n");
      out.write("                    <h1 class=\"site-title\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/index\" rel=\"home\">SHARE IT</a></h1>\n");
      out.write("                    <p class=\"site-description\">Chào mừng đến với trang quản lí Share IT</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"main-navigation-wrap\" class=\"primary-navigation-wrap\">\n");
      out.write("                <nav id=\"main-navigation\" class=\"primary-navigation navigation container clearfix\" role=\"navigation\">\n");
      out.write("                    <ul id=\"menu-navigation\" class=\"main-navigation-menu\">\n");
      out.write("                        <li id=\"menu-item-1\" class=\"menu-item menu-item-type-custom menu-item-object-custom current_page_item menu-item-home menu-item-2732\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/index\">Trang chủ</a></li>\n");
      out.write("                        <li id=\"menu-item-2\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-2741\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/cat/index\">Quản lý danh mục</a></li>\n");
      out.write("                        <li id=\"menu-item-3\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-2737\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/news/index\">Quản lý tin tức</a></li>\n");
      out.write("                        <li id=\"menu-item-4\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-2746\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/user/index\">Quản lý người dùng</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>");
      out.write("<div class=\"slider-container\">\n");
      out.write("  <div class=\"menu\">\n");
      out.write("    <label for=\"slide-dot-1\"></label>\n");
      out.write("    <label for=\"slide-dot-2\"></label>\n");
      out.write("    <label for=\"slide-dot-3\"></label>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <input id=\"slide-dot-1\" type=\"radio\" name=\"slides\" checked>\n");
      out.write("    <div class=\"slide slide-1\"></div>\n");
      out.write("  \n");
      out.write("  <input id=\"slide-dot-2\" type=\"radio\" name=\"slides\">\n");
      out.write("    <div class=\"slide slide-2\"></div>\n");
      out.write("  \n");
      out.write("  <input id=\"slide-dot-3\" type=\"radio\" name=\"slides\">\n");
      out.write("    <div class=\"slide slide-3\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    document.getElementById(\"menu-item-1\").classList.add('current-menu-item');\n");
      out.write("</script>\n");
      out.write(" ");
      out.write("<div id=\"footer\" class=\"footer-wrap\">\n");
      out.write("            <footer id=\"colophon\" class=\"site-footer container clearfix\" role=\"contentinfo\">\n");
      out.write("                <div id=\"footer-text\" class=\"site-info\"> <span class=\"credit-link\"> Powered by <a href=\"http://wordpress.org\" title=\"WordPress\">WordPress</a> and <a href=\"https://themezee.com/themes/chronus/\" title=\"Chronus WordPress Theme\">Chronus</a>. </span>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://preview.themezee.com/chronus/wp-content/cache/min/79/6284d8b81c5d2227af9ea8e5ebbc11c3.js\" data-minify=\"1\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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