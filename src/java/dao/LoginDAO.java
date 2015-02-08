/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernateUtil.HibernateUtil;
import hibernatemodels.User;
import iDAO.iLoginDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author a
 */
public class LoginDAO implements iLoginDAO{

    public LoginDAO() {
    }

    @Override
    public User fetchUserDAO(String uname) {
        User ur = new User();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        ur = (User) session.createQuery("from User as user where user.username = '"+uname+"'").uniqueResult();
        tx.commit();
        session.close();
        return ur;
    }

    @Override
    public void fetchUserTeamsDAO(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fetchUserNewMessagesDAO(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
