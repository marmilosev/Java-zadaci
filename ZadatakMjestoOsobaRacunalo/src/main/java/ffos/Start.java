/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import ffos.utility.HibernateUtil;
import ffos.view.Izbornik;


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
