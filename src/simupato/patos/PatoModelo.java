/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simupato.patos;

import simupato.grasnado.Grasnar;
import simupato.voo.NaoVoar;

/**
 *
 * @author rodrigo
 */
public class PatoModelo extends Pato {

    public PatoModelo() {
        comportamentoDeGrasnado = new Grasnar();
        comportamentoDeVoo = new NaoVoar();
    }
    @Override
    public void display() {
        System.out.println("Sou um modelo de pato!");
    }
    
}
