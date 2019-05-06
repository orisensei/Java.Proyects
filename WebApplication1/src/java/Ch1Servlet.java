/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hugo
 */
@WebServlet(urlPatterns = {"/Ch1Servlet"})
public class Ch1Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ch1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ch1Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        java.util.Date today = new java.util.Date();
        out.println("<html> "+
                "<body>"+
                "<div id = colores>"+"<h1>Servlet time is " +
                  today + "</h1>"+"</div>"+"<br>"+
                "<form>"+"<b>Color de la fuente: </b>"
                +"<select id=\"colores\" onchange= \"changecolor(container,value)\">\n" +
"\n" +
"<option value = \"blue\" >Azul</option>\n" +
"\n" +
"<option>Rojo</option>\n" +
"\n" +
"<option>Verde</option>\n" +
"\n" +
"</select>"+"</h1>"+"<br>"+"<b>Color del fondo:</b>"+
                "<select name=\"colores2\">\n" +
"\n" +
"<option value = 1>Azul</option>\n" +
"\n" +
"<option value = 2>Rojo</option>\n" +
"\n" +
"<option value = 3>Verde</option>\n" +
"\n" +
"</select>"+"<br>"+"<button type=button onclick= changecolor(id,color)>Cambiar</button>"+"</form>"+"<script>function changecolor(id,color) {\n" +
"  id.style.backgroundColor=color;\n" +
"}</script>"+"<div id=\"container\">"+"</container>"+"</body>" + "</html>");
        
        
        
        
      //  processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
