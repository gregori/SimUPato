/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simupato;

import simupato.patos.Pato;
import simupato.patos.PatoModelo;
import simupato.patos.PatoSelvagem;
import simupato.voo.VoarComFoguete;

/**
 *
 * @author rodrigo
 */
public class SimUPato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pato selvagem = new PatoSelvagem();
        selvagem.emitirGrasnado();
        selvagem.executarVoo();
        
        Pato modelo = new PatoModelo();
        modelo.executarVoo();
        modelo.setComportamentoDeVoo(new VoarComFoguete());
        modelo.executarVoo();
    }
    
}
