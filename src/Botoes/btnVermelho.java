/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Andre
 */
public class btnVermelho extends JButton implements iCommand {

    private Mediator med;

    public btnVermelho(ActionListener act, Mediator med) {
        this.addActionListener(act);
        this.med = med;
        med.RegistraVermelho(this);
        setText("Ligar LED Vermelha");
        Font font = new Font("Verdana", Font.BOLD, 14);
        setForeground(Color.RED);
        setFont(font);
        setEnabled(false);
        setPreferredSize(new Dimension(280, 45));
        setMinimumSize(new Dimension(5, 15));
    }

    @Override
    public void execute() {
        setText((getText().substring(0, 8).equalsIgnoreCase("Desligar")
                ? "Ligar" : "Desligar") + " LED Vermelha");
        med.getControlArduino().enviaDados("r".getBytes());
    }

}
