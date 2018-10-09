package view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.FormaPagamento;
import model.Funcionario;
import model.ItensPedido;
import model.ItensPedidoId;
import model.Permissoes;
import model.PessoaJuridica;
import model.Produto;
import model.TelaPermissao;
import model.dao.ComboDAO;
import model.dao.FormaPagamentoDAO;
import model.dao.FuncionarioDAO;
import model.dao.PessoaJuridicaDAO;
import model.dao.ProdutoDAO;
import model.util.ComboItens;
import model.util.Formatacao;
import model.util.Log;
import model.util.Validacao;
import model.util.limpaCampos;
import sun.nio.cs.ext.Big5;

public class CadastroPedidoF extends javax.swing.JInternalFrame implements TelaPermissao {

    int codigoPedido = 0;
    int ID_TELA;
    String tipo;
    int formaPgto;
    ArrayList<ItensPedido> gItensPedido;

    public CadastroPedidoF(int pIDTela, String pTipo) {
        initComponents();
        this.ID_TELA = pIDTela;
        this.setResizable(false);
        this.HabilitarBotoes();
        tipo = pTipo;

        lbValorPed.setText("0,00");

        if (pTipo.equals("C")) {
            edTipoPedido.setText("C - Compra");
        } else {
            edTipoPedido.setText("V - Venda");
        }

        edFormaPgto.removeAllItems();
        new ComboDAO().popularComboFormaPgto(edFormaPgto);

        Formatacao.formatarData(edDataPed);
        edDataPed.setText(Formatacao.getDataAtual());
        formaPgto = 0;
        gItensPedido = new ArrayList();

        tbItensPedido.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String valor = String.valueOf(tbItensPedido.getValueAt(tbItensPedido.getSelectedRow(), 0));

                Integer wCodProduto = Integer.parseInt(valor);
                SelecionaItemPedido(wCodProduto);
            }
        });

        popularTabelaItensPedido();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnCampos = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbItensPedido = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btAddItem = new javax.swing.JButton();
        edNomeProduto = new javax.swing.JTextField();
        edCodProduto = new javax.swing.JTextField();
        btSelecionar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btRemoverItem = new javax.swing.JButton();
        edQuantidade = new model.util.JNumberFormatField();
        edValorUnit = new model.util.JNumberFormatField();
        edValorTotal = new model.util.JNumberFormatField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edFormaPgto = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        edDesconto = new model.util.JNumberFormatField();
        jLabel13 = new javax.swing.JLabel();
        edAcrescimo = new model.util.JNumberFormatField();
        jLabel16 = new javax.swing.JLabel();
        edValAcre = new model.util.JNumberFormatField();
        edValDesc = new model.util.JNumberFormatField();
        pnDadosPrincipal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        edTipoPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edCodigoCli2 = new javax.swing.JTextField();
        edCodFunc = new javax.swing.JTextField();
        edNomeFunc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edCodCliente = new javax.swing.JTextField();
        edNomeCliente = new javax.swing.JTextField();
        btSelecionar2 = new javax.swing.JButton();
        btSelecionar3 = new javax.swing.JButton();
        edDataPed = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        lbValorPed = new javax.swing.JLabel();
        pnLista = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        edBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContratos = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Cadastro de pedidos");
        setToolTipText("");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(501, 362));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(501, 362));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(501, 362));

        pnCampos.setBackground(new java.awt.Color(255, 255, 255));

        btSalvar.setBackground(new java.awt.Color(76, 175, 80));
        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Salvar_15.png"))); // NOI18N
        btSalvar.setText("Salvar");
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
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 33, 33));
        jLabel10.setText("Itens:");

        tbItensPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbItensPedido.setForeground(new java.awt.Color(33, 33, 33));
        tbItensPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbItensPedido);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item do pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btAddItem.setBackground(new java.awt.Color(243, 243, 243));
        btAddItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAddItem.setForeground(new java.awt.Color(33, 33, 33));
        btAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Novo_15.png"))); // NOI18N
        btAddItem.setText("Adicionar item");
        btAddItem.setName("A"); // NOI18N
        btAddItem.setPreferredSize(new java.awt.Dimension(113, 25));
        btAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddItemActionPerformed(evt);
            }
        });

        edNomeProduto.setEditable(false);
        edNomeProduto.setBackground(new java.awt.Color(255, 255, 204));
        edNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edNomeProduto.setForeground(new java.awt.Color(33, 33, 33));

        edCodProduto.setEditable(false);
        edCodProduto.setBackground(new java.awt.Color(255, 255, 204));
        edCodProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCodProduto.setForeground(new java.awt.Color(33, 33, 33));

        btSelecionar1.setBackground(new java.awt.Color(243, 243, 243));
        btSelecionar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSelecionar1.setForeground(new java.awt.Color(33, 33, 33));
        btSelecionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Selecionar_15.png"))); // NOI18N
        btSelecionar1.setText("Selecionar");
        btSelecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionar1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 33, 33));
        jLabel7.setText("Código:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 33, 33));
        jLabel8.setText("Quantidade:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(33, 33, 33));
        jLabel9.setText("Valor unitário:");

        btRemoverItem.setBackground(new java.awt.Color(243, 243, 243));
        btRemoverItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRemoverItem.setForeground(new java.awt.Color(33, 33, 33));
        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Excluir_15.png"))); // NOI18N
        btRemoverItem.setText("Remover item");
        btRemoverItem.setName("R"); // NOI18N
        btRemoverItem.setPreferredSize(new java.awt.Dimension(113, 25));
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        edQuantidade.setBackground(new java.awt.Color(255, 255, 204));
        edQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edQuantidadeFocusLost(evt);
            }
        });
        edQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edQuantidadeKeyTyped(evt);
            }
        });

        edValorUnit.setEditable(false);
        edValorUnit.setBackground(new java.awt.Color(255, 255, 204));
        edValorUnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edValorTotal.setEditable(false);
        edValorTotal.setBackground(new java.awt.Color(255, 255, 204));
        edValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 33, 33));
        jLabel17.setText("Valor total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(edCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelecionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(edQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(edValorUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(edValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddItem, btRemoverItem});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSelecionar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edValorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do encerramento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 33, 33));
        jLabel4.setText("Forma de pagamento:");

        edFormaPgto.setBackground(new java.awt.Color(255, 255, 204));
        edFormaPgto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edFormaPgto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edFormaPgto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edFormaPgtoItemStateChanged(evt);
            }
        });
        edFormaPgto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edFormaPgtoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edFormaPgtoPopupMenuWillBecomeVisible(evt);
            }
        });
        edFormaPgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edFormaPgtoActionPerformed(evt);
            }
        });
        edFormaPgto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                edFormaPgtoPropertyChange(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(33, 33, 33));
        jLabel14.setText("Desconto:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(33, 33, 33));
        jLabel15.setText("Acréscimo:");

        edDesconto.setBackground(new java.awt.Color(255, 255, 204));
        edDesconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 33, 33));
        jLabel13.setText("%");

        edAcrescimo.setBackground(new java.awt.Color(255, 255, 204));
        edAcrescimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 33, 33));
        jLabel16.setText("%");

        edValAcre.setBackground(new java.awt.Color(255, 255, 204));
        edValAcre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edValDesc.setBackground(new java.awt.Color(255, 255, 204));
        edValDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edFormaPgto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(edDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(edAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edValAcre, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(edValDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(edFormaPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edValAcre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edValDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnDadosPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnDadosPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados principais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 33, 33));
        jLabel6.setText("Tipo de pedido");

        edTipoPedido.setEditable(false);
        edTipoPedido.setBackground(new java.awt.Color(255, 255, 204));
        edTipoPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edTipoPedido.setForeground(new java.awt.Color(33, 33, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Vendedor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 33, 33));
        jLabel2.setText("Data do pedido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Situação:");

        edCodigoCli2.setEditable(false);
        edCodigoCli2.setBackground(new java.awt.Color(255, 255, 204));
        edCodigoCli2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCodigoCli2.setForeground(new java.awt.Color(33, 33, 33));

        edCodFunc.setEditable(false);
        edCodFunc.setBackground(new java.awt.Color(255, 255, 204));
        edCodFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCodFunc.setForeground(new java.awt.Color(33, 33, 33));

        edNomeFunc.setEditable(false);
        edNomeFunc.setBackground(new java.awt.Color(255, 255, 204));
        edNomeFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edNomeFunc.setForeground(new java.awt.Color(33, 33, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 33, 33));
        jLabel12.setText("Cliente:");

        edCodCliente.setEditable(false);
        edCodCliente.setBackground(new java.awt.Color(255, 255, 204));
        edCodCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edCodCliente.setForeground(new java.awt.Color(33, 33, 33));

        edNomeCliente.setEditable(false);
        edNomeCliente.setBackground(new java.awt.Color(255, 255, 204));
        edNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edNomeCliente.setForeground(new java.awt.Color(33, 33, 33));

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

        btSelecionar3.setBackground(new java.awt.Color(243, 243, 243));
        btSelecionar3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSelecionar3.setForeground(new java.awt.Color(33, 33, 33));
        btSelecionar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Selecionar_15.png"))); // NOI18N
        btSelecionar3.setText("Selecionar");
        btSelecionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionar3ActionPerformed(evt);
            }
        });

        edDataPed.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnDadosPrincipalLayout = new javax.swing.GroupLayout(pnDadosPrincipal);
        pnDadosPrincipal.setLayout(pnDadosPrincipalLayout);
        pnDadosPrincipalLayout.setHorizontalGroup(
            pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosPrincipalLayout.createSequentialGroup()
                        .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnDadosPrincipalLayout.createSequentialGroup()
                                .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(edCodFunc)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edNomeFunc))
                            .addGroup(pnDadosPrincipalLayout.createSequentialGroup()
                                .addComponent(edCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSelecionar3)
                            .addComponent(btSelecionar2)))
                    .addComponent(jLabel2)
                    .addGroup(pnDadosPrincipalLayout.createSequentialGroup()
                        .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edTipoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(edCodigoCli2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12)
                    .addComponent(edDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnDadosPrincipalLayout.setVerticalGroup(
            pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosPrincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(edCodigoCli2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edTipoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDadosPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelecionar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnDadosPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {edCodFunc, edNomeFunc});

        pnDadosPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {edCodCliente, edNomeCliente});

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lbValorPed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbValorPed.setForeground(new java.awt.Color(0, 102, 153));
        lbValorPed.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbValorPed.setText("999,999");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbValorPed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lbValorPed)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnCamposLayout = new javax.swing.GroupLayout(pnCampos);
        pnCampos.setLayout(pnCamposLayout);
        pnCamposLayout.setHorizontalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addComponent(pnDadosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(pnCamposLayout.createSequentialGroup()
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnCamposLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btSalvar});

        pnCamposLayout.setVerticalGroup(
            pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCamposLayout.createSequentialGroup()
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCamposLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(pnDadosPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", pnCampos);

        pnLista.setBackground(new java.awt.Color(254, 254, 254));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 33, 33));
        jLabel11.setText("Busca:");

        edBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbContratos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbContratos.setForeground(new java.awt.Color(33, 33, 33));
        tbContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbContratos);

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

        javax.swing.GroupLayout pnListaLayout = new javax.swing.GroupLayout(pnLista);
        pnLista.setLayout(pnListaLayout);
        pnListaLayout.setHorizontalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnListaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btEditar, btExcluir, btNovo, btPesquisar});

        pnListaLayout.setVerticalGroup(
            pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnListaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11))
                    .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btNovo))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listar", pnLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        /*String wUsuNome = String.valueOf(tbContratos.getValueAt(tbContratos.getSelectedRow(), 0));

         Object[] options = {"Confirmar", "Cancelar"};
         int wOpc = JOptionPane.showOptionDialog(null, "Deseja excluir o contrato: " + wUsuNome,
         "Informação",
         JOptionPane.DEFAULT_OPTION,
         JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

         if (wOpc == 0) {
         String valor = String.valueOf(tbContratos.getValueAt(tbContratos.getSelectedRow(), 0));

         contratoDAO wContratoDAO = new contratoDAO();

         String retorno = wContratoDAO.excluir(Integer.parseInt(valor));

         if (retorno == null) {
         JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
         //wContratoDAO.popularTabela(tbContratos, edBusca.getText());
         } else {
         JOptionPane.showMessageDialog(null, "Problemas ao excluir registro!\n\n"
         + "Mensagem técnica: \n" + retorno);
         }
         }*/
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        /*String valor = String.valueOf(tbContratos.getValueAt(tbContratos.getSelectedRow(), 0));

         Contrato wContrato = new contratoDAO().consultarId(Integer.parseInt(valor));

         codigo = Integer.parseInt(valor);

         edDataIni.setText(wContrato.getDataIni());
         edDataFim.setText(wContrato.getDataFim());
        
         GParcelas = wContrato.getAParcelas();
         popularTabela();

         jTabbedPane1.setSelectedIndex(0);
         edCodigoCli.requestFocus();*/
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        /*codigo = 0;
         limpaCampos.limparCampos(pnCampos);
         jTabbedPane1.setSelectedIndex(0);
         edCodigoCli.requestFocus();

         Calendario cal = new Calendario();
         edDataIni.setText(cal.obterDataAtualDMA());*/
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void edFormaPgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edFormaPgtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edFormaPgtoActionPerformed

    private void edFormaPgtoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edFormaPgtoPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edFormaPgtoPopupMenuWillBecomeVisible

    private void edFormaPgtoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edFormaPgtoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edFormaPgtoPopupMenuWillBecomeInvisible

    private void btAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddItemActionPerformed
        if (validaCampoItens()) {
            adicionarItemPedido(Integer.parseInt(edCodCliente.getText()), edQuantidade.getValue(), edQuantidade.getValue().multiply(edValorUnit.getValue()));
            popularTabelaItensPedido();
            limparCamposItemPedido();
        }
    }//GEN-LAST:event_btAddItemActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        //limpaCampos.limparCampos(pnCampos);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        /*if (validaCampo()) {
         Contrato wContrato = new Contrato();
         wContrato.setCodigo(codigo);
         wContrato.setDataIni(edDataIni.getText());
         wContrato.setDataFim(edDataFim.getText());
         wContrato.setOCliente(new clienteDAO().consultarId(Integer.parseInt(edCodigoCli.getText())));
         wContrato.setViagens(GViagens);
         wContrato.setAParcelas(GParcelas);
         contratoDAO wContratoDAO = new contratoDAO();

         String retorno = null;
         if (wContrato.getCodigo() == 0) {
         retorno = wContratoDAO.salvar(wContrato);
         } else {
         retorno = wContratoDAO.atualizar(wContrato);
         }

         if (retorno == null) {
         JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
         limpaCampos.limparCampos(pnCampos);
         codigo = 0;
         new contratoDAO().popularTabela(tbContratos, "", Integer.parseInt(edCodigoCli.getText()));
         jTabbedPane1.setSelectedIndex(1);
         } else {
         JOptionPane.showMessageDialog(null, "Problemas ao salvar registro!\n\n"
         + "Mensagem técnica: \n" + retorno);
         }
         }*/
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSelecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionar1ActionPerformed
        SelecionarCliente wSelecionar = new SelecionarCliente(null, true);
        wSelecionar.CarregarProdutos();
        wSelecionar.setVisible(true);

        if (wSelecionar.getTextSearch() != null) {
            SelecionaItemPedido(Integer.parseInt(wSelecionar.getTextSearch()));
        }
    }//GEN-LAST:event_btSelecionar1ActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        if (validaCampoItens()) {
            Object[] options = {"Confirmar", "Cancelar"};
            int wOpc = JOptionPane.showOptionDialog(null, "Deseja remover o item do pedido?",
                    "Informação",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (wOpc == 0) {
                removerItemPedido(Integer.parseInt(edCodCliente.getText()));
                popularTabelaItensPedido();
                limparCamposItemPedido();
            }
        }
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void btSelecionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionar2ActionPerformed
        SelecionarCliente wSelecionar = new SelecionarCliente(null, true);
        wSelecionar.CarregarCliente();
        wSelecionar.setVisible(true);

        if (wSelecionar.getTextSearch() != null) {
            PessoaJuridica wCliente = new PessoaJuridicaDAO().consultarID(Integer.parseInt(wSelecionar.getTextSearch()));
            edCodCliente.setText(wCliente.getIdPessoa() + "");
            edNomeCliente.setText(wCliente.getNome() + "");
        }
    }//GEN-LAST:event_btSelecionar2ActionPerformed

    private void btSelecionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionar3ActionPerformed
        SelecionarCliente wSelecionarCliente = new SelecionarCliente(null, true);
        wSelecionarCliente.CarregarFuncionarios();
        wSelecionarCliente.setVisible(true);

        if (wSelecionarCliente.getTextSearch() != null) {
            Funcionario wFunc = new FuncionarioDAO().consultarID(Integer.parseInt(wSelecionarCliente.getTextSearch()));
            edCodFunc.setText(wFunc.getIdPessoa() + "");
            edNomeFunc.setText(wFunc.getNome() + "");
        }
    }//GEN-LAST:event_btSelecionar3ActionPerformed

    private void edFormaPgtoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edFormaPgtoItemStateChanged
        ComboItens ci = (ComboItens) edFormaPgto.getSelectedItem();
        if (ci != null) {
            edDesconto.setValue(BigDecimal.valueOf(0.00));
            edAcrescimo.setValue(BigDecimal.valueOf(0.00));;
            edValDesc.setValue(BigDecimal.valueOf(0.00));;
            edValAcre.setValue(BigDecimal.valueOf(0.00));;

            if (ci.getCodigo() > 0) {
                formaPgto = ci.getCodigo();
                FormaPagamento wFormaPgto = new FormaPagamentoDAO().consultarID(formaPgto);

                edDesconto.setValue(BigDecimal.valueOf(wFormaPgto.getPercDesconto()));
                edAcrescimo.setValue(BigDecimal.valueOf(wFormaPgto.getPercAcrescimo()));

                edValAcre.setValue(BigDecimal.valueOf(0.00));
                edValDesc.setValue(BigDecimal.valueOf(0.00));

                valorTotalPedido();
            }
        }
    }//GEN-LAST:event_edFormaPgtoItemStateChanged

    private void edFormaPgtoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_edFormaPgtoPropertyChange

    }//GEN-LAST:event_edFormaPgtoPropertyChange

    private void edQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edQuantidadeKeyTyped

    }//GEN-LAST:event_edQuantidadeKeyTyped

    private void edQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edQuantidadeFocusLost
        if (validaCampoItens()) {
            edValorTotal.setValue(edQuantidade.getValue().multiply(edValorUnit.getValue()));
        }
    }//GEN-LAST:event_edQuantidadeFocusLost

    private void removerItemPedido(Integer pCodigo) {
        if (validaCampoItens()) 
        {
            ItensPedido witemPedido = null;
            
            for (ItensPedido itensPedido : gItensPedido) {
                if (itensPedido.getId().getIdProduto() == pCodigo) {
                    witemPedido = itensPedido;
                }
            }

            if (witemPedido != null) {
                gItensPedido.remove(witemPedido);
                valorTotalPedido();
            } else {
                JOptionPane.showMessageDialog(this, "Item não adicionado ao pedido!");
            }
        }
    }

    private void adicionarItemPedido(Integer pCodigo, BigDecimal pQuantidade, BigDecimal pValorTotal) {
        ItensPedido wItemPedido = verificaItemNoPedido(pCodigo);

        if (wItemPedido == null) {
            wItemPedido = new ItensPedido();
            wItemPedido.setId(new ItensPedidoId(codigoPedido, pCodigo));
            wItemPedido.setQuantidade(pQuantidade);
            wItemPedido.setValorTotal(edQuantidade.getValue().multiply(edValorUnit.getValue()));
            gItensPedido.add(wItemPedido);
        } else {
            wItemPedido.setQuantidade(pQuantidade);
            wItemPedido.setValorTotal(pValorTotal);
        }

        valorTotalPedido();
        popularTabelaItensPedido();
    }

    private void popularTabela() {
        // dados da tabela
        /* Object[][] dadosTabela = null;

         // cabecalho da tabela
         Object[] cabecalho = new Object[4];
         cabecalho[0] = "Parcela";
         cabecalho[1] = "Data de vencimento";
         cabecalho[2] = "data de pagamento";
         cabecalho[3] = "Valor";

         dadosTabela = new Object[GParcelas.size()][4];
         for (int j = 0; j < GParcelas.size(); j++) {
         dadosTabela[j][0] = GParcelas.get(j).getSeq();
         dadosTabela[j][1] = GParcelas.get(j).getDataVencimento();
         dadosTabela[j][2] = GParcelas.get(j).getDataPagamento();
         dadosTabela[j][3] = GParcelas.get(j).getValor();
         }

         // configuracoes adicionais no componente tabela
         tbParcelas.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
         @Override
         // quando retorno for FALSE, a tabela nao é editavel
         public boolean isCellEditable(int row, int column) {
         return false;
         }

         // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
         @Override
         public Class getColumnClass(int column) {

         if (column == 2) {
         //return ImageIcon.class;
         }
         return Object.class;
         }
         });

         // permite seleção de apenas uma linha da tabela
         tbParcelas.setSelectionMode(0);

         // redimensiona as colunas de uma tabela
         TableColumn column = null;
         for (int i = 0; i < tbParcelas.getColumnCount(); i++) {
         column = tbParcelas.getColumnModel().getColumn(i);
         switch (i) {
         case 0:
         column.setPreferredWidth(17);
         break;
         case 1:
         column.setPreferredWidth(140);
         break;
         }
         }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddItem;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSelecionar1;
    private javax.swing.JButton btSelecionar2;
    private javax.swing.JButton btSelecionar3;
    private model.util.JNumberFormatField edAcrescimo;
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edCodCliente;
    private javax.swing.JTextField edCodFunc;
    private javax.swing.JTextField edCodProduto;
    private javax.swing.JTextField edCodigoCli2;
    private javax.swing.JFormattedTextField edDataPed;
    private model.util.JNumberFormatField edDesconto;
    private javax.swing.JComboBox<String> edFormaPgto;
    private javax.swing.JTextField edNomeCliente;
    private javax.swing.JTextField edNomeFunc;
    private javax.swing.JTextField edNomeProduto;
    private model.util.JNumberFormatField edQuantidade;
    private javax.swing.JTextField edTipoPedido;
    private model.util.JNumberFormatField edValAcre;
    private model.util.JNumberFormatField edValDesc;
    private model.util.JNumberFormatField edValorTotal;
    private model.util.JNumberFormatField edValorUnit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbValorPed;
    private javax.swing.JPanel pnCampos;
    private javax.swing.JPanel pnDadosPrincipal;
    private javax.swing.JPanel pnLista;
    private javax.swing.JTable tbContratos;
    private javax.swing.JTable tbItensPedido;
    // End of variables declaration//GEN-END:variables

    private boolean validaCampoItens() {
        if (edCodProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
            edCodProduto.requestFocus();
            return false;
        }

        if (edQuantidade.getValue() == BigDecimal.valueOf(0.00)) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade do item");
            edQuantidade.requestFocus();
            return false;
        }

        return true;
    }

    private void popularTabelaItensPedido() {

        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Unidade";
        cabecalho[3] = "Valor unitário";
        cabecalho[4] = "Quantidade";
        cabecalho[5] = "Valor total";

        try {

            dadosTabela = new Object[gItensPedido.size()][6];

            int lin = 0;
            // efetua consulta na tabela
            for (ItensPedido o : gItensPedido) {
                Produto wProduto = new ProdutoDAO().consultarID(o.getId().getIdProduto());

                dadosTabela[lin][0] = o.getId().getIdProduto();
                dadosTabela[lin][1] = wProduto.getNome();
                dadosTabela[lin][2] = wProduto.getUnidade().getSigla();
                dadosTabela[lin][3] = wProduto.getPercentualLucro();
                dadosTabela[lin][4] = o.getQuantidade();
                dadosTabela[lin][5] = o.getValorTotal();
                lin++;
            }
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tbItensPedido.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
                    //return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tbItensPedido.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tbItensPedido.getColumnCount(); i++) {
            column = tbItensPedido.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
            }
        }
    }

    private BigDecimal calculaValorTotalProduto(BigDecimal pQtd, BigDecimal pValor) {
        return pQtd.multiply(pValor);
    }

    private ItensPedido verificaItemNoPedido(Integer pCodigo) {
        for (ItensPedido itensPedido : gItensPedido) {
            if (itensPedido.getId().getIdProduto() == pCodigo) {
                return itensPedido;
            }
        }

        return null;
    }

    private void preencheCamposItemPedido(ItensPedido wItemPedido) {
        edCodProduto.setText("");
        edNomeProduto.setText("");
        edQuantidade.setValue(BigDecimal.ZERO);
        edValorUnit.setValue(BigDecimal.ZERO);
        edValorTotal.setValue(BigDecimal.ZERO);

        if (wItemPedido != null) {
            Produto wProduto = new ProdutoDAO().consultarID(wItemPedido.getId().getIdProduto());

            edCodProduto.setText(wProduto.getIdProduto() + "");
            edNomeProduto.setText(wProduto.getNome() + "");
            edQuantidade.setValue(wItemPedido.getQuantidade());
            edValorUnit.setValue(wProduto.getPercentualLucro());
            edValorTotal.setValue(wItemPedido.getValorTotal());
        }
    }

    public void SelecionaItemPedido(Integer pCodigo) {
        ItensPedido wItemPedido = verificaItemNoPedido(pCodigo);

        if (wItemPedido == null) {
            Produto wProduto = new ProdutoDAO().consultarID(pCodigo);
            wItemPedido = new ItensPedido();
            wItemPedido.setId(new ItensPedidoId(codigoPedido, wProduto.getIdProduto()));
            wItemPedido.setQuantidade(BigDecimal.valueOf(1.0));
            wItemPedido.setValorTotal(calculaValorTotalProduto(BigDecimal.ONE, wProduto.getPercentualLucro()));
        }

        preencheCamposItemPedido(wItemPedido);
    }

    private void valorTotalPedido() {
        double wResultado = 0;
        double wAcre = 0;
        double wDesc = 0;

        for (ItensPedido itensPedido : gItensPedido) {
            wResultado = wResultado + itensPedido.getValorTotal().doubleValue();
        }

        if (formaPgto > 0) {
            FormaPagamento wFormaPgto = new FormaPagamentoDAO().consultarID(formaPgto);

            wAcre = (wResultado * wFormaPgto.getPercAcrescimo() / 100);
            wDesc = (wResultado * wFormaPgto.getPercDesconto() / 100);
            wResultado = wResultado + wAcre;
            wResultado = wResultado - wDesc;
        }

        edValAcre.setValue(BigDecimal.valueOf(wAcre));
        edValDesc.setValue(BigDecimal.valueOf(wDesc));
        lbValorPed.setText(BigDecimal.valueOf(wResultado) + "");
    }

    @Override
    public ArrayList<JButton> BotoesTela() {
        ArrayList<JButton> wBotoes = new ArrayList();
        wBotoes.add(btNovo);
        wBotoes.add(btSalvar);
        wBotoes.add(btEditar);
        wBotoes.add(btPesquisar);
        wBotoes.add(btExcluir);
        wBotoes.add(btAddItem);
        wBotoes.add(btRemoverItem);
        return wBotoes;
    }

    @Override
    public void HabilitarBotoes() {
        Permissoes.aplicaHabilitacao(this.ID_TELA, this.BotoesTela());
    }

    private void limparCamposItemPedido() {
        edCodProduto.setText("");
        edNomeProduto.setText("");
        edQuantidade.setValue(BigDecimal.ZERO);
        edValorUnit.setValue(BigDecimal.ZERO);
        edValorTotal.setValue(BigDecimal.ZERO);
    }
}
