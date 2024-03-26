/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Hashtable.Cliente;
import javax.swing.JOptionPane;
import static main.main.reservas;

/** Interfaz que permite al usuario conocer los datos de la reservaci&oacute;n.
 * Esto dado el n&uacute;mero de c&eacute;dula del cliente.
 *
 * @author nelsoncarrillo
 */
public class BuscarReservacion extends javax.swing.JFrame {
    
    private final MenuPrincipal menu;
    
    /**
     * Creates new form BuscarReservacion
     * @param muns
     */
    public BuscarReservacion(MenuPrincipal muns) {
        initComponents();
        cedula.setText("");
        datos.setText("");
        datos.setEditable(false);
        this.menu=muns;
        setLocationRelativeTo(null);
        setResizable(false);
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
        cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTextArea();
        Buscar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese Número de Cédula del cliente para obtener los datos de su reservación:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos de Reservación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        datos.setColumns(20);
        datos.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        datos.setRows(5);
        jScrollPane1.setViewportView(datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 550, 140));

        Buscar.setBackground(new java.awt.Color(255, 204, 204));
        Buscar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, -1));

        Atras.setBackground(new java.awt.Color(255, 204, 204));
        Atras.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hotels Business Website in Brown White Modern Elegance Style.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        try{
            String cedulaStr = cedula.getText().trim();
            cedulaStr = cedulaStr.replace(".", "");
            int ci = Integer.parseInt(cedulaStr);
            Cliente cliente = reservas.reservationDetails(reservas.getRoot(), ci);
            if (cliente != null){
                String info = "Nombre: "+cliente.getName()+"\nApellido: "+cliente.getLastName()+"\nCedula: "+ci+"\nEmail: "+cliente.getEmail()+"\nGenero: "+cliente.getGenero()+"\nNumero de contacto: "+cliente.getTlf()+"\nFecha de llegada: "+cliente.getLlegada()+"\nFecha de salida: "+cliente.getSalida()+"\nTipo de habitacion: "+cliente.getTipoHab();
                datos.setText(info);
                cedula.setText("");
            } else{
                JOptionPane.showMessageDialog(null, "No existe ninguna reservacion con el N° de cedula "+ci);
                cedula.setText("");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR - Recuerde ingresar unicamente numeros");
            cedula.setText("");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here
        this.menu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel background;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextArea datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
