/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Interface.iactionHandler;
import hibernatemodels.User;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author a
 */
public class UrlController implements iactionHandler{
    private String URL;
    private HttpServletRequest req;
    public UrlController(String URL, HttpServletRequest req){
    
        this.URL = URL;
        this.req = req;
        
    }
    
    @Override
    public String mainControllerMethod(){
    
        switch (URL) {
            case "/login":
                LoginController lc = new LoginController();
                User ur;
                try{
                ur = lc.fetchUser(req.getParameter("uname"));
                req.getSession(true).setAttribute("test", ur);}
                catch(java.lang.NullPointerException ex){
                
                return "index.jsp";
                }
                
                return "Pages/testpage.jsp";
            case "/register":
                return "";
            case "/search":
                return "";
            case "/forum":
                return "";
            default:
                return "/index.jsp";
        }
        
    } 
    
}
