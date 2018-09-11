package view;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import model.dao.FuncionarioDAO;
import model.dao.UsuarioDAO;


public class PermissoesUsuarioConfigF extends javax.swing.JDialog {
    
    private String textSearch = "";
    private String TextoInicial = "";

    public String getTextSearch() {
        return this.textSearch;
    }
    
    public void CarregarPermisoes(String pNomeTela, String pBotoesTela, String pPermissoes){
        lbNomeTela.setText(pNomeTela);
        TextoInicial = pPermissoes; 
        edEdicao.setEnabled(false);
        edExclusao.setEnabled(false);
        edConsulta.setEnabled(false);
        edInclusao.setEnabled(false);
        

        if (pBotoesTela.contains("E")) {
            edEdicao.setEnabled(true);
        } 
        
        if (pBotoesTela.contains("X")) {
            edExclusao.setEnabled(true);
        } 
        
        if (pBotoesTela.contains("P")) {
            edConsulta.setEnabled(true);
        } 
        
        if (pBotoesTela.contains("N")) {
            edInclusao.setEnabled(true);
        }

        
        edEdicao.setSelected(false);
        edExclusao.setSelected(false);
        edConsulta.setSelected(false);
        edInclusao.setSelected(false);
        
        if (pPermissoes.contains("E")) {
            edEdicao.setSelected(true);
        } 
        
        if (pPermissoes.contains("X")) {
            edExclusao.setSelected(true);
        } 
        
        if (pPermissoes.contains("P")) {
            edConsulta.setSelected(true);
        } 
        
        if (pPermissoes.contains("N")) {
            edInclusao.setSelected(true);
        }
    }
    
    public PermissoesUsuarioConfigF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbNomeTela = new javax.swing.JLabel();
        edEdicao = new javax.swing.JCheckBox();
        edConsulta = new javax.swing.JCheckBox();
        edInclusao = new javax.swing.JCheckBox();
        edExclusao = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração de permissão");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Selecionar_15.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbNomeTela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNomeTela.setText("Titulo da tela");

        edEdicao.setBackground(new java.awt.Color(255, 255, 255));
        edEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edEdicao.setText("Edição");
        edEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEdicaoActionPerformed(evt);
            }
        });

        edConsulta.setBackground(new java.awt.Color(255, 255, 255));
        edConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edConsulta.setText("Consulta");
        edConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edConsultaActionPerformed(evt);
            }
        });

        edInclusao.setBackground(new java.awt.Color(255, 255, 255));
        edInclusao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edInclusao.setText("Inclusão");
        edInclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edInclusaoActionPerformed(evt);
            }
        });

        edExclusao.setBackground(new java.awt.Color(255, 255, 255));
        edExclusao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edExclusao.setText("Exclusão");
        edExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edExclusaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNomeTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edExclusao)
                            .addComponent(edInclusao)
                            .addComponent(edEdicao)
                            .addComponent(edConsulta))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edInclusao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edEdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edExclusao)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.textSearch = "";
        

        if (edEdicao.isSelected()) {
            this.textSearch = this.textSearch + "E";
        }
        
        if (edInclusao.isSelected()) {
            this.textSearch = this.textSearch + "N";
        }
        
        if (edExclusao.isSelected()) {
            this.textSearch = this.textSearch + "X";
        }
        
        if (edConsulta.isSelected()) {
            this.textSearch = this.textSearch + "P";
        }
        
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.textSearch = this.TextoInicial;
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edEdicaoActionPerformed

    private void edConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edConsultaActionPerformed

    private void edInclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edInclusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edInclusaoActionPerformed

    private void edExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edExclusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edExclusaoActionPerformed

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
            java.util.logging.Logger.getLogger(PermissoesUsuarioConfigF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PermissoesUsuarioConfigF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PermissoesUsuarioConfigF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PermissoesUsuarioConfigF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PermissoesUsuarioConfigF dialog = new PermissoesUsuarioConfigF(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox edConsulta;
    private javax.swing.JCheckBox edEdicao;
    private javax.swing.JCheckBox edExclusao;
    private javax.swing.JCheckBox edInclusao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNomeTela;
    // End of variables declaration//GEN-END:variables
}