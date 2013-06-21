package br.edu.utfpr.syslavarapido.model.telas;

import java.awt.Desktop;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class JFramePrincipal extends javax.swing.JFrame {

    /** Creates new form TelaPrincipal */
    public JFramePrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        HibernateConfiguration.getSessionFactory();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtAtalho = new javax.swing.JToolBar();
        jButtonCliente = new javax.swing.JButton();
        jButtonProduto = new javax.swing.JButton();
        jButtonCompra = new javax.swing.JButton();
        jButtonVenda = new javax.swing.JButton();
        jButtonHistoricoCliente = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jButtonConsulta = new javax.swing.JButton();
        jButtonGerRelatorio = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();
        jButtonManual = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jpBaixo = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemCidade = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuItemHistorico = new javax.swing.JMenuItem();
        jMenuCompra = new javax.swing.JMenu();
        jMenuItemCompra = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenu();
        jMenuItemEstoque = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConsCliente = new javax.swing.JMenuItem();
        jMenuItemConsFornec = new javax.swing.JMenuItem();
        jMenuItemConsFunc = new javax.swing.JMenuItem();
        jMenuItemConsProduto = new javax.swing.JMenuItem();
        jmiRelatórios = new javax.swing.JMenu();
        jmiGerRelatorio = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuFerramenta = new javax.swing.JMenu();
        jMenuItemBanco = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenu();
        jMenuItemInformacao = new javax.swing.JMenuItem();
        consulta = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemManualWeb = new javax.swing.JMenuItem();
        jMenuItemManualModel = new javax.swing.JMenuItem();
        jMenuItemEspecificacao = new javax.swing.JMenuItem();
        jMenuOpcao = new javax.swing.JMenu();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Samansys - Sistema de Gerenciamento de vendas");
        setBackground(new java.awt.Color(182, 184, 221));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1280, 1024));
        setMinimumSize(new java.awt.Dimension(500, 300));

        jtAtalho.setBackground(new java.awt.Color(198, 198, 198));
        jtAtalho.setRollover(true);

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pessoa.png"))); // NOI18N
        jButtonCliente.setToolTipText("Cadastrar de Clientes");
        jButtonCliente.setFocusable(false);
        jButtonCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonClienteMouseExited(evt);
            }
        });
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonCliente);

        jButtonProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cad_product.png"))); // NOI18N
        jButtonProduto.setToolTipText("Cadastro de Produtos");
        jButtonProduto.setFocusable(false);
        jButtonProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonProdutoMouseExited(evt);
            }
        });
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonProduto);

        jButtonCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/compra.png"))); // NOI18N
        jButtonCompra.setToolTipText("Registrar Compras");
        jButtonCompra.setFocusable(false);
        jButtonCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCompraMouseExited(evt);
            }
        });
        jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompraActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonCompra);

        jButtonVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/venda.png"))); // NOI18N
        jButtonVenda.setToolTipText("Registrar Vendas");
        jButtonVenda.setFocusable(false);
        jButtonVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVendaMouseExited(evt);
            }
        });
        jButtonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendaActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonVenda);

        jButtonHistoricoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/historico.png"))); // NOI18N
        jButtonHistoricoCliente.setToolTipText("Histórico de Clientes");
        jButtonHistoricoCliente.setFocusable(false);
        jButtonHistoricoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonHistoricoCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonHistoricoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHistoricoClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHistoricoClienteMouseExited(evt);
            }
        });
        jButtonHistoricoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoricoClienteActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonHistoricoCliente);

        jButtonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/estoque.png"))); // NOI18N
        jButtonEstoque.setToolTipText("Verificar Estoque");
        jButtonEstoque.setFocusable(false);
        jButtonEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEstoqueMouseExited(evt);
            }
        });
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonEstoque);

        jButtonConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/search.png"))); // NOI18N
        jButtonConsulta.setToolTipText("Consulta de Fornecedores");
        jButtonConsulta.setFocusable(false);
        jButtonConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonConsultaMouseExited(evt);
            }
        });
        jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonConsulta);

        jButtonGerRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relatorios.png"))); // NOI18N
        jButtonGerRelatorio.setToolTipText("Gerenciamento de Relatóriosl");
        jButtonGerRelatorio.setFocusable(false);
        jButtonGerRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGerRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGerRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGerRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGerRelatorioMouseExited(evt);
            }
        });
        jButtonGerRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerRelatorioActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonGerRelatorio);

        jButtonSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/help.png"))); // NOI18N
        jButtonSobre.setToolTipText("Informação do Sistema");
        jButtonSobre.setFocusable(false);
        jButtonSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSobreMouseExited(evt);
            }
        });
        jButtonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonSobre);

        jButtonManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/manual.png"))); // NOI18N
        jButtonManual.setToolTipText("Manual do Usuário");
        jButtonManual.setFocusable(false);
        jButtonManual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonManual.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonManual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonManualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonManualMouseExited(evt);
            }
        });
        jButtonManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManualActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonManual);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/quit.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair do Sistema");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSairMouseExited(evt);
            }
        });
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jtAtalho.add(jButtonSair);

        jpBaixo.setBackground(new java.awt.Color(80, 80, 80));
        jpBaixo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStatus.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(254, 254, 254));
        jpBaixo.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 510, 20));

        jMenuCadastro.setMnemonic('C');
        jMenuCadastro.setText("Cadastros");
        jMenuCadastro.setToolTipText("Clique aqui para realizar cadastros");

        jMenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/client.png"))); // NOI18N
        jMenuItemCliente.setMnemonic('C');
        jMenuItemCliente.setText("Cadastrar cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fornec.png"))); // NOI18N
        jMenuItemFornecedor.setMnemonic('F');
        jMenuItemFornecedor.setText("Cadastrar fornecedor");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFornecedor);

        jMenuItemFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/funcionario.png"))); // NOI18N
        jMenuItemFuncionario.setMnemonic('N');
        jMenuItemFuncionario.setText("Cadastrar funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionario);

        jMenuItemCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/city.png"))); // NOI18N
        jMenuItemCidade.setMnemonic('I');
        jMenuItemCidade.setText("Cadastrar cidade");
        jMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCidade);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/product.png"))); // NOI18N
        jMenuItemProduto.setMnemonic('P');
        jMenuItemProduto.setText("Cadastro de produtos");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemProduto);

        jMenuBar1.add(jMenuCadastro);

        jMenuVenda.setMnemonic('V');
        jMenuVenda.setText("Vendas");
        jMenuVenda.setToolTipText("Clique aqui para realizar uma venda");

        jMenuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/res_vendas.png"))); // NOI18N
        jMenuItemVenda.setMnemonic('V');
        jMenuItemVenda.setText("Resgistrar Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemVenda);

        jMenuItemHistorico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/hisotoricomenu.png"))); // NOI18N
        jMenuItemHistorico.setMnemonic('h');
        jMenuItemHistorico.setText("Histórico do Cliente");
        jMenuItemHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHistoricoActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemHistorico);

        jMenuBar1.add(jMenuVenda);

        jMenuCompra.setMnemonic('P');
        jMenuCompra.setText("Compras");
        jMenuCompra.setToolTipText("Clique aqui para realizar uma compra");

        jMenuItemCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/compra_menu.png"))); // NOI18N
        jMenuItemCompra.setMnemonic('C');
        jMenuItemCompra.setText("Registrar Compra");
        jMenuItemCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCompraActionPerformed(evt);
            }
        });
        jMenuCompra.add(jMenuItemCompra);

        jMenuBar1.add(jMenuCompra);

        jMenuEstoque.setMnemonic('E');
        jMenuEstoque.setText("Estoque");
        jMenuEstoque.setToolTipText("Clique aqui para verificar o estoque");

        jMenuItemEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/estoque_menu.png"))); // NOI18N
        jMenuItemEstoque.setMnemonic('E');
        jMenuItemEstoque.setText("Produtos em estoque");
        jMenuItemEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstoqueActionPerformed(evt);
            }
        });
        jMenuEstoque.add(jMenuItemEstoque);

        jMenuBar1.add(jMenuEstoque);

        jMenuConsulta.setMnemonic('u');
        jMenuConsulta.setText("Consultas");
        jMenuConsulta.setToolTipText("consultas");

        jMenuItemConsCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/searchclient.png"))); // NOI18N
        jMenuItemConsCliente.setMnemonic('C');
        jMenuItemConsCliente.setText("Consulta de Clientes");
        jMenuItemConsCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsClienteActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsCliente);

        jMenuItemConsFornec.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsFornec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/searchfornec.png"))); // NOI18N
        jMenuItemConsFornec.setMnemonic('F');
        jMenuItemConsFornec.setText("Consulta de Fornecedores");
        jMenuItemConsFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsFornecActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsFornec);

        jMenuItemConsFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/searchfuncionario.png"))); // NOI18N
        jMenuItemConsFunc.setMnemonic('N');
        jMenuItemConsFunc.setText("Consulta de Funcionários");
        jMenuItemConsFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsFuncActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsFunc);

        jMenuItemConsProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/searchproduct.png"))); // NOI18N
        jMenuItemConsProduto.setMnemonic('P');
        jMenuItemConsProduto.setText("Consulta de Produtos");
        jMenuItemConsProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsProdutoActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConsProduto);

        jMenuBar1.add(jMenuConsulta);

        jmiRelatórios.setMnemonic('r');
        jmiRelatórios.setText("Relatórios");
        jmiRelatórios.setToolTipText("Clique aqui para gerar relatórios");

        jmiGerRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiGerRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/gerenciarRel.png"))); // NOI18N
        jmiGerRelatorio.setMnemonic('G');
        jmiGerRelatorio.setText("Gerenciador de relatórios");
        jmiGerRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGerRelatorioActionPerformed(evt);
            }
        });
        jmiRelatórios.add(jmiGerRelatorio);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/reportCustom.png"))); // NOI18N
        jMenuItem1.setText("Relatórios Customizados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmiRelatórios.add(jMenuItem1);

        jMenuBar1.add(jmiRelatórios);

        jMenuFerramenta.setMnemonic('f');
        jMenuFerramenta.setText("Ferramentas");
        jMenuFerramenta.setToolTipText("Clique aqui para configurar o banco de dados");

        jMenuItemBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bancoDeDados.png"))); // NOI18N
        jMenuItemBanco.setMnemonic('B');
        jMenuItemBanco.setText("Configuração do Banco de dados");
        jMenuItemBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBancoActionPerformed(evt);
            }
        });
        jMenuFerramenta.add(jMenuItemBanco);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/consultaHQL.png"))); // NOI18N
        jMenuItem2.setText("Consulta HQL");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuFerramenta.add(jMenuItem2);

        jMenuBar1.add(jMenuFerramenta);

        jMenuItemSobre.setMnemonic('S');
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.setToolTipText("Clique aqui para visualizar nformações do sistema");

        jMenuItemInformacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInformacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sobre.png"))); // NOI18N
        jMenuItemInformacao.setMnemonic('I');
        jMenuItemInformacao.setText("Informações");
        jMenuItemInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInformacaoActionPerformed(evt);
            }
        });
        jMenuItemSobre.add(jMenuItemInformacao);

        consulta.setText("consulta");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        jMenuItemSobre.add(consulta);

        jMenuBar1.add(jMenuItemSobre);

        jMenuAjuda.setMnemonic('A');
        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.setToolTipText("Clique aqui para consultar o manual");

        jMenuItemManualWeb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemManualWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/manual_menu.png"))); // NOI18N
        jMenuItemManualWeb.setMnemonic('W');
        jMenuItemManualWeb.setText("Manual Web");
        jMenuItemManualWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManualWebActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemManualWeb);

        jMenuItemManualModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemManualModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/manual_mer.png"))); // NOI18N
        jMenuItemManualModel.setMnemonic('M');
        jMenuItemManualModel.setText("Figura do Modelo do Banco de Dados");
        jMenuItemManualModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManualModelActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemManualModel);

        jMenuItemEspecificacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEspecificacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/especificacao.png"))); // NOI18N
        jMenuItemEspecificacao.setMnemonic('E');
        jMenuItemEspecificacao.setText("Especificação do projeto");
        jMenuItemEspecificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEspecificacaoActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemEspecificacao);

        jMenuBar1.add(jMenuAjuda);

        jMenuOpcao.setMnemonic('O');
        jMenuOpcao.setText("Opções");
        jMenuOpcao.setToolTipText("Opções para sair do sistema");

        jMenuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logout.png"))); // NOI18N
        jMenuItemLogout.setMnemonic('L');
        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenuOpcao.add(jMenuItemLogout);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jMenuItemSair.setMnemonic('S');
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcao.add(jMenuItemSair);

        jMenuBar1.add(jMenuOpcao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtAtalho, javax.swing.GroupLayout.DEFAULT_SIZE, 1431, Short.MAX_VALUE)
            .addComponent(jpBaixo, javax.swing.GroupLayout.DEFAULT_SIZE, 1431, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtAtalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 640, Short.MAX_VALUE)
                .addComponent(jpBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Sair();
    }//GEN-LAST:event_jButtonSairActionPerformed
    
    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed
        // TODO add your handling code here:
        JDialogProduto jdProduto = new JDialogProduto(this, true);
        jdProduto.setLocationRelativeTo(null);
        jdProduto.setVisible(true);
    }//GEN-LAST:event_jButtonProdutoActionPerformed
    
    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        JDialogCliente jdCliente = new JDialogCliente(this, true);
        jdCliente.setLocationRelativeTo(null);
        jdCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed
    
    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        // TODO add your handling code here:
        JDialogCliente jdCliente = new JDialogCliente(this, true);
        jdCliente.setLocationRelativeTo(jdCliente);
        jdCliente.setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed
    
    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        // TODO add your handling code here:
        JDialogProduto jdProduto = new JDialogProduto(this, true);
        jdProduto.setLocationRelativeTo(null);
        jdProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed
    
    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        // TODO add your handling code here:
        JDialogFornecedor jdFornecedor = new JDialogFornecedor(this, true);
        jdFornecedor.setLocationRelativeTo(null);
        jdFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed
    
    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        // TODO add your handling code here:
        JDialogFuncionario jdFuncionario = new JDialogFuncionario(this, true);
        jdFuncionario.setLocationRelativeTo(null);
        jdFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed
    
    private void jMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadeActionPerformed
        // TODO add your handling code here:
        JDialogCidade jdCidade = new JDialogCidade(this, true);
        jdCidade.setLocationRelativeTo(null);
        jdCidade.setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadeActionPerformed
    
    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed
        // TODO add your handling code here:
        JDialogVenda jdVenda = new JDialogVenda(this, true);
        jdVenda.setLocationRelativeTo(null);
        jdVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendaActionPerformed
    
    private void jButtonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendaActionPerformed
        // TODO add your handling code here:
        JDialogVenda jdVenda = new JDialogVenda(this, true);
        jdVenda.setLocationRelativeTo(null);
        jdVenda.setVisible(true);
    }//GEN-LAST:event_jButtonVendaActionPerformed
    
    private void jMenuItemCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCompraActionPerformed
        // TODO add your handling code here:
        JDialogCompra jdCompra = new JDialogCompra(this, true);
        jdCompra.setLocationRelativeTo(null);
        jdCompra.setVisible(true);
    }//GEN-LAST:event_jMenuItemCompraActionPerformed
    
    private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
        // TODO add your handling code here:
        JDialogCompra jdCompra = new JDialogCompra(this, true);
        jdCompra.setLocationRelativeTo(null);
        jdCompra.setVisible(true);
        
    }//GEN-LAST:event_jButtonCompraActionPerformed
    
    private void jMenuItemEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstoqueActionPerformed
        // TODO add your handling code here:
        JDialogEstoque jdEstoque = new JDialogEstoque(this, true);
        jdEstoque.setLocationRelativeTo(null);
        jdEstoque.setVisible(true);
    }//GEN-LAST:event_jMenuItemEstoqueActionPerformed
    
    private void jMenuItemConsClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsClienteActionPerformed
        // TODO add your handling code here:
        JDialogConsCliente jdConsCliente = new JDialogConsCliente(this, true);
        jdConsCliente.setLocationRelativeTo(null);
        jdConsCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsClienteActionPerformed
    
    private void jMenuItemConsFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsFuncActionPerformed
        // TODO add your handling code here:
        JDialogConsFun jDialogConsFunc = new JDialogConsFun(this, true);
        jDialogConsFunc.setLocationRelativeTo(null);
        jDialogConsFunc.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsFuncActionPerformed
    
    private void jMenuItemConsFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsFornecActionPerformed
        // TODO add your handling code here:
        JDialogConsFornec jDialogConsFornec = new JDialogConsFornec(this, true);
        jDialogConsFornec.setLocationRelativeTo(null);
        jDialogConsFornec.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsFornecActionPerformed
    
    private void jMenuItemConsProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsProdutoActionPerformed
        // TODO add your handling code here:
        JDialogConsProduto jdConsProduto = new JDialogConsProduto(this, true);
        jdConsProduto.setLocationRelativeTo(null);
        jdConsProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsProdutoActionPerformed
    
    private void jmiGerRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGerRelatorioActionPerformed
        // TODO add your handling code here:
        JDialogRelatorio jDialogRelatorio = new JDialogRelatorio(this, true);
        jDialogRelatorio.setLocationRelativeTo(null);
        jDialogRelatorio.setVisible(true);
        
    }//GEN-LAST:event_jmiGerRelatorioActionPerformed
    
    private void jMenuItemInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInformacaoActionPerformed
        // TODO add your handling code here:
        JDialogInformacao jDialogInformacao = new JDialogInformacao(null, true);
        jDialogInformacao.setLocationRelativeTo(null);
        jDialogInformacao.setVisible(true);
    }//GEN-LAST:event_jMenuItemInformacaoActionPerformed
    
    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        Sair();
    }//GEN-LAST:event_jMenuItemSairActionPerformed
    
    private void jButtonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreActionPerformed
        // TODO add your handling code here:
        JDialogInformacao jDialogInformacao = new JDialogInformacao(null, true);
        jDialogInformacao.setLocationRelativeTo(null);
        jDialogInformacao.setVisible(true);
        
    }//GEN-LAST:event_jButtonSobreActionPerformed
    
    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        // TODO add your handling code here:
        JDialogLogin telaL = new JDialogLogin(null, true);
        telaL.setLocationRelativeTo(telaL);
        telaL.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed
    
    private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaActionPerformed
        // TODO add your handling code here:
        JDialogConsFornec jDialogConsFornec = new JDialogConsFornec(this, true);
        jDialogConsFornec.setLocationRelativeTo(jDialogConsFornec);
        jDialogConsFornec.setVisible(true);
    }//GEN-LAST:event_jButtonConsultaActionPerformed
    
    private void jButtonGerRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerRelatorioActionPerformed
        // TODO add your handling code here:
        JDialogRelatorio jDialogRelatorio = new JDialogRelatorio(this, true);
        jDialogRelatorio.setLocationRelativeTo(null);
        jDialogRelatorio.setVisible(true);
    }//GEN-LAST:event_jButtonGerRelatorioActionPerformed
    
    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        // TODO add your handling code here:
        JDialogEstoque jdEstoque = new JDialogEstoque(this, true);
        jdEstoque.setLocationRelativeTo(null);
        jdEstoque.setVisible(true);
    }//GEN-LAST:event_jButtonEstoqueActionPerformed
    
    private void jMenuItemManualModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManualModelActionPerformed
        mostrarAjuda();
    }//GEN-LAST:event_jMenuItemManualModelActionPerformed
    
    private void jMenuItemBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBancoActionPerformed
        // TODO add your handling code here:
        JDialogConfigBanco jDialogConfigBanco = new JDialogConfigBanco((null), false);
        jDialogConfigBanco.setLocationRelativeTo(null);
        jDialogConfigBanco.setVisible(true);
    }//GEN-LAST:event_jMenuItemBancoActionPerformed
    
    private void jButtonClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClienteMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Cadastro de Clientes");
    }//GEN-LAST:event_jButtonClienteMouseEntered
    
    private void jButtonClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClienteMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonClienteMouseExited
    
    private void jButtonProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProdutoMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Cadastro de Produtos");
    }//GEN-LAST:event_jButtonProdutoMouseEntered
    
    private void jButtonProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProdutoMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonProdutoMouseExited
    
    private void jButtonVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVendaMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Registrar Vendas");
    }//GEN-LAST:event_jButtonVendaMouseEntered
    
    private void jButtonVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVendaMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonVendaMouseExited
    
    private void jButtonCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCompraMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Registrar Compras");
    }//GEN-LAST:event_jButtonCompraMouseEntered
    
    private void jButtonCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCompraMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonCompraMouseExited
    
    private void jButtonEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstoqueMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Verificar Estoque de Produtos");
        
    }//GEN-LAST:event_jButtonEstoqueMouseEntered
    
    private void jButtonEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEstoqueMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonEstoqueMouseExited
    
    private void jButtonConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Consulta de Fornecedores");
    }//GEN-LAST:event_jButtonConsultaMouseEntered
    
    private void jButtonConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonConsultaMouseExited
    
    private void jButtonGerRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGerRelatorioMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Gerenciador de Relatórios");
    }//GEN-LAST:event_jButtonGerRelatorioMouseEntered
    
    private void jButtonGerRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGerRelatorioMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonGerRelatorioMouseExited
    
    private void jButtonSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSobreMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Informações sobre o sistema");
    }//GEN-LAST:event_jButtonSobreMouseEntered
    
    private void jButtonSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSobreMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonSobreMouseExited
    
    private void jButtonManualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonManualMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Manual do Usuário");
    }//GEN-LAST:event_jButtonManualMouseEntered
    
    private void jButtonManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonManualMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonManualMouseExited
    
    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Sair do Sistema");
    }//GEN-LAST:event_jButtonSairMouseEntered
    
    private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonSairMouseExited
    
    private void jButtonHistoricoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistoricoClienteMouseEntered
        // TODO add your handling code here:
        jLabelStatus.setText("Hstórico do Cliente");
    }//GEN-LAST:event_jButtonHistoricoClienteMouseEntered
    
    private void jButtonHistoricoClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHistoricoClienteMouseExited
        // TODO add your handling code here:
        jLabelStatus.setText("");
    }//GEN-LAST:event_jButtonHistoricoClienteMouseExited
    
    private void jButtonHistoricoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoricoClienteActionPerformed
        // TODO add your handling code here:
        JDialogHistCliente jDialogHistCliente = new JDialogHistCliente(this, true);
        jDialogHistCliente.setLocationRelativeTo(null);
        jDialogHistCliente.setVisible(true);
    }//GEN-LAST:event_jButtonHistoricoClienteActionPerformed
    
    private void jMenuItemHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHistoricoActionPerformed
        // TODO add your handling code here:
        JDialogHistCliente jDialogHistCliente = new JDialogHistCliente(this, true);
        jDialogHistCliente.setLocationRelativeTo(null);
        jDialogHistCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemHistoricoActionPerformed
    
    private void timer2OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer2OnTime
        // TODO add your handling code here:
    }//GEN-LAST:event_timer2OnTime
    
    private void jMenuItemEspecificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEspecificacaoActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().open(new File("src/HTML/espec_projeto.html"));
        } catch (Exception ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemEspecificacaoActionPerformed
    
    private void jMenuItemManualWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManualWebActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().open(new File("src/HTML/manual.html"));
        } catch (Exception ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemManualWebActionPerformed
    
    private void jButtonManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManualActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().open(new File("src/HTML/manual.html"));
        } catch (Exception ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonManualActionPerformed
    
private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
// TODO add your handling code here:
    JDialogConsulta jDialogConsulta = new JDialogConsulta(null, true);
    jDialogConsulta.setVisible(true);
}//GEN-LAST:event_consultaActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JDialogRelatCustomizado jDialogRelatCustomizado = new JDialogRelatCustomizado(this, true);
        jDialogRelatCustomizado.setLocationRelativeTo(null);
        jDialogRelatCustomizado.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JDialogConsultaHQL jDialogConsultaHQL = new JDialogConsultaHQL(this, true);
        jDialogConsultaHQL.setLocationRelativeTo(null);
        jDialogConsultaHQL.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void Sair() {
        String[] opcoes = {"Sim", "Não"};
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Mensagem",
                JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
        if (JOptionPane.YES_OPTION == opcao) {
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                JFramePrincipal telaP = new JFramePrincipal();
                telaP.setLocationRelativeTo(telaP);
                telaP.setVisible(true);
                JDialogLogin telaL = new JDialogLogin(null, true);
                telaL.setLocationRelativeTo(telaL);
                telaL.setVisible(true);
                System.out.println("teste");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consulta;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonCompra;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonGerRelatorio;
    private javax.swing.JButton jButtonHistoricoCliente;
    private javax.swing.JButton jButtonManual;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JButton jButtonVenda;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCompra;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenu jMenuEstoque;
    private javax.swing.JMenu jMenuFerramenta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemBanco;
    private javax.swing.JMenuItem jMenuItemCidade;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemCompra;
    private javax.swing.JMenuItem jMenuItemConsCliente;
    private javax.swing.JMenuItem jMenuItemConsFornec;
    private javax.swing.JMenuItem jMenuItemConsFunc;
    private javax.swing.JMenuItem jMenuItemConsProduto;
    private javax.swing.JMenuItem jMenuItemEspecificacao;
    private javax.swing.JMenuItem jMenuItemEstoque;
    private javax.swing.JMenuItem jMenuItemFornecedor;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemHistorico;
    private javax.swing.JMenuItem jMenuItemInformacao;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemManualModel;
    private javax.swing.JMenuItem jMenuItemManualWeb;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuOpcao;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JMenuItem jmiGerRelatorio;
    private javax.swing.JMenu jmiRelatórios;
    private javax.swing.JPanel jpBaixo;
    private javax.swing.JToolBar jtAtalho;
    // End of variables declaration//GEN-END:variables

    private void mostrarAjuda() {
        try {
            Desktop.getDesktop().open(new File("src/HTML/ajuda.html"));
        } catch (Exception ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
