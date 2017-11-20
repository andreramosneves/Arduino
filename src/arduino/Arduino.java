/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduino;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Andre
 */
public class Arduino {
    
    private static frmArduino frmArduino;
    
    public static void main(String[] args) {
        frmArduino = new frmArduino();
        frmArduino.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmArduino.setBounds(600, 200, 290, 400);
        frmArduino.setResizable(false);
        frmArduino.setVisible(true);
        frmArduino.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);// desabilita o botao fechar
 
            //Windows - porta e taxa de transmissão
        //arduino = new ControlePorta("/dev/ttyUSB0",9600);//Linux - porta e taxa de transmissão
    }
    
}
