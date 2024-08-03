/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author ksalo
 */
public class GerenteControlador implements ActionListener {
 private MenuGerente menG;
     private Gestiones formGes;
    private Informes formInf;
    private Inventario formInv;
    private PreCalificacion formPre;
    private Clientes formCli;
    private Reportes formRep;   
    private Ayuda formAyu;
    private Ajustes formAju;
    
    public GerenteControlador(MenuGerente menG, Inventario formInv, PreCalificacion formPre, Clientes formCli, Reportes formRep, Gestiones formGes, Informes formInf, Ayuda formAyu, Ajustes formAju){
    this.menG = menG;
        this.formInv = formInv;
        this.formPre = formPre;
        this.formCli = formCli;
        this.formRep = formRep;
       this.formGes = formGes;
       this.formInf = formInf;
        this.formAyu = formAyu;
        this.formAju = formAju;
        
        this.menG.botInventario.addActionListener(this);
        this.menG.botPreCali.addActionListener(this);
        this.menG.botClientes.addActionListener(this);
        this.menG.botReportes.addActionListener(this);
        this.menG.botGestiones.addActionListener(this);
        this.menG.botInformes.addActionListener(this);
        this.menG.botAyuda.addActionListener(this);
        this.menG.botAjustes.addActionListener(this);
        
        
    }
    public void iniciar() {
        menG.setLocationRelativeTo(null);
        
        formInv.setLocationRelativeTo(null);
        formPre.setLocationRelativeTo(null);
        formCli.setLocationRelativeTo(null);
        formRep.setLocationRelativeTo(null);
        formGes.setLocationRelativeTo(null);
        formInf.setLocationRelativeTo(null);
        formAyu.setLocationRelativeTo(null);
        formAju.setLocationRelativeTo(null);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == menG.botInventario) {
            formInv.setVisible(true);
        }
        if (e.getSource() == menG.botPreCali) {
            formPre.setVisible(true);
        }
        if (e.getSource() == menG.botClientes) {
            formCli.setVisible(true);
        }
        if (e.getSource() == menG.botReportes) {
            formRep.setVisible(true);
        }
        if (e.getSource() == menG.botGestiones) {
            formGes.setVisible(true);
        }
        if (e.getSource() == menG.botInformes) {
            formInf.setVisible(true);
        }
        if (e.getSource() == menG.botAyuda) {
            formAyu.setVisible(true);
        }
        if (e.getSource() == menG.botAjustes) {
            formAju.setVisible(true);
        }
    
        
        
    }
    }
    

