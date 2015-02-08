/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import hibernatemodels.User;

/**
 *
 * @author a
 */
public interface ilogin {
    public User fetchUser(String ur);
    public boolean validateUser(String passdb, String passgiven);
    public void fetchUserTeams();
    public void fetchUserNewMessages();
}
