/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author EduardoGreco
 */
public class DaoGenerics<T> implements Dao<T> {

    Session session = null;
    Class classe = null;


    public DaoGenerics(Class classe) {
        this.classe = classe;
    }

    public Class getClasse() {
        return this.classe;
    }

    @Override
    public void persist(T o) throws Exception {
        session = TransactionManager.getCurrentSession();
        session.saveOrUpdate(o);
    }

    @Override
    public void delete(T o) throws Exception {
        session = TransactionManager.getCurrentSession();
        session.delete(o);
    }

    @Override
    public T retrieve(int id) throws Exception {
        T objeto = null;
        if (id > 0) {
            session = TransactionManager.getCurrentSession();
            Query select = session.createQuery("From " + classe.getSimpleName() + " where id = " + id);
            objeto = (T) select.uniqueResult();
        }
        return objeto;
    }

    @Override
    public List<T> list() throws Exception {
        session = TransactionManager.getCurrentSession();
        List<T> lista = session.createQuery("FROM " + classe.getSimpleName()).list();
        return lista;
    }

    @Override
    public List<T> list(Filter... filters) throws Exception {
        return list();
    }
}
