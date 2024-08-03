/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsulU extends Conexion {

    private PreparedStatement ps;
    private ResultSet rs;

    public boolean crearUsuario(UsuarioPOO usuario) {
        String sql = "INSERT INTO usuarios (username, password, roles, estado) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getTipoAcceso());
            ps.setString(4, "activo"); // Valor predeterminado para 'estado'
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO CREAR EL USUARIO: " + e.getMessage());
            return false;
        }
    }

    public boolean modificarUsuario(UsuarioPOO usuario, String oldUsername) {
        String sql = "UPDATE usuarios SET username=?, password=? WHERE username=?";
        try (Connection con = getConnection()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, oldUsername);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO MODIFICAR EL USUARIO: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarUsuario(String username) {
        String sql = "DELETE FROM usuarios WHERE username=?";
        try (Connection con = getConnection()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO ELIMINAR EL USUARIO: " + e.getMessage());
            return false;
        }
    }

    public boolean usuarioExiste(String username) {
        String sql = "SELECT username FROM usuarios WHERE username=?";
        try (Connection con = getConnection()) {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO VERIFICAR EL USUARIO: " + e.getMessage());
            return false;
        }
    }
}