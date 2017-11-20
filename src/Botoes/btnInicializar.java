/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import arduino.ControlePorta;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Andre
 */
public class btnInicializar extends JButton implements iCommand {

    private Mediator med;
    private ControlePorta ControlPort;
    private static final int taxa = 9600;
    
    public ControlePorta getControlArduino(){
        return ControlPort;
    }

    public btnInicializar(ActionListener act, Mediator med) {
        this.addActionListener(act);
        this.med = med;
        med.RegistraInicializar(this);
        setText("Inicializa comunicação.");
        setPreferredSize(new Dimension(280, 45));
        Font font = new Font("Verdana",Font.BOLD,14);
        setFont(font);
        setMinimumSize(new Dimension(5, 15));

    }

    @Override
    public void execute() {
        ControlPort = new ControlePorta("COM4", taxa);
    }

}
