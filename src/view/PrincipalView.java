/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import view.carrinho.ListCarrinhoView;
import view.cliente.ClienteView;
import view.produto.ProdutoView;
import view.usuario.UsuarioView;

/**
 *
 * @author Leo
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
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

        MENU = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCadastroDeProduto = new javax.swing.JMenuItem();
        jmiClientes = new javax.swing.JMenuItem();
        jmiUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Arquivos");

        jmiCadastroDeProduto.setText("Cadastro de Produtos");
        jmiCadastroDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroDeProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadastroDeProduto);

        jmiClientes.setText("Cadastro de Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jmiClientes);

        jmiUsuarios.setText("Cadastro de Usuários");
        jmiUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUsuarios);

        MENU.add(jMenu1);

        jMenu2.setText("Consultar");

        jmiCompras.setText("Compras");
        jmiCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComprasActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCompras);

        MENU.add(jMenu2);

        setJMenuBar(MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastroDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroDeProdutoActionPerformed
        ProdutoView v = new ProdutoView();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_jmiCadastroDeProdutoActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        ClienteView v = new ClienteView();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuariosActionPerformed
        UsuarioView v = new UsuarioView();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_jmiUsuariosActionPerformed

    private void jmiComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComprasActionPerformed
        ListCarrinhoView v = new ListCarrinhoView();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_jmiComprasActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrincipalView v = new PrincipalView();
                v.setLocationRelativeTo(null);
                v.setExtendedState(JFrame.MAXIMIZED_BOTH);
                v.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MENU;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jmiCadastroDeProduto;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiCompras;
    private javax.swing.JMenuItem jmiUsuarios;
    // End of variables declaration//GEN-END:variables
}
