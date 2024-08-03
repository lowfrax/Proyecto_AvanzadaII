/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsulU;
import Modelo.UsuarioPOO;
import Vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UsuarioControlador implements ActionListener {

    private UsuarioPOO usuario;
    private Usuario vista;
    private ConsulU consulU;

    public UsuarioControlador(UsuarioPOO usuario, Usuario vista, ConsulU consulU) {
        this.usuario = usuario;
        this.vista = vista;
        this.consulU = consulU;

        this.vista.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getCrear()) {
            crearUsuario();
        } else if (e.getSource() == vista.getModificar()) {
            modificarUsuario();
        } else if (e.getSource() == vista.getEliminar()) {
            eliminarUsuario();
        }
    }

    public void crearUsuario() {
        String username = JOptionPane.showInputDialog(vista, "Ingresa el nombre de usuario:");
        String password = JOptionPane.showInputDialog(vista, "Ingresa la contraseña:");
        String tipoAcceso = JOptionPane.showInputDialog(vista, "Ingresa el tipo de acceso (vendedor o admin):");

        if (username == null || password == null || tipoAcceso == null || username.trim().isEmpty() || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Los campos no pueden estar vacíos.");
            return;
        }

        if (!tipoAcceso.equalsIgnoreCase("vendedor") && !tipoAcceso.equalsIgnoreCase("admin")) {
            JOptionPane.showMessageDialog(vista, "Tipo de acceso no válido.");
            return;
        }

        usuario.setUsername(username.toLowerCase());
        usuario.setPassword(password.toLowerCase());
        usuario.setTipoAcceso(tipoAcceso.toLowerCase());

        if (consulU.crearUsuario(usuario)) {
            JOptionPane.showMessageDialog(vista, "Usuario creado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo crear el usuario.");
        }
    }

    public void modificarUsuario() {
        String username = JOptionPane.showInputDialog(vista, "Ingresa el nombre de usuario a modificar:");
        String password = JOptionPane.showInputDialog(vista, "Ingresa la nueva contraseña:");

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Los campos no pueden estar vacíos.");
            return;
        }

        if (!consulU.usuarioExiste(username)) {
            JOptionPane.showMessageDialog(vista, "El usuario no existe.");
            return;
        }

        String newUsername = JOptionPane.showInputDialog(vista, "Ingresa el nuevo nombre de usuario:");

        if (newUsername == null || newUsername.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "El nuevo nombre de usuario no puede estar vacío.");
            return;
        }

        usuario.setUsername(newUsername.toLowerCase());
        usuario.setPassword(password.toLowerCase());

        if (consulU.modificarUsuario(usuario, username.toLowerCase())) {
            JOptionPane.showMessageDialog(vista, "Usuario modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo modificar el usuario.");
        }
    }

    public void eliminarUsuario() {
        String username = JOptionPane.showInputDialog(vista, "Ingresa el nombre de usuario a eliminar:");
        String password = JOptionPane.showInputDialog(vista, "Ingresa la contraseña:");

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Los campos no pueden estar vacíos.");
            return;
        }

        if (consulU.eliminarUsuario(username.toLowerCase())) {
            JOptionPane.showMessageDialog(vista, "Usuario eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo eliminar el usuario.");
        }
    }
}