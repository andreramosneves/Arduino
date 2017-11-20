/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import arduino.ControlePorta;

/**
 *
 * @author Andre
 */
public class Mediator {
    
    private btnAmarelo btnAmarelo;
    private btnVerde btnVerde;
    private btnVermelho btnVermelho;
    private btnInicializar btnInicializa;
    private btnFechar btnFecha;
    
    
    public ControlePorta getControlArduino() {
       return btnInicializa.getControlArduino();
    }
    public void RegistraAmarelo(btnAmarelo btnAmarelo){
        this.btnAmarelo = btnAmarelo;
    }
    public void RegistraVermelho(btnVermelho btnVermelho){
        this.btnVermelho = btnVermelho;
    }
    public void RegistraVerde(btnVerde btnVerde){
        this.btnVerde = btnVerde;
    }
    public void RegistraFechar(btnFechar btnFechar){
        this.btnFecha = btnFechar;
    }
    public void RegistraInicializar(btnInicializar btnInicializa){
        this.btnInicializa = btnInicializa;
    }

    public void rotina() {
        btnInicializa.setEnabled(false);
        btnAmarelo.setEnabled(! btnInicializa.isEnabled());
        btnVermelho.setEnabled(! btnInicializa.isEnabled());
        btnVerde.setEnabled(! btnInicializa.isEnabled());
        btnFecha.setEnabled(! btnInicializa.isEnabled());        
    }
}
