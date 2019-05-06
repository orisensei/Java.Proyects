
package ans;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "second", urlPatterns = {"/second"})
public class second extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
            float numero1=Float.parseFloat(request.getParameter("timerl"));
            float numero2=Float.parseFloat(request.getParameter("timer2"));
            String op=request.getParameter("operador");
            
            if(op.equals("+"))
            {
                out.println("la suma es:"+(numero1+numero2));
            }
              if(op.equals("-"))
            {
                out.println("la resta es:"+(numero1-numero2));
            }
                if(op.equals("*"))
            {
                out.println("la multiplicación es:"+(numero1*numero2));
            }
                  if(op.equals("/"))
            {
                out.println("la división es:"+(numero1/numero2));
            }
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
