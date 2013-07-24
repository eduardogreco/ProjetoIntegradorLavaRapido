/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.telas;

import br.edu.utfpr.cwsmanager.model.daos.DaoCidade;
import br.edu.utfpr.cwsmanager.model.endereco.Cidade;
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
public class JDialogConsCidade extends javax.swing.JDialog {

    private DaoCidade daoCidade;
    private List<Cidade> cidades;
    private DefaultTableModel modeloCidade;
    public Cidade cidade;

    /**
     * Creates new form JDialogConsCliente
     */
    public JDialogConsCidade(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();

        daoCidade = new DaoCidade();
        cidade = new Cidade();

        modeloCidade = (DefaultTableModel) jTableResultConsultaCidade.getModel();
        modeloCidade.setNumRows(0);

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
        jFormattedTextFieldPesquisaFuncionario = new javax.swing.JFormattedTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultConsultaCidade = new javax.swing.JTable();
        jButtonOkConsultaFuncionario = new javax.swing.JButton();
        jButtonCancelarConsultaFuncionario = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Cidades");

        jLabelPesquisa.setText("Consulta por:");

        jComboBoxCampos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Codigo", "Nome" }));
        jComboBoxCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCamposActionPerformed(evt);
            }
        });

        jFormattedTextFieldPesquisaFuncionario.setMinimumSize(new java.awt.Dimension(42, 28));
        jFormattedTextFieldPesquisaFuncionario.setPreferredSize(new java.awt.Dimension(42, 28));

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

        jTableResultConsultaCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultConsultaCidade);

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

        jButtonOkConsultaFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ok.png"))); // NOI18N
        jButtonOkConsultaFuncionario.setText("Ok");
        jButtonOkConsultaFuncionario.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonOkConsultaFuncionario.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonOkConsultaFuncionario.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonOkConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkConsultaFuncionarioActionPerformed(evt);
            }
        });

        jButtonCancelarConsultaFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        jButtonCancelarConsultaFuncionario.setText("Limpar");
        jButtonCancelarConsultaFuncionario.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonCancelarConsultaFuncionario.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonCancelarConsultaFuncionario.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonCancelarConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarConsultaFuncionarioActionPerformed(evt);
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
                        .add(jFormattedTextFieldPesquisaFuncionario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButtonPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(jButtonOkConsultaFuncionario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButtonCancelarConsultaFuncionario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
                        .add(jFormattedTextFieldPesquisaFuncionario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(31, 31, 31)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonOkConsultaFuncionario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonCancelarConsultaFuncionario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        pesquisa();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonOkConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkConsultaFuncionarioActionPerformed
        selecionar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOkConsultaFuncionarioActionPerformed

    private void jButtonCancelarConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarConsultaFuncionarioActionPerformed
        modeloCidade.setNumRows(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarConsultaFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogConsCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogConsCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogConsCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogConsCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogConsCidade dialog = new JDialogConsCidade(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton jButtonCancelarConsultaFuncionario;
    private javax.swing.JButton jButtonOkConsultaFuncionario;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxCampos;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesquisaFuncionario;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultConsultaCidade;
    // End of variables declaration//GEN-END:variables

    private void selecionar() {
        int linha = jTableResultConsultaCidade.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecion um registro.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        cidade = cidades.get(linha);
        dispose();
    }

    private void pesquisa() {
        cidades = new ArrayList<>();

        switch (jComboBoxCampos.getSelectedIndex()) {
            case 0:
                try {
                    cidades = daoCidade.list();
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsCidade.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;

            case 1:
                break;

            case 2:

                break;
        }

        preencherjTable();
    }

    private void preencherjTable() {
        modeloCidade.setNumRows(0);

        if (cidades.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registros não encontrados.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Cidade obj : cidades) {
            modeloCidade.addRow(new Object[]{
                obj.getId(),
                obj.getNome(),
                obj.getEstado(),});
        }
    }
}
