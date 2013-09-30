package br.edu.utfpr.cwsmanager.model.telas;

import br.edu.utfpr.cwsmanager.model.daos.DaoGenerics;
import br.edu.utfpr.cwsmanager.model.daos.Filter;
import br.edu.utfpr.cwsmanager.model.daos.Operator;
import br.edu.utfpr.cwsmanager.model.endereco.Cidade;
import br.edu.utfpr.cwsmanager.model.movimentacao.OrdemServico;
import br.edu.utfpr.cwsmanager.model.movimentacao.SolicitacaoServico;
import br.edu.utfpr.cwsmanager.model.movimentacao.TipoServico;
import br.edu.utfpr.cwsmanager.model.pessoa.Cliente;
import br.edu.utfpr.cwsmanager.model.pessoa.Funcionario;
import br.edu.utfpr.cwsmanager.model.util.UtilDatas;
import br.edu.utfpr.cwsmanager.model.veiculo.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raphael Lira
 */
public class JDialogOrdemServico extends javax.swing.JDialog {

    public OrdemServico ordemServico;
    private DefaultTableModel tabelaConsulta;
    private List<OrdemServico> ordemServicos = new ArrayList<OrdemServico>();
    private List<Cliente> clientes;
    private UtilDatas converteData = new UtilDatas();
    private List<Funcionario> funcionarios;
    private List<TipoServico> tipoServicos;
    public Cliente cliente;
    public Veiculo veiculo = null;
    public Funcionario funcionario;
    public TipoServico tipoServico;
    public SolicitacaoServico solicitacaoServico;
    private List<SolicitacaoServico> solicitacaoServicos = new ArrayList<SolicitacaoServico>();

    public JDialogOrdemServico(java.awt.Frame parent, boolean modal, boolean consulta) {
        super(parent, modal);
        initComponents();

        ordemServico = new OrdemServico();

        tabelaConsulta = (DefaultTableModel) jTableConsultaOrdem.getModel();
        tabelaConsulta.setNumRows(0);

        pesquisa();

//        if (consulta) {
//            jTabbedPane1.setEnabledAt(0, !consulta);
//           jTabbedPane1.setSelectedIndex(1);
//
//             habilitaCampos(modal);
//        }
//        
        //habilitaCampos(modal);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneOrdem = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextFieldPesquisaOrdemServico = new javax.swing.JFormattedTextField();
        jComboBoxTipoConsultaOs = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaOrdem = new javax.swing.JTable();
        jButtonPesquisarOrdemServico = new javax.swing.JButton();
        jButtonEncerrarOrdem = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem de Serviço");

        jLabel12.setText("Consulta por:");

        jFormattedTextFieldPesquisaOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPesquisaOrdemServicoActionPerformed(evt);
            }
        });

        jComboBoxTipoConsultaOs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cód. Ordem", "Funcionário Responsável", "Cliente" }));

        jTableConsultaOrdem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Status", "Data", "Hora Inicio", "Responsável", "Tipo de Serviço", "Cliente", "Veículo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaOrdem.setToolTipText("");
        jTableConsultaOrdem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableConsultaOrdem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableConsultaOrdemMousePressed(evt);
            }
        });
        jTableConsultaOrdem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableConsultaOrdemKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaOrdem);

        jButtonPesquisarOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa.png"))); // NOI18N
        jButtonPesquisarOrdemServico.setToolTipText("Pesquisar Cliente");
        jButtonPesquisarOrdemServico.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonPesquisarOrdemServico.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonPesquisarOrdemServico.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonPesquisarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarOrdemServicoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 832, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBoxTipoConsultaOs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jFormattedTextFieldPesquisaOrdemServico)
                        .add(18, 18, 18)
                        .add(jButtonPesquisarOrdemServico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel12)
                        .add(jComboBoxTipoConsultaOs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jFormattedTextFieldPesquisaOrdemServico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButtonPesquisarOrdemServico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 361, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPaneOrdem.addTab("Ordem de Serviço", jPanel3);

        jButtonEncerrarOrdem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jButtonEncerrarOrdem.setText("Encerrar Ordem");
        jButtonEncerrarOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncerrarOrdemActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(374, 374, 374)
                .add(jButtonEncerrarOrdem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 287, Short.MAX_VALUE)
                .add(jButtonSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jTabbedPaneOrdem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 907, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonEncerrarOrdem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jTabbedPaneOrdem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 495, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldPesquisaOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPesquisaOrdemServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPesquisaOrdemServicoActionPerformed

    private void jButtonPesquisarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarOrdemServicoActionPerformed

        pesquisa();

    }//GEN-LAST:event_jButtonPesquisarOrdemServicoActionPerformed

    private void jButtonEncerrarOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerrarOrdemActionPerformed
         
        int linha = jTableConsultaOrdem.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ordemServico = ordemServicos.get(linha);

        JDialogCadOrdemServico finalizaOrdem = new JDialogCadOrdemServico(this, true);
        finalizaOrdem.setLocationRelativeTo(finalizaOrdem);
        finalizaOrdem.preencherOrdem(ordemServico);
        finalizaOrdem.encerrarOrdem(ordemServico);
        finalizaOrdem.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButtonEncerrarOrdemActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableConsultaOrdemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaOrdemMousePressed
        int linha = jTableConsultaOrdem.getSelectedRow();
        ordemServico = ordemServicos.get(linha);
        if (ordemServico.getStatus().equals("Concluido")) {
            jButtonEncerrarOrdem.setEnabled(false);
        } else {
            jButtonEncerrarOrdem.setEnabled(true);
        }
    }//GEN-LAST:event_jTableConsultaOrdemMousePressed

    private void jTableConsultaOrdemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableConsultaOrdemKeyPressed
        int linha = jTableConsultaOrdem.getSelectedRow();
        ordemServico = ordemServicos.get(linha);
        if (ordemServico.getStatus().equals("Concluido")) {
            jButtonEncerrarOrdem.setEnabled(false);
        } else {
            jButtonEncerrarOrdem.setEnabled(true);
        }
    }//GEN-LAST:event_jTableConsultaOrdemKeyPressed

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
            java.util.logging.Logger.getLogger(JDialogOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogOrdemServico dialog = new JDialogOrdemServico(new javax.swing.JFrame(), true, false);
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
    private javax.swing.JButton jButtonEncerrarOrdem;
    private javax.swing.JButton jButtonPesquisarOrdemServico;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxTipoConsultaOs;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesquisaOrdemServico;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneOrdem;
    private javax.swing.JTable jTableConsultaOrdem;
    // End of variables declaration//GEN-END:variables

    public void pesquisa() {
        ordemServicos = new ArrayList<>();

        switch (jComboBoxTipoConsultaOs.getSelectedIndex()) {
            case 0:
                try {
                    ordemServicos = new DaoGenerics<OrdemServico>(OrdemServico.class).list(new Filter("id", Operator.LIKE, jFormattedTextFieldPesquisaOrdemServico.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(JDialogConsTipoDeServico.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

//            case 1:
//                try {
//                    ordemServicos = new DaoGenerics<OrdemServico>(OrdemServico.class).execute("select s.nome from OrdemServico s join s.SolicitacaoServico where s.funcionario_id like '%" + jFormattedTextFieldPesquisaOrdemServico.getText() + "%'");
//                } catch (Exception ex) {
//                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                break;

//            case 2:
//                try {
//                    ordemServicos = new DaoGenerics<OrdemServico>(OrdemServico.class).execute("select s from SolicitacaoServico s where s.cliente.nome like '%" + jFormattedTextFieldPesquisaOrdemServico.getText() + "%'");
//                } catch (Exception ex) {
//                    Logger.getLogger(JDialogConsCliente.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                break;
        }
        preencherjTable();
    }

    private void preencherjTable() {
        tabelaConsulta.setNumRows(0);

        if (ordemServicos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registros não encontrados.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (OrdemServico obj : ordemServicos) {
            tabelaConsulta.addRow(new Object[]{
                obj.getId(),
                obj.getStatus(),
                obj.getData(),
                obj.getSolicitacaoServico().getHorario(),
                obj.getSolicitacaoServico().getFuncionario(),
                obj.getSolicitacaoServico().getTipoServico(),
                obj.getSolicitacaoServico().getCliente(),
                obj.getSolicitacaoServico().getVeiculo()
            //    obj.getEmail()
            });
        }
    }

   
}
