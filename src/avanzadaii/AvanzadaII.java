/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzadaii;

import Controlador.controladorInventario;
import Controlador.principalControlador;
import Modelo.ConsultaInventario;
import Modelo.ConsultasBD;
import Modelo.inventarioPOO;
import Vista.Gestiones;
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

        /* MenuGerente mGer = new MenuGerente();
        MenuVendedor mVen = new MenuVendedor();

        inventarioPOO invPOO = new inventarioPOO();

        Gestiones ges = new Gestiones(mVen, true, "JIMO");

        ConsultaInventario conInventario = new ConsultaInventario();

        controladorInventario cont = new controladorInventario(invPOO, ges, conInventario, mVen);*/
        form.setVisible(true);
        //form.setLocationRelativeTo(null);

    }

    public void accesoGerente(String user) {
       // MenuVendedor mVen = new MenuVendedor(user);
        MenuGerente mGen = new MenuGerente();
        inventarioPOO invPOO = new inventarioPOO();
        
        Gestiones ges = new Gestiones(mGen, true, user);

        ConsultaInventario conInventario = new ConsultaInventario();

        controladorInventario contInv = new controladorInventario(invPOO, ges, conInventario, mGen);
        
        principalControlador prinVen = new principalControlador(mGen, ges);

        prinVen.iniciar();
        mGen.setVisible(true);
       

    }

    public void accesoVendedor(String user) {
        
        MenuVendedor mVen = new MenuVendedor(user);
         MenuGerente mGen = new MenuGerente();
        Gestiones ges = new Gestiones(mVen, true, user);

         principalControlador prinVen = new principalControlador(mGen, ges);
          prinVen.iniciar();
        mVen.setVisible(true);

    }

}
