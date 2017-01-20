
package java_0502;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0502 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cep = JOptionPane.showInputDialog(null, "Informe seu CEP com hifén: ");
        
        JOptionPane.showMessageDialog(null, cep.replaceAll("-", ""));
    }
    
}
