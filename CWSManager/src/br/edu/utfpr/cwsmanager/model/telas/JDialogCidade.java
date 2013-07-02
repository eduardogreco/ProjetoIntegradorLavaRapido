/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.telas;

import br.edu.utfpr.cwsmanager.model.daos.DaoCidade;
import br.edu.utfpr.cwsmanager.model.endereco.Cidade;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EduardoGreco
 */
public class JDialogCidade extends javax.swing.JDialog {

    private DaoCidade daoCidade = new DaoCidade();
    /**
     * Creates new form JDialogCidade
     */
    public JDialogCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabelCodCidade = new javax.swing.JLabel();
        jLabelNomeCidade = new javax.swing.JLabel();
        jLabelEstadoCidade = new javax.swing.JLabel();
        jTextFieldIdCidade = new javax.swing.JTextField();
        jTextFieldNomeCidade = new javax.swing.JTextField();
        jButtonPesquisarCidade = new javax.swing.JButton();
        jComboBoxEstadoCidade = new javax.swing.JComboBox();
        jButtonAlterarCidade = new javax.swing.JButton();
        jButtonExcluirCidade = new javax.swing.JButton();
        jButtonIncluirCidade = new javax.swing.JButton();
        jButtonSairCidade = new javax.swing.JButton();
        jButtonGravarCidade = new javax.swing.JButton();
        jButtonCancelarCidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodCidade.setText("Código:");

        jLabelNomeCidade.setText("Nome:");

        jLabelEstadoCidade.setText("Estado:");

        jTextFieldNomeCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCidadeActionPerformed(evt);
            }
        });

        jButtonPesquisarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa.png"))); // NOI18N
        jButtonPesquisarCidade.setToolTipText("Pesquisar Cliente");
        jButtonPesquisarCidade.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonPesquisarCidade.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonPesquisarCidade.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonPesquisarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarCidadeActionPerformed(evt);
            }
        });

        jComboBoxEstadoCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Minas Gerais", "Mato Grosso do Sul", "Mato Grosso", "Pará", "Paraíba", "Pernambuco", "Piauí", "Paraná", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "Sergipe", "São Paulo", "Tocantins" }));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelEstadoCidade)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelCodCidade)
                            .add(jLabelNomeCidade))
                        .add(26, 26, 26)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextFieldNomeCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jTextFieldIdCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButtonPesquisarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jComboBoxEstadoCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabelCodCidade)
                        .add(jTextFieldIdCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButtonPesquisarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNomeCidade)
                    .add(jTextFieldNomeCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEstadoCidade)
                    .add(jComboBoxEstadoCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jButtonAlterarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        jButtonAlterarCidade.setText("Alterar");
        jButtonAlterarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarCidadeActionPerformed(evt);
            }
        });

        jButtonExcluirCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jButtonExcluirCidade.setText("Exluir");
        jButtonExcluirCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirCidadeActionPerformed(evt);
            }
        });

        jButtonIncluirCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/incluir.png"))); // NOI18N
        jButtonIncluirCidade.setText("Incluir");
        jButtonIncluirCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirCidadeActionPerformed(evt);
            }
        });

        jButtonSairCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jButtonSairCidade.setText("Sair");
        jButtonSairCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairCidadeActionPerformed(evt);
            }
        });

        jButtonGravarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gravar.png"))); // NOI18N
        jButtonGravarCidade.setText("Gravar");
        jButtonGravarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarCidadeActionPerformed(evt);
            }
        });

        jButtonCancelarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jButtonCancelarCidade.setText("Cancelar");
        jButtonCancelarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCidadeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(jButtonSairCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButtonGravarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jButtonIncluirCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 86, Short.MAX_VALUE)
                                .add(jButtonExcluirCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jButtonAlterarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonCancelarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonSairCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonGravarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonCancelarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(jButtonIncluirCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonAlterarCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(jButtonExcluirCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCidadeActionPerformed

    private void jButtonPesquisarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarCidadeActionPerformed
int id = Integer.parseInt(jTextFieldIdCidade.getText().trim());
        try {
            setCidade(daoCidade.retrieve(id));
        } catch (Exception ex) {
            Logger.getLogger(JDialogCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarCidadeActionPerformed

    private void jButtonAlterarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarCidadeActionPerformed
habilitaCampos(true);
    }//GEN-LAST:event_jButtonAlterarCidadeActionPerformed

    private void jButtonExcluirCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirCidadeActionPerformed
        try {
            daoCidade.delete(getCidade());
        } catch (Exception ex) {
            Logger.getLogger(JDialogCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearCampos();
    }//GEN-LAST:event_jButtonExcluirCidadeActionPerformed

    private void jButtonIncluirCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirCidadeActionPerformed
        clearCampos();
        habilitaCampos(true);
    }//GEN-LAST:event_jButtonIncluirCidadeActionPerformed

    private void jButtonSairCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairCidadeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairCidadeActionPerformed

    private void jButtonGravarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarCidadeActionPerformed
        Cidade cidade = new Cidade();
        
        cidade = getCidade();
        
        try {
            // TODO add your handling code here:
            if (cidade.getId() != 0) {
                daoCidade.update(cidade);
            } else {
                daoCidade.insert(getCidade());
            }

        } catch (Exception ex) {
            Logger.getLogger(JDialogCidade.class.getName()).log(Level.SEVERE, null, ex);
        }

        clearCampos();
        habilitaCampos(false);
    }//GEN-LAST:event_jButtonGravarCidadeActionPerformed

    private void jButtonCancelarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCidadeActionPerformed
habilitaCampos(false);
        clearCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCidade dialog = new JDialogCidade(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAlterarCidade;
    private javax.swing.JButton jButtonCancelarCidade;
    private javax.swing.JButton jButtonExcluirCidade;
    private javax.swing.JButton jButtonGravarCidade;
    private javax.swing.JButton jButtonIncluirCidade;
    private javax.swing.JButton jButtonPesquisarCidade;
    private javax.swing.JButton jButtonSairCidade;
    private javax.swing.JComboBox jComboBoxEstadoCidade;
    private javax.swing.JLabel jLabelCodCidade;
    private javax.swing.JLabel jLabelEstadoCidade;
    private javax.swing.JLabel jLabelNomeCidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldIdCidade;
    private javax.swing.JTextField jTextFieldNomeCidade;
    // End of variables declaration//GEN-END:variables
    public Cidade getCidade() {
        Cidade cidade = new Cidade();
        
        try {
            cidade.setId(Integer.parseInt(jTextFieldIdCidade.getText().trim()));
        } catch (Exception e) {
            cidade.setId(0);
        }
        
        cidade.setNome(jTextFieldNomeCidade.getText().trim());
        cidade.setEstado(jComboBoxEstadoCidade.getSelectedItem().toString());
        
        return cidade;
    }
    
    private void setCidade(Cidade cidade){
    jTextFieldNomeCidade.setText(cidade.getNome());
    jComboBoxEstadoCidade.setSelectedItem(cidade.getEstado());
    }
    
    private void clearCampos() {
        jTextFieldIdCidade.setText("");
        jTextFieldNomeCidade.setText("");

    }
    
    private void habilitaCampos(boolean comando) {
        jButtonAlterarCidade.setEnabled(!comando);
        jButtonExcluirCidade.setEnabled(!comando);
        jButtonIncluirCidade.setEnabled(!comando);

        jButtonCancelarCidade.setEnabled(comando);
        jButtonGravarCidade.setEnabled(comando);

        jTextFieldIdCidade.setEnabled(!comando);
        jButtonPesquisarCidade.setEnabled(!comando);
        jTextFieldNomeCidade.setEnabled(comando);
        jComboBoxEstadoCidade.setEnabled(comando);
    }
    }
