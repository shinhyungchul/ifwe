/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-03-15 16:42:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1583844248000L));
    _jspx_dependants.put("jar:file:/C:/workspacese/spring_workspace/Ifwe.0.1/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/workspacese/spring_workspace/Ifwe.0.1/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/workspacese/spring_workspace/Ifwe.0.1/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Main Board</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main/afterLoginCommon.css\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/5e1e16b3f4.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Fredoka+One&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main/mainboard.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("     $(function(){\r\n");
      out.write("         $(\".section-boardcate-button\").click(function(){\r\n");
      out.write("             $(\".section-boardcate-button\").css(\"background-color\",\"#beceea\");\r\n");
      out.write("             $(this).css(\"background-color\",\"#2756a6\");\r\n");
      out.write("         })\r\n");
      out.write("         \r\n");
      out.write("         $(\"#notice\").trigger(\"click\");\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("     });\r\n");
      out.write(" </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/mainInclude.jsp", out, false);
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("        <div class=\"section-container-box\">\r\n");
      out.write("            <div class=\"section-title-box\">\r\n");
      out.write("                <p>게시판</p>\r\n");
      out.write("                <p>ifwe를 사용하시면서 궁금한 점이나 신고사항을 적어주세요</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"writing-button-box\">\r\n");
      out.write("                <div class=\"section-block-right\">\r\n");
      out.write("                    <p>글쓰기</p>\r\n");
      out.write("                <i class=\"fas fa-pencil-alt\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"section-boardcate-box\">\r\n");
      out.write("                <div class=\"section-boardcate-button\" id=\"notice\">\r\n");
      out.write("                    <p>공지사항</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"section-boardcate-button\">\r\n");
      out.write("                    <p>문의게시판</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"section-boardcate-button\">\r\n");
      out.write("                    <p>신고게시판</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"section-board-container\">\r\n");
      out.write("                <div class=\"sction-board-center\">\r\n");
      out.write("                    <div class=\"section-board-line\"></div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"section-boardtitle-box\">\r\n");
      out.write("                        <p>공지</p>\r\n");
      out.write("                        <div class=\"section-boardtitle\">\r\n");
      out.write("                            안녕하세요.공지사항입니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>2020-03-10</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"section-boardtitle-box\">\r\n");
      out.write("                        <p>공지</p>\r\n");
      out.write("                        <div class=\"section-boardtitle\">\r\n");
      out.write("                            안녕하세요.공지사항입니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>2020-03-10</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"section-boardtitle-box\">\r\n");
      out.write("                        <p>공지</p>\r\n");
      out.write("                        <div class=\"section-boardtitle\">\r\n");
      out.write("                            안녕하세요.공지사항입니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>2020-03-10</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"section-boardtitle-box\">\r\n");
      out.write("                        <p>공지</p>\r\n");
      out.write("                        <div class=\"section-boardtitle\">\r\n");
      out.write("                            안녕하세요.공지사항입니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>2020-03-10</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"section-boardtitle-box\">\r\n");
      out.write("                        <p>공지</p>\r\n");
      out.write("                        <div class=\"section-boardtitle\">\r\n");
      out.write("                            안녕하세요.공지사항입니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>2020-03-10</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
