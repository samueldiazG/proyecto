/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicolombo.poo.Gui;

import co.edu.unicolombo.poo.Gui.User.RolCrudWindow;

/**
 *
 * @author nadir
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraMenu = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        menuRoles = new javax.swing.JMenu();
        itemAgregarRol = new javax.swing.JMenuItem();
        itemBuscarRol = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        menuUsuarios.setText("Usuarios");
        BarraMenu.add(menuUsuarios);

        menuRoles.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        menuRoles.setText("Roles");

        itemAgregarRol.setText("Agregar");
        itemAgregarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarRolActionPerformed(evt);
            }
        });
        menuRoles.add(itemAgregarRol);

        itemBuscarRol.setText("Buscar");
        menuRoles.add(itemBuscarRol);

        BarraMenu.add(menuRoles);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarRolActionPerformed
    RolCrudWindow window=new RolCrudWindow(this,true);
    window.setLocationRelativeTo(this);
    window.setVisible(true);
    }//GEN-LAST:event_itemAgregarRolActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem itemAgregarRol;
    private javax.swing.JMenuItem itemBuscarRol;
    private javax.swing.JMenu menuRoles;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
