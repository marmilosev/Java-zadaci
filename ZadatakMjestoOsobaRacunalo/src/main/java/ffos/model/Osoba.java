/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marija
 */
@Entity
public class Osoba extends Entitet{
    
    private String ime;
    private String prezime;
    @ManyToOne
    private Mjesto mjesto;
    @ManyToMany
    private List<Racunalo> racunala;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }

    public List<Racunalo> getRacunala() {
        return racunala;
    }

    public void setRacunala(List<Racunalo> racunala) {
        this.racunala = racunala;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
    
    
}
