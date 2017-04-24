/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaAdmin;

import javax.swing.JOptionPane;
import sistema_de_datos_educativo.Colegio;

/**
 *
 * @author Vall_
 */
public class VentanaEliminaEstudianteAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEliminaEstudiante
     */
    Colegio colegio;// se crea un nuevo objeto de tipo colegio
    public VentanaEliminaEstudianteAdmin(Colegio colegio) {
        initComponents();
        setLocationRelativeTo(null);//para centrar ventanas
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.colegio= colegio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        choice1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        intID = new javax.swing.JTextField();
        AceptBTN = new javax.swing.JButton();
        AtrasBTN = new javax.swing.JButton();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Eliminar estudiante");

        jLabel2.setText("Ingrese el ID del estudiante que desea eliminar:");

        intID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intIDActionPerformed(evt);
            }
        });

        AceptBTN.setText("Aceptar");
        AceptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptBTNActionPerformed(evt);
            }
        });
        AceptBTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AceptBTNKeyPressed(evt);
            }
        });

        AtrasBTN.setText("Atras");
        AtrasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(AceptBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasBTN)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(intID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptBTN)
                    .addComponent(AtrasBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void intIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intIDActionPerformed

    private void AceptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptBTNActionPerformed
        try{
        int id= Integer.parseInt(intID.getText()); // convierte en string el id ingresado que tiene los datos de un estudiante
        colegio.eliminaEstudiante(id);// llamamos al metódo eliminaEstudiante de la clase colegio para eliminar un estudiante del sistema
        this.setVisible(false);  //este set visible es para que cierre la ventana luego de ser agregado
        JOptionPane.showMessageDialog(null,"El estudiante con el id " + id + " ha sido eliminado");// cuándo el estudiante sea eliminado, se mostrará este mensaje
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " Valor incorrecto ");// evita que el programa se caiga si ingresa algún dato incorrectamentr
        }
    }//GEN-LAST:event_AceptBTNActionPerformed

    private void AceptBTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AceptBTNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptBTNKeyPressed

    private void AtrasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBTNActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_AtrasBTNActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEliminaEstudianteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminaEstudianteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminaEstudianteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminaEstudianteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptBTN;
    private javax.swing.JButton AtrasBTN;
    private java.awt.Button button1;
    private java.awt.Choice choice1;
    private javax.swing.JTextField intID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
