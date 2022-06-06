/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.mmilosevic_kol2.controller;

import ffos.mmilosevic_kol2.model.Osoba;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Marija
 */
public class ObradaOsoba extends Obrada<Osoba>{
    
    public void setPodaci(String datumRodenja, String ime, String prezime){
        
        if(entitet == null){
            Osoba o = new Osoba();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try {
                o.setIme(ime);
                o.setPrezime(prezime);
                o.setDatumRodenja(sdf.parse(datumRodenja));
            } catch (Exception e) {
            }
        }else{
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            try {
                entitet.setIme(ime);
                entitet.setPrezime(prezime);
                entitet.setDatumRodenja(df.parse(datumRodenja));
            } catch (Exception e) {
            }
        }
        
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
    public List<Osoba> read() {
        return session.createQuery("from Osoba").list();
    }

    @Override
    public void setNew() {
        entitet = new Osoba();
    }
    
    
    
}
