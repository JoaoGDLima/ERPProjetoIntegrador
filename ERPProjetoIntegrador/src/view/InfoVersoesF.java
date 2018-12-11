package view;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Versao;
import model.dao.ConfiguracoesDAO;
import model.dao.VersaoDAO;

public class InfoVersoesF extends javax.swing.JInternalFrame {

    public InfoVersoesF() {
        initComponents();
        liVersoes.removeAll();

        VersaoDAO wVersaoDAO = new VersaoDAO();
        wVersaoDAO.popularTabela(liVersoes);

        liVersoes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String valor = String.valueOf(liVersoes.getSelectedValue());

                Integer widVersao = Integer.parseInt(valor.split("-")[0].trim());
                Versao wVersao = new VersaoDAO().consultarID(widVersao);
                selecionarVersao(wVersao);
            }
        });

        Versao wVersaoAtual = new VersaoDAO().consultarID(Integer.parseInt(new ConfiguracoesDAO().consultarID("versao").getValor()));
        selecionarVersao(wVersaoAtual);
        lbVersaoAtual.setText("Versão atual: " + wVersaoAtual.getVersao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liVersoes = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        edDescricao = new javax.swing.JTextArea();
        lbNomeTela = new javax.swing.JLabel();
        lbVersao = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lbVersaoAtual = new javax.swing.JLabel();

        setTitle("Informações de versões");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        liVersoes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(liVersoes);

        edDescricao.setEditable(false);
        edDescricao.setColumns(20);
        edDescricao.setRows(5);
        jScrollPane2.setViewportView(edDescricao);

        lbNomeTela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNomeTela.setForeground(new java.awt.Color(51, 153, 255));
        lbNomeTela.setText("Versões:");

        lbVersao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbVersao.setForeground(new java.awt.Color(51, 153, 255));
        lbVersao.setText("Versão ");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Selecionar_15.png"))); // NOI18N
        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lbVersaoAtual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbVersaoAtual.setForeground(new java.awt.Color(51, 153, 255));
        lbVersaoAtual.setText("Versão atual:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVersao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbVersaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeTela)
                    .addComponent(lbVersao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVersaoAtual)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void selecionarVersao(Versao pVersao) {
        edDescricao.setText(pVersao.getDescricao());
        lbVersao.setText("Versão selecionada: " + pVersao.getVersao());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea edDescricao;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNomeTela;
    private javax.swing.JLabel lbVersao;
    private javax.swing.JLabel lbVersaoAtual;
    private javax.swing.JList liVersoes;
    // End of variables declaration//GEN-END:variables
}
