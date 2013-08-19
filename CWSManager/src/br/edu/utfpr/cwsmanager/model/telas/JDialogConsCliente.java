/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.telas;

import br.edu.utfpr.cwsmanager.model.daos.DaoGenerics;
import br.edu.utfpr.cwsmanager.model.daos.Filter;
import br.edu.utfpr.cwsmanager.model.daos.Operator;
import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EduardoGreco
 */
public class JDialogConsCliente extends javax.swing.JDialog {

    private List<Cliente> clientes;
    private DefaultTableModel modeloCliente;
    public Cliente cliente;

    public JDialogConsCliente(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();

        cliente = new Cliente();

        modeloCliente = (DefaultTableModel) jTableResult.getModel();
        modeloCliente.setNumRows(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxCampos = new javax.swing.JComboBox();
        jFormattedTextFieldPesquisa = new javax.swing.JFormattedTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jButtonOk = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Clientes");

        jLabelPesquisa.setText("Consulta por:");

        jComboBoxCampos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Codigo", "Nome", "CPF", "Email" }));
        jComboBoxCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCamposActionPerformed(evt);
            }
        });

        jFormattedTextFieldPesquisa.setMinimumSize(new java.awt.Dimension(42, 28));
        jFormattedTextFieldPesquisa.setPreferredSize(new java.awt.Dimension(42, 28));

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Pesquisar Cidade");
        jButtonPesquisar.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonPesquisar.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonPesquisar.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResult);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 720, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 212, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jButtonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ok.png"))); // NOI18N
        jButtonOk.setText("Visualizar");
        jButtonOk.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonOk.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonOk.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        jButtonCancelar.setText("Limpar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(37, 37, 37)
                        .add(jLabelPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBoxCampos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(jFormattedTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButtonPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(jButtonOk, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(35, 35, 35)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButtonPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabelPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jComboBoxCampos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jFormattedTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(31, 31, 31)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonOk, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        pesquisa();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        selecionar();
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        modeloCliente.setNumRows(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCamposActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogConsCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogConsCliente dialog = new JDialogConsCliente(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxCampos;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesquisa;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResult;
    // End of variables declaration//GEN-END:variables

    private void selecionar() {
        int linha = jTableResult.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        cliente = clientes.get(linha);
        dispose();
    }

    private void pesquisa() {
        clientes = new ArrayList<>();

        switch (jComboBoxCampos.getSelectedIndex()) {
            case 0:
                try {
                    clientes = new DaoGenerics<Cliente>(Cliente.class).list();
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;

            case 1:
                try {
                    clientes = new DaoGenerics<Cliente>(Cliente.class).list(new Filter("id", Operator.LIKE, jFormattedTextFieldPesquisa.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case 2:
                try {
                    clientes = new DaoGenerics<Cliente>(Cliente.class).list(new Filter("nome", Operator.LIKE, jFormattedTextFieldPesquisa.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                
            case 3:
                try {
                    clientes = new DaoGenerics<Cliente>(Cliente.class).list(new Filter("cpf", Operator.LIKE, jFormattedTextFieldPesquisa.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                
            case 4:
                try {
                    clientes = new DaoGenerics<Cliente>(Cliente.class).list(new Filter("email", Operator.LIKE, jFormattedTextFieldPesquisa.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        preencherjTable();
    }

    private void preencherjTable() {
        modeloCliente.setNumRows(0);

        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registros não encontrados.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Cliente obj : clientes) {
            modeloCliente.addRow(new Object[]{
                obj.getId(),
                obj.getNome(),
                obj.getCpf(),
                obj.getEmail()
            });
        }
    }
}
