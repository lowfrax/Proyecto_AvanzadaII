package helpers;

import java.awt.*;// con el * importamos todas las libterias  del awt
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class formulario extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfPrimerNombre, tfSegundoNombre; //delclaracion de JtextFields
    JLabel lbBienvenido;




    public void intilize(){

        //********** Objetos dentro del formulario****************

        //creacion del label Primer N
        JLabel lbPrimerNombre = new JLabel("Primer Nombre"); 
        lbPrimerNombre.setFont(mainFont);

        tfPrimerNombre = new JTextField(); //instancia del text field primer nombre
        tfPrimerNombre.setFont(mainFont); //mostrar el text field

        //creacion del label Segundo N

        JLabel lbSegundoNombre = new JLabel("Segundo Nombre"); 
        lbPrimerNombre.setFont(mainFont);
        tfSegundoNombre = new JTextField();//instancia del text field segundo nombre
        tfSegundoNombre.setFont(mainFont); //mostrar el text field

        JPanel formPanel = new JPanel(); //?
        formPanel.setLayout(new GridLayout(4,1,5,5));//?
        formPanel.add(lbPrimerNombre);
        formPanel.add(tfPrimerNombre);
        formPanel.add(lbSegundoNombre);
        formPanel.add(tfSegundoNombre);

        /*******************Bienvenida Label *******************/
        lbBienvenido = new JLabel();
        lbBienvenido.setFont(mainFont);


        /************Boton aceptar del panel****************************/
        JButton btnaceptar = new JButton("ACEPTAR");
        btnaceptar.setFont(mainFont);

        //accion del boton, tenemos que implentar los unniplemnt metodos
        btnaceptar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String PrimerNombre = tfPrimerNombre.getText();
                String SegundoNombre = tfSegundoNombre.getText();
                lbBienvenido.setText("Hola "+PrimerNombre+" "+SegundoNombre);
            } 
            
        });

        /************Boton limpiar del panel****************************/
        JButton btnlimpiar = new JButton("LIMPIAR");
        btnlimpiar.setFont(mainFont);

       //accion del boton, tenemos que implentar los unniplemnt metodos

        btnlimpiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfPrimerNombre.setText("");
                tfSegundoNombre.setText("");
                lbBienvenido.setText("");
            }
            
        });

        
         //**********Forma general del main panel y posiciones******************
         JPanel mainPanel = new JPanel(); // intancia del Jpanel
         mainPanel.setLayout(new BorderLayout()); //??
         mainPanel.setBackground(new Color(128,128,255)); //color compuesto para el fondo
         mainPanel.add(formPanel, BorderLayout.NORTH); //centramos el formulario 
         mainPanel.add(lbBienvenido, BorderLayout.CENTER);
       
/********************** NOSE ************************** */

JPanel buttonsPanel = new JPanel();
buttonsPanel.setLayout(new GridLayout(1,2,5,5));

         add(mainPanel);//nose

        //**********Sets de dimensiones y posicion****************
    setTitle("Bienvenido");
    this.setSize(500,600);
    this.setMinimumSize(new Dimension(300,400));
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);
    }

    public static void main(String[] args) {
        formulario FM = new formulario();
        FM.intilize();
    }

}
