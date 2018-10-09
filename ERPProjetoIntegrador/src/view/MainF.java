package view;

import org.apache.log4j.Logger;//Importação principal do log4j - fase de testes ainda
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.dao.MasterDAO;
import model.util.unit;
import org.apache.log4j.Level;
import view.relatorios.ListarCargosF;
import view.relatorios.ListarCidadesF;
import view.relatorios.ListarEstadosF;
import view.relatorios.ListarFormasPagamentosF;
import view.relatorios.ListarProdutosF;
import view.relatorios.ListarUnidadesF;
import view.relatorios.ListarUsuariosF;

public class MainF extends javax.swing.JFrame {
    static Logger log = Logger.getLogger(MainF.class.getName());

    public MainF() {
        log.setLevel(Level.INFO);
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP - Gerenciamento de empresas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Clientes_25.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Fornecedores_25.png"))); // NOI18N
        jMenuItem3.setText("Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Funcionario_25.png"))); // NOI18N
        jMenuItem2.setText("Funcionários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cargos.png"))); // NOI18N
        jMenuItem13.setText("Cargos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Produto.png"))); // NOI18N
        jMenuItem4.setText("Produtos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Unidade.png"))); // NOI18N
        jMenuItem15.setText("Unidades");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/FPagamento_25.png"))); // NOI18N
        jMenuItem12.setText("Formas de pagamentos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Estado_25.png"))); // NOI18N
        jMenuItem5.setText("Estados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cidade_25.png"))); // NOI18N
        jMenuItem6.setText("Cidades");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Usuario_config.png"))); // NOI18N
        jMenu7.setText("Usuários");
        jMenu7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Usuario_perm.png"))); // NOI18N
        jMenuItem14.setText("Usuários");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Usuario_perm.png"))); // NOI18N
        jMenuItem17.setText("Permissões de usuários");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem17);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pedidos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Contratos_25.png"))); // NOI18N
        jMenuItem7.setText("Vendas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Contratos_25.png"))); // NOI18N
        jMenuItem8.setText("Compras");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gerenciamento");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Contas a receber_25.png"))); // NOI18N
        jMenuItem9.setText("Contas a receber");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Contas a receber_25.png"))); // NOI18N
        jMenuItem10.setText("Contas a pagar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Estoque_25.png"))); // NOI18N
        jMenuItem11.setText("Estoque");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Listagem/relatórios");
        jMenu6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem18.setText("Estados");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem19.setText("Cidades");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem20.setText("Unidades");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem21.setText("Formas de pagamentos");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem21);

        jMenuItem22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem22.setText("Cargos");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem22);

        jMenuItem23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem23.setText("Usuários");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem23);

        jMenuItem24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem24.setText("Produtos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem24);

        jMenuBar1.add(jMenu6);

        jMenu8.setText("Suporte");
        jMenu8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem25.setText("Auditoria");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem25);

        jMenuBar1.add(jMenu8);

        jMenu5.setText("Configurações");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Config_25.png"))); // NOI18N
        jMenuItem16.setText("Configurações");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Sair");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroPessoaF ifrPessoa = new CadastroPessoaF(1, 'C');
        ifrPessoa.setTitle("Cadastro de cliente");
        jDesktopPane1.add(ifrPessoa);
        unit.setPositionCenter(ifrPessoa);
        ifrPessoa.setVisible(true);
        //log.info("Teste menu abrindo");//teste do log4j
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CadastroEstadoF ifrEstado = new CadastroEstadoF();
        jDesktopPane1.add(ifrEstado);
        unit.setPositionCenter(ifrEstado);
        ifrEstado.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastroProdutosF ifrProdutos = new CadastroProdutosF();
        jDesktopPane1.add(ifrProdutos);
        unit.setPositionCenter(ifrProdutos);
        ifrProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroPessoaF ifrPessoa = new CadastroPessoaF(3, 'U');
        ifrPessoa.setTitle("Cadastro de funcionários");
        jDesktopPane1.add(ifrPessoa);
        unit.setPositionCenter(ifrPessoa);
        ifrPessoa.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastroPessoaF ifrPessoa = new CadastroPessoaF(2, 'F');
        ifrPessoa.setTitle("Cadastro de fornecedores");
        jDesktopPane1.add(ifrPessoa);
        unit.setPositionCenter(ifrPessoa);
        ifrPessoa.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CadastroCidadeF ifrCidade = new CadastroCidadeF();
        jDesktopPane1.add(ifrCidade);
        unit.setPositionCenter(ifrCidade);
        ifrCidade.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        CadastroFPagamentoF ifrFPagamento = new CadastroFPagamentoF();
        jDesktopPane1.add(ifrFPagamento);
        unit.setPositionCenter(ifrFPagamento);
        ifrFPagamento.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        CadastroUnidadeF ifrUnidade = new CadastroUnidadeF();
        jDesktopPane1.add(ifrUnidade);
        unit.setPositionCenter(ifrUnidade);
        ifrUnidade.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        CadastroUsuarioF ifrUsuario = new CadastroUsuarioF();
        jDesktopPane1.add(ifrUsuario);
        unit.setPositionCenter(ifrUsuario);
        ifrUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        CadastroCargosF ifrCargos = new CadastroCargosF();
        jDesktopPane1.add(ifrCargos);
        unit.setPositionCenter(ifrCargos);
        ifrCargos.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CadastroPedidoF ifrPedido = new CadastroPedidoF(11, "V");
        jDesktopPane1.add(ifrPedido);
        unit.setPositionCenter(ifrPedido);
        ifrPedido.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CadastroPedidoF ifrPedido = new CadastroPedidoF(12, "C");
        jDesktopPane1.add(ifrPedido);
        unit.setPositionCenter(ifrPedido);
        ifrPedido.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CadastroMovFinancF ifrMovFinanc = new CadastroMovFinancF(13);
        jDesktopPane1.add(ifrMovFinanc);
        unit.setPositionCenter(ifrMovFinanc);
        ifrMovFinanc.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CadastroMovFinancF ifrMovFinanc = new CadastroMovFinancF(14);
        jDesktopPane1.add(ifrMovFinanc);
        unit.setPositionCenter(ifrMovFinanc);
        ifrMovFinanc.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        ConfiguraF ifrConfig = new ConfiguraF();
        jDesktopPane1.add(ifrConfig);
        unit.setPositionCenter(ifrConfig);
        ifrConfig.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new MasterDAO().liberaLockUsuario();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        PermissoesUsuarioF ifrPermissoesUsuario = new PermissoesUsuarioF();
        jDesktopPane1.add(ifrPermissoesUsuario);
        unit.setPositionCenter(ifrPermissoesUsuario);
        ifrPermissoesUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        ListarEstadosF ifrListarEstadosF = new ListarEstadosF();
        jDesktopPane1.add(ifrListarEstadosF);
        unit.setPositionCenter(ifrListarEstadosF);
        ifrListarEstadosF.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        ListarCidadesF ifrListarCidadesF = new ListarCidadesF();
        jDesktopPane1.add(ifrListarCidadesF);
        unit.setPositionCenter(ifrListarCidadesF);
        ifrListarCidadesF.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        ListarUnidadesF ifrListarUnidadesF = new ListarUnidadesF();
        jDesktopPane1.add(ifrListarUnidadesF);
        unit.setPositionCenter(ifrListarUnidadesF);
        ifrListarUnidadesF.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        ListarFormasPagamentosF ifrListarFormasPagamentosF = new ListarFormasPagamentosF();
        jDesktopPane1.add(ifrListarFormasPagamentosF);
        unit.setPositionCenter(ifrListarFormasPagamentosF);
        ifrListarFormasPagamentosF.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        ListarCargosF ifrListarCargosF = new ListarCargosF();
        jDesktopPane1.add(ifrListarCargosF);
        unit.setPositionCenter(ifrListarCargosF);
        ifrListarCargosF.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        ListarUsuariosF ifrListarUsuariosF = new ListarUsuariosF();
        jDesktopPane1.add(ifrListarUsuariosF);
        unit.setPositionCenter(ifrListarUsuariosF);
        ifrListarUsuariosF.setVisible(true);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        ListarProdutosF ifrListarProdutosF = new ListarProdutosF();
        jDesktopPane1.add(ifrListarProdutosF);
        unit.setPositionCenter(ifrListarProdutosF);
        ifrListarProdutosF.setVisible(true);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        MensagensF wMsg = new MensagensF();
        jDesktopPane1.add(wMsg);
        unit.setPositionRight(wMsg);
        wMsg.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        AuditoriaF ifrAuditoriaF = new AuditoriaF();
        jDesktopPane1.add(ifrAuditoriaF);
        unit.setPositionCenter(ifrAuditoriaF);
        ifrAuditoriaF.setVisible(true);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        EstoqueF ifrEstoqueF = new EstoqueF();
        jDesktopPane1.add(ifrEstoqueF);
        unit.setPositionCenter(ifrEstoqueF);
        ifrEstoqueF.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(MainF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                 new MainF().setVisible(true);   

              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
