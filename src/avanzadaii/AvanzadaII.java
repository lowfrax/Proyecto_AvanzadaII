/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzadaii;

import Vista.Login;
import Vista.MenuGerente;
import Vista.MenuVendedor;

/**
 *
 * @author ksalo
 */
public class AvanzadaII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login form = new Login();
        
        MenuGerente mGer = new MenuGerente();
        
        MenuVendedor mVen = new MenuVendedor();
        
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    
    }
    
}
