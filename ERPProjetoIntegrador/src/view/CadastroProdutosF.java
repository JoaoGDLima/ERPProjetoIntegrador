package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Produto;
import model.TelaPermissao;
import model.dao.ComboDAO;
import model.dao.ProdutoDAO;
import model.dao.UnidadeDAO;
import model.util.ComboItens;
import model.util.limpaCampos;

public class CadastroProdutosF extends javax.swing.JInternalFrame implements TelaPermissao{
    public static String botoes = "SENXP";
    int codigo = 0;

    public CadastroProdutosF() {
        initComponents();
        this.setResizable(false);

        new ProdutoDAO().popularTabela(tbProduto, "");

        edUnidade.removeAllItems();
        new ComboDAO().popularComboUnidade(edUnidade);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCampos = new javax.swing.JPanel();
        lbNome2 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edUnidade = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        edLucro = new model.util.JNumberFormatField();
        edDescricao = new javax.swing.JTextField();
        pnLista = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Cadastro de produtos");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(501, 362));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(501, 362));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(501, 362));

        pnCampos.setBackground(new java.awt.Color(255, 255, 255));

        lbNome2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome2.setForeground(new java.awt.Color(33, 33, 33));
        lbNome2.setText("Nome:");

        edNome.setBackground(new java.awt.Color(255, 255, 204));
        edNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 33, 33));
        jLabel4.setText("Descrição:");

        btSalvar.setBackground(new java.awt.Color(76, 175, 80));
        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Salvar_20.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setActionCommand("");
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btSalvar.setName("S"); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(243, 243, 243));
        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(33, 33, 33));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setActionCommand("");
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 33, 33));
        jLabel6.setText("Percentual de lucro:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 33, 33));
        jLabel10.setText("Unidade:");

        edUnidade.setBackground(new java.awt.Color(255, 255, 204));
        edUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edUnidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edUnidadeItemStateChanged(evt);
            }
        });
        edUnidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edUnidadePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 33, 33));
        jLabel7.setText("%");

        edLucro.setBackground(new java.awt.Color(255, 255, 204));

        edDescricao.setBackground(new java.awt.Color(255, 255, 204));
        edDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edDescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addComponent(edDescricao)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCamposLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addGap(359, 359, 359))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome2)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(edLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(edDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", pnCampos);

        pnLista.setBackground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Busca:");

        edBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edBusca.setForeground(new java.awt.Color(33, 33, 33));

        tbProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbProduto.setForeground(new java.awt.Color(33, 33, 33));
        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbProduto);

        btExcluir.setBackground(new java.awt.Color(243, 243, 243));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(33, 33, 33));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Excluir_15.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setName("X"); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(243, 243, 243));
        btEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(33, 33, 33));
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Editar_15.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setName("E"); // NOI18N
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btNovo.setBackground(new java.awt.Color(243, 243, 243));
        btNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo.setForeground(new java.awt.Color(33, 33, 33));
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Novo_15.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setName("N"); // NOI18N
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(243, 243, 243));
        btPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(33, 33, 33));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Pesquisar_15.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setName("P"); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnListaLayout = new javax.swing.GroupLayout(pnLista);
        pnLista.setLayout(pnListaLayout);
        pnListaLayout.setHorizontalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", pnLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed

    }//GEN-LAST:event_edNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validaCampo()) {
            Produto wProduto = new Produto();

            wProduto.setIdProduto(codigo);
            wProduto.setNome(edNome.getText());
            wProduto.setDescricao(edDescricao.getText());
            wProduto.setPercentualLucro(edLucro.getValue());
            wProduto.setInativo('F');

            ComboItens ci = (ComboItens) edUnidade.getSelectedItem();
            wProduto.setUnidade(new UnidadeDAO().consultarID(ci.getCodigo()));

            ProdutoDAO wProdutoDAO = new ProdutoDAO();

            String retorno = null;
            if (wProduto.getIdProduto() == 0) {
                retorno = wProdutoDAO.salvar(wProduto);
            } else {
                Produto wProdutoOld = wProdutoDAO.consultarID(wProduto.getIdProduto());
                retorno = wProdutoDAO.atualizar(wProduto, wProdutoOld);
            }

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                limpaCampos.limparCampos(pnCampos);
                codigo = 0;
                new ProdutoDAO().popularTabela(tbProduto, "");
                jTabbedPane1.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // limpaCampos.limparCampos(pnCampos);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edUnidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edUnidadeItemStateChanged
        /*ComboItens ci = (ComboItens) edEstado.getSelectedItem();
         if (ci!=null) {
         edCidade.removeAllItems();
         new CombosDAO().popularCombo("cidade","codigo, nome", "estado_codigo=" + ci.getCodigo(), "nome", edCidade);
         }*/
    }//GEN-LAST:event_edUnidadeItemStateChanged

    private void edUnidadePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edUnidadePopupMenuWillBecomeVisible

    }//GEN-LAST:event_edUnidadePopupMenuWillBecomeVisible

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String wNomeProduto = String.valueOf(tbProduto.getValueAt(tbProduto.getSelectedRow(), 1));

        String codigo = String.valueOf(tbProduto.getValueAt(tbProduto.getSelectedRow(), 0));
        
        ProdutoDAO wProdutoDAO = new ProdutoDAO();
        Produto wProduto = wProdutoDAO.consultarID(Integer.parseInt(codigo));
        wProduto.setInativo('T');

        Object[] options = {"Confirmar", "Cancelar"};
        int wOpc = JOptionPane.showOptionDialog(null, "Deseja excluir o usuario: " + wNomeProduto,
                "Informação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (wOpc == 0) {
            String retorno = null;
            wProdutoDAO.excluir(wProduto);

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                wProdutoDAO.popularTabela(tbProduto, edBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        String valor = String.valueOf(tbProduto.getValueAt(tbProduto.getSelectedRow(), 0));

        Produto wProduto = new ProdutoDAO().consultarID(Integer.parseInt(valor));

        codigo = Integer.parseInt(valor);

        edNome.setText(wProduto.getNome());
        edDescricao.setText(wProduto.getDescricao());
        edLucro.setValue(wProduto.getPercentualLucro());

        ComboItens wUnidade = new ComboItens();
        wUnidade.setCodigo(wProduto.getUnidade().getIdUnidade());
        new ComboDAO().definirItemCombo(edUnidade, wUnidade);

        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        codigo = 0;
        limpaCampos.limparCampos(pnCampos);
        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        new ProdutoDAO().popularTabela(tbProduto, edBusca.getText());
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void edDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edDescricaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validaCampo() {
        boolean wRetorno = true;

        ComboItens ci = (ComboItens) edUnidade.getSelectedItem();
        if (ci == null) {
            JOptionPane.showMessageDialog(null, "Selecione uma unidade!");
            edUnidade.requestFocus();
            return false;
        }

        if (edNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo nome inválido!");
            edNome.requestFocus();
            return false;
        } else if (edDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo descrição inválido!");
            edDescricao.requestFocus();
            return false;
        } else if ((ci.getCodigo() <= 0)) {
            JOptionPane.showMessageDialog(null, "Selecione uma unidade!");
            edUnidade.requestFocus();
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edDescricao;
    private model.util.JNumberFormatField edLucro;
    private javax.swing.JTextField edNome;
    private javax.swing.JComboBox<String> edUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JPanel pnLista;
    private javax.swing.JTable tbProduto;
    // End of variables declaration//GEN-END:variables

    @Override
    public ArrayList<JButton> BotoesTela() {
        ArrayList<JButton> wBotoes = new ArrayList();
        wBotoes.add(btNovo);
        wBotoes.add(btSalvar);
        wBotoes.add(btEditar);
        wBotoes.add(btPesquisar);
        wBotoes.add(btExcluir);
        return wBotoes;
    }

    @Override
    public void HabilitarBotoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
