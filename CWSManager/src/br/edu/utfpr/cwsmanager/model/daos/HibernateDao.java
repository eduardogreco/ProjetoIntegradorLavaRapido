/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author RAFAEL
 */
public class HibernateDao implements Dao<Object> {

    public void persit(Object o) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/cwsmanager");
        cfg.setProperty("hibernate.connection.user", "cwsmanager");
        cfg.setProperty("hibernate.connection.password", "");


        cfg.addAnnotatedClass(Funcionario.class);

        Session session = sessionFactory.openSession();

        session.beginTransaction().begin();
        session.persist(o);
        session.beginTransaction().commit();

        session.flush();
        session.close();
        sessionFactory.close();

    }

    @Override
    public void delete(Object o) throws Exception {
        EntityManager em = HibernateFactory.getEntityManager();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Object o, Connection con) throws Exception {
        
    }

    @Override
    public Object retrieve(int id) throws Exception {
    
    }

    @Override
    public List<Object> list(String whereClause, String orderClause) throws Exception {
      
    }

    @Override
    public List<Object> list(Filter... filters) throws Exception {
        
    }
}
