/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzadaii;

import Controlador.UsuarioControlador;
import Modelo.ConsulU;
import Modelo.UsuarioPOO;
import Vista.Login;
import Vista.MenuGerente;
import Vista.MenuVendedor;
import Vista.Usuario;

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
        
        Usuario vista = new Usuario();
        UsuarioPOO usuario = new UsuarioPOO();
        ConsulU consulU = new ConsulU();
        UsuarioControlador controlador = new UsuarioControlador(usuario, vista, consulU);
        
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    
    }
    
}
