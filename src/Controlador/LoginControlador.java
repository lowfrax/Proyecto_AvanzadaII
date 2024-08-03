package Controlador;

import Modelo.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ConsultasBD;
import Modelo.LoginPOO;

import Vista.Login;
import Vista.MenuGerente;
import Vista.MenuVendedor;

public class LoginControlador implements ActionListener {

    private LoginPOO log;
    private Login form;

    private ConsultasBD conBD;

    private MenuGerente menGen;
    private MenuVendedor menVen;

    private String user;
    private String pass;
    private String rol;

    public LoginControlador(LoginPOO log, Login form, ConsultasBD conBD, MenuGerente menGen, MenuVendedor menVen, String user, String pass, String rol) {
        this.log = log;
        this.form = form;
        this.conBD = conBD;
        this.menGen = menGen;
        this.menVen = menVen;
        this.user = user;
        this.pass = pass;
        this.rol = rol;

        this.form.botLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Hola
        
        

    }

}
