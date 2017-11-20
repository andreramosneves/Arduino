/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduino;

import Botoes.Mediator;
import Botoes.btnAmarelo;
import Botoes.btnFechar;
import Botoes.btnInicializar;
import Botoes.btnVerde;
import Botoes.btnVermelho;
import Botoes.iCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

public class frmArduino extends JFrame implements ActionListener{
 
    private final Mediator mediador = new Mediator();
    public frmArduino() {
        setLayout(new MigLayout());
        add(new btnInicializar(this, mediador),"wrap");
        add(new btnAmarelo(this, mediador),"wrap");
        add(new btnVermelho(this, mediador),"wrap");
        add(new btnVerde(this, mediador),"wrap");
        add(new btnFechar(this, mediador),"wrap");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        iCommand cmd = (iCommand) e.getSource();
        cmd.execute();
        mediador.rotina();
    }
    

}
