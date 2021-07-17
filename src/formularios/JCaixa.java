/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Administrador;
import entidades.Cliente;
import entidades.Produto;
import entidades.Vendas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.Administracao;
import servicos.Estoque;

/**
 *
 * @author vinic
 */
public class JCaixa extends javax.swing.JFrame {
    Administrador administrador; 
    Administracao adm;
    Estoque est;
    Vendas venda;
    /**
     * Creates new form JVendas
     */
    public JCaixa() {
        initComponents();
    }
    
    /**
     * Creates new form JVendas
     * @param adm
     * @param est
     */
    public JCaixa(Administracao adm, Estoque est,Administrador administrador) {
        initComponents();
        this.adm = adm;
        this.est = est;
        this.administrador = administrador;
        listarClientes();
        listarProdutos();
        carregarCodigo();
        jTextFieldPrecoTotalCompra.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogListaVendas = new javax.swing.JDialog();
        jButtonExibirListaProdutos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaVendas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jDialogListaProdutosVenda = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProdutosVenda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabelCodCliente = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jComboBoxNomeCliente = new javax.swing.JComboBox<>();
        jLabelCodProduto = new javax.swing.JLabel();
        jLabelNomeProduto = new javax.swing.JLabel();
        jComboBoxNomeProduto = new javax.swing.JComboBox<>();
        jLabelQuantidadeProduto = new javax.swing.JLabel();
        jTextFieldQuantidadeProduto = new javax.swing.JTextField();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jButtonAdicionarProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProdutos = new javax.swing.JTable();
        jLabelPrecoTotalCompra = new javax.swing.JLabel();
        jTextFieldPrecoTotalCompra = new javax.swing.JTextField();
        jButtonFinalizarVendas = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodVenda = new javax.swing.JTextField();
        jButtonListaTodasVendas = new javax.swing.JButton();

        jButtonExibirListaProdutos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonExibirListaProdutos.setText("Exibir lista de produtos");
        jButtonExibirListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExibirListaProdutosActionPerformed(evt);
            }
        });

        jTableListaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id compra", "Cliente", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableListaVendas);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Lista de vendas");

        javax.swing.GroupLayout jDialogListaVendasLayout = new javax.swing.GroupLayout(jDialogListaVendas.getContentPane());
        jDialogListaVendas.getContentPane().setLayout(jDialogListaVendasLayout);
        jDialogListaVendasLayout.setHorizontalGroup(
            jDialogListaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
            .addGroup(jDialogListaVendasLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogListaVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExibirListaProdutos)
                .addGap(164, 164, 164))
        );
        jDialogListaVendasLayout.setVerticalGroup(
            jDialogListaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogListaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonExibirListaProdutos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableProdutosVenda);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Produtos da categoria");

        javax.swing.GroupLayout jDialogListaProdutosVendaLayout = new javax.swing.GroupLayout(jDialogListaProdutosVenda.getContentPane());
        jDialogListaProdutosVenda.getContentPane().setLayout(jDialogListaProdutosVendaLayout);
        jDialogListaProdutosVendaLayout.setHorizontalGroup(
            jDialogListaProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogListaProdutosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDialogListaProdutosVendaLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogListaProdutosVendaLayout.setVerticalGroup(
            jDialogListaProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogListaProdutosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCodCliente.setText("Código cliente:");

        jLabelNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelNomeCliente.setText("Nome cliente:");

        jTextFieldCodCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodClienteFocusLost(evt);
            }
        });

        jComboBoxNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBoxNomeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNomeCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxNomeClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabelCodProduto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCodProduto.setText("Código produto:");

        jLabelNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelNomeProduto.setText("Nome produto:");

        jComboBoxNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBoxNomeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNomeProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxNomeProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabelQuantidadeProduto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelQuantidadeProduto.setText("Quantidade:");

        jTextFieldCodProduto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextFieldCodProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodProdutoFocusLost(evt);
            }
        });

        jButtonAdicionarProduto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonAdicionarProduto.setText("Adicionar");
        jButtonAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarProdutoActionPerformed(evt);
            }
        });

        jTableListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quant.", "Preço unit.", "Preço total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListaProdutos);
        if (jTableListaProdutos.getColumnModel().getColumnCount() > 0) {
            jTableListaProdutos.getColumnModel().getColumn(0).setMinWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(0).setMaxWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(4).setMinWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableListaProdutos.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabelPrecoTotalCompra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelPrecoTotalCompra.setText("Preço Total:");

        jButtonFinalizarVendas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonFinalizarVendas.setText("Finalizar");
        jButtonFinalizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVendasActionPerformed(evt);
            }
        });

        jButtonCancelarVenda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonCancelarVenda.setText("Cancelar");
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Caixa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Id:");

        jTextFieldCodVenda.setEditable(false);

        jButtonListaTodasVendas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonListaTodasVendas.setText("Lista todas as vendas");
        jButtonListaTodasVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaTodasVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonListaTodasVendas)
                                .addGap(270, 270, 270)
                                .addComponent(jButtonFinalizarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodProduto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCodCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNomeCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxNomeCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, 450, Short.MAX_VALUE)
                                    .addComponent(jComboBoxNomeProduto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelQuantidadeProduto)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelPrecoTotalCompra)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldPrecoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCliente)
                    .addComponent(jLabelCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidadeProduto)
                    .addComponent(jLabelCodProduto)
                    .addComponent(jLabelNomeProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarProduto)
                    .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecoTotalCompra)
                    .addComponent(jTextFieldPrecoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarVenda)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonFinalizarVendas)
                    .addComponent(jButtonListaTodasVendas))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *
    */
    private void jTextFieldCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodClienteFocusLost
        // Evento que carrega um cliente no box pelo codigo
        if(!jTextFieldCodCliente.getText().trim().isEmpty()){ //Se o textField estiver vazio, não realiza o evento
            Cliente cliente;
            cliente = adm.buscarClienteCod(Integer.parseInt(jTextFieldCodCliente.getText().trim())); //trim elimina espaços
            if(cliente == null){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }else{
                jComboBoxNomeCliente.setSelectedItem(cliente.getNome());
            }
        }
        
    }//GEN-LAST:event_jTextFieldCodClienteFocusLost
    
    /*
    *
    */
    private void jComboBoxNomeClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxNomeClientePopupMenuWillBecomeInvisible
        // Evento que carrega o codigo de um cliente pelo box
        Cliente cliente;
        if(jComboBoxNomeCliente.isPopupVisible()){
            cliente = adm.buscarClienteNome(jComboBoxNomeCliente.getSelectedItem().toString().trim());
            jTextFieldCodCliente.setText(Integer.toString(cliente.getCodigoCliente()));
        }
    }//GEN-LAST:event_jComboBoxNomeClientePopupMenuWillBecomeInvisible

    /*
    *
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botao selecionar cliente
        selecionarClienteCompra();
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
    *
    */
    private void jTextFieldCodProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodProdutoFocusLost
        // Carrega o nome do produto na jbox pelo código digitado após a perca de focu na caixa de texto
        if(!jTextFieldCodProduto.getText().trim().isEmpty()){ //Se o textField estiver vazio, não realiza o evento
            Produto produto;
            produto = est.encontrarProdutoCod(Integer.parseInt(jTextFieldCodProduto.getText().trim())); //trim elimina espaços
            if(produto == null){
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }else{
                jComboBoxNomeProduto.setSelectedItem(produto.getNome());
            }
        }
    }//GEN-LAST:event_jTextFieldCodProdutoFocusLost

    /*
    *
    */
    private void jButtonAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProdutoActionPerformed
        // Botão adicionar protudo
        adicionarProdutoCompra();
    }//GEN-LAST:event_jButtonAdicionarProdutoActionPerformed

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        // Botão cancelar
        resetarTela();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // Botão voltar
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonFinalizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarVendasActionPerformed
        // Botão de finalizar a venda
        if(jTableListaProdutos.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Para finalizar uma venda é necessário haver produtos cadastrados.");
        }else{
            finalizarVenda();
        }
        
    }//GEN-LAST:event_jButtonFinalizarVendasActionPerformed

    private void jComboBoxNomeProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxNomeProdutoPopupMenuWillBecomeInvisible
        // Carrega o cod do produto na txtfield pelo jbox
        Produto produto;
        if(jComboBoxNomeProduto.isPopupVisible()){
            produto = est.encontrarProdNome(jComboBoxNomeProduto.getSelectedItem().toString().trim());
            jTextFieldCodCliente.setText(Integer.toString(produto.getCodigoProduto()));
        }
    }//GEN-LAST:event_jComboBoxNomeProdutoPopupMenuWillBecomeInvisible

    private void jButtonListaTodasVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaTodasVendasActionPerformed
        // Lista todas as vendas
        jDialogListaVendas.setVisible(true);
        jDialogListaVendas.setSize(450, 410);
        jDialogListaVendas.setLocationRelativeTo(null);
        listarVendas();
    }//GEN-LAST:event_jButtonListaTodasVendasActionPerformed

    private void jButtonExibirListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibirListaProdutosActionPerformed
        // Botão de exibit lista de produtos das compras
        jDialogListaProdutosVenda.setVisible(true);
        jDialogListaProdutosVenda.setSize(800, 400);
        jDialogListaProdutosVenda.setLocationRelativeTo(null);
        int id = (int) jTableListaVendas.getValueAt(jTableListaVendas.getSelectedRow(), 0);
        carregarListaProdutos(id);
    }//GEN-LAST:event_jButtonExibirListaProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(JCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCaixa().setVisible(true);
            }
        });
    }
    
    /*
    *
    */
    private void listarClientes(){
        jComboBoxNomeCliente.removeAllItems();
        for (int i =0 ; i < adm.getClientes().size(); i++){
            jComboBoxNomeCliente.addItem(adm.getClientes().get(i).getNome());
        }
    }
    
    /*
    *
    */
    private void listarProdutos(){
        jComboBoxNomeProduto.removeAllItems();
        for (int i =0 ; i < est.getProdutosCadastrados().size(); i++){
            jComboBoxNomeProduto.addItem(est.getProdutosCadastrados().get(i).getNome());
        }
    }
    
    /*
    *
    */
    public void selecionarClienteCompra(){
        if(jTextFieldCodCliente.getText().trim().equals("") || jComboBoxNomeCliente.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, preencha algum campo para seleção do cliente.");
        }else{
            venda = new Vendas(Integer.parseInt(jTextFieldCodVenda.getText().trim()));
            Cliente cliente;
            cliente = adm.buscarClienteCod(Integer.parseInt(jTextFieldCodCliente.getText().trim()));
            this.venda.setCliente(cliente);
            jTextFieldCodCliente.setEditable(false);
            jComboBoxNomeCliente.setEditable(false);
            jButton1.setEnabled(false);
        }
    }
    
    /*
    *
    */
    public void adicionarProdutoCompra(){
        if(venda == null){
            JOptionPane.showMessageDialog(null, "Antes de adicionar produtos, é necessário definir um cliente.");
        }else{
            int quant =Integer.parseInt(jTextFieldQuantidadeProduto.getText().trim());
            if(jTextFieldCodProduto.getText().trim().equals("") || jComboBoxNomeProduto.getSelectedItem().equals("") || jTextFieldQuantidadeProduto.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Para adicionar um produto na venda é necassário todos os campos estarem preenchidos.");
            } else if(quant <= 0){
                JOptionPane.showMessageDialog(null, "Quantidade inválida.");
            }else{
                Produto produtoLista;
                int i = Integer.parseInt(jTextFieldCodProduto.getText().trim());
                produtoLista = est.encontrarProdutoCod(i);
                if(produtoLista == null){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                    jTextFieldCodProduto.setText("");
                    jComboBoxNomeProduto.setSelectedItem("");
                    jTextFieldQuantidadeProduto.setText("");
                }else if(Integer.parseInt(jTextFieldQuantidadeProduto.getText().trim()) > produtoLista.getQuantidadeEstoque()){
                    JOptionPane.showMessageDialog(null, "Quantidade é maior que a disponível no estoque.");
                    jTextFieldQuantidadeProduto.setText("");
                }else{
                    Produto produto = new Produto(produtoLista.getCodigoProduto(),produtoLista.getNome(),produtoLista.getMarca(),produtoLista.getPreco(),Integer.parseInt(jTextFieldQuantidadeProduto.getText().trim()), produtoLista.getCategoria());
                    produtoLista.setQuantidadeEstoque(produtoLista.getQuantidadeEstoque()- Integer.parseInt(jTextFieldQuantidadeProduto.getText().trim()));
                    venda.getProdutos().add(produto);
                    DefaultTableModel model = (DefaultTableModel) jTableListaProdutos.getModel();
                    model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome(),produto.getMarca(),produto.getPreco(),produto.getQuantidadeEstoque(), produto.getCategoria()});
                    double precoTxtField = Double.parseDouble(jTextFieldPrecoTotalCompra.getText().trim());
                    double soma = precoTxtField + produto.getPreco()*produto.getQuantidadeEstoque();
                    jTextFieldPrecoTotalCompra.setText(Double.toString(soma));
                    venda.setPrecoTotal(soma);
                }
            }
        }
    }
    
    /*
    *
    */
    public void resetarTela(){
        DefaultTableModel model = (DefaultTableModel) jTableListaProdutos.getModel();
        model.setRowCount(0);
        jTextFieldCodCliente.setEditable(true);
        jComboBoxNomeCliente.setEditable(true);
        jButton1.setEnabled(true);
        jTextFieldCodCliente.setText("");
        jComboBoxNomeCliente.setSelectedItem("");
        jTextFieldCodProduto.setText("");
        jComboBoxNomeProduto.setSelectedItem("");
        jTextFieldQuantidadeProduto.setText("");
        jTextFieldPrecoTotalCompra.setText("0");
        jTextFieldCodVenda.setText(String.valueOf(adm.getIdVendas()));
        venda = null;
    }
    
    /*
    *
    */
    public void finalizarVenda(){
        Cliente cliente;
        cliente = adm.buscarClienteCod(Integer.parseInt(jTextFieldCodCliente.getText().trim()));
        cliente.getCompras().add(venda);
        adm.getListaVendas().add(venda);
        adm.setIdVendas();
        resetarTela();
    }
    
    /*
    *
    */
    public void carregarCodigo(){
        String texto = String.valueOf(adm.getIdVendas());
        jTextFieldCodVenda.setText(texto);
    }
    
    
    public void listarVendas(){
        DefaultTableModel model = (DefaultTableModel) jTableListaVendas.getModel();
        if(adm.getListaVendas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma venda foi realizada.");
        }else{
            for(Vendas venda: adm.getListaVendas() ){
                model.addRow(new Object[]{venda.getId(),venda.getCliente().getNome(),venda.getPrecoTotal()});
            }
        }
    }
    
    public void carregarListaProdutos(int id){
        DefaultTableModel model = (DefaultTableModel) jTableProdutosVenda.getModel(); 
        Vendas venda;
        venda = administrador.buscarVenda(id); 
        for(Produto produto: venda.getProdutos() ){
            model.addRow(new Object[]{produto.getCodigoProduto(),produto.getNome(),produto.getMarca(),produto.getCategoria(),produto.getPreco(),produto.getQuantidadeEstoque()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdicionarProduto;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonExibirListaProdutos;
    private javax.swing.JButton jButtonFinalizarVendas;
    private javax.swing.JButton jButtonListaTodasVendas;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxNomeCliente;
    private javax.swing.JComboBox<String> jComboBoxNomeProduto;
    private javax.swing.JDialog jDialogListaProdutosVenda;
    private javax.swing.JDialog jDialogListaVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCodCliente;
    private javax.swing.JLabel jLabelCodProduto;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelPrecoTotalCompra;
    private javax.swing.JLabel jLabelQuantidadeProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableListaProdutos;
    private javax.swing.JTable jTableListaVendas;
    private javax.swing.JTable jTableProdutosVenda;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldCodVenda;
    private javax.swing.JTextField jTextFieldPrecoTotalCompra;
    private javax.swing.JTextField jTextFieldQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
