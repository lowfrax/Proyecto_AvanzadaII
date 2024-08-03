/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultaInventario;
import Modelo.inventarioPOO;
import Vista.Gestiones;
import Vista.MenuGerente;
import Vista.MenuVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class controladorInventario implements ActionListener {

    inventarioPOO inv;
    Gestiones form;
    ConsultaInventario conBD;
    MenuGerente menG;
    private Object datos[] = new Object[11];
    DefaultTableModel modelo;
    private String dirImagen;
    private String cambio = "no";

    public controladorInventario(inventarioPOO inv, Gestiones form, ConsultaInventario conBD, MenuGerente menG) {
        this.inv = inv;
        this.form = form;
        this.conBD = conBD;
        this.menG = menG;

        this.form.btn_agregar.addActionListener(this);
        this.form.btn_leer.addActionListener(this);
        this.form.btn_limpiar.addActionListener(this);
        this.form.btn_actualizar.addActionListener(this);
        this.form.btn_eliminar.addActionListener(this);
        this.form.btn_foto.addActionListener(this);
        this.form.btn_buscar.addActionListener(this);
    }

    public void llenarTabla() {
        modelo = (DefaultTableModel) form.tbl_inventario.getModel();
        int numRegistros = conBD.leer_todos().size();
        for (int i = 0; i < numRegistros; i++) {
            datos[0] = conBD.leer_todos().get(i).getId();
            datos[1] = conBD.leer_todos().get(i).getAnio();
            datos[2] = conBD.leer_todos().get(i).getMarca();
            datos[3] = conBD.leer_todos().get(i).getModelo();
            datos[4] = conBD.leer_todos().get(i).getColor();

            datos[5] = conBD.leer_todos().get(i).getVin();
            datos[6] = conBD.leer_todos().get(i).getMillas();
            datos[7] = conBD.leer_todos().get(i).getMotor();
            datos[8] = conBD.leer_todos().get(i).getTransmision();
            datos[9] = conBD.leer_todos().get(i).getCapacidad();
            datos[10] = conBD.leer_todos().get(i).getPrecio();

            modelo.addRow(datos);
        }
        form.tbl_inventario.setModel(modelo);
    }

    public void limpiar() {
        form.txt_id.setText("0");
        form.txt_anio.setText(null);
        form.txt_marca.setText(null);
        form.txt_modelo.setText(null);
        form.txt_color.requestFocus();
        form.txt_vin.setText(null);
        form.txt_millas.setText("0");
        form.txt_motor.setText(null);
        form.txt_transmision.setText(null);
        form.txt_capacidad.setText(null);
        form.txt_precio.requestFocus();
        //form.lbl_foto.setIcon(new ImageIcon("src/image/Logo1.jpg"));

        int fila = form.tbl_inventario.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btn_agregar) {
            inv.setId(Integer.parseInt(form.txt_id.getText()));
            inv.setAnio(form.txt_anio.getText());
            inv.setMarca(form.txt_marca.getText());
            inv.setModelo(form.txt_modelo.getText());
            inv.setColor(form.txt_color.getText());
            inv.setMillas(form.txt_millas.getText());
            inv.setVin(form.txt_vin.getText());
            inv.setMotor(form.txt_motor.getText());
            inv.setCapacidad(form.txt_capacidad.getText());
            inv.setTransmision(form.txt_transmision.getText());
            inv.setPrecio(Double.parseDouble(form.txt_precio.getText()));
            inv.setEstado("Activo");
            if (conBD.crear(inv)) {
                JOptionPane.showMessageDialog(null, "REGISTRO DE INVENTARIO CREADO CORRECTAMENTE - CTRL");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL INVENTARIO + CTRL");
            }
        }

        if (e.getSource() == form.btn_leer) {
            llenarTabla();
        }

        if (e.getSource() == form.btn_limpiar) {
            limpiar();
        }

        if (e.getSource() == form.btn_buscar) {
            inv.setId(Integer.parseInt(form.txt_id.getText()));
            if (conBD.leerInventario(inv)) {
                JOptionPane.showMessageDialog(null, "INVENTARIO ENCONTRADO - CTRL");
                form.txt_anio.setText(inv.getAnio());
                form.txt_marca.setText(inv.getMarca());
                form.txt_modelo.setText(inv.getModelo());
                form.txt_color.setText(inv.getColor());
                form.txt_millas.setText(inv.getMillas());
                form.txt_vin.setText(inv.getVin());
                form.txt_motor.setText(inv.getMotor());
                form.txt_capacidad.setText(inv.getCapacidad());
                form.txt_transmision.setText(inv.getTransmision());
                form.txt_precio.setText(String.valueOf(inv.getPrecio()));
                form.lbl_foto.setIcon(form.tamanioImagen(inv.getFoto()));
                dirImagen = inv.getFoto();

            } else {
                JOptionPane.showMessageDialog(null, "INVENTARIO DE VEHICULOS NO ENCONTRADO");
            }
        }

        if (e.getSource() == form.btn_actualizar) {
            inv.setId(Integer.parseInt(form.txt_id.getText()));
            inv.setAnio(form.txt_anio.getText());
            inv.setMarca(form.txt_marca.getText());
            inv.setModelo(form.txt_modelo.getText());
            inv.setColor(form.txt_color.getText());
            inv.setVin(form.txt_vin.getText());
            inv.setMillas(form.txt_millas.getText());
            inv.setMotor(form.txt_motor.getText());
            inv.setTransmision(form.txt_transmision.getText());
            inv.setCapacidad(form.txt_capacidad.getText());
            inv.setPrecio(Double.parseDouble(form.txt_precio.getText()));
            if (cambio.equals("no")) {
                inv.setFoto(dirImagen);
            }

            if (conBD.actualizarInventario(inv)) {
                JOptionPane.showMessageDialog(null, "INVENTARIO ACTUALIZADO CORRECTAMENTE - CTRL");
                limpiar();
                llenarTabla();//OPCIONAL
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR EL INVENTARIO");
            }

        }

        if (e.getSource() == form.btn_foto) {
            form.buscarImagen();
            inv.setFoto(form.direccionImagen);
            cambio = "si";
        }

        if (e.getSource() == form.btn_eliminar) {
            inv.setId(Integer.parseInt(form.txt_id.getText()));
            if (conBD.eliminarInventario(inv)) {

                JOptionPane.showMessageDialog(null, "INVENTARIO ELIMINADO CORRECTAMENTE");
                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showConfirmDialog(null, "NO SE PUDO ELIMINAR EL INVENTARIO");
            }

        }
    }

}
