/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author HP
 */
public class MenuVendedor extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuVendedor(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        botClientes1 = new javax.swing.JButton();
        botReportes1 = new javax.swing.JButton();
        botGestiones = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botInventario = new javax.swing.JButton();
        botPreCali = new javax.swing.JButton();
        botClientes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1162, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(1162, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1162, 620));
        jPanel1.setMinimumSize(new java.awt.Dimension(1162, 620));
        jPanel1.setLayout(null);

        jPanel4.setLayout(null);

        botClientes1.setBackground(new java.awt.Color(90, 0, 0));
        botClientes1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botClientes1.setForeground(new java.awt.Color(255, 255, 255));
        botClientes1.setText("A Y U D A");
        botClientes1.setBorder(null);
        botClientes1.setBorderPainted(false);
        botClientes1.setFocusPainted(false);
        botClientes1.setFocusable(false);
        botClientes1.setRequestFocusEnabled(false);
        botClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botClientes1ActionPerformed(evt);
            }
        });
        jPanel4.add(botClientes1);
        botClientes1.setBounds(20, 330, 290, 50);

        botReportes1.setBackground(new java.awt.Color(90, 0, 0));
        botReportes1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botReportes1.setForeground(new java.awt.Color(255, 255, 255));
        botReportes1.setText("A J U S T E S");
        botReportes1.setBorder(null);
        botReportes1.setBorderPainted(false);
        botReportes1.setFocusPainted(false);
        botReportes1.setFocusable(false);
        botReportes1.setRequestFocusEnabled(false);
        jPanel4.add(botReportes1);
        botReportes1.setBounds(20, 420, 290, 50);

        botGestiones.setBackground(new java.awt.Color(90, 0, 0));
        botGestiones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botGestiones.setForeground(new java.awt.Color(255, 255, 255));
        botGestiones.setText("R E P O R T E S");
        botGestiones.setBorder(null);
        botGestiones.setBorderPainted(false);
        botGestiones.setFocusPainted(false);
        botGestiones.setFocusable(false);
        botGestiones.setRequestFocusEnabled(false);
        botGestiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGestionesActionPerformed(evt);
            }
        });
        jPanel4.add(botGestiones);
        botGestiones.setBounds(20, 240, 290, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background2.jpg"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 1162, 775);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(830, 0, 330, 620);

        jPanel2.setLayout(null);

        botInventario.setBackground(new java.awt.Color(90, 0, 0));
        botInventario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botInventario.setForeground(new java.awt.Color(255, 255, 255));
        botInventario.setText("I N V E N T A R I O");
        botInventario.setBorder(null);
        botInventario.setBorderPainted(false);
        botInventario.setFocusPainted(false);
        botInventario.setFocusable(false);
        botInventario.setRequestFocusEnabled(false);
        jPanel2.add(botInventario);
        botInventario.setBounds(20, 240, 290, 50);

        botPreCali.setBackground(new java.awt.Color(90, 0, 0));
        botPreCali.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botPreCali.setForeground(new java.awt.Color(255, 255, 255));
        botPreCali.setText("P R E - C A L I F I C A C I O N");
        botPreCali.setBorder(null);
        botPreCali.setBorderPainted(false);
        botPreCali.setFocusPainted(false);
        botPreCali.setFocusable(false);
        botPreCali.setRequestFocusEnabled(false);
        jPanel2.add(botPreCali);
        botPreCali.setBounds(20, 330, 290, 50);

        botClientes.setBackground(new java.awt.Color(90, 0, 0));
        botClientes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botClientes.setForeground(new java.awt.Color(255, 255, 255));
        botClientes.setText("C L I E N T E S");
        botClientes.setBorder(null);
        botClientes.setBorderPainted(false);
        botClientes.setFocusPainted(false);
        botClientes.setFocusable(false);
        botClientes.setRequestFocusEnabled(false);
        botClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botClientesActionPerformed(evt);
            }
        });
        jPanel2.add(botClientes);
        botClientes.setBounds(20, 420, 290, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SECCION VENDEDOR");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 60, 310, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO: ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 180, 80, 19);

        jlbUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jlbUsuario);
        jlbUsuario.setBounds(130, 170, 180, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background2.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1162, 775);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 620);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        botSalir.setBackground(new java.awt.Color(90, 0, 0));
        botSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botSalir.setForeground(new java.awt.Color(255, 255, 255));
        botSalir.setText("S A L I R");
        botSalir.setBorder(null);
        botSalir.setBorderPainted(false);
        botSalir.setFocusPainted(false);
        botSalir.setFocusable(false);
        botSalir.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(330, 540, 830, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo3.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 150, 460, 390);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("V E N T A S");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 20, 500, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botClientesActionPerformed

    private void botClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botClientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botClientes1ActionPerformed

    private void botGestionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGestionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botGestionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVendedor("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botClientes;
    private javax.swing.JButton botClientes1;
    public javax.swing.JButton botGestiones;
    private javax.swing.JButton botInventario;
    private javax.swing.JButton botPreCali;
    private javax.swing.JButton botReportes1;
    private javax.swing.JButton botSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbUsuario;
    // End of variables declaration//GEN-END:variables
}
