/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Gestiones;
import Vista.MenuGerente;
import Vista.MenuVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author josue
 */
public class principalControlador implements ActionListener {

    private MenuGerente PrincipalGerente;
    private Gestiones formGestiones;

    public principalControlador(MenuGerente PrincipalGerente, Gestiones formGestiones) {
        this.PrincipalGerente = PrincipalGerente;
        this.formGestiones = formGestiones;

        this.PrincipalGerente.btn_gestiones.addActionListener(this);
    }

    public void iniciar() {

        PrincipalGerente.setLocationRelativeTo(null);
        formGestiones.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == PrincipalGerente.btn_gestiones) {
            formGestiones.setVisible(true);
            // prin.dispose();
        }
    }

}
