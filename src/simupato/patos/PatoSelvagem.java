/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simupato.patos;

import simupato.grasnado.Grasnar;
import simupato.voo.VoarComAsas;

/**
 *
 * @author rodrigo
 */
public class PatoSelvagem extends Pato {

    public PatoSelvagem() {
        comportamentoDeGrasnado = new Grasnar();
        comportamentoDeVoo = new VoarComAsas();
    }
    @Override
    public void display() {
        System.out.println("Sou um verdadeiro pato selvagem!");
    }
    
}
