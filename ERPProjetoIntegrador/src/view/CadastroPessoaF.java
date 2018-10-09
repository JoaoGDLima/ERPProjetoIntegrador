package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Permissoes;
import model.PessoaJuridica;
import model.TelaPermissao;
import model.dao.CargosDAO;
import model.dao.CidadeDAO;
import model.dao.ComboDAO;
import model.dao.PessoaJuridicaDAO;
import model.dao.FuncionarioDAO;
import model.util.ComboItens;
import model.util.Formatacao;
import model.util.Validacao;
import model.util.limpaCampos;

public class CadastroPessoaF extends javax.swing.JInternalFrame implements TelaPermissao{
    int ID_TELA = 5;
    char Modo;
    int codigo = 0;

    public CadastroPessoaF(int pIDTela, char pModo) {
        initComponents();
        this.setResizable(false);
        this.ID_TELA = pIDTela;
        this.Modo = pModo;
        this.HabilitarBotoes();
        
        
        edCargos.removeAllItems();
        new ComboDAO().popularComboCargos(edCargos);

        edCidade.removeAllItems();
        new ComboDAO().popularComboCidades(edCidade);

        edCPF.setFont(new java.awt.Font("Tahoma", 0, 14));
        edRG.setFont(new java.awt.Font("Tahoma", 0, 14));
        edTelefone.setFont(new java.awt.Font("Tahoma", 0, 14));
        edCelular.setFont(new java.awt.Font("Tahoma", 0, 14));

        Formatacao.formatarCnpj(edCNPJ);
        Formatacao.formatarIE(edIE);
        Formatacao.formatarCpf(edCPF);
        Formatacao.formatarRG(edRG);
        Formatacao.formatarTelefone(edTelefone);
        Formatacao.formatarCelular(edCelular);
        Formatacao.formatarData(edDataNasc);

        ValidaTipoPessoa();

        if (Modo != 'U') {
            jRBJuridico.setSelected(true);
            jRBFisico.setEnabled(false);
            new PessoaJuridicaDAO().popularTabela(tbPessoa, "", Modo);
        } else {
            jRBFisico.setSelected(true);
            jRBJuridico.setEnabled(false);
            new FuncionarioDAO().popularTabela(tbPessoa, "");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCampos = new javax.swing.JPanel();
        lbNome2 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edTelefone = new javax.swing.JFormattedTextField();
        edCelular = new javax.swing.JFormattedTextField();
        pnPessoaFisica = new javax.swing.JPanel();
        edCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edRG = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        edCidade = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        edEstado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edRua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        edBairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edNumero = new javax.swing.JTextField();
        jRBFisico = new javax.swing.JRadioButton();
        jRBJuridico = new javax.swing.JRadioButton();
        pnJuridico = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        edCNPJ = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        edIE = new javax.swing.JFormattedTextField();
        edNomeFantasia = new javax.swing.JTextField();
        lbNome3 = new javax.swing.JLabel();
        edCargos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        edDataNasc = new javax.swing.JFormattedTextField();
        lbData = new javax.swing.JLabel();
        pnLista = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPessoa = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btCancelar2 = new javax.swing.JButton();

        setTitle("Cadastro de cliente");

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

        btSalvar.setBackground(new java.awt.Color(76, 175, 80));
        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Salvar_15.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setActionCommand("");
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 33, 33));
        jLabel8.setText("Telefone:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(33, 33, 33));
        jLabel9.setText("Celular:");

        edCelular.setBackground(new java.awt.Color(255, 255, 204));

        pnPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));

        edCPF.setBackground(new java.awt.Color(255, 255, 204));
        edCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edCPFFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 33, 33));
        jLabel4.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 33, 33));
        jLabel7.setText("RG:");

        edRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edRGFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnPessoaFisicaLayout = new javax.swing.GroupLayout(pnPessoaFisica);
        pnPessoaFisica.setLayout(pnPessoaFisicaLayout);
        pnPessoaFisicaLayout.setHorizontalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(edCPF, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edRG, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnPessoaFisicaLayout.setVerticalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pnPessoaFisicaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {edCPF, edRG});

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Cidade:");

        edCidade.setBackground(new java.awt.Color(255, 255, 204));
        edCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edCidadeItemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 33, 33));
        jLabel10.setText("Estado:");

        edEstado.setEditable(false);
        edEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEstadoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 33, 33));
        jLabel12.setText("Rua:");

        edRua.setBackground(new java.awt.Color(255, 255, 204));
        edRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edRuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TakaoExGothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 33, 33));
        jLabel1.setText("Bairro:");

        edBairro.setBackground(new java.awt.Color(255, 255, 204));
        edBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBairroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TakaoExGothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 33, 33));
        jLabel2.setText("Número:");

        edNumero.setBackground(new java.awt.Color(255, 255, 204));
        edNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jRBFisico.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRBFisico);
        jRBFisico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBFisico.setText("Pessoa Física");
        jRBFisico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRBFisicoStateChanged(evt);
            }
        });
        jRBFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFisicoActionPerformed(evt);
            }
        });

        jRBJuridico.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRBJuridico);
        jRBJuridico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBJuridico.setSelected(true);
        jRBJuridico.setText("Pessoa Jurídica");
        jRBJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBJuridicoActionPerformed(evt);
            }
        });

        pnJuridico.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 33, 33));
        jLabel13.setText("CNPJ:");

        edCNPJ.setBackground(new java.awt.Color(255, 255, 204));
        edCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edCNPJFocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(33, 33, 33));
        jLabel14.setText("IE:");

        edIE.setBackground(new java.awt.Color(255, 255, 204));
        edIE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edIEFocusLost(evt);
            }
        });

        edNomeFantasia.setBackground(new java.awt.Color(255, 255, 204));
        edNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeFantasiaActionPerformed(evt);
            }
        });

        lbNome3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome3.setForeground(new java.awt.Color(33, 33, 33));
        lbNome3.setText("Nome fantasia:");

        javax.swing.GroupLayout pnJuridicoLayout = new javax.swing.GroupLayout(pnJuridico);
        pnJuridico.setLayout(pnJuridicoLayout);
        pnJuridicoLayout.setHorizontalGroup(
            pnJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJuridicoLayout.createSequentialGroup()
                .addComponent(edCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edIE, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
            .addGroup(pnJuridicoLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 369, Short.MAX_VALUE))
            .addGroup(pnJuridicoLayout.createSequentialGroup()
                .addComponent(lbNome3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(edNomeFantasia)
        );
        pnJuridicoLayout.setVerticalGroup(
            pnJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnJuridicoLayout.createSequentialGroup()
                .addGroup(pnJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edIE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edCargos.setBackground(new java.awt.Color(255, 255, 204));
        edCargos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edCargos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edCargosItemStateChanged(evt);
            }
        });
        edCargos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edCargosPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 33, 33));
        jLabel11.setText("Cargo:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Tipo de pessoa:");

        edDataNasc.setBackground(new java.awt.Color(255, 255, 204));

        lbData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(33, 33, 33));
        lbData.setText("Data de nascimento:");

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbData)
                            .addComponent(edDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(267, Short.MAX_VALUE))
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edEstado)
                                .addContainerGap())))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCamposLayout.createSequentialGroup()
                                        .addComponent(jRBFisico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRBJuridico))
                                    .addComponent(lbNome2)
                                    .addGroup(pnCamposLayout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edNome)
                            .addComponent(pnJuridico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnPessoaFisica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edRua)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(10, 10, 10)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBFisico)
                    .addComponent(jRBJuridico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnCamposLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btCancelar, btSalvar, edBairro, edCelular, edCidade, edEstado, edNome, edNumero, edRua, edTelefone});

        jTabbedPane1.addTab("Cadastro", pnCampos);

        pnLista.setBackground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Busca:");

        edBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edBusca.setForeground(new java.awt.Color(33, 33, 33));

        tbPessoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbPessoa.setForeground(new java.awt.Color(33, 33, 33));
        tbPessoa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPessoa);

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

        btCancelar2.setBackground(new java.awt.Color(243, 243, 243));
        btCancelar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar2.setForeground(new java.awt.Color(33, 33, 33));
        btCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        btCancelar2.setText("Sair");
        btCancelar2.setActionCommand("");
        btCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar2ActionPerformed(evt);
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
                        .addContainerGap(160, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnListaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btPesquisar, edBusca});

        jTabbedPane1.addTab("Listar", pnLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed

    }//GEN-LAST:event_edNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validaCampo()) {
            String retorno = "ERRO";

            if (jRBFisico.isSelected()) {
                retorno = SalvarPessoaFisico();
            } else {
                retorno = SalvarPessoaJuridica();
            }

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                limpaCampos.limparCampos(pnCampos);
                limpaCampos.limparCampos(pnPessoaFisica);
                codigo = 0;

                if (Modo != 'U') {
                    new PessoaJuridicaDAO().popularTabela(tbPessoa, "", Modo);
                } else {
                    new FuncionarioDAO().popularTabela(tbPessoa, "");
                }

                jTabbedPane1.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limpaCampos.limparCampos(pnCampos);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edRuaActionPerformed

    private void edBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edBairroActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String wUsuNome = String.valueOf(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), 2));

        Object[] options = { "Confirmar", "Cancelar" };
        int wOpc = JOptionPane.showOptionDialog(null, "Deseja excluir o cliente: " + wUsuNome,
            "Informação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (wOpc==0)
        {
            String valor = String.valueOf(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), 0));
            String fisico = String.valueOf(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), 1));
        
            if(fisico.equals("T"))
            {
                FuncionarioDAO wFuncDAO = new FuncionarioDAO();

                String retorno = wFuncDAO.excluir(Integer.parseInt(valor));

                if (retorno == null) {
                    JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                    wFuncDAO.popularTabela(tbPessoa, edBusca.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
                }
            }
            else
            {
                PessoaJuridicaDAO wPessJuriDAO = new PessoaJuridicaDAO();

                String retorno = wPessJuriDAO.excluir(Integer.parseInt(valor));

                if (retorno == null) {
                    JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                    wPessJuriDAO.popularTabela(tbPessoa, edBusca.getText(), Modo);
                } else {
                    JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!\n\n"
                        + "Mensagem técnica: \n" + retorno);
                }
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        String valor = String.valueOf(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), 0));
        String fisico = String.valueOf(tbPessoa.getValueAt(tbPessoa.getSelectedRow(), 1));
        
        if(fisico.equals("T"))
        {
            Funcionario wFunc = new FuncionarioDAO().consultarID(Integer.parseInt(valor));
            codigo = Integer.parseInt(valor);
            edNome.setText(wFunc.getNome());
            edCPF.setText(wFunc.getCpf());
            edRG.setText(wFunc.getRg());
            edDataNasc.setText(Formatacao.ajustaDataDMA(wFunc.getNascimento().toString()));
            edTelefone.setText(wFunc.getTelefone());
            edCelular.setText(wFunc.getCelular());

            ComboItens cidade = new ComboItens();
            cidade.setCodigo(wFunc.getCidade().getIdCidade());
            new ComboDAO().definirItemCombo(edCidade, cidade);

            ComboItens cargos = new ComboItens();
            cargos.setCodigo(wFunc.getCargo().getIdCargos());
            new ComboDAO().definirItemCombo(edCargos, cargos);

            edRua.setText(wFunc.getEndereco());
            edNumero.setText(wFunc.getNumero());
            edBairro.setText(wFunc.getBairro());

            jTabbedPane1.setSelectedIndex(0);
            edNome.requestFocus();
        }
        else
        {                                                

            PessoaJuridica wJuridico = new PessoaJuridicaDAO().consultarID(Integer.parseInt(valor));
            
            codigo = Integer.parseInt(valor);
            edNome.setText(wJuridico.getNome());
            edCNPJ.setText(wJuridico.getCnpj());
            edIE.setText(wJuridico.getIe());
            edDataNasc.setText(Formatacao.ajustaDataDMA(wJuridico.getDataCadastro().toString()));
            edNomeFantasia.setText(wJuridico.getFantasia());
            edTelefone.setText(wJuridico.getTelefone());
            edCelular.setText(wJuridico.getCelular());

            ComboItens cidade = new ComboItens();
            cidade.setCodigo(wJuridico.getCidade().getIdCidade());
            new ComboDAO().definirItemCombo(edCidade, cidade);

            ComboItens cargos = new ComboItens();
            cargos.setCodigo(wJuridico.getCargo().getIdCargos());
            new ComboDAO().definirItemCombo(edCargos, cargos);

            edRua.setText(wJuridico.getEndereco());
            edNumero.setText(wJuridico.getNumero());
            edBairro.setText(wJuridico.getBairro());

            jTabbedPane1.setSelectedIndex(0);
            edNome.requestFocus();
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        codigo = 0;
        limpaCampos.limparCampos(pnCampos);
        limpaCampos.limparCampos(pnPessoaFisica);
        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if (Modo != 'U') {
            new PessoaJuridicaDAO().popularTabela(tbPessoa, edBusca.getText(), Modo);
        } else {
            new FuncionarioDAO().popularTabela(tbPessoa, edBusca.getText());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void edEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edEstadoActionPerformed

    private void edCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edCidadeItemStateChanged
        ComboItens ciCidade = (ComboItens) edCidade.getSelectedItem();
        if (ciCidade != null) {
            if (ciCidade.getCodigo() > 0) {
                edEstado.setText(new CidadeDAO().consultarID(ciCidade.getCodigo()).getEstado().getNome());
            }
        }
    }//GEN-LAST:event_edCidadeItemStateChanged

    private void jRBFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFisicoActionPerformed
        ValidaTipoPessoa();// TODO add your handling code here:
    }//GEN-LAST:event_jRBFisicoActionPerformed

    private void jRBJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBJuridicoActionPerformed
        ValidaTipoPessoa();     // TODO add your handling code here:
    }//GEN-LAST:event_jRBJuridicoActionPerformed

    private void edCargosPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edCargosPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edCargosPopupMenuWillBecomeVisible

    private void edCargosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edCargosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_edCargosItemStateChanged

    private void edCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCPFFocusLost
        if (!Validacao.validarCPF(Formatacao.removerFormatacao(edCPF.getText()))) {
            edCPF.requestFocus();
        }
    }//GEN-LAST:event_edCPFFocusLost

    private void edIEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edIEFocusLost
        /*if (!Validacao.validarIE(Formatacao.removerFormatacao(edIE.getText()))) {
            edIE.requestFocus();
        }*/

    }//GEN-LAST:event_edIEFocusLost

    private void edCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edCNPJFocusLost
        /*if (!Validacao.validarCNPJ(Formatacao.removerFormatacao(edCNPJ.getText()))) {
            edCNPJ.requestFocus();
        }*/
    }//GEN-LAST:event_edCNPJFocusLost

    private void edRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edRGFocusLost

    }//GEN-LAST:event_edRGFocusLost

    private void edNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeFantasiaActionPerformed

    private void jRBFisicoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRBFisicoStateChanged

    }//GEN-LAST:event_jRBFisicoStateChanged

    private void btCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar2ActionPerformed
        limpaCampos.limparCampos(pnCampos);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelar2ActionPerformed

    private String SalvarPessoaJuridica() {
        PessoaJuridica wPessoaJuridica = new PessoaJuridica();

        wPessoaJuridica.setIdPessoa(codigo);
        wPessoaJuridica.setNome(edNome.getText());
        wPessoaJuridica.setCnpj(Formatacao.removerFormatacao(edCNPJ.getText()));
        wPessoaJuridica.setIe(Formatacao.removerFormatacao(edIE.getText()));
        wPessoaJuridica.setFantasia(edNomeFantasia.getText());
        wPessoaJuridica.setFisico('F');
        
        wPessoaJuridica.setTelefone(Formatacao.removerFormatacao(edTelefone.getText()));
        wPessoaJuridica.setCelular(Formatacao.removerFormatacao(edCelular.getText()));

        ComboItens ci = (ComboItens) edCidade.getSelectedItem();
        wPessoaJuridica.setCidade(new CidadeDAO().consultarID(ci.getCodigo()));

        ComboItens ca = (ComboItens) edCargos.getSelectedItem();
        wPessoaJuridica.setCargo(new CargosDAO().consultarID(ca.getCodigo()));

        wPessoaJuridica.setEndereco(edRua.getText());
        wPessoaJuridica.setBairro(edBairro.getText());
        wPessoaJuridica.setNumero(edNumero.getText());
        wPessoaJuridica.setTipo(Modo);

        try {
            wPessoaJuridica.setDataCadastro(new SimpleDateFormat("yyyy-MM-dd").parse(Formatacao.ajustaDataAMD(edDataNasc.getText())));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoaF.class.getName()).log(Level.SEVERE, null, ex);
        }

        wPessoaJuridica.setInativo('F');

        PessoaJuridicaDAO wPessoaJuridicaDAO = new PessoaJuridicaDAO();

        String retorno = null;
        if (wPessoaJuridica.getIdPessoa() == 0) {
            retorno = wPessoaJuridicaDAO.salvar(wPessoaJuridica);
        } else {
            retorno = wPessoaJuridicaDAO.atualizar(wPessoaJuridica);
        }

        return retorno;
    }

    private String SalvarPessoaFisico() {
        Funcionario wFuncionario = new Funcionario();

        wFuncionario.setIdPessoa(codigo);
        wFuncionario.setNome(edNome.getText());
        wFuncionario.setCpf(Formatacao.removerFormatacao(edCPF.getText()));
        wFuncionario.setRg(Formatacao.removerFormatacao(edRG.getText()));
        wFuncionario.setFisico('T');
        
        try {
            wFuncionario.setNascimento(new SimpleDateFormat("yyyy-MM-dd").parse(Formatacao.ajustaDataAMD(edDataNasc.getText())));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoaF.class.getName()).log(Level.SEVERE, null, ex);
        }

        wFuncionario.setTelefone(Formatacao.removerFormatacao(edTelefone.getText()));
        wFuncionario.setCelular(Formatacao.removerFormatacao(edCelular.getText()));

        ComboItens ci = (ComboItens) edCidade.getSelectedItem();
        wFuncionario.setCidade(new CidadeDAO().consultarID(ci.getCodigo()));

        ComboItens ca = (ComboItens) edCargos.getSelectedItem();
        wFuncionario.setCargo(new CargosDAO().consultarID(ca.getCodigo()));

        wFuncionario.setEndereco(edRua.getText());
        wFuncionario.setBairro(edBairro.getText());
        wFuncionario.setNumero(edNumero.getText());
        wFuncionario.setInativo('F');
        FuncionarioDAO wFuncionarioDAO = new FuncionarioDAO();

        String retorno = null;
        if (wFuncionario.getIdPessoa() == 0) {
            retorno = wFuncionarioDAO.salvar(wFuncionario);
        } else {
            retorno = wFuncionarioDAO.atualizar(wFuncionario);
        }

        return retorno;
    }

    private boolean validaCampo() {
        boolean wRetorno = true;

        ComboItens ciCargos = (ComboItens) edCargos.getSelectedItem();

        if (ciCargos == null) {
            JOptionPane.showMessageDialog(null, "Selecione um cargo!");
            edCargos.requestFocus();
            return false;
        }

        ComboItens ciCidade = (ComboItens) edCidade.getSelectedItem();
        if (ciCidade == null) {
            JOptionPane.showMessageDialog(null, "Selecione uma cidade!");
            edCargos.requestFocus();
            return false;
        }

        if (jRBFisico.isSelected()) {
            if (edCPF.isEnabled() && Formatacao.removerFormatacao(edCPF.getText()).equals("")) {
                JOptionPane.showMessageDialog(null, "Campo CPF inválido!");
                edCPF.requestFocus();
                return false;
            }

            if (edRG.isEnabled() && Formatacao.removerFormatacao(edRG.getText()).equals("")) {
                JOptionPane.showMessageDialog(null, "Campo RG inválido!");
                edRG.requestFocus();
                return false;
            }
            if (!Validacao.validarCPF(Formatacao.removerFormatacao(edCPF.getText()))) {
                JOptionPane.showMessageDialog(null, "Campo CPF inválido!");
                edCPF.requestFocus();
                return false;
            }
        } else {
            if (edCNPJ.isEnabled() && Formatacao.removerFormatacao(edCNPJ.getText()).equals("")) {
                JOptionPane.showMessageDialog(null, "Campo CNPJ inválido!");
                edCNPJ.requestFocus();
                return false;
            }

            if (edIE.isEnabled() && Formatacao.removerFormatacao(edIE.getText()).equals("")) {
                JOptionPane.showMessageDialog(null, "Campo IE inválido!");
                edIE.requestFocus();
                return false;
            }

            if (edNomeFantasia.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Nome fantasia inválido!");
                edIE.requestFocus();
                return false;
            }
        }

        if (!Validacao.validarDataFormatada(edDataNasc.getText())) {
            JOptionPane.showMessageDialog(null, "Campo Data inválido!");
            edDataNasc.requestFocus();
            return false;
        }
        if (edNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo nome inválido!");
            edNome.requestFocus();
            return false;
        } else if (!Validacao.validarCelular(edCelular.getText())) {
            JOptionPane.showMessageDialog(null, "Campo celular inválido!");
            edCelular.requestFocus();
            return false;
        }

        return true;
    }

    private void ValidaTipoPessoa() {
        edNomeFantasia.setEnabled(!jRBFisico.isSelected());
        edCNPJ.setEnabled(!jRBFisico.isSelected());
        edIE.setEnabled(!jRBFisico.isSelected());
        edCPF.setEnabled(jRBFisico.isSelected());
        edRG.setEnabled(jRBFisico.isSelected());

        if (jRBFisico.isSelected()) {
            lbData.setText("Data de nascimento");
        } else {
            lbData.setText("Data de cadastro");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar2;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edBairro;
    private javax.swing.JTextField edBusca;
    private javax.swing.JFormattedTextField edCNPJ;
    private javax.swing.JFormattedTextField edCPF;
    private javax.swing.JComboBox<String> edCargos;
    private javax.swing.JFormattedTextField edCelular;
    private javax.swing.JComboBox<String> edCidade;
    private javax.swing.JFormattedTextField edDataNasc;
    private javax.swing.JTextField edEstado;
    private javax.swing.JFormattedTextField edIE;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNomeFantasia;
    private javax.swing.JTextField edNumero;
    private javax.swing.JFormattedTextField edRG;
    private javax.swing.JTextField edRua;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBFisico;
    private javax.swing.JRadioButton jRBJuridico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbNome3;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JPanel pnJuridico;
    private javax.swing.JPanel pnLista;
    private javax.swing.JPanel pnPessoaFisica;
    private javax.swing.JTable tbPessoa;
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
        Permissoes.aplicaHabilitacao(this.ID_TELA, this.BotoesTela());
    }
}
