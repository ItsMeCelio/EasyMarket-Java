/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.carrinho;

import control.CarrinhoController;
import control.ItemCarrinhoController;
import control.ProdutoController;
import control.SessaoClienteController;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carrinho;
import model.ItemCarrinho;
import model.Produto;
import util.DateTimeUtil;

/**
 *
 * @author Leo
 */
public class CarrinhoView extends javax.swing.JFrame {

    private int PrimeiroItem = 0;

    public CarrinhoView() {
        initComponents();
        jlbNome.setText(SessaoClienteController.getInstance().getCliente().getNome());

        //Enable componentes
        jbtAdd.setEnabled(false);
        jbtExcluir.setEnabled(false);
        jbtFinalizar.setEnabled(false);
        jbtBuscar.setEnabled(false);

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
        jLabel1 = new javax.swing.JLabel();
        jlbNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbtAdd = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProdutos = new javax.swing.JTable();
        jbtIniciar = new javax.swing.JButton();
        jbtFinalizar = new javax.swing.JButton();
        jpStatus = new javax.swing.JPanel();
        jlbStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Cliente logado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlbNome))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/codigo.png"))); // NOI18N

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jbtAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Create.png"))); // NOI18N
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Forbidden.png"))); // NOI18N
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Search.png"))); // NOI18N
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        jtbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbProdutos);

        jbtIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Apply.png"))); // NOI18N
        jbtIniciar.setText("Iniciar compra");
        jbtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIniciarActionPerformed(evt);
            }
        });

        jbtFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/Abort.png"))); // NOI18N
        jbtFinalizar.setText("Finalizar compra");
        jbtFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFinalizarActionPerformed(evt);
            }
        });

        jpStatus.setBackground(new java.awt.Color(255, 102, 102));

        jlbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbStatus.setText("Compra não iniciada");

        javax.swing.GroupLayout jpStatusLayout = new javax.swing.GroupLayout(jpStatus);
        jpStatus.setLayout(jpStatusLayout);
        jpStatusLayout.setHorizontalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpStatusLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jlbStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpStatusLayout.setVerticalGroup(
            jpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpStatusLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jlbStatus))
        );

        jLabel3.setText("Insira o código");

        jLabel4.setText("Valor Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtFinalizar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(145, 145, 145)
                                    .addComponent(jLabel3))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtIniciar)
                        .addComponent(jbtFinalizar)
                        .addComponent(jLabel4)))
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Iniciando compra
    private void jbtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIniciarActionPerformed
        //Alterando mudanças no JFrame
        Color c = new Color(204, 204, 255);
        jpStatus.setBackground(c);
        jlbStatus.setText("Compra Iniciada");

        //Desativando enable em componentes
        jbtIniciar.setEnabled(false);
        jbtAdd.setEnabled(true);
        jbtExcluir.setEnabled(true);
        jbtFinalizar.setEnabled(true);
        jbtBuscar.setEnabled(true);

        jtfCodigo.requestFocus();
    }//GEN-LAST:event_jbtIniciarActionPerformed

    //Finalizando compra
    private void jbtFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFinalizarActionPerformed

        int l = jtbProdutos.getRowCount();
        //Verificando se existe itens na grade de produto.
        if (l > 0) {

            if (JOptionPane.showConfirmDialog(this, "Deseja realmente finalizar sua compra ?", "Opção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                //Alterando componentes visuais 
                Color cor = new Color(255, 102, 102);
                jpStatus.setBackground(cor);
                jlbStatus.setText("Compra finalizada");
                jlbTotal.setText("0");
                jtfCodigo.setText("");
                //Desativando enable em componentes
                jbtAdd.setEnabled(false);
                jbtExcluir.setEnabled(false);
                jbtFinalizar.setEnabled(false);
                jbtBuscar.setEnabled(false);
                jbtIniciar.setEnabled(true);

                //Persistindo carrinho no banco
                Carrinho c = new Carrinho();
                c.setCliente(SessaoClienteController.getInstance().getCliente());
                c.setData(getDataAtual());
                c.setStatus(true);

                try {
                    CarrinhoController.getInstance().persistir(c);
                    //JOptionPane.showMessageDialog(this, "Carrinho gravado com sucesso");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o carrinho");
                }

                //Persistindo os itens da compra
                try {
                    Carrinho ultimo_carrinho = CarrinhoController.getInstance().getLastCarrinho();
                    Produto p_item = new Produto();
                    Long cod;
                    for (int i = 0; i < jtbProdutos.getRowCount(); i++) {
                        //Capturando codigo do produto
                        cod = Long.parseLong(jtbProdutos.getValueAt(i, 0).toString());

                        p_item = ProdutoController.getInstance().buscarID(cod);

                        //Setando dados no objeto item
                        ItemCarrinho item = new ItemCarrinho();

                        item.setCarrinho(ultimo_carrinho);
                        item.setProduto(p_item);
                        item.setQuantidade(1);
                        item.setValor(p_item.getPrecoCusto());

                        //Persistindo objeto
                        ItemCarrinhoController.getInstance().persistir(item);
                    }
                    //Fim do loop que persiste os itens

                    //Removendo todos os itens da tabela
                    while (jtbProdutos.getModel().getRowCount() > 0) {  
                        ((DefaultTableModel) jtbProdutos.getModel()).removeRow(0);  
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro");
                }

            }

        } else {
            JOptionPane.showMessageDialog(this, "Nenhum produto adicionado");
        }
    }//GEN-LAST:event_jbtFinalizarActionPerformed

    //Pegando data atual do sistema
    public Date getDataAtual() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        return calendar.getTime();
    }

    //Adicionando produtos ao jTable
    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed

        if (jtfCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Insira um código antes de prosseguir com a operação.");
            jtfCodigo.requestFocus();
        } else {

            Produto produto = new Produto();
            produto = ProdutoController.getInstance().buscarCOD(jtfCodigo.getText());
            
            if(produto == null) {
                JOptionPane.showMessageDialog(this, "Produto não cadastrado.");
            } else {
                // Cria um defaultTableModel para ser usado na JTable com os campos que serão exibidos na tela
                DefaultTableModel modelo = new DefaultTableModel();

                if (PrimeiroItem == 1) {

                    ((DefaultTableModel) jtbProdutos.getModel()).addRow(new Object[]{produto.getId(), produto.getCod(), produto.getNome(), produto.getDescricao(), produto.getPrecoCusto()});

                    jtfCodigo.setText("");
                    jtfCodigo.requestFocus();

                } else {

                    //Grade será criada pela primeira vez
                    // Cria um defaultTableModel para ser usado na JTable com os campos que serão exibidos na tela
                    modelo.addColumn("(ID)");
                    modelo.addColumn("Código");
                    modelo.addColumn("Nome");
                    modelo.addColumn("Descricao");
                    modelo.addColumn("Valor");

                    modelo.addRow(new Object[]{produto.getId(), produto.getCod(), produto.getNome(), produto.getDescricao(), produto.getPrecoCusto()});

                    //Limpa a JTable (Grid)
                    //jtbProdutos.removeAll();
                    //Seta o modelo para a Grid 
                    jtbProdutos.setModel(modelo);

                    //Ajusta o tamanho da primeira coluna 
                    jtbProdutos.getColumnModel().getColumn(0).setPreferredWidth(60);
                    jtbProdutos.getColumnModel().getColumn(1).setPreferredWidth(60);
                    jtbProdutos.getColumnModel().getColumn(2).setPreferredWidth(180);
                    jtbProdutos.getColumnModel().getColumn(3).setPreferredWidth(220);

                    //Ocutar coluna ID 
                    ///jtAluno.getColumnModel().getColumn(0).setMinWidth(0);
                    //jtAluno.getColumnModel().getColumn(0).setMaxWidth(0);
                    //jtAluno.getColumnModel().getColumn(0).setWidth(0);
                    jtfCodigo.setText("");
                    jtfCodigo.requestFocus();

                    if (PrimeiroItem == 0) {
                        PrimeiroItem = 1;
                    }

                }

                jlbTotal.setText(CalculaTotal());
            }
        }
    }//GEN-LAST:event_jbtAddActionPerformed

    //Excluindo item
    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        int linha = -2;
        linha = jtbProdutos.getSelectedRow();

        if (linha == -2) {
            JOptionPane.showMessageDialog(this, "Selecione um produto.");
        } else {
            ((DefaultTableModel) jtbProdutos.getModel()).removeRow(jtbProdutos.getSelectedRow());
            jlbTotal.setText(CalculaTotal());
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso !");
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    //Consultando produto no modal
    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        //Verifica se algum codigo foi inserido
        if (jtfCodigo.getText() == "") {
            JOptionPane.showMessageDialog(this, "Nenhum código foi inserido.");
        } else {
            Produto produto = ProdutoController.getInstance().buscarCOD(jtfCodigo.getText());
            if ( produto == null ) {
                JOptionPane.showMessageDialog(this, "Produto não cadastrado.");
            } else {
                ConsultaProdutoView v = new ConsultaProdutoView();
                v.setLocationRelativeTo(null);
                v.setDados(produto);
                v.setVisible(true);
            }
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private String CalculaTotal() {
        Double Orcamento = 0.0;
        for (int i = 0; i < jtbProdutos.getRowCount(); i++) {
            Orcamento += Double.parseDouble(jtbProdutos.getValueAt(i, 4).toString());
        }
        return Orcamento.toString();
    }

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
            java.util.logging.Logger.getLogger(CarrinhoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarrinhoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarrinhoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarrinhoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarrinhoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtFinalizar;
    private javax.swing.JButton jbtIniciar;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbStatus;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JPanel jpStatus;
    private javax.swing.JTable jtbProdutos;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables
}
