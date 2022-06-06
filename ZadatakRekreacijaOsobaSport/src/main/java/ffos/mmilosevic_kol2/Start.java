/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.mmilosevic_kol2;

import ffos.mmilosevic_kol2.utility.HibernateUtil;
import ffos.mmilosevic_kol2.view.Izbornik;


/**
 *
 * @author Korisnik
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        new Izbornik().setVisible(true);
    }
    
}
