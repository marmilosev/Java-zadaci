/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Korisnik
 */
// singleton
public class HibernateUtil {
    private static Session session;
    public static Session getSession() {
        if (session == null) {
            try {
                // Create registry
                StandardServiceRegistry registry  = new StandardServiceRegistryBuilder().configure().build();
                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();
                // Create SessionFactory
                SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                session=sessionFactory.openSession();
            } catch (Exception e) {
                e.printStackTrace();
              
            }
        }
        return session;
    }
   
}
