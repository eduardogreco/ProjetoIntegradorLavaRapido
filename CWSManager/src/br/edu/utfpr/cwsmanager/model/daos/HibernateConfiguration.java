/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.daos;

import br.edu.utfpr.cwsmanager.model.endereco.Cidade;
import br.edu.utfpr.cwsmanager.model.endereco.Endereco;
import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;
import br.edu.utfpr.cwsmanager.model.veiculo.Veiculo;
import java.sql.Connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author EduardoGreco
 */
public class HibernateConfiguration {
    
    private static AnnotationConfiguration cfg = null;
    private static SessionFactory factory = null;
    
    public static SessionFactory getSessionFactory() {
        if (cfg == null) {
            cfg = new AnnotationConfiguration();
            cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            cfg.setProperty("hibernate.connection.username", "root");
            cfg.setProperty("hibernate.connection.password", "");
            cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/projetointegrador");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
            cfg.setProperty("hibernate.connection.autocommit", "true");
            cfg.addAnnotatedClass(Cliente.class); // classes para serem mapeadas
            cfg.addAnnotatedClass(Endereco.class); // classes para serem mapeadas
            cfg.addAnnotatedClass(Cidade.class); // classes para serem mapeadas
            cfg.addAnnotatedClass(Veiculo.class); // classes para serem mapeadas

            factory = cfg.buildSessionFactory();// construindo uma fabrica de sessão

        }

        return factory;
    }
    //podemos setar o autocomit como true e nao precisa usar begin tansaction

    public static void createSchema() {
        getSessionFactory().close();
        org.hibernate.tool.hbm2ddl.SchemaExport schemaEx = new SchemaExport(cfg);
        schemaEx.create(true, true);
    }

    public static Connection getConnection() {
        Session session = TransactionManager.getCurrentSession();
        return session.connection();
    }
    
}
