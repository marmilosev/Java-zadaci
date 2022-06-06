/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.model;

import javax.persistence.Entity;

/**
 *
 * @author Marija
 */
@Entity
public class Racunalo extends Entitet{
    
    private String vrsta;
    private String proizvodac;

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    @Override
    public String toString() {
        return vrsta;
    }
    
    
    
    
    
}
