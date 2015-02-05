/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author a
 */
public class UrlController {
    private String URL;
    private HttpServletRequest req;
    public UrlController(String URL, HttpServletRequest req){
    
        this.URL = URL;
        this.req = req;
        
    }
    
    public String mainControllerMethod(){
    
    
    //return "/Pages/Login/Login.jsp";
        return "/index.html";
    } 
    
}
