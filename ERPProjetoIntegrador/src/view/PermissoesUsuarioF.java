package view;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Permissoes;
import model.PermissoesPK;
import model.Usuario;
import model.dao.PermissoesDAO;
import model.dao.TelaDAO;
import model.dao.UsuarioDAO;
import model.util.limpaCampos;
import view.CadastroCargosF;

public class PermissoesUsuarioF extends javax.swing.JInternalFrame {

    public PermissoesUsuarioF() {
        initComponents();
        this.setResizable(false);
        new TelaDAO().popularTabela(tbTelas, "");

        tbTelas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("1")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroPessoaF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("2")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroPessoaF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("3")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroPessoaF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("4")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroUsuarioF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("5")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroCargosF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("6")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroProdutosF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("7")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroUnidadeF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("8")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroFPagamentoF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("9")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroEstadoF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("10")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroCidadeF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("11")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroPedidoF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("12")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroPedidoF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("13")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroMovFinancF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("14")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), CadastroMovFinancF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                } else if (String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 0)).equals("16")) {
                    abrirConfig(String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 1)), ConfiguraF.botoes, String.valueOf(tbTelas.getValueAt(tbTelas.getSelectedRow(), 2)), tbTelas.getSelectedRow());
                }

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCampos = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSelecionar2 = new javax.swing.JButton();
        edNomeUsuario = new javax.swing.JTextField();
        edUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTelas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setTitle("Permissões de usuário");

        pnCampos.setBackground(new java.awt.Color(255, 255, 255));

        btSalvar.setBackground(new java.awt.Color(76, 175, 80));
        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Salvar_15.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setName(""); // NOI18N
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

        btSelecionar2.setBackground(new java.awt.Color(243, 243, 243));
        btSelecionar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSelecionar2.setForeground(new java.awt.Color(33, 33, 33));
        btSelecionar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Selecionar_15.png"))); // NOI18N
        btSelecionar2.setText("Selecionar");
        btSelecionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionar2ActionPerformed(evt);
            }
        });

        edNomeUsuario.setEditable(false);
        edNomeUsuario.setBackground(new java.awt.Color(255, 255, 204));
        edNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edNomeUsuario.setForeground(new java.awt.Color(33, 33, 33));

        edUsuario.setEditable(false);
        edUsuario.setBackground(new java.awt.Color(255, 255, 204));
        edUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edUsuario.setForeground(new java.awt.Color(33, 33, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 33, 33));
        jLabel12.setText("Usuário:");

        tbTelas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbTelas);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Definir super usuário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(edUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edNomeUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelecionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validaCampo()) {
            for (int i = 0; i < tbTelas.getRowCount(); i++) {
                int wIDTela = Integer.parseInt(String.valueOf(tbTelas.getValueAt(i, 0)));
                int wUsuario = Integer.parseInt(edUsuario.getText());

                PermissoesDAO wPermDAO = new PermissoesDAO();

                Permissoes wPerm = wPermDAO.consultarID(wIDTela, wUsuario);

                String retorno = null;

                if (wPerm == null) {
                    PermissoesPK wPermPK = new PermissoesPK(wIDTela, wUsuario);
                    
                    wPerm = new Permissoes();
                    wPerm.setPermissoesPK(wPermPK);
                    wPerm.setNivel(String.valueOf(tbTelas.getValueAt(i, 2)));

                    retorno = wPermDAO.salvar(wPerm);
                } else {
                    wPerm.setNivel(String.valueOf(tbTelas.getValueAt(i, 2)));
                    retorno = wPermDAO.atualizar(wPerm);
                }

                if (retorno == null) {
                    JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                    edUsuario.setText("");
                    edNomeUsuario.setText("");
                    new TelaDAO().popularTabela(tbTelas, "");
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
                            + "Mensagem técnica: \n" + retorno);
                }
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        //limpaCampos.limparCampos(pnCampos);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSelecionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionar2ActionPerformed
        SelecionarCliente wSelecionar = new SelecionarCliente(null, true);
        wSelecionar.CarregarUsuario();
        wSelecionar.setVisible(true);

        if (wSelecionar.getTextSearch() != null) {
            Usuario wUsuario = new UsuarioDAO().consultarID(Integer.parseInt(wSelecionar.getTextSearch()));
            edUsuario.setText(wUsuario.getIdUsuario() + "");
            edNomeUsuario.setText(wUsuario.getUsername() + "");

            new TelaDAO().popularTabela(tbTelas, "");

            for (int i = 0; i < tbTelas.getRowCount(); i++) {
                int wIDTela = Integer.parseInt(String.valueOf(tbTelas.getValueAt(i, 0)));
                Permissoes wPerm = new PermissoesDAO().consultarID(wIDTela, wUsuario.getIdUsuario());

                if (wPerm != null) {
                    tbTelas.setValueAt(wPerm.getNivel(), i, 2);
                }
            }
        }

    }//GEN-LAST:event_btSelecionar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validaCampo()) {
            for (int i = 0; i < tbTelas.getRowCount(); i++) {
                tbTelas.setValueAt("EXPN", i, 2);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void abrirConfig(String pNomeTela, String pBotoes, String pPermissoes, int pLinha) {
        PermissoesUsuarioConfigF wConfigPerm = new PermissoesUsuarioConfigF(null, true);
        CadastroCargosF wCadastroCargosF = new CadastroCargosF();
        wConfigPerm.CarregarPermisoes(pNomeTela, pBotoes, pPermissoes);
        wConfigPerm.setVisible(true);
        tbTelas.setValueAt(wConfigPerm.getTextSearch(), pLinha, 2);
    }

    private boolean validaCampo() {
        boolean wRetorno = true;

        if (edUsuario.getText().equals("")) {
            wRetorno = false;
            JOptionPane.showMessageDialog(null, "Campo usuário inválido!");
        }

        return wRetorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSelecionar2;
    private javax.swing.JTextField edNomeUsuario;
    private javax.swing.JTextField edUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JTable tbTelas;
    // End of variables declaration//GEN-END:variables
}
