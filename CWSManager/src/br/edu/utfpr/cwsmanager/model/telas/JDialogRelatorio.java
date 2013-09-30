/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cwsmanager.model.telas;

import br.edu.utfpr.cwsmanager.model.daos.HibernateConfiguration;
import br.edu.utfpr.cwsmanager.model.relatorio.JDialogRelatorioExibir;
import java.net.URL;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author EduardoGreco
 */
public class JDialogRelatorio extends javax.swing.JDialog {

    /**
     * Creates new form JDialogRelatorio
     */
    public JDialogRelatorio(java.awt.Frame parent, boolean modal) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioRelSSAberto = new javax.swing.JRadioButton();
        jRadioRelOS = new javax.swing.JRadioButton();
        jRadioRelFuncionarios = new javax.swing.JRadioButton();
        jRadioButtonCliente = new javax.swing.JRadioButton();
        jRadioRelSSEncerradas = new javax.swing.JRadioButton();
        jButtonGerarRel = new javax.swing.JButton();
        jButtonSairRel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selecione o relatório desejado:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonGroup1.add(jRadioRelSSAberto);
        jRadioRelSSAberto.setText("Relatório de Solicitaçao de Serviços em aberto");

        buttonGroup1.add(jRadioRelOS);
        jRadioRelOS.setText("Relatório de Ordem de serviço concluidas");

        buttonGroup1.add(jRadioRelFuncionarios);
        jRadioRelFuncionarios.setText("Relatório de Funcionários");
        jRadioRelFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRelFuncionariosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCliente);
        jRadioButtonCliente.setText("Relatório de Clientes");

        buttonGroup1.add(jRadioRelSSEncerradas);
        jRadioRelSSEncerradas.setText("Relatório de Solicitaçao de Serviços encerradas");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioRelOS)
                    .add(jRadioRelSSAberto)
                    .add(jRadioRelFuncionarios)
                    .add(jRadioRelSSEncerradas)
                    .add(jRadioButtonCliente))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jRadioRelOS)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioRelSSAberto)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioRelSSEncerradas)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButtonCliente)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                .add(jRadioRelFuncionarios)
                .addContainerGap())
        );

        jButtonGerarRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gerarReport.png"))); // NOI18N
        jButtonGerarRel.setText("Gerar");
        jButtonGerarRel.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonGerarRel.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonGerarRel.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonGerarRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelActionPerformed(evt);
            }
        });

        jButtonSairRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jButtonSairRel.setText("Sair");
        jButtonSairRel.setMaximumSize(new java.awt.Dimension(42, 28));
        jButtonSairRel.setMinimumSize(new java.awt.Dimension(42, 28));
        jButtonSairRel.setPreferredSize(new java.awt.Dimension(42, 28));
        jButtonSairRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairRelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jButtonGerarRel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonSairRel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(4, 4, 4))
            .add(layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 26, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonGerarRel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonSairRel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioRelFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRelFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioRelFuncionariosActionPerformed

    private void jButtonGerarRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelActionPerformed
         if (jRadioRelOS.isSelected()) {
            try {
                relatorioPronto("/br/edu/utfpr/cwsmanager/model/relatorio/relatorioOrdensConcluidas.jasper");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(this, "Relatório de ordens não foi encontrado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (jRadioButtonCliente.isSelected()) {
            try {
                relatorioPronto("/br/edu/utfpr/cwsmanager/model/relatorio/relatorioCliente.jasper");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(this, "Relatório de clientes não foi encontrado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (jRadioRelFuncionarios.isSelected()) {
            try {
                relatorioPronto("/br/edu/utfpr/cwsmanager/model/relatorio/relatorioFuncionarios.jasper");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(this, "Relatório de funcionários não foi encontrado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (jRadioRelSSAberto.isSelected()) {
            try {
                relatorioPronto("/br/edu/utfpr/cwsmanager/model/relatorio/relatorioSSAberto.jasper");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(this, "Relatório de Solicitação em Aberto não foi encontrado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (jRadioRelSSEncerradas.isSelected()) {
            try {
                relatorioPronto("/br/edu/utfpr/cwsmanager/model/relatorio/relatorioSSEncerrado.jasper");
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(this, "Relatório de Solicitação encerradas não foi encontrado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonGerarRelActionPerformed

    private void jButtonSairRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairRelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairRelActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogRelatorio dialog = new JDialogRelatorio(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGerarRel;
    private javax.swing.JButton jButtonSairRel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonCliente;
    private javax.swing.JRadioButton jRadioRelFuncionarios;
    private javax.swing.JRadioButton jRadioRelOS;
    private javax.swing.JRadioButton jRadioRelSSAberto;
    private javax.swing.JRadioButton jRadioRelSSEncerradas;
    // End of variables declaration//GEN-END:variables

    private void relatorioPronto(String nome) throws JRException {
        try {
            URL arquivo = getClass().getResource(nome);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), HibernateConfiguration.getConnection());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            JDialogRelatorioExibir dialog = new JDialogRelatorioExibir((JFrame) getParent(), true);
            dialog.getContentPane().add(jrviewer.getContentPane());
            dialog.setSize(getParent().getSize());
            dialog.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }




    }
}
