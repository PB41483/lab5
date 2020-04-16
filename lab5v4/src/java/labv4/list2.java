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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "list2", urlPatterns = {"/list"})
public class list2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<Student> lista;
       
        
        HttpSession session = request.getSession();
        
        

            if (session.getAttribute("Studenci") == null) {
                lista = new ArrayList<>();}
            else {
                lista = (List<Student>) session.getAttribute("Studenci");}
            
            if (request.getParameter("imie") != null) {
                
                String FirstName2 = request.getParameter("imie");
                String LastName2 = request.getParameter("nazwisko");
                String Email2 = request.getParameter("email");

                Student a1 = new Student(FirstName2, LastName2, Email2);
                
                if(FirstName2.length()!=0 && 
                   LastName2.length()!=0 && 
                   Email2.length()!=0){
                        lista.add(a1); }
                
                session.setAttribute("Studenci", lista);
            }
        
    
            request.getRequestDispatcher("list.jsp").forward(request, response);
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        processRequest(request, response);

        HttpSession session = request.getSession();
        List<Student> Studenci2;
                
        if (!(session.isNew())) {
            if (session.getAttribute("Studenci") == null) {
                Studenci2 = new ArrayList<>();
            }else {
                Studenci2 = (List<Student>) session.getAttribute("Studenci");
            }
            session.setAttribute("Studenci", Studenci2);
        }
            
       
            request.getRequestDispatcher("list.jsp").forward(request, response);
         
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
