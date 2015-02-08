/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iDAO;

import hibernatemodels.User;

/**
 *
 * @author a
 */
public interface iLoginDAO {
    public User fetchUserDAO(String uname);
    public void fetchUserTeamsDAO(int id);
    public void fetchUserNewMessagesDAO(int id);
}
