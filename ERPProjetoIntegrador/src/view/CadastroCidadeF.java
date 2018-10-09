
package view;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Permissoes;
import model.TelaPermissao;
import model.Usuario;
import model.dao.CidadeDAO;
import model.dao.ComboDAO;
import model.dao.EstadoDAO;
import model.dao.UsuarioDAO;
import model.secaoConexao;
import model.util.ComboItens;
import model.util.Formatacao;
import model.util.limpaCampos;

public class CadastroCidadeF extends javax.swing.JInternalFrame implements TelaPermissao{
    
    public static final int ID_TELA = 10;
    int codigo = 0;
    int usuarioLock = 0;
    
    public CadastroCidadeF() {
        initComponents();
        this.setResizable(false);
        this.HabilitarBotoes();
        new CidadeDAO().popularTabela(tbCidades, "");

        edEstado.removeAllItems();
        new ComboDAO().popularComboEstado(edEstado);
        usuarioLock = 0;
        btSalvar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        edEstado = new javax.swing.JComboBox<>();
        lbMsgLock = new javax.swing.JLabel();
        pnLista = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edBusca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCidades = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Cadastro de cidade");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(501, 362));

        pnCampos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Nome:");

        edNome.setBackground(new java.awt.Color(255, 255, 204));
        edNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btSalvar.setBackground(new java.awt.Color(76, 175, 80));
        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Salvar_15.png"))); // NOI18N
        btSalvar.setText("Salvar");
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
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Estado *:");

        edEstado.setBackground(new java.awt.Color(255, 255, 204));
        edEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edEstado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edEstadoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edEstadoPopupMenuWillBecomeVisible(evt);
            }
        });
        edEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEstadoActionPerformed(evt);
            }
        });

        lbMsgLock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMsgLock.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(pnCamposLayout.createSequentialGroup()
                                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 219, Short.MAX_VALUE))
                            .addComponent(lbMsgLock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edNome))
                        .addContainerGap())
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(edEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnCamposLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btSalvar});

        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(lbMsgLock, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", pnCampos);

        pnLista.setBackground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Busca:");

        edBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnPesquisar.setBackground(new java.awt.Color(243, 243, 243));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(33, 33, 33));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Pesquisar_15.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setName("P"); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tbCidades.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbCidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbCidades);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnListaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btEditar, btExcluir, btNovo, btnPesquisar});

        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnListaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btEditar, btExcluir, btNovo, btnPesquisar, edBusca, jLabel5});

        jTabbedPane1.addTab("Listar", pnLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validaCampo()) {
            Cidade wCidade = new Cidade();
            wCidade.setIdCidade(codigo);
            wCidade.setNome(edNome.getText());
            
            ComboItens ci = (ComboItens) edEstado.getSelectedItem();
            wCidade.setEstado(new EstadoDAO().consultarID(ci.getCodigo()));
            wCidade.setInativo('F');
            
            CidadeDAO wCidadeDAO = new CidadeDAO();

            String retorno = null;
            if (wCidade.getIdCidade() == 0) {
                retorno = wCidadeDAO.salvar(wCidade);
            } else {
                Cidade wCidadeOld = wCidadeDAO.consultarID(wCidade.getIdCidade());
                retorno = wCidadeDAO.atualizar(wCidade, wCidadeOld);
            }

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                limpaCampos.limparCampos(pnCampos);
                codigo = 0;
                new CidadeDAO().popularTabela(tbCidades, "");
                jTabbedPane1.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        //limpaCampos.limparCampos(pnCampos);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new CidadeDAO().popularTabela(tbCidades, edBusca.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        String valor = String.valueOf(tbCidades.getValueAt(tbCidades.getSelectedRow(), 0));

        Cidade wCidade = new CidadeDAO().consultarID(Integer.parseInt(valor));
        
        wCidade.setUsuarioLock(new CidadeDAO().fazLock("Cidade", wCidade.getIdCidade() + ""));

        codigo = Integer.parseInt(valor);
        usuarioLock = wCidade.getUsuarioLock();
        edNome.setText(wCidade.getNome());
        
        if ((secaoConexao.usuarioLogado.getIdUsuario() != wCidade.getUsuarioLock()) && (wCidade.getUsuarioLock() != 0)) {
            Usuario wUsu = new UsuarioDAO().consultarID(wCidade.getUsuarioLock());
            lbMsgLock.setText("Registro em uso pelo usuário: " + wUsu.getIdUsuario() + " - " + wUsu.getUsername());
            btSalvar.setEnabled(false);
        } else {
            lbMsgLock.setText("");
            btSalvar.setEnabled(true);
        }
       
        ComboItens item = new ComboItens();
        item.setCodigo(wCidade.getEstado().getIdEstado());
        new ComboDAO().definirItemCombo(edEstado, item);
        
        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        codigo = 0;
        limpaCampos.limparCampos(pnCampos);
        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
         String wUsuNome = String.valueOf(tbCidades.getValueAt(tbCidades.getSelectedRow(), 1));
        
        String codigo = String.valueOf(tbCidades.getValueAt(tbCidades.getSelectedRow(), 0));

        CidadeDAO wEstadoDAO = new CidadeDAO();
        Cidade wcidade = wEstadoDAO.consultarID(Integer.parseInt(codigo));
        wcidade.setInativo('T');
        
        Object[] options = {"Confirmar", "Cancelar"};
        int wOpc = JOptionPane.showOptionDialog(null, "Deseja excluir o usuario: " + wUsuNome,
                "Informação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (wOpc == 0) {
            String retorno = null; 
            wEstadoDAO.excluir(wcidade);

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                wEstadoDAO.popularTabela(tbCidades, edBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void edEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEstadoActionPerformed
        
    }//GEN-LAST:event_edEstadoActionPerformed

    private void edEstadoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edEstadoPopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_edEstadoPopupMenuWillBecomeInvisible

    private void edEstadoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edEstadoPopupMenuWillBecomeVisible
        /*ComboItens itemSelec = (ComboItens) edEstado.getSelectedItem(); 
        edEstado.removeAllItems();
        CombosDAO wCombosDAO = new CombosDAO();
        wCombosDAO.popularCombo("estado","codigo, nome", "", "nome", edEstado);
        
        if (itemSelec!=null) {
            wCombosDAO.definirItemCombo(edEstado, itemSelec);
        }*/
    }//GEN-LAST:event_edEstadoPopupMenuWillBecomeVisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        liberaLock();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        liberaLock();
    }//GEN-LAST:event_formInternalFrameClosed

    private boolean validaCampo(){
        boolean wRetorno = true;

        ComboItens ci = (ComboItens) edEstado.getSelectedItem();
        if(ci == null){
            JOptionPane.showMessageDialog(null, "Selecione um estado!");
            edEstado.requestFocus();
            return false;
        }
        
        if (edNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo nome inválido!");
            edNome.requestFocus();
            return false;
        } else if ((ci.getCodigo() <= 0)) {
            JOptionPane.showMessageDialog(null, "Selecione um estado!");
            edEstado.requestFocus();
            return false;
        }
        return true;
    }
     
    private void liberaLock() {
        if ((codigo != 0) && (usuarioLock == secaoConexao.usuarioLogado.getIdUsuario() || usuarioLock == 0)) {
            new CidadeDAO().liberaLock(codigo);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField edBusca;
    private javax.swing.JComboBox<String> edEstado;
    private javax.swing.JTextField edNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMsgLock;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JPanel pnLista;
    private javax.swing.JTable tbCidades;
    // End of variables declaration//GEN-END:variables

    @Override
    public ArrayList<JButton> BotoesTela() {
        ArrayList<JButton> wBotoes = new ArrayList();
        wBotoes.add(btNovo);
        wBotoes.add(btSalvar);
        wBotoes.add(btEditar);
        wBotoes.add(btnPesquisar);
        wBotoes.add(btExcluir);
        return wBotoes;
    }

    @Override
    public void HabilitarBotoes() {
        Permissoes.aplicaHabilitacao(this.ID_TELA, this.BotoesTela());
    }
}
