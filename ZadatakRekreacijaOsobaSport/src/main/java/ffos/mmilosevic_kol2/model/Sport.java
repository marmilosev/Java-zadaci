/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.mmilosevic_kol2.model;

import javax.persistence.Entity;

/**
 *
 * @author Marija
 */
@Entity
public class Sport extends Entitet{
    
    private String naziv;
    private String opis;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
    
}
