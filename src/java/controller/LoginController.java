/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Interface.ilogin;
import dao.LoginDAO;
import hibernatemodels.User;
import models.UserLoc;
import java.lang.NullPointerException;

/**
 *
 * @author a
 */
public class LoginController implements ilogin {
    
    LoginController(){
    
    }

    @Override
    public User fetchUser(String ur) throws java.lang.NullPointerException {
        
        LoginDAO loginDAO = new LoginDAO();
        User fetcheduser = new User();
        
        fetcheduser = loginDAO.fetchUserDAO(ur);
        if(!fetcheduser.getUsername().equals("antochas")){
             java.lang.NullPointerException ex = new java.lang.NullPointerException();
             throw ex;
        }
        return fetcheduser;
    }
    

    @Override
    public boolean validateUser(String passdb, String passgiven) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchUserTeams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchUserNewMessages() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
