/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.mmilosevic_kol2.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marija
 */
@Entity
public class Rekreacija extends Entitet{
    
    private String naziv;
    @ManyToOne
    private Sport sport;
    @ManyToMany
    private List<Osoba> osobe;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public List<Osoba> getOsobe() {
        return osobe;
    }

    public void setOsobe(List<Osoba> osobe) {
        this.osobe = osobe;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
