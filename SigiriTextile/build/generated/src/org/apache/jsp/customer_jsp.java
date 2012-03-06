package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link rel=\"icon\" href=\"images/logo_link.png\">\n");
      out.write("        <title>Sigiri - Stock Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/div_styles.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"verticaltabs/css/verticaltabs.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/formstyle.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"verticaltabs/js/verticaltabs.pack.js\"></script> <!--http://dean.edwards.name/packer/-->\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#textExample\").verticaltabs({speed: 500,slideShow: false,activeIndex:0});\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table width=\"100%\" height=\"114\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"116\" height=\"108\"><center><img src=\"images/logo.png\"/></center></td>\n");
      out.write("                    <td width=\"612\" style=\"padding-left:8px;color:#000079;font-size:20px;font-family:'Lucida Sans Unicode', 'Lucida Grande', sans-serif;\">\n");
      out.write("\n");
      out.write("                        <p>Sigiri Textile Industries (Pvt) Ltd.        </p>\n");
      out.write("                        <p>No:227/1,\n");
      out.write("                            Galle Road,Katubedda,\n");
      out.write("                            Mt.Lavinia,\n");
      out.write("                            Sri Lanka. </p></td>\n");
      out.write("                    <td width=\"458\">&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table width=\"100%\" height=\"80\" >\n");
      out.write("                <!-- Text Example -->\n");
      out.write("                <div class=\"verticalslider\" id=\"textExample\">\n");
      out.write("                    <ul class=\"verticalslider_tabs\">\n");
      out.write("                        <li style=\"margin-top:25px;\"><a href=\"#\">Customer & Operation</a></li>\n");
      out.write("                        <li><a href=\"#\">Add Customer</a></li>\n");
      out.write("                        <li><a href=\"#\">Search Customer</a></li>\n");
      out.write("                        <li><a href=\"#\">Edit Customer</a></li>\n");
      out.write("                        <li><a href=\"#\">Customer List</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"verticalslider_contents\">\n");
      out.write("                        <li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li style=\"padding-left:50px;\">\n");
      out.write("\n");
      out.write("                            <form action=\"AddCustomer.action\" method=\"post\">\n");
      out.write("\n");
      out.write("                                <fieldset style=\"height:450px;width:600px;\">\n");
      out.write("                                    <legend>Customer Details</legend>\n");
      out.write("                                    <div>\n");
      out.write("                                        <p><label for=\"input-one\" class=\"float\" ><strong>Name:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"name\" id=\"name\" type=\"text\" size=\"30\" /><br/></p>\n");
      out.write("\n");
      out.write("                                        <P><label for=\"input-two\" class=\"float\"  style=\"padding-top:10px;\"><strong>Address:</strong></label><br />\n");
      out.write("                                            <textarea rows=\"1\" cols=\"10\"  class=\"inp-text\" id=\"address\"name=\"address\"></textarea> <br/></P>\n");
      out.write("\n");
      out.write("                                        <p><label for=\"input-three\" class=\"float\"><strong>VAT Number:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"vatNumber\" id=\"vat\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                        <p><label for=\"input-four\" class=\"float\"><strong>SVAT Number:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"svatNumber\" id=\"svat\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                        <p><label for=\"input-five\" class=\"float\"><strong>TQB Number:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"tqbNumber\" id=\"tqb\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                        <p><label for=\"input-six\" class=\"float\"><strong>Telephone:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"telephone\" id=\"tel\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                        <p><label for=\"input-seven\" class=\"float\"><strong>Fax:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"fax\" id=\"fax\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                        <p><label for=\"input-eight\" class=\"float\"><strong>Owner:</strong></label>\n");
      out.write("                                            <input class=\"inp-text\" name=\"owner\" id=\"own\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                        <p style=\"padding-left:300px;\"><input class=\"submit-button\" type=\"submit\" alt=\"SUBMIT\" name=\"Submit\" value=\"Submit\"/>\n");
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li style=\"padding-left:50px;\">\n");
      out.write("\n");
      out.write("                            <form action=\"\" >\n");
      out.write("\n");
      out.write("                                <fieldset style=\"height:500px;width:600px;\">\n");
      out.write("                                    <legend>Update Customer</legend>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-one\" class=\"float\" ><strong>Select:</strong></label>\n");
      out.write("                                    <form action=\"\">\n");
      out.write("                                        <select name=\"menu\" style=\"width:310px;\">\n");
      out.write("                                            <option value=\"0\" selected>Select Customer</option>\n");
      out.write("                                            <option value=\"1\">one</option>\n");
      out.write("                                            <option value=\"2\">two</option>\n");
      out.write("                                            <option value=\"3\">three</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </form>\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-one\" class=\"float\" style=\"padding-top:10px;\"><strong>Name:</strong></label><br/>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-name\" id=\"name\" type=\"text\" size=\"30\"/></br></p>\n");
      out.write("\n");
      out.write("                                    <P><label for=\"input-two\" class=\"float\"  style=\"padding-top:10px;\"><strong>Address:</strong></label><br />\n");
      out.write("                                        <textarea rows=\"1\" cols=\"10\"  class=\"inp-text\" id=\"address\"name=\"input-address\"></textarea> <br/></P>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-three\" class=\"float\"><strong>VAT Number:</strong></label>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-vat\" id=\"vat\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-four\" class=\"float\"><strong>SVAT Number:</strong></label>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-svat\" id=\"svat\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-five\" class=\"float\"><strong>TQB Number:</strong></label>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-tqb\" id=\"tqb\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-six\" class=\"float\"><strong>Telephone:</strong></label>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-tel\" id=\"tel\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-seven\" class=\"float\"><strong>Fax:</strong></label>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-fax\" id=\"fax\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"input-eight\" class=\"float\"><strong>Owner:</strong></label>\n");
      out.write("                                        <input class=\"inp-text\" name=\"input-own\" id=\"own\" type=\"text\" size=\"30\"/></p>\n");
      out.write("\n");
      out.write("                                    <p style=\"padding-left:300px;\"><input class=\"submit-button\" type=\"submit\" alt=\"SUBMIT\" name=\"Submit\" value=\"Update\" />\n");
      out.write("\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <div style=\"padding-top:600px;padding-left:290px;\">\n");
      out.write("                        <fieldset style=\"height:35px;width:600px;\">\n");
      out.write("                            <a href=\"customer_order.jsp\" ><h2>click here to Enter Place order</h2></a>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <table width=\"100%\" height=\"100\" border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
