/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.Administracao;

/**
 *
 * @author vinic
 */
public class JClientesExcluidos extends javax.swing.JFrame {
        Administracao adm;
    /**
     * Creates new form JClientesExcluidos
     */
    public JClientesExcluidos() {
        initComponents();
    }
    
    /**
     * Creates new form JClientesExcluidos
     * @param adm
     */
    public JClientesExcluidos( Administracao adm) {
        initComponents();
        this.adm = adm;
        carregarTabela();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientesExcluidos = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Lista clientes excluidos");

        jTableClientesExcluidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. cliente", "Nome", "Celular", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableClientesExcluidos);
        if (jTableClientesExcluidos.getColumnModel().getColumnCount() > 0) {
            jTableClientesExcluidos.getColumnModel().getColumn(0).setMinWidth(80);
            jTableClientesExcluidos.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableClientesExcluidos.getColumnModel().getColumn(0).setMaxWidth(80);
            jTableClientesExcluidos.getColumnModel().getColumn(2).setMinWidth(90);
            jTableClientesExcluidos.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTableClientesExcluidos.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)
                        .addGap(0, 273, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // Botão voltar
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(JClientesExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JClientesExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JClientesExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JClientesExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JClientesExcluidos().setVisible(true);
            }
        });
    }
    /*
    *Ler a lista de cliente excluidos e preenche a tabela;
    */
    public void carregarTabela(){
        DefaultTableModel model = (DefaultTableModel) jTableClientesExcluidos.getModel();
        ((DefaultTableModel) jTableClientesExcluidos.getModel()).setRowCount(0);
        try{
            for(Cliente cliente: adm.getClientesExcluidos() ){
                model.addRow(new Object[]{cliente.getCodigoCliente(), cliente.getNome(),cliente.getNumeroTelefone(),cliente.getEndereco()});
            }
        }catch(NullPointerException ex){
            System.out.print(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Dados da tabela não foram encontrados");

        }catch(Exception e){
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela.");
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientesExcluidos;
    // End of variables declaration//GEN-END:variables
}
