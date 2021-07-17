/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Categoria;
import entidades.Cliente;
import entidades.GestorDeEstoque;
import entidades.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.Estoque;

/**
 *
 * @author aliss
 */
public class JListaProduto extends javax.swing.JFrame {
    Estoque est = new Estoque();
    GestorDeEstoque gestor;
    /**
     * Creates new form JListaProdutos
     */
    public JListaProduto() {
        initComponents();
    }
    
    /**
     * Creates new form JListaProdutos
     * @param est
     * @param gestor
     */
    public JListaProduto(Estoque est, GestorDeEstoque gestor){
        initComponents();
        this.est = est;
        this.gestor = gestor;
        //carregarProdutos();
        listarCategorias();
        jButtonSalvar.setVisible(false);
        jToggleButtonExcluir.setEnabled(false);
        jToggleButtonEditar.setEnabled(false);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelMarca = new javax.swing.JLabel();
        jLabelFuncaoFuncionario = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelCodFuncionario = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jLabelEstoque = new javax.swing.JLabel();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jTextFieldEstoque = new javax.swing.JTextField();
        jTextFieldNomeProd = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jToggleButtonExcluir = new javax.swing.JToggleButton();
        jToggleButtonEditar = new javax.swing.JToggleButton();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonListarProdDisponiveis = new javax.swing.JButton();
        jButtonListaProdutosIndis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lista de produtos");

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelMarca.setText("Marca:");

        jLabelFuncaoFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelFuncaoFuncionario.setText("Categoria:");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Preço:");

        jLabelCodFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCodFuncionario.setText("Código:");

        jLabelNomeFuncionario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelNomeFuncionario.setText("Nome:");

        jLabelEstoque.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelEstoque.setText("Quant. Estoque:");

        jToggleButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jToggleButtonExcluir.setText("Excluir");
        jToggleButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonExcluirActionPerformed(evt);
            }
        });

        jToggleButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jToggleButtonEditar.setText("Editar");
        jToggleButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEditarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "Marca", "Categoria", "Quant.", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setMinWidth(80);
            jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableProdutos.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableProdutos.getColumnModel().getColumn(4).setMinWidth(80);
            jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTableProdutos.getColumnModel().getColumn(4).setMaxWidth(80);
            jTableProdutos.getColumnModel().getColumn(5).setMinWidth(80);
            jTableProdutos.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTableProdutos.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setText("Carregar todos os produtos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonListarProdDisponiveis.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonListarProdDisponiveis.setText("Lista produtos disponíveis");
        jButtonListarProdDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarProdDisponiveisActionPerformed(evt);
            }
        });

        jButtonListaProdutosIndis.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonListaProdutosIndis.setText("Listar produtos indisponíveis");
        jButtonListaProdutosIndis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaProdutosIndisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLabelMarca)
                                    .addComponent(jTextFieldMarca)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelCodFuncionario)
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFuncionario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelFuncaoFuncionario)
                                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(56, 56, 56)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelEstoque)
                                                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonListarProdDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonListaProdutosIndis)
                                    .addComponent(jToggleButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNomeFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMarca)
                            .addComponent(jLabel1)
                            .addComponent(jLabelFuncaoFuncionario)
                            .addComponent(jLabelEstoque))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonListaProdutosIndis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarProdDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // Boão voltar
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jToggleButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonExcluirActionPerformed
        //Botão Excluir
        excluirProduto();
        jTextFieldCodProduto.setText("");
        jTextFieldNomeProd.setText("");
        jTextFieldMarca.setText("");
        jComboBoxCategoria.setSelectedItem("");
        jTextFieldPreco.setText("");
        jTextFieldEstoque.setText("");
                
    }//GEN-LAST:event_jToggleButtonExcluirActionPerformed

    private void jToggleButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEditarActionPerformed
        // Botão editar
        if(jTableProdutos.getSelectedRow() != -1){
            jTextFieldCodProduto.setEditable(false);
            jButtonSalvar.setVisible(true);
            jButtonPesquisar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "É necessário selecionar, na tabela, a categoria que deseja editar.");
        } 
    }//GEN-LAST:event_jToggleButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // Botão pesquisar
        pesquisarCliente();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        // Carregar campos ao clicar em um na jtable
        Object ob = jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0);
        jTextFieldCodProduto.setText(ob.toString());
        ob = jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1);
        jTextFieldNomeProd.setText(ob.toString());
        ob = jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 2);
        jTextFieldMarca.setText(ob.toString());
        ob = jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 3);
        jComboBoxCategoria.setSelectedItem(ob.toString());
        ob = jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 4);
        jTextFieldEstoque.setText(ob.toString());
        ob = jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 5);
        jTextFieldPreco.setText(ob.toString());
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Botão de carregar todos os produtos
        carregarProdutos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Salvar edição produto
        editarProduto();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonListaProdutosIndisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaProdutosIndisActionPerformed
        // Lista produto indisponiveis
        carregarProdutosIndisponiveis();
    }//GEN-LAST:event_jButtonListaProdutosIndisActionPerformed

    private void jButtonListarProdDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarProdDisponiveisActionPerformed
        // Lista produtos disponiveis
        carregarProdutosDisponiveis();
    }//GEN-LAST:event_jButtonListarProdDisponiveisActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListaProduto().setVisible(true);
                
            }
        });
    }
      private void excluirProduto(){
        if(jTableProdutos.getSelectedRow() != -1){
            DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
            Produto produto;
            produto = est.encontrarProdutoCod((int) jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
            if(gestor.excluirProdutos(produto)){
                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso.");
                model.removeRow(jTableProdutos.getSelectedRow());
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir o Produto.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "É necessário selecionar, na tabela, o produto que deseja excluir.");
        }
    }
    
    public void carregarProdutos(){
        //carregarProdutos();
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        if(est.getProdutosCadastrados().isEmpty()){
            JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
        }else{
            for(Produto produto: est.getProdutosCadastrados()){
            model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome() ,produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco(),});
            }
            jToggleButtonExcluir.setEnabled(true);
            jToggleButtonEditar.setEnabled(true);
        }
    }
    
    public void carregarProdutosDisponiveis(){
        //carregarProdutos();
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        if(est.getProdutosCadastrados().isEmpty()){
            JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
        }else{
            for(Produto produto: est.getProdutosCadastrados()){
                if(produto.getQuantidadeEstoque() > 0){
                    model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome() ,produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco(),});
                }
            }
            jToggleButtonExcluir.setEnabled(true);
            jToggleButtonEditar.setEnabled(true);
        }
    }
    
    public void carregarProdutosIndisponiveis(){
        //carregarProdutos();
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        if(est.getProdutosCadastrados().isEmpty()){
            JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
        }else{
            for(Produto produto: est.getProdutosCadastrados()){
                if(produto.getQuantidadeEstoque() == 0){
                    model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome() ,produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco(),});
                }
            }
            jToggleButtonExcluir.setEnabled(true);
            jToggleButtonEditar.setEnabled(true);
        }
    }
    
    
    public void pesquisarCliente(){
        Produto produto;
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        model.setRowCount(0);
        if(jTextFieldCodProduto.getText().isEmpty() && jTextFieldNomeProd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha algum campo para pesquisa.");
        }
        else if(jTextFieldCodProduto.getText().isEmpty()){
            produto = est.encontrarProdNome(jTextFieldNomeProd.getText());
            if(produto == null){
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                jTextFieldCodProduto.requestFocus();
            }else{
                model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome(),produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco()});   
                jToggleButtonExcluir.setEnabled(true);
                jToggleButtonEditar.setEnabled(true);
            }
        } else if(jTextFieldNomeProd.getText().isEmpty()){
            produto = est.encontrarProdutoCod(Integer.parseInt(jTextFieldCodProduto.getText()));
            if(produto == null){
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                jTextFieldCodProduto.requestFocus();
            }else{
                model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome(),produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco()});                jToggleButtonExcluir.setEnabled(true);
                jToggleButtonEditar.setEnabled(true);
                jToggleButtonExcluir.setEnabled(true);
            }
        }
    }
    
    public void editarProduto(){
        int id;
        String nomeCategoria;
        Produto produto;
        Categoria categoria;
        DefaultTableModel model = (DefaultTableModel) jTableProdutos.getModel();
        id = (int) jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0);
        nomeCategoria = String.valueOf(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 3)); 
        if(jTextFieldNomeProd.getText().isEmpty() || jTextFieldNomeProd.getText().isEmpty() || jTextFieldMarca.getText().isEmpty() || jTextFieldPreco.getText().isEmpty() || jTextFieldEstoque.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Todos os campos tem que ser preenchidos.");
            
        } else{
            categoria = est.encontrarCategoriaNome(String.valueOf(jComboBoxCategoria.getSelectedItem()));
            boolean teste = gestor.editarProduto(id,jTextFieldNomeProd.getText(),jTextFieldMarca.getText(),Double.parseDouble(jTextFieldPreco.getText()), Integer.parseInt(jTextFieldEstoque.getText()), categoria);
            if(teste){
                JOptionPane.showMessageDialog(null, "Cadastro do produto editado.");
                model.removeRow(jTableProdutos.getSelectedRow());
                produto = est.encontrarProdutoCod(id);
                model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome() ,produto.getMarca(),produto.getCategoria().getNomeCategoria(),produto.getQuantidadeEstoque(),produto.getPreco(),});
                jButtonSalvar.setVisible(false);
                jToggleButtonEditar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao editar cadastro do produto");
                jButtonSalvar.setVisible(false);
                jToggleButtonEditar.setEnabled(true);
            }
        }
    }
    
    public void listarCategorias(){
        jComboBoxCategoria.removeAllItems();
        if(est.getCategorias().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma categoria cadastrada.");
        }else{
            for (int i =0 ; i < est.getCategorias().size(); i++){
                jComboBoxCategoria.addItem(est.getCategorias().get(i).getNomeCategoria());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonListaProdutosIndis;
    private javax.swing.JButton jButtonListarProdDisponiveis;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCodFuncionario;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFuncaoFuncionario;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNomeProd;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JToggleButton jToggleButtonEditar;
    private javax.swing.JToggleButton jToggleButtonExcluir;
    // End of variables declaration//GEN-END:variables
}

