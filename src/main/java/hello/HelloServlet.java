/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

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
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
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
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String msg = "";
        
        String custom = request.getParameter("custom");
        
        
        Date agora = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("H");
        String horaString = sdf.format(agora);
        int horaInt = Integer.parseInt(horaString);
        
        if (custom == null || custom.equals("")) {
            if (horaInt <12) {
                String lang = request.getParameter("lang");
                if(lang==null)
                    lang = "pt";
                switch(lang){
                    case "pt":
                        msg = "Bom dia, ";
                        break;
                    case "en":
                        msg = "Good morning, ";
                        break;
                    case "fr":
                        msg = "Bonjour, ";
                        break;
                    case "de":
                        msg = "Guten morgan, ";
                        break;
                    case "es":
                        msg = "Buenos días, ";
                        break;    
                    case "ie":
                        msg = "Maidin mhaith, ";
                        break;        
                }
            }
            
            if (horaInt >=12 && horaInt < 18) {
                String lang = request.getParameter("lang");
                if(lang==null)
                    lang = "pt";
                switch(lang){
                    case "pt":
                        msg = "Boa tarde, ";
                        break;
                    case "en":
                        msg = "Good afternoon, ";
                        break;
                    case "fr":
                        msg = "Bon après-midi, ";
                        break;
                    case "de":
                        msg = "Guten tag, ";
                        break;
                    case "es":
                        msg = "Buenas tardes, ";
                        break;    
                    case "ie":
                        msg = "Tráthnóna maith, ";
                        break;        
                }
            }
            
            if (horaInt >= 18) {
                String lang = request.getParameter("lang");
                if(lang==null)
                    lang = "pt";
                switch(lang){
                    case "pt":
                        msg = "Boa noite, ";
                        break;
                    case "en":
                        msg = "Good night, ";
                        break;
                    case "fr":
                        msg = "bonne nuit, ";
                        break;
                    case "de":
                        msg = "Gute Nacht, ";
                        break;
                    case "es":
                        msg = "Buenas noches, ";
                        break;    
                    case "ie":
                        msg = "Oíche mhaith, ";
                        break;        
                }
            }
        } else {
        	msg = custom + ", ";
        }
        

        

        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
