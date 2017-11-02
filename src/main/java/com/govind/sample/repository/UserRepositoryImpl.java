/*
package com.govind.sample.repository;

import com.govind.sample.payload.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

*/
/**
 * Created by 609600403 on 13/03/2016.
 *//*

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Override
    public User getUser(int userId) {
        User user = null;
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            user  =
                    (User) session.get(User.class, userId);


        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return user;
    }
}
*/
