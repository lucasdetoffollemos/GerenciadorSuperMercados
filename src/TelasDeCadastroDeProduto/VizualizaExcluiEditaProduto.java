package TelasDeCadastroDeProduto;


import TelasDeCadastroDeProduto.CadastroProdutos;
import Classes.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class VizualizaExcluiEditaProduto extends javax.swing.JFrame {

    /**
     * Creates new form CrudProduto
     */
    
    
    
    public VizualizaExcluiEditaProduto() {
        initComponents();
 
        geraComboBox();
        
    }
    
    private void geraComboBox() {
        for(int i = 0; i < CadastroProdutos.supermercado.getProdutosCadastrados().size(); i++) {
            jComboBox1.addItem(CadastroProdutos.supermercado.getProdutosCadastrados().get(i).getDescricao());
        }
    }
    
     private void verificaSeProdutosEhVazio() {
        if(CadastroProdutos.supermercado.getProdutosCadastrados().isEmpty()){
            setVisible(false);
            dispose(); 
        }
    }
    
    private void excluirProduto() {
        String produto = jComboBox1.getSelectedItem().toString();
        int cod = 0;
        ArrayList<Produto> produtos = CadastroProdutos.supermercado.getProdutosCadastrados();
        
        for(int i = 0; i < produtos.size(); i++) { 
            if(produtos.get(i).getDescricao().equals(produto)){
                cod = produtos.get(i).getCodigo();
                
                CadastroProdutos.supermercado.removeProduto(cod);
                //Retirando o respectivo produto da comboBox
                jComboBox1.removeItemAt(i);
            }
        }
        
        verificaSeProdutosEhVazio();
        
    }
    
    private Produto achaOProdutoASerEditado() {
        
        String descricaoProduto = jComboBox1.getSelectedItem().toString();
        Produto produto = null;
               
        for(int i = 0; i < CadastroProdutos.supermercado.getProdutosCadastrados().size(); i++) { 
            if(CadastroProdutos.supermercado.getProdutosCadastrados().get(i).getDescricao().equals(descricaoProduto)){
                produto = CadastroProdutos.supermercado.getProdutosCadastrados().get(i);
                
            }
        }
        
        return produto;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Visualizar Produtos Cadastrados");

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonVoltar)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonEditar)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        setVisible(false); 
        dispose(); 
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
         switch(JOptionPane.showConfirmDialog(null, "Tem certeza disso? ", "Excluir produto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)){
            case 0: //botao sim
                excluirProduto();
            break;
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        Produto p = achaOProdutoASerEditado();

        EdicaoProduto edicaoProduto = new EdicaoProduto(p);
        edicaoProduto.setVisible(true);
        
        //exclui esse jFrame, para quando voltar da outra tela, ser criado um novo jFrame, assim atualizando os novos valores vindos da outra p??gina
        this.setVisible(false);
        this.dispose();
        
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    
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
            java.util.logging.Logger.getLogger(VizualizaExcluiEditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VizualizaExcluiEditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VizualizaExcluiEditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VizualizaExcluiEditaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizualizaExcluiEditaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    

   

    

    
}
