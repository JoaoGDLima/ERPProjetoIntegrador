/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Backup;
import model.Config;
import model.Configuracoes;
import model.Licenciamento;
import model.Permissoes;
import model.TelaPermissao;
import model.XmlTools;
import model.dao.ConfiguracoesDAO;
import model.secaoConexao;
import org.jdom2.JDOMException;

/**
 *
 * @author joao.lima
 */
public class ConfiguraF extends javax.swing.JInternalFrame implements TelaPermissao{
    
    public static final int ID_TELA = 16;    
    FileFilter filtro = new FileNameExtensionFilter("Licenças","lic");
    FileFilter filtro2 = new FileNameExtensionFilter("Arquivo de Backup","backup");

    
    public ConfiguraF() {
        initComponents();
        secaoConexao.configs = new Config();
        fchooseLicenca = new JFileChooser();         
        fchooseBackup = new JFileChooser();
        this.setResizable(false);
        this.HabilitarBotoes();

        ConfiguracoesDAO wConfigDAO = new ConfiguracoesDAO();
        Configuracoes wConfig = wConfigDAO.consultarID("Auditoria");

        if (wConfig == null) {
            edAuditoria.setSelected(false);
        } else {
            if (wConfig.getValor().equals("T")) {
                edAuditoria.setSelected(true);
            } else {
                edAuditoria.setSelected(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        edAuditoria = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btLicenca = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Auditoria do sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        edAuditoria.setBackground(new java.awt.Color(255, 255, 255));
        edAuditoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edAuditoria.setText("Ativar auditoria do sistema");

        jLabel1.setText("IP do Servidor:");

        jTextField1.setToolTipText("Digite o IP para se conectar ao Servidor");

        jLabel2.setText("Usuario do Banco de Dados:");

        jTextField2.setToolTipText("Digite o nome de Usuario para conectar a Base de Dados");

        jLabel3.setText("Senha:");

        jTextField3.setToolTipText("Digite a senha da Base de Dados");

        jLabel4.setText("Local dos Arquivos:");

        jTextField4.setToolTipText("Digite o local para armazenamento das configurações");

        btLicenca.setText("Licenciamento");
        btLicenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLicencaActionPerformed(evt);
            }
        });

        jButton3.setText("Gerar Licença");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(edAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField4))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edAuditoria)
                    .addComponent(btLicenca)
                    .addComponent(jButton3))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jButton1.setText("BackUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Restaurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Não é possivel salvar configurações, verifique se todos os campos estão preenchidos");
        }
        else
        {            
            String temp = "false";
            if(edAuditoria.isSelected())
            {
                temp = "true";
            }

            System.out.println(temp);
            try {
                XmlTools.EscreverXML(temp, jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchFieldException ex) {
                Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ConfiguracoesDAO wConfigDAO = new ConfiguracoesDAO();
                Configuracoes wConfig = new Configuracoes();
                wConfig.setChave("Auditoria");

                if (edAuditoria.isSelected()) {
                    wConfig.setValor("T");
                } else {
                    wConfig.setValor("F");
                }

                if (wConfigDAO.consultarID("Auditoria") != null) {
                    Configuracoes wConfigOld = wConfigDAO.consultarID("Auditoria");
                    wConfigDAO.atualizar(wConfig, wConfigOld);
                } else {
                    wConfigDAO.salvar(wConfig);
                }

                JOptionPane.showMessageDialog(null, "Configurações salvas com sucesso, o sistema será reiniciado para recaregar as configurações.");
                System.exit(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas ao salvar configurações!\n\n"
                        + "Mensagem técnica: \n" + e);
            }
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLicencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLicencaActionPerformed
    fchooseLicenca.setAcceptAllFileFilterUsed(false);
    fchooseLicenca.setFileFilter(filtro);
    fchooseLicenca.addChoosableFileFilter(filtro);
    int returnval = fchooseLicenca.showOpenDialog(this);        
    if(returnval == JFileChooser.APPROVE_OPTION)
    {
        File file = fchooseLicenca.getSelectedFile();
        Licenciamento.LerLicenca(file.getAbsolutePath(), "nome do usuario");//tem que colocar atributo chave nessa função
                                                                            //e retornar a chave do banco de dados.
                                                                            //a chave é criada com a função
                                                                            //CriaLicenca
  //Joao só me cria uma função que retorna a chave do banco atrelada ao usuario, dae ta tudo funcionando ja                                                                            
    }
    }//GEN-LAST:event_btLicencaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Backup.realizaBackup();
        } catch (IOException ex) {
            Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                           
        try {
           //FileFilter filtro = new FileNameExtensionFilter("Licenças","txt");
           //javax.swing.JFileChooser fchooseLicenca = new JFileChooser();
           fchooseBackup.setAcceptAllFileFilterUsed(false);
           fchooseBackup.setFileFilter(filtro2);
           fchooseBackup.addChoosableFileFilter(filtro2);
           int returnval = fchooseLicenca.showOpenDialog(this);        
           if(returnval == JFileChooser.APPROVE_OPTION)
           {
               File file = fchooseBackup.getSelectedFile();
           
            Backup.realizaRestore(file.getAbsolutePath());
           }
            XmlTools.LerXML();
           
        } catch (JDOMException ex) {
            Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfiguraF.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(secaoConexao.configs.getAuditoria().equals("true")) edAuditoria.setSelected(true);
        else edAuditoria.setSelected(false);
        jTextField1.setText(secaoConexao.configs.getIp());
        jTextField2.setText(secaoConexao.configs.getUsuario());
        jTextField3.setText(secaoConexao.configs.getSenha());
        jTextField4.setText(secaoConexao.configs.getPath());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd_MM_yyyy");        
        try {
            data = formatador.parse("14_11_2017");
        } catch (ParseException ex) {
            Logger.getLogger(CadastroEstadoF.class.getName()).log(Level.SEVERE, null, ex);
        }
        Licenciamento.CriaLicenca("teste", formatador.format( data ));// cria licença
        JOptionPane.showMessageDialog(null, "Arquivo de licença gerado com sucesso. Disponivel no diretorio atualmente configurado no programa.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private javax.swing.JFileChooser fchooseLicenca;
    private javax.swing.JFileChooser fchooseBackup;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLicenca;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox edAuditoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    @Override
    public ArrayList<JButton> BotoesTela() {
        ArrayList<JButton> wBotoes = new ArrayList();
        wBotoes.add(btSalvar);
        return wBotoes;
    }

    @Override
    public void HabilitarBotoes() {
        Permissoes.aplicaHabilitacao(this.ID_TELA, this.BotoesTela());
    }
}

