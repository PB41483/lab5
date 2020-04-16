/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labv4;

/**
 *
 * @author pb41483
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "licznik", urlPatterns = {"/hello"})
public class licznik extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            HttpSession session = request.getSession();    
        
           int a = 1;
           
        if (session.getAttribute("licznik") == null) {
            a = 1;
        } 
        else {
            a = (Integer) session.getAttribute("licznik");
            a++;
        }
        session.setAttribute("licznik", a);
        
       
           request.getRequestDispatcher("hello.jsp").forward(request, response);
        
    }
}
