package TelasDeCompraDeProduto;

import Classes.Carrinho;
import TelasDeCadastroDeProduto.CadastroProdutos;
import Classes.Usuario;
import Classes.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CompraProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CompraProdutos
     */
    public static Usuario usuario;
    public static Carrinho carrinho = new Carrinho();
    public static double precoTotal;
    
    public CompraProdutos(Usuario u) {
        initComponents();
        this.usuario = u;
        
        inicializaComboBox(); 
    }
    
    private void inicializaComboBox() {
        for(int i = 0; i < CadastroProdutos.supermercado.getProdutosCadastrados().size(); i++) {
            jComboBox1.addItem(CadastroProdutos.supermercado.getProdutosCadastrados().get(i).getDescricao());
        }
    }
    
    private void totalPagar(){
        precoTotal = carrinho.totalAPagar();
        String totalStr = String.valueOf(precoTotal);
        jLabelTotal.setText(totalStr); 
    }
    
    private Produto pegaOProdutoASerMostrado() {
        String produto = jComboBox1.getSelectedItem().toString();
        Produto p = null;
        for(int i = 0; i < CadastroProdutos.supermercado.getProdutosCadastrados().size(); i++) {
            if(CadastroProdutos.supermercado.getProdutosCadastrados().get(i).getDescricao().equals(produto)){
                p = CadastroProdutos.supermercado.getProdutosCadastrados().get(i);
            }
        }
        
        return p;
    }
    
    private void removendoDoCarrinho() {
        String produto = jComboBox1.getSelectedItem().toString();
        int cod;
        
        ArrayList<Produto> produtosComprados = carrinho.getListaProdutos();
        
        for(int i = 0; i < produtosComprados.size(); i++) { 
            if(produtosComprados.get(i).getDescricao().equals(produto)){
                cod = produtosComprados.get(i).getCodigo();
                carrinho.removeProduto(cod, i);
                break;
            }
        }
       
    }
    
    private Produto retornaProdutoASerInserido() {
        Produto p = null;
        String produto = jComboBox1.getSelectedItem().toString();
        ArrayList<Produto> produtos = CadastroProdutos.supermercado.getProdutosCadastrados();
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getDescricao().equals(produto)){
                p = produtos.get(i);
                break;
            }
        }
        
        return p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jButtonDetalhes = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonEmitirNotaFiscal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Compra de Produtos");

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonInserir.setText("Adicionar ao Carrinho");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonDetalhes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDetalhes.setText("Ver Detalhes do Produto");
        jButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesActionPerformed(evt);
            }
        });

        jButtonRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRemover.setText("Retirar do Carrinho");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonEmitirNotaFiscal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEmitirNotaFiscal.setText("Emitir Nota Fiscal");
        jButtonEmitirNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmitirNotaFiscalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Total a pagar: ");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEmitirNotaFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEmitirNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelTotal))
                .addGap(28, 28, 28)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        setVisible(false); 
        dispose(); 
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
        Produto p = pegaOProdutoASerMostrado();

        InformacoesProduto info = new InformacoesProduto(p);
        info.setVisible(true);
    }//GEN-LAST:event_jButtonDetalhesActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        Produto p = retornaProdutoASerInserido();
        
        carrinho.insereProduto(p);

        JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho com sucesso", "titulo da janela", JOptionPane.INFORMATION_MESSAGE);
        
        //atualiza o total a pagar
        totalPagar();
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        switch(JOptionPane.showConfirmDialog(null, "Tem certeza disso? ", "Retirar produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)){
            case 0: //botao sim
                removendoDoCarrinho();

                JOptionPane.showMessageDialog(null, "Produto retirado do carrinho com sucesso", "titulo da janela", JOptionPane.INFORMATION_MESSAGE);
                
                //atualiza o total a pagar
                totalPagar();
                
            break;
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonEmitirNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmitirNotaFiscalActionPerformed
        
        if(carrinho.getListaProdutos().size()>0){
           NotaFiscal nota = new NotaFiscal(usuario);
           nota.setVisible(true);
        }
        else{
              JOptionPane.showMessageDialog(null, "Nenhum produto comprado", "titulo da janela", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEmitirNotaFiscalActionPerformed

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
            java.util.logging.Logger.getLogger(CompraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraProdutos(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JButton jButtonEmitirNotaFiscal;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTotal;
    // End of variables declaration//GEN-END:variables



    

    

    
}
