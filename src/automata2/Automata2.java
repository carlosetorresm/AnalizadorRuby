/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata2;
import javax.swing.UIManager;
/**
 *
 * @author Carlos
 */
public class Automata2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Interfaz frm = new Interfaz();
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
//De aqui vamos a Interfaz en el paquete interfaz
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

}
