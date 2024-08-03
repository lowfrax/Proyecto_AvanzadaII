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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class ConsultaInventario extends Conexion {

    PreparedStatement ps = null;
    String sentenciaSQL;
    ResultSet rs = null;
    inventarioPOO inv;

    public boolean crear(inventarioPOO inv) {
        Connection con = getConnection();
        sentenciaSQL = "INSERT INTO inventario(id,año,marca,modelo,color,foto,vin,millas,motor,transmision,capacidad,precio,estado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sentenciaSQL);
            ps.setInt(1, inv.getId());
            ps.setString(2, inv.getAnio());
            ps.setString(3, inv.getMarca());
            ps.setString(4, inv.getModelo());
            ps.setString(5, inv.getColor());
            ps.setString(6, inv.getFoto());
            ps.setString(7, inv.getVin());
            ps.setString(8, inv.getMillas());
            ps.setString(9, inv.getMotor());
            ps.setString(10, inv.getTransmision());
            ps.setString(11, inv.getCapacidad());
            ps.setDouble(12, inv.getPrecio());
            ps.setString(13, inv.getEstado());
            ps.execute();
            
            
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS CORRECTAMENTE - CONSULTA");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDO CREAR EL NUEVO REGISTRO DE INVENTARIO - CONSULTA " + ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ArrayList<inventarioPOO> leer_todos() {
        ArrayList inventario = new ArrayList();
        Connection con = getConnection();
        sentenciaSQL = "SELECT * FROM inventario WHERE estado = 'Activo'";
        try {
            ps = con.prepareStatement(sentenciaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                inv = new inventarioPOO();
                inv.setId(rs.getInt(1));
                inv.setAnio(rs.getString(2));
                inv.setMarca(rs.getString(3));
                inv.setModelo(rs.getString(4));
                inv.setColor(rs.getString(5));
                //inv.setFoto(rs.getString(6));
                inv.setVin(rs.getString(7));
                inv.setMillas(rs.getString(8));
                inv.setMotor(rs.getString(9));
                inv.setTransmision(rs.getString(10));
                inv.setCapacidad(rs.getString(11));
                inv.setPrecio(rs.getDouble(12));
                inventario.add(inv);
            }
            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDIERON LEER LOS DATOS - ERROR " + ex.getMessage() + "Joyeria");
        }

        return inventario;
    }

    public boolean leerInventario(inventarioPOO inv) {
        Connection con = getConnection();
        sentenciaSQL = "SELECT * FROM inventario WHERE id=? AND estado='Activo'";
        try {
            ps = con.prepareStatement(sentenciaSQL);
            ps.setInt(1, inv.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                inv.setId(rs.getInt(1));
                inv.setAnio(rs.getString(2));
                inv.setMarca(rs.getString(3));
                inv.setModelo(rs.getString(4));
                inv.setColor(rs.getString(5));
                inv.setFoto(rs.getString(6));
                inv.setVin(rs.getString(7));
                inv.setMillas(rs.getString(8));
                inv.setMotor(rs.getString(9));
                inv.setTransmision(rs.getString(10));
                inv.setCapacidad(rs.getString(11));
                inv.setPrecio(rs.getDouble(12));
                return true;
            }
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDIERON LEER LOS DATOS - CONSULTA " + ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public boolean actualizarInventario(inventarioPOO inv) {
        Connection con = getConnection();
        sentenciaSQL = "UPDATE inventario SET año = ?,marca = ?,modelo = ?, color=?, vin = ?, foto=?, millas = ?, motor = ?, transmision = ?, capacidad = ?, precio = ? WHERE id = ?";
        try {
            ps = con.prepareStatement(sentenciaSQL);
            ps.setString(1, inv.getAnio());
            ps.setString(2, inv.getMarca());
            ps.setString(3, inv.getModelo());
            ps.setString(4, inv.getColor());
            ps.setString(5, inv.getVin());
            ps.setString(6, inv.getFoto());
            ps.setString(7, inv.getMillas());
            ps.setString(8, inv.getMotor());
            ps.setString(9, inv.getTransmision());
            ps.setString(10, inv.getCapacidad());
            ps.setDouble(11, inv.getPrecio());
            ps.setInt(12, inv.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE - CONSULTA");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDIERON ACTUALIZAR LOS DATOS - CONSULTAS " + ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public boolean eliminarInventario(inventarioPOO inv) {
        Connection con = getConnection();
        sentenciaSQL = "UPDATE inventario SET estado='Inactivo' WHERE id=?";
        try {
            ps = con.prepareStatement(sentenciaSQL);
            ps.setInt(1, inv.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS CORRECTAMENTE - CONSULTA");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDIERON ELIMINAR LOS DATOS - CONSULTAS " + ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
