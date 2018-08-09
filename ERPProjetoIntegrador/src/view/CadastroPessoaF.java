package view;

public class CadastroPessoaF extends javax.swing.JInternalFrame {
    
    public CadastroPessoaF() {
        initComponents();
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel6 = new javax.swing.JLabel();
        edDataNasc = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        edEstado1 = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        edCidade = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        edComplemento1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edLogradouro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        edBairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edNumero = new javax.swing.JTextField();
        pnLista = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btNovo1 = new javax.swing.JButton();

        setTitle("Cadastro de cliente");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 33, 33));
        jLabel4.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 33, 33));
        jLabel7.setText("RG:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 33, 33));
        jLabel6.setText("Data de nascimento:");

        edDataNasc.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 33, 33));
        jLabel11.setText("Cargo:");

        edEstado1.setBackground(new java.awt.Color(255, 255, 204));
        edEstado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edEstado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edEstado1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edEstado1ItemStateChanged(evt);
            }
        });
        edEstado1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edEstado1PopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout pnPessoaFisicaLayout = new javax.swing.GroupLayout(pnPessoaFisica);
        pnPessoaFisica.setLayout(pnPessoaFisicaLayout);
        pnPessoaFisicaLayout.setHorizontalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                        .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(edCPF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edRG, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(edDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Cidade:");

        edCidade.setBackground(new java.awt.Color(255, 255, 204));
        edCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 33, 33));
        jLabel10.setText("Estado:");

        edComplemento1.setEditable(false);
        edComplemento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edComplemento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edComplemento1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 33, 33));
        jLabel12.setText("Rua:");

        edLogradouro.setBackground(new java.awt.Color(255, 255, 204));
        edLogradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edLogradouroActionPerformed(evt);
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

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(209, Short.MAX_VALUE))
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edComplemento1)
                                .addContainerGap())))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCamposLayout.createSequentialGroup()
                                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbNome2)
                                    .addGroup(pnCamposLayout.createSequentialGroup()
                                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pnPessoaFisica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edLogradouro)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(edNome))
                        .addContainerGap())))
        );
        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(edComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnCamposLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {edBairro, edCelular, edCidade, edComplemento1, edLogradouro, edNumero, edTelefone});

        jTabbedPane1.addTab("Cadastro", pnCampos);

        pnLista.setBackground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Busca:");

        edBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edBusca.setForeground(new java.awt.Color(33, 33, 33));

        tbClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbClientes.setForeground(new java.awt.Color(33, 33, 33));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbClientes);

        btExcluir.setBackground(new java.awt.Color(243, 243, 243));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(33, 33, 33));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Excluir_15.png"))); // NOI18N
        btExcluir.setText("Excluir");
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
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btNovo1.setBackground(new java.awt.Color(243, 243, 243));
        btNovo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNovo1.setForeground(new java.awt.Color(33, 33, 33));
        btNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Pesquisar_15.png"))); // NOI18N
        btNovo1.setText("Pesquisar");
        btNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo1ActionPerformed(evt);
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
                        .addComponent(btNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnListaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btNovo1, edBusca});

        jTabbedPane1.addTab("Listar", pnLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed

    }//GEN-LAST:event_edNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        /*if (validaCampo()) {
            cliente wCliente = new cliente();

            wCliente.setCodigo(codigo);
            wCliente.setNome(edNome.getText());
            wCliente.setCpf(edCPF.getText());
            wCliente.setRg(edRG.getText());
            wCliente.setDataNasc(edDataNasc.getText());
            wCliente.setTelefone(edTelefone.getText());
            wCliente.setCelular(edCelular.getText());

            ComboItens ci = (ComboItens) edCidade.getSelectedItem();

            wCliente.setCidadeO(new cidadeDAO().consultarId(ci.getCodigo()));
            wCliente.setLogradouro(edLogradouro.getText());
            wCliente.setComplemento(edComplemento.getText());
            wCliente.setBairro(edBairro.getText());
            wCliente.setNumero(edNumero.getText());

            clienteDAO wClienteDAO = new clienteDAO();

            String retorno = null;
            if (wCliente.getCodigo() == 0) {
                retorno = wClienteDAO.salvar(wCliente);
            } else {
                retorno = wClienteDAO.atualizar(wCliente);
            }

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                limpaCampos.limparCampos(pnCampos);
                codigo = 0;
                new clienteDAO().popularTabela(tbClientes, "");
                jTabbedPane1.setSelectedIndex(1);
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
                    + "Mensagem técnica: \n" + retorno);
            }
        }*/
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // limpaCampos.limparCampos(pnCampos);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edLogradouroActionPerformed

    private void edBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edBairroActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        /*String wUsuNome = String.valueOf(tbClientes.getValueAt(tbClientes.getSelectedRow(), 1));

        Object[] options = { "Confirmar", "Cancelar" };
        int wOpc = JOptionPane.showOptionDialog(null, "Deseja excluir o cliente: " + wUsuNome,
            "Informação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (wOpc==0)
        {
            String valor = String.valueOf(tbClientes.getValueAt(tbClientes.getSelectedRow(), 0));

            clienteDAO wClienteDAO = new clienteDAO();

            String retorno = wClienteDAO.excluir(Integer.parseInt(valor));

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                wClienteDAO.popularTabela(tbClientes, edBusca.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!\n\n"
                    + "Mensagem técnica: \n" + retorno);
            }
        }*/
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        /*String valor = String.valueOf(tbClientes.getValueAt(tbClientes.getSelectedRow(), 0));

        cliente wCliente = new clienteDAO().consultarId(Integer.parseInt(valor));

        codigo = Integer.parseInt(valor);

        edNome.setText(wCliente.getNome());
        edCPF.setText(wCliente.getCpf());
        edRG.setText(wCliente.getRg());
        edDataNasc.setText(wCliente.getDataNasc());
        edTelefone.setText(wCliente.getTelefone());
        edCelular.setText(wCliente.getCelular());

        ComboItens estado = new ComboItens();
        estado.setCodigo(wCliente.getCidadeO().getEstadoO().getCodigo());
        new CombosDAO().definirItemCombo(edEstado, estado);

        ComboItens cidade = new ComboItens();
        cidade.setCodigo(wCliente.getCidadeO().getCodigo());
        new CombosDAO().definirItemCombo(edCidade, cidade);

        edLogradouro.setText(wCliente.getLogradouro());
        edComplemento.setText(wCliente.getComplemento());
        edBairro.setText(wCliente.getBairro());
        edNumero.setText(wCliente.getNumero());
        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();*/
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        /*codigo = 0;
        limpaCampos.limparCampos(pnCampos);
        jTabbedPane1.setSelectedIndex(0);
        edNome.requestFocus();*/
    }//GEN-LAST:event_btNovoActionPerformed

    private void btNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo1ActionPerformed
        // new cidadeDAO().popularTabela(tbClientes, edBusca.getText());
    }//GEN-LAST:event_btNovo1ActionPerformed

    private void edEstado1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edEstado1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_edEstado1ItemStateChanged

    private void edEstado1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edEstado1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edEstado1PopupMenuWillBecomeVisible

    private void edComplemento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edComplemento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edComplemento1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btNovo1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edBairro;
    private javax.swing.JTextField edBusca;
    private javax.swing.JFormattedTextField edCPF;
    private javax.swing.JFormattedTextField edCelular;
    private javax.swing.JComboBox<String> edCidade;
    private javax.swing.JTextField edComplemento1;
    private javax.swing.JFormattedTextField edDataNasc;
    private javax.swing.JComboBox<String> edEstado1;
    private javax.swing.JTextField edLogradouro;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNumero;
    private javax.swing.JFormattedTextField edRG;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JPanel pnLista;
    private javax.swing.JPanel pnPessoaFisica;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
