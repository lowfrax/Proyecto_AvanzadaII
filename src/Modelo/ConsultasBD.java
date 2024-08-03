
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultasBD extends Conexion{
    PreparedStatement ps = null;
    String sentenciaSQL;
    ResultSet rs = null;
    
    LoginPOO logP;

    public boolean buscarUsuario(LoginPOO logP) {
        Connection con = getConnection();
        sentenciaSQL = "SELECT * FROM usuarios WHERE username=? AND password=?";
        try {
            ps = con.prepareStatement(sentenciaSQL);
            ps.setString(1, logP.getUser());
            ps.setString(2, logP.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "USUARIO EXISTE EN BD");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA");
            }
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL VERIFICAR USUARIO - CONSULTA " + ex.getMessage());
            return false;
        }
    }
}
