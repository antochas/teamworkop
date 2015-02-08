/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controller.UrlController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a
 */
@WebServlet(name = "Login", urlPatterns = {"/login", "/register","/search","/forum"})
public class LittleMonstreusServlet extends HttpServlet {





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
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
//        if(request.getServletPath().equals("/login"))
//         out.print("test");
        String URL = request.getServletPath();//Stores
        UrlController mainController = new UrlController(URL, request);
        RequestDispatcher rd = request.getRequestDispatcher(mainController.mainControllerMethod());
        mainController = null;
        rd.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return This is a little monster servlet, which receives all actions, stores request and request path(action) then calls a controller which in turn performs neccessary actions.
     */
    @Override
    public String getServletInfo() {
        return "This is a little monster servlet, which receives all"
                + "actions, stores request and request path(action)"
                + "then calls a controller which in turn performs neccessary actions.";
    }// </editor-fold>

}
