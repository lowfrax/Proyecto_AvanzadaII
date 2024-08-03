/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ajustes;
import Vista.Ayuda;
import Vista.Clientes;
import Vista.Gestiones;
import Vista.Informes;
import Vista.Inventario;
import Vista.MenuGerente;
import Vista.MenuVendedor;
import Vista.PreCalificacion;
import Vista.Reportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class VendedorControlador implements ActionListener{
   
    private MenuVendedor menV;
    private Inventario formInv;
    private PreCalificacion formPre;
    private Clientes formCli;
    private Reportes formRep;   
    private Ayuda formAyu;
    private Ajustes formAju;

    public VendedorControlador( MenuVendedor menV, Inventario formInv, PreCalificacion formPre, Clientes formCli, Reportes formRep,  Ayuda formAyu, Ajustes formAju) {
      
        this.menV = menV;
        this.formInv = formInv;
        this.formPre = formPre;
        this.formCli = formCli;
        this.formRep = formRep;
       // this.formGes = formGes;
       // this.formInf = formInf;
        this.formAyu = formAyu;
        this.formAju = formAju;
        
        
        this.menV.botInventario.addActionListener(this);
        this.menV.botPreCali.addActionListener(this);
        this.menV.botClientes.addActionListener(this);
        this.menV.botReportes.addActionListener(this);
        this.menV.botAyuda.addActionListener(this);
        this.menV.botAjustes.addActionListener(this);
    }
    
    public void iniciar() {
        
        menV.setLocationRelativeTo(null);
        formInv.setLocationRelativeTo(null);
        formPre.setLocationRelativeTo(null);
        formCli.setLocationRelativeTo(null);
        formRep.setLocationRelativeTo(null);
    
        formAyu.setLocationRelativeTo(null);
        formAju.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    
        
        
        if (e.getSource() == menV.botInventario) {
            formInv.setVisible(true);
        }
        if (e.getSource() == menV.botPreCali) {
            formPre.setVisible(true);
        }
        if (e.getSource() == menV.botClientes) {
            formCli.setVisible(true);
        }
        if (e.getSource() == menV.botReportes) {
            formRep.setVisible(true);
        }
        if (e.getSource() == menV.botAyuda) {
            formAyu.setVisible(true);
        }
        if (e.getSource() == menV.botAjustes) {
            formAju.setVisible(true);
        }
    }
    
}
