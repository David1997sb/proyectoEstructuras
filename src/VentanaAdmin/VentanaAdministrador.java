/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaAdmin;


import sistema_de_datos_educativo.Colegio;
import VentanaMateria.VentListMat;
import VentanaMateria.VentanaModificaMat;
import VentanaUsuarios.VentanaModificaUsuario;
import VentanaUsuarios.ListaUsuarios;
import sistema_de_datos_educativo.Login;

/**
 *
 * @author aldomora89
 */
public class VentanaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    Colegio colegio;
    public VentanaAdministrador(Colegio colegio) {
        initComponents();
        setLocationRelativeTo(null);//para centrar ventanas
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.colegio=colegio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        modificarMateria1 = new javax.swing.JMenu();
        modificaMateria1 = new javax.swing.JMenuItem();
        EllminaUsuarioBTN = new javax.swing.JMenuItem();
        verListaBTN1 = new javax.swing.JMenuItem();
        modificarMateria = new javax.swing.JMenu();
        addMatBTN = new javax.swing.JMenuItem();
        modificaMateria = new javax.swing.JMenuItem();
        EliminaMatBTN = new javax.swing.JMenuItem();
        verListaBTN = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        agregaProfesor = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        EliminaEstBTN = new javax.swing.JMenuItem();
        ModifEstBTN = new javax.swing.JMenuItem();
        ListEstBTN = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar4.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar4.add(jMenu10);

        jMenu15.setText("jMenu15");

        jMenuItem2.setText("jMenuItem2");

        jMenu11.setText("File");
        jMenuBar5.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar5.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar6.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar6.add(jMenu14);

        jMenuItem13.setText("jMenuItem13");

        jMenuItem14.setText("jMenuItem14");

        jMenuItem15.setText("jMenuItem15");

        jMenuItem16.setText("jMenuItem16");

        jMenuItem17.setText("jMenuItem17");

        jMenuItem18.setText("jMenuItem18");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_de_datos_educativo/Mision.jpeg"))); // NOI18N

        modificarMateria1.setText("Administrar usuarios");

        modificaMateria1.setText("Modifica Usuario");
        modificaMateria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaMateria1ActionPerformed(evt);
            }
        });
        modificarMateria1.add(modificaMateria1);

        EllminaUsuarioBTN.setText("Ellimina Usuario");
        EllminaUsuarioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EllminaUsuarioBTNActionPerformed(evt);
            }
        });
        modificarMateria1.add(EllminaUsuarioBTN);

        verListaBTN1.setText("Ver lista de Usuarios");
        verListaBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaBTN1ActionPerformed(evt);
            }
        });
        modificarMateria1.add(verListaBTN1);

        jMenuBar1.add(modificarMateria1);

        modificarMateria.setText("Administrar Materias");

        addMatBTN.setText("Agrega Materias");
        addMatBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMatBTNActionPerformed(evt);
            }
        });
        modificarMateria.add(addMatBTN);

        modificaMateria.setText("Modifica Materia");
        modificaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaMateriaActionPerformed(evt);
            }
        });
        modificarMateria.add(modificaMateria);

        EliminaMatBTN.setText("Elimina Materias");
        EliminaMatBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaMatBTNActionPerformed(evt);
            }
        });
        modificarMateria.add(EliminaMatBTN);

        verListaBTN.setText("Ver lista de Materias");
        verListaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaBTNActionPerformed(evt);
            }
        });
        modificarMateria.add(verListaBTN);

        jMenuItem19.setText("Agregar estudiantes a Materia");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        modificarMateria.add(jMenuItem19);

        jMenuItem7.setText("Agregar profesor a Materia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        modificarMateria.add(jMenuItem7);

        jMenuBar1.add(modificarMateria);

        jMenu3.setText("Administrar Profesores");

        agregaProfesor.setText("Agrega profesor");
        agregaProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaProfesorActionPerformed(evt);
            }
        });
        jMenu3.add(agregaProfesor);

        jMenuItem5.setText("Elimina Profesor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem4.setText("Modifica profesor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem6.setText("Ver lista de profesores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Administrar Estudiantes");

        jMenuItem8.setText("Agrega Estudiante");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        EliminaEstBTN.setText("Elimina Estudiante");
        EliminaEstBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaEstBTNActionPerformed(evt);
            }
        });
        jMenu4.add(EliminaEstBTN);

        ModifEstBTN.setText("Modifica Estudiante");
        ModifEstBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifEstBTNActionPerformed(evt);
            }
        });
        jMenu4.add(ModifEstBTN);

        ListEstBTN.setText("Ver lista de Estudiantes");
        ListEstBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListEstBTNActionPerformed(evt);
            }
        });
        jMenu4.add(ListEstBTN);

        jMenuBar1.add(jMenu4);

        MenuSalir.setText("Salir");
        MenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListEstBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListEstBTNActionPerformed
        VentanaListaEstudiantesAdmin listaEst = new VentanaListaEstudiantesAdmin(colegio); // llamamos a la clase VentanaListaEstudiantesAdmin y creamos un nuevo objeto de tipo colegio para mostrar la lista de estudiantes en el sistema
        listaEst.setVisible(true);// hacemos la ventana visible para mostrar la lista
    }//GEN-LAST:event_ListEstBTNActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        VentanaAdminAgregaEstudiante addEst = new VentanaAdminAgregaEstudiante(colegio); // llamamos a la clase VentanaAdminAgregaEstudiante y creamos un nuevo objeto de tipo colegio para agregar nuevos estudiantes al sistema
        addEst.setVisible(true);//// hacemos la ventana visible para agregar los datos del estudiante y guardarlo
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VentanaAdminModProf modprof = new VentanaAdminModProf(colegio);//llamamos a la clase VenataAdminModProf y creamos un objeto de tipo colegio para modificar los datos de un profesor a creado
        modprof.setVisible(true);// hacemos la ventana visible para que se puedan modificar los datos
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        VentanaAdminListaProf listaProf = new VentanaAdminListaProf(colegio); // llamamos a la clase VentanaAdminListaProf y creamos un nuevo objeto de tipo colegio para mostrar la lista de profesores en el sistema
        listaProf.setVisible(true);// hacemos la ventana visible para que se pueda ver la lista de profesores en el sistema
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        VentanaAdminEliminaProf elimProf = new VentanaAdminEliminaProf(colegio);// llamamos a la clase VentanaAdminEliminaProfe y creamos un nuevo objeto de tipo colegio para que busque en la lista de profesores el usuario del profesor que se desea eliminar y lo elimine
        elimProf.setVisible(true);// hacemos la ventana visible para que se pueda eliminar el profesor
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void agregaProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaProfesorActionPerformed
        VentanaAdminAddProf addprof= new VentanaAdminAddProf(colegio);// llamamos a la clase VentanaAdminAddprof y creamos un nuevo objeto de tipo colegio para agregar un nuevo profesor al sistema
        addprof.setVisible(true);// hacemos la ventana visible para que se pueda agregar un nuevo profesor
    }//GEN-LAST:event_agregaProfesorActionPerformed

    private void MenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalirMouseClicked
       //este metódo nos permite que al salir de cualquier ventana, no nos saqué inmediatamente del programa y se borren los datos que ya teníamos agregados si no que nos envíe a iniciar sesión de nuevo
        this.setVisible(false);
        Login abrirLogin = new Login();
        abrirLogin.setVisible(true);
        
    }//GEN-LAST:event_MenuSalirMouseClicked


    private void verListaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaBTNActionPerformed
        VentListMat listaMaterias = new VentListMat(colegio);// llamamos a la clase VentListMat y creamos un objeto de tipo colegio para poder ver la lista de materias creadas
        listaMaterias.setVisible(true); // hacemos la ventana visible para poder imprimir la lista de materias
    }//GEN-LAST:event_verListaBTNActionPerformed

    private void EliminaMatBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaMatBTNActionPerformed
        VentanaAdminEliMat eliminaMat = new VentanaAdminEliMat(colegio); // llamamos a la clase VentanaAdminEliminaMat y creamos un objeto de tipo colegio para eliminar una materia del sistema
        eliminaMat.setVisible(true);// hacemos la ventana visible para poder eliminar la materia 
    }//GEN-LAST:event_EliminaMatBTNActionPerformed

    private void modificaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaMateriaActionPerformed
        VentanaModificaMat modifyProf = new VentanaModificaMat(colegio); //llamamos a la clase VentanaModifMateria y creamos un nuevo objeto de tipo colegio para poder modificar la informacion de una materia ya existente
        modifyProf.setVisible(true);// hacemos la ventana visible para poder modificarla
    }//GEN-LAST:event_modificaMateriaActionPerformed

    private void addMatBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMatBTNActionPerformed
        VentanaAdminAddMat addmat = new VentanaAdminAddMat(colegio);
        addmat.setVisible(true);
    }//GEN-LAST:event_addMatBTNActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        VentanaAddEstudianteMat addEst = new VentanaAddEstudianteMat(colegio);
        addEst.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void EliminaEstBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaEstBTNActionPerformed
        VentanaEliminaEstudianteAdmin eliminaEst = new VentanaEliminaEstudianteAdmin(colegio);
        eliminaEst.setVisible(true);
    }//GEN-LAST:event_EliminaEstBTNActionPerformed

    private void ModifEstBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifEstBTNActionPerformed
        VentanaModificaEstudianteAdmin modiESt = new VentanaModificaEstudianteAdmin(colegio);
        modiESt.setVisible(true);
    }//GEN-LAST:event_ModifEstBTNActionPerformed

    private void modificaMateria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaMateria1ActionPerformed
        VentanaModificaUsuario usuario = new VentanaModificaUsuario(colegio);
        usuario.setVisible(true);
    }//GEN-LAST:event_modificaMateria1ActionPerformed

    private void EllminaUsuarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EllminaUsuarioBTNActionPerformed
        VentanaElimUsuario elimUsuario = new VentanaElimUsuario(colegio); // llamamos a la clase VentanaElimUsuario y creamos un nuevo objeto de tipo colegio para que busque en la lista de usuarios al que desee eliminar que se desea eliminar y lo elimine
        elimUsuario.setVisible(true);// hacemos visible la ventana para que se puedan eliminar los usuarios
    }//GEN-LAST:event_EllminaUsuarioBTNActionPerformed

    private void verListaBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaBTN1ActionPerformed
        ListaUsuarios listaUsuarios = new ListaUsuarios(colegio);// llamamos a la clase ListaUsuarios y creamos un objeto de tipo colegio para poder imprimir la lista de todos los usuarios
        listaUsuarios.setVisible(true); // hacemos visible la ventana para poder imprimir la lista de todos los usuarios del Colegio
    }//GEN-LAST:event_verListaBTN1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        VentanaAddProfMat addProfMat = new VentanaAddProfMat(colegio);// llamamos a la clase VentanaAddProfMat de la clase colegio para agregar un profesor a una materia ya creada
        addProfMat.setVisible(true);// hacemos visible la ventana para poder agregar profesores a materias
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       //este metódo nos permite que al salir de cualquier ventana, no nos saqué inmediatamente del programa y se borren los datos que ya teníamos agregados si no que nos envíe a iniciar sesión de nuevo
       this.setVisible(false);
        Login abrirLogin = new Login();
        abrirLogin.setVisible(true);
    }//GEN-LAST:event_formWindowClosing




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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
// new VentanaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminaEstBTN;
    private javax.swing.JMenuItem EliminaMatBTN;
    private javax.swing.JMenuItem EllminaUsuarioBTN;
    private javax.swing.JMenuItem ListEstBTN;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuItem ModifEstBTN;
    private javax.swing.JMenuItem addMatBTN;
    private javax.swing.JMenuItem agregaProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem modificaMateria;
    private javax.swing.JMenuItem modificaMateria1;
    private javax.swing.JMenu modificarMateria;
    private javax.swing.JMenu modificarMateria1;
    private javax.swing.JMenuItem verListaBTN;
    private javax.swing.JMenuItem verListaBTN1;
    // End of variables declaration//GEN-END:variables
}
