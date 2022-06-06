/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Entitet;
import ffos.model.Racunalo;
import java.util.List;

/**
 *
 * @author Marija
 */
public class ObradaRacunalo extends Obrada<Racunalo>{
    
    public void setPodaci(String vrsta, String proizvodac){
        if(entitet == null){
            entitet = new Racunalo();
        }
        entitet.setVrsta(vrsta);
        entitet.setProizvodac(proizvodac);
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
    public List<Racunalo> read() {
        return session.createQuery("from Racunalo").list();
    }

    @Override
    public void setNew() {
        entitet = new Racunalo();
    }
    
}
