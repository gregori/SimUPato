/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simupato.grasnado;

import simupato.interfaces.ComportamentoDeGrasnado;

/**
 *
 * @author rodrigo
 */
public class Squeack implements ComportamentoDeGrasnado {

    @Override
    public void grasnar() {
        System.out.println("Squeack!");
    }
    
}
