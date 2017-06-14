/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simupato.patos;

import simupato.interfaces.ComportamentoDeGrasnado;
import simupato.interfaces.ComportamentoDeVoo;

/**
 *
 * @author rodrigo
 */
public abstract class Pato {
    
    // protected por padrão
    ComportamentoDeVoo comportamentoDeVoo;
    ComportamentoDeGrasnado comportamentoDeGrasnado;
    
    public Pato() { }
    
    public abstract void display();
    
    public void executarVoo() {
        comportamentoDeVoo.voar();
    }
    
    public void emitirGrasnado() {
        comportamentoDeGrasnado.grasnar();
    }
    
    public void nadar() {
        System.out.println("Todos os patos nadam, mesmo os falsos, de madeira!");
    }
    
    public void setComportamentoDeVoo(ComportamentoDeVoo cv) {
        comportamentoDeVoo = cv;
    }
    
    public void setComportamentoDeGrasnado(ComportamentoDeGrasnado cg) {
        comportamentoDeGrasnado = cg;
    }
}
