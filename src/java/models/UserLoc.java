/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author a
 */
public class UserLoc {
    private String uname;
    private String pass;

    public UserLoc() {
        this.uname = "John";
        this.pass = "Doh";
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public UserLoc(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }
    
}
