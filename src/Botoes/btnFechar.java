/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Andre
 */
public class btnFechar extends JButton implements iCommand {

    private Mediator med;

    public btnFechar(ActionListener act, Mediator med) {
        this.addActionListener(act);
        this.med = med;
        med.RegistraFechar(this);
        setText("Fecha Comunicação");
        setPreferredSize(new Dimension(280, 45));
        setMinimumSize(new Dimension(5, 15));
        Font font = new Font("Verdana",Font.BOLD,14);
        setFont(font);
        setEnabled(false);

    }

    @Override
    public void execute() {
        med.getControlArduino().enviaDados("f".getBytes());
        med.getControlArduino().close();
        System.exit(0);
    }
}
