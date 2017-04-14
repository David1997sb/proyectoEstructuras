/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaAdmin;

import Estructuras.ColaEst;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sistema_de_datos_educativo.Colegio;
import sistema_de_datos_educativo.Estudiante;

/**
 *
 * @author Vall_
 */
public class VentanaModificaEstudianteAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaModificaEstudiante
     */
    Colegio colegio;

    public VentanaModificaEstudianteAdmin(Colegio colegio) {
        initComponents();
        this.colegio = colegio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AcptBTN = new javax.swing.JButton();
        atrasBTN = new javax.swing.JButton();
        txtapelido = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtencargado = new javax.swing.JTextField();
        intid = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        intedad = new javax.swing.JTextField();
        txtnivel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Modifica estudiantes");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Encargado:");

        jLabel5.setText("Correo:");

        jLabel6.setText("ID Estudiante existente:");

        jLabel7.setText("Teléfono:");

        jLabel8.setText("Edad:");

        jLabel9.setText("Nivel Educativo:");

        AcptBTN.setText("Aceptar");
        AcptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcptBTNActionPerformed(evt);
            }
        });

        atrasBTN.setText("Atras");
        atrasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBTNActionPerformed(evt);
            }
        });

        intid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                intidFocusLost(evt);
            }
        });
        intid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intidActionPerformed(evt);
            }
        });

        intedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intedadActionPerformed(evt);
            }
        });

        jLabel10.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(AcptBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atrasBTN)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo)
                                    .addComponent(txtapelido)
                                    .addComponent(txtname)
                                    .addComponent(txtencargado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(intid, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 146, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(intedad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtTelefono)
                                    .addComponent(txtnivel))))
                        .addGap(84, 84, 84)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(intid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtencargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcptBTN)
                    .addComponent(atrasBTN))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void intedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intedadActionPerformed

    private void AcptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcptBTNActionPerformed
        try {
            //Completar Campos cuando agrego ID

            String nombre = txtname.getText();
            String Apellido = txtapelido.getText();
            String Encargado = txtencargado.getText();
            String Correo = txtcorreo.getText();
            int ID = Integer.parseInt(intid.getText());
            String Telefono = txtTelefono.getText();
            int Edad = Integer.parseInt(intedad.getText());
            String Nivel = txtnivel.getText();
            colegio.validaEst(ID);
            colegio.modificaEstudianteAdmin(nombre, Apellido, Encargado, Correo, ID, Telefono, Edad, Nivel);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Se ha modificado existosamente al estudiante");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor invalido");
        }
    }//GEN-LAST:event_AcptBTNActionPerformed

    private void atrasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBTNActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_atrasBTNActionPerformed

    private void intidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intidActionPerformed


    }//GEN-LAST:event_intidActionPerformed


    private void intidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_intidFocusLost
        intid.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                
                
                Estudiante estudiantes = new Estudiante();
                String id = ((JTextField) e.getSource()).getText();
                System.out.println(id);
                txtname.setText(colegio.imprimeNomEstu(Integer.parseInt(id)));
                txtapelido.setText(colegio.imprimeApelliEstu(Integer.parseInt(id)));
                intedad.setText(String.valueOf(colegio.imprimeEdadEstu(Integer.parseInt(id)))); 
                txtTelefono.setText(colegio.imprimeTelEstu(Integer.parseInt(id)));
                txtencargado.setText(colegio.imprimeEncargadoEstu(Integer.parseInt(id)));
                txtcorreo.setText(colegio.imprimeCorreoEstu(Integer.parseInt(id)));
                txtnivel.setText(colegio.imprimeNivelEstu(Integer.parseInt(id)));

            }

        }
        );

    }//GEN-LAST:event_intidFocusLost

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
            java.util.logging.Logger.getLogger(VentanaModificaEstudianteAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificaEstudianteAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificaEstudianteAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificaEstudianteAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton AcptBTN;
    private javax.swing.JButton atrasBTN;
    private javax.swing.JTextField intedad;
    private javax.swing.JTextField intid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtapelido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtencargado;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnivel;
    // End of variables declaration//GEN-END:variables
}
