/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.mmilosevic_kol2.controller;

import ffos.mmilosevic_kol2.model.Osoba;
import ffos.mmilosevic_kol2.model.Rekreacija;
import ffos.mmilosevic_kol2.model.Sport;
import java.util.List;

/**
 *
 * @author Marija
 */
public class ObradaRekreacija extends Obrada<Rekreacija>{
    
    public void setPodaci(String naziv, Sport sport, List<Osoba> osobe){
        if(entitet == null){
            entitet = new Rekreacija();
        }
        entitet.setNaziv(naziv);
        entitet.setSport(sport);
        entitet.setOsobe(osobe);
    }

    @Override
    public void kontrolaCreate() throws Exception {
        
    }

    @Override
    public void kontrolaUpdate() throws Exception {
        
    }

    @Override
    public void kontrolaDelete() throws Exception {
        
    }

    @Override
    public List<Rekreacija> read() {
        return session.createQuery("from Rekreacija").list();
    }

    @Override
    public void setNew() {
        entitet = new Rekreacija();
    }
    
    
}
