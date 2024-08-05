/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzadaii;

import Controlador.GerenteControlador;
import Controlador.VendedorControlador;
import Controlador.controladorInventario;
import Controlador.principalControlador;
import Modelo.ConsultaInventario;
import Modelo.ConsultasBD;
import Modelo.inventarioPOO;
import Vista.Ajustes;
import Vista.Ayuda;
import Vista.Clientes;
import Vista.Gestiones;
import Vista.Informes;
import Vista.Inventario;
import Vista.Login;
import Vista.MenuGerente;
import Vista.MenuVendedor;
import Vista.PreCalificacion;
import Vista.Reportes;

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
        
        //desde aqui
        Inventario Inv = new Inventario(mGen, true);
        PreCalificacion Pre = new PreCalificacion(mGen, true);
        Clientes Cli = new Clientes(mGen, true);
        Reportes Rep = new Reportes(mGen, true);
        Gestiones Ges = new Gestiones(mGen, true,user);
        Informes Inf = new Informes(mGen, true);
        Ayuda Ayu = new Ayuda(mGen, true);
        Ajustes Aju = new Ajustes(mGen, true);
        
        GerenteControlador conGen = new GerenteControlador(mGen,Inv,Pre,Cli,Rep,Ges,Inf,Ayu,Aju);
        
        
        principalControlador prinVen = new principalControlador(mGen, ges);

        prinVen.iniciar();
        mGen.setVisible(true);
       

    }

    public void accesoVendedor(String user) {
        
        MenuVendedor mVen = new MenuVendedor(user);
         MenuGerente mGen = new MenuGerente();
        Gestiones ges = new Gestiones(mVen, true, user);
        
        //desde aqui
        Inventario Inv = new Inventario(mGen, true);
        PreCalificacion Pre = new PreCalificacion(mGen, true);
        Clientes Cli = new Clientes(mGen, true);
        Reportes Rep = new Reportes(mGen, true);
        Gestiones Ges = new Gestiones(mGen, true,user);
        //Informes Inf = new Informes(mGen, true);
        Ayuda Ayu = new Ayuda(mGen, true);
        Ajustes Aju = new Ajustes(mGen, true);

        ConsultasBD con = new ConsultasBD();
        
        VendedorControlador conVen = new VendedorControlador(mVen, Inv, Pre, Cli, Rep, Ayu, Aju);
        

         principalControlador prinVen = new principalControlador(mGen, ges);
          prinVen.iniciar();
        mVen.setVisible(true);

    }

}
