/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Marija
 */
public abstract class Obrada<T> {
    protected T entitet;
    protected Session session;
    public abstract void kontrolaCreate() throws Exception;
    public abstract void kontrolaUpdate() throws Exception;
    public abstract void kontrolaDelete() throws Exception;
    public abstract List<T> read();
    public abstract void setNew();

    public Obrada() {
        session = HibernateUtil.getSession();
    }
    
    public void create() throws Exception{
        kontrolaCreate();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    public void update() throws Exception{
        kontrolaUpdate();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    public void delete() throws Exception{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();        
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
    
}
