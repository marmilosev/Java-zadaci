/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.mmilosevic_kol2.controller;

import ffos.mmilosevic_kol2.model.Sport;
import java.util.List;

/**
 *
 * @author Marija
 */
public class ObradaSport extends Obrada<Sport>{
    
    public void setPodaci(String naziv, String opis){
        if(entitet == null){
            entitet = new Sport();
        }
        entitet.setNaziv(naziv);
        entitet.setOpis(opis);
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
    public List<Sport> read() {
        return session.createQuery("from Sport").list();
    }

    @Override
    public void setNew() {
        entitet = new Sport();
    }
    
    
}
