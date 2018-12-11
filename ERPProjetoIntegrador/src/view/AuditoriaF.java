package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Permissoes;
import model.TelaPermissao;
import model.dao.AuditoriaDAO;
import model.util.Formatacao;
import model.util.Validacao;

public class AuditoriaF extends javax.swing.JInternalFrame implements TelaPermissao {

    public static final int ID_TELA = 17;

    public AuditoriaF() {
        initComponents();
        this.setResizable(false);
        new AuditoriaDAO().popularTabela(tbAuditoria, "");

        Formatacao.formatarData(edDataIni);
        Formatacao.formatarData(edDataFim);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLista = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAuditoria = new javax.swing.JTable();
        edDataIni = new javax.swing.JFormattedTextField();
        lbData = new javax.swing.JLabel();
        lbData1 = new javax.swing.JLabel();
        edDataFim = new javax.swing.JFormattedTextField();
        btArquivar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Consulta auditoria");

        pnLista.setBackground(new java.awt.Color(254, 254, 254));

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

        tbAuditoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbAuditoria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAuditoria);

        edDataIni.setBackground(new java.awt.Color(255, 255, 204));

        lbData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(33, 33, 33));
        lbData.setText("Data inicial:");

        lbData1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbData1.setForeground(new java.awt.Color(33, 33, 33));
        lbData1.setText("Data final:");

        edDataFim.setBackground(new java.awt.Color(255, 255, 204));

        btArquivar.setBackground(new java.awt.Color(243, 243, 243));
        btArquivar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btArquivar.setForeground(new java.awt.Color(33, 33, 33));
        btArquivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Pesquisar_15.png"))); // NOI18N
        btArquivar.setText("Arquivar");
        btArquivar.setName("P"); // NOI18N
        btArquivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArquivarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(243, 243, 243));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnListaLayout = new javax.swing.GroupLayout(pnLista);
        pnLista.setLayout(pnListaLayout);
        pnListaLayout.setHorizontalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbData1)
                            .addGroup(pnListaLayout.createSequentialGroup()
                                .addComponent(edDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btArquivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))))
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addComponent(lbData, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addComponent(lbData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btArquivar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (validaCampo()) {
            String wWhere = "";

            if (!Formatacao.removerFormatacao(edDataIni.getText()).equals("") && Formatacao.removerFormatacao(edDataFim.getText()).equals("")) {
                wWhere = "datahora >= '" + Formatacao.ajustaDataAMD(edDataIni.getText()) + "'";
            } else if (Formatacao.removerFormatacao(edDataIni.getText()).equals("") && !Formatacao.removerFormatacao(edDataFim.getText()).equals("")) {
                wWhere = "datahora <= '" + Formatacao.ajustaDataAMD(edDataFim.getText()) + "'";
            } else if (!Formatacao.removerFormatacao(edDataIni.getText()).equals("") && !Formatacao.removerFormatacao(edDataFim.getText()).equals("")) {
                wWhere = "datahora between '" + Formatacao.ajustaDataAMD(edDataIni.getText()) + "' and '" + Formatacao.ajustaDataAMD(edDataFim.getText()) + "'";
            }

            new AuditoriaDAO().popularTabela(tbAuditoria, wWhere);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btArquivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArquivarActionPerformed
        if (validaCampo()) {
            Object[] options = {"Confirmar", "Cancelar"};
            int wOpc = JOptionPane.showOptionDialog(null, "Deseja arquivar a auditoria no periodo informado?",
                    "Informação",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (wOpc == 0) {
                AuditoriaDAO wAuditoriaDAO = new AuditoriaDAO();

                String wRetorno = wAuditoriaDAO.arquivarAuditoria(Formatacao.getDataAtual(), Formatacao.ajustaDataAMD(edDataIni.getText()), Formatacao.ajustaDataAMD(edDataFim.getText()));

                if (wRetorno == null) {
                    JOptionPane.showMessageDialog(null, "Auditoria arquivada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao arquivar auditoria!\n\n"
                            + "Mensagem técnica: \n" + wRetorno);
                }
            }
        }
    }//GEN-LAST:event_btArquivarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean validaCampo() {
        if (!Formatacao.removerFormatacao(edDataIni.getText()).equals("")) {
            if (!Validacao.validarDataFormatada(edDataIni.getText())) {
                JOptionPane.showMessageDialog(null, "Campo Data inicial inválido!");
                edDataIni.requestFocus();
                return false;
            }
        }

        if (!Formatacao.removerFormatacao(edDataFim.getText()).equals("")) {
            if (!Validacao.validarDataFormatada(edDataFim.getText())) {
                JOptionPane.showMessageDialog(null, "Campo Data final inválido!");
                edDataFim.requestFocus();
                return false;
            }
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArquivar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JFormattedTextField edDataFim;
    private javax.swing.JFormattedTextField edDataIni;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbData1;
    private javax.swing.JPanel pnLista;
    private javax.swing.JTable tbAuditoria;
    // End of variables declaration//GEN-END:variables

    @Override
    public ArrayList<JButton> BotoesTela() {
        ArrayList<JButton> wBotoes = new ArrayList();
        wBotoes.add(btArquivar);
        wBotoes.add(btnPesquisar);
        return wBotoes;
    }

    @Override
    public void HabilitarBotoes() {
        Permissoes.aplicaHabilitacao(this.ID_TELA, this.BotoesTela());
    }
}
