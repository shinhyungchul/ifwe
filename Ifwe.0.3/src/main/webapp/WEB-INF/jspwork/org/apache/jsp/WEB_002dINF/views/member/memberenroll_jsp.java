/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-03-15 12:34:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberenroll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Enroll</title>\r\n");
      out.write("<!-- 영문폰트(구글웹폰트) -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Fredoka+One&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/748cfe3a61.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("@font-face { font-family: 'GmarketSansLight'; src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansLight.woff') format('woff'); font-weight: normal; font-style: normal; }\r\n");
      out.write(".font-kor{\r\n");
      out.write("    font-family : 'GmarketSansLight';\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("}\r\n");
      out.write("html{\r\n");
      out.write("    width: 1920px;\r\n");
      out.write("    height: 1280px;\r\n");
      out.write("    color: #3b3b3b;\r\n");
      out.write("    font-size:14px;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("\tmargin: 5%;\r\n");
      out.write("    width: 1660px;\r\n");
      out.write("    height: 1040px;\r\n");
      out.write("}\r\n");
      out.write("header{\r\n");
      out.write("    margin-bottom: 5%;\r\n");
      out.write("}\r\n");
      out.write(".number,h2,.posts,.post,.info-container,#container,#button-container,#left,#right,#thrid{\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("}\r\n");
      out.write("[name=num]{\r\n");
      out.write("\tfont-size:40px;\r\n");
      out.write("    color: #2756a6;\r\n");
      out.write("}\r\n");
      out.write("#container{\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    height: 100px;\r\n");
      out.write("    padding-top: 2%;\r\n");
      out.write("}\r\n");
      out.write("#button-container{\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    height: 130px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("}\r\n");
      out.write("#first{\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("#hr01{\r\n");
      out.write("    border: solid 2px #2756a6;\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    margin-left: 0;\r\n");
      out.write("}\r\n");
      out.write(".post span{\r\n");
      out.write("    font-size: 20px; \r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("}\r\n");
      out.write(".posts{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    margin-left: 3%;\r\n");
      out.write("}\r\n");
      out.write("section{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("}\r\n");
      out.write("[name=btn]{\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    height: 130px;\r\n");
      out.write("    border:0;\r\n");
      out.write("    outline: 0;\r\n");
      out.write("    background-color: #f3f3f3;\r\n");
      out.write("}\r\n");
      out.write("[name=btn]>p{\r\n");
      out.write("    font-size:20px; \r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("}\r\n");
      out.write("footer{\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    color: #3b3b3b;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 85%;\r\n");
      out.write("}\r\n");
      out.write("article{\r\n");
      out.write("    display: inline;\r\n");
      out.write("}\r\n");
      out.write("#thrid{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: -270px;\r\n");
      out.write("    left: 35%;\r\n");
      out.write("}\r\n");
      out.write("#second{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: -150px;\r\n");
      out.write("    margin: 3%;\r\n");
      out.write("}\r\n");
      out.write("[name=num02]{\r\n");
      out.write("    font-size:40px;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("}\r\n");
      out.write("[name=info]{\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("}\r\n");
      out.write(".info-container{\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("#hr02{\r\n");
      out.write("    width: 1100px;\r\n");
      out.write("    color: #f3f3f3;\r\n");
      out.write("    margin-top: 4%;\r\n");
      out.write("}\r\n");
      out.write(".label, .birth-label{\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    margin: 2% 0 5% 0;\r\n");
      out.write("}\r\n");
      out.write("#enroll{\r\n");
      out.write("    padding: 2%;\r\n");
      out.write("}\r\n");
      out.write(".input{\r\n");
      out.write("    width: 260px;\r\n");
      out.write("    height: 44px;\r\n");
      out.write("}\r\n");
      out.write("input{\r\n");
      out.write("    border:1px solid #ebebeb;\r\n");
      out.write("    margin-bottom: 5%;\r\n");
      out.write("}\r\n");
      out.write("#right{\r\n");
      out.write("    margin-left: 20%;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("}\r\n");
      out.write(".gender-button{\r\n");
      out.write("    width: 55px;\r\n");
      out.write("    height: 45px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-family : 'Godo';\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("}\r\n");
      out.write(".enroll-btn{\r\n");
      out.write("    width: 470px;\r\n");
      out.write("    height: 70px;\r\n");
      out.write("    background-color: #ffc862;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    outline: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<span><img src=\"resources/images/index/logo_black.png\" alt=\"\" style=\"width: 80px; height: 35px;\"></span>\r\n");
      out.write("</header>\r\n");
      out.write("<section>\r\n");
      out.write("\t<article id=\"first\"> \r\n");
      out.write("        <hr id=\"hr01\" noshade>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div class=\"number font-kor\"><span name=\"num\">02</span></div>\r\n");
      out.write("            <div class=\"posts\">\r\n");
      out.write("                <div class=\"post font-kor\"><span>안전한 회원가입을 위해</span></div><br>\r\n");
      out.write("                <div class=\"post font-kor\"><span>본인인증을 진행해주세요</span></div>   \r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        <br />\r\n");
      out.write("        <div id=\"button-container\">\r\n");
      out.write("            <button name=\"btn\">\r\n");
      out.write("               <p class=\"font-kor\" style=\"font-weight: normal;\">휴대폰인증</p> <br>\r\n");
      out.write("               <span style=\"font-size: 12px;\" class=\"font-kor\">본인인증 기관을 통해 본인인증 후 가입하기</span>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </article>\r\n");
      out.write("\t<article id=\"second\"> \r\n");
      out.write("        <div id=\"arrow\"><img src=\"https://img.icons8.com/ios/30/000000/forward--v1.png\"></div>\r\n");
      out.write("    </article>\r\n");
      out.write("    <article id=\"thrid\">\r\n");
      out.write("        <div class=\"number\"><span name=\"num02\" class=\"font-kor\">03</span></div>\r\n");
      out.write("        <div class=\"info-container\"><span name=\"info\" class=\"font-kor\">회원님의 정보를 입력해주세요 </span></div>\r\n");
      out.write("        <hr id=\"hr02\" noshade>\r\n");
      out.write("        <div id=\"enroll\">\r\n");
      out.write("            <form action=\"\">\r\n");
      out.write("                <div id=\"left\">\r\n");
      out.write("                    <div id=\"name\">\r\n");
      out.write("                        <div class=\"label font-kor\">이름</div>\r\n");
      out.write("                        <input type=\"text\" name=\"name\" class=\"input\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"birth\">\r\n");
      out.write("                        <div class=\"label font-kor\">생년월일</div>\r\n");
      out.write("                        <input type=\"text\" name=\"year\" style=\"width: 132px;height: 44px;\">\r\n");
      out.write("                        <span class=\"birth-label font-kor\">년</span>\r\n");
      out.write("                        <input type=\"text\" name=\"month\" style=\"width: 73px;height: 44px;\">\r\n");
      out.write("                        <span class=\"birth-label font-kor\">월</span>\r\n");
      out.write("                        <input type=\"text\" name=\"day\" style=\"width: 73px;height: 44px;\">\r\n");
      out.write("                        <span class=\"birth-label font-kor\">일</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"addr\">\r\n");
      out.write("                        <div class=\"label font-kor\">주소</div>\r\n");
      out.write("                        <input type=\"text\" name=\"addr\" style=\"width: 400px;height: 44px;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"gender\">\r\n");
      out.write("                        <div class=\"label font-kor\">성별</div>\r\n");
      out.write("                        <input type=\"button\" name=\"male\" value=\"남\" class=\"gender-button\">\r\n");
      out.write("                        <input type=\"button\" name=\"female\" value=\"여\" class=\"gender-button\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"right\">\r\n");
      out.write("                    <div id=\"id\">\r\n");
      out.write("                        <div class=\"label font-kor\">아이디</div>\r\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"id\"><span class=\"font-kor\" style=\"color: rgb(56, 209, 9);\">사용가능한 아이디입니다.</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"pwd\">\r\n");
      out.write("                        <div class=\"label font-kor\">비밀번호</div>\r\n");
      out.write("                        <input type=\"password\" class=\"input\" name=\"password\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"pwdchk\">\r\n");
      out.write("                        <div class=\"label font-kor\">비밀번호 확인</div>\r\n");
      out.write("                        <input type=\"password\" name=\"passwordCheck\" class=\"input\">\r\n");
      out.write("                        <span class=\"font-kor\" style=\"color:rgb(235, 42, 14)\">비밀번호가 다릅니다.</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"email\">\r\n");
      out.write("                        <div class=\"label font-kor\">이메일</div>\r\n");
      out.write("                        <input type=\"email\" name=\"email\" style=\"width: 400px; height: 44px;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"enroll-btn\">\r\n");
      out.write("                        <input type=\"button\" value=\"회원가입\" class=\"enroll-btn font-kor\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </article>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"font-kor\"> kh academy </footer>\r\n");
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
