/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simupato.voo;

import simupato.interfaces.ComportamentoDeVoo;

/**
 *
 * @author rodrigo
 */
public class VoarComAsas implements ComportamentoDeVoo {

    @Override
    public void voar() {
        System.out.println("Estou voando!");
    }
    
}
