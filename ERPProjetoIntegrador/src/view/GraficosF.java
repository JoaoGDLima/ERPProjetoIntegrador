/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import model.dao.ConexaoBD;
import model.util.ComboItens;
import model.util.Log;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import sun.security.util.Length;

public class GraficosF extends javax.swing.JInternalFrame {

    public GraficosF() {
        initComponents();

        edAno.removeAllItems();
        popularComboAno(edAno);

        edTipoPedido.removeAllItems();
        popularComboTipoPedido(edTipoPedido);

        edAnoVenc.removeAllItems();
        popularComboAnoVenc(edAnoVenc);

        edMes.removeAllItems();
        popularComboMes(edMes);

        edUltimos.removeAllItems();
        popularComboUltimos(edUltimos);

        try {
            criaGraficoPedidoAno();
            criaGraficoParcelasMes();
            criaGraficoPedido();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnGrafico1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edAno = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        edTipoPedido = new javax.swing.JComboBox<String>();
        pnGrafico1a = new javax.swing.JPanel();
        btAtuGrafico1 = new javax.swing.JButton();
        pnGrafico2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edMes = new javax.swing.JComboBox<String>();
        pnGrafico2b = new javax.swing.JPanel();
        edAnoVenc = new javax.swing.JComboBox<String>();
        btAtuGrafico2 = new javax.swing.JButton();
        pnGrafico3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edUltimos = new javax.swing.JComboBox<String>();
        pnGrafico3a = new javax.swing.JPanel();
        btAtuGrafico3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        jButton2.setBackground(new java.awt.Color(243, 243, 243));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setTitle("Gráficos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnGrafico1.setBackground(new java.awt.Color(255, 255, 255));
        pnGrafico1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 33, 33));
        jLabel3.setText("Ano:");

        edAno.setBackground(new java.awt.Color(255, 255, 204));
        edAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edAno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edAnoItemStateChanged(evt);
            }
        });
        edAno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edAnoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edAnoPopupMenuWillBecomeVisible(evt);
            }
        });
        edAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edAnoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 33, 33));
        jLabel4.setText("Tipo pedido:");

        edTipoPedido.setBackground(new java.awt.Color(255, 255, 204));
        edTipoPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edTipoPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edTipoPedido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edTipoPedidoItemStateChanged(evt);
            }
        });
        edTipoPedido.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edTipoPedidoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edTipoPedidoPopupMenuWillBecomeVisible(evt);
            }
        });
        edTipoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edTipoPedidoActionPerformed(evt);
            }
        });

        pnGrafico1a.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnGrafico1aLayout = new javax.swing.GroupLayout(pnGrafico1a);
        pnGrafico1a.setLayout(pnGrafico1aLayout);
        pnGrafico1aLayout.setHorizontalGroup(
            pnGrafico1aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnGrafico1aLayout.setVerticalGroup(
            pnGrafico1aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        btAtuGrafico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Atualizar_30.png"))); // NOI18N
        btAtuGrafico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtuGrafico1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGrafico1Layout = new javax.swing.GroupLayout(pnGrafico1);
        pnGrafico1.setLayout(pnGrafico1Layout);
        pnGrafico1Layout.setHorizontalGroup(
            pnGrafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGrafico1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGrafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGrafico1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addComponent(btAtuGrafico1))
                    .addGroup(pnGrafico1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnGrafico1Layout.createSequentialGroup()
                        .addGroup(pnGrafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edAno, 0, 380, Short.MAX_VALUE)
                            .addComponent(edTipoPedido, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnGrafico1a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnGrafico1Layout.setVerticalGroup(
            pnGrafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGrafico1Layout.createSequentialGroup()
                .addGroup(pnGrafico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAtuGrafico1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edTipoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnGrafico1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnGrafico2.setBackground(new java.awt.Color(255, 255, 255));
        pnGrafico2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 33, 33));
        jLabel5.setText("Ano:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 33, 33));
        jLabel6.setText("Mês:");

        edMes.setBackground(new java.awt.Color(255, 255, 204));
        edMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edMesItemStateChanged(evt);
            }
        });
        edMes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edMesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edMesPopupMenuWillBecomeVisible(evt);
            }
        });
        edMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edMesActionPerformed(evt);
            }
        });

        pnGrafico2b.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnGrafico2bLayout = new javax.swing.GroupLayout(pnGrafico2b);
        pnGrafico2b.setLayout(pnGrafico2bLayout);
        pnGrafico2bLayout.setHorizontalGroup(
            pnGrafico2bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnGrafico2bLayout.setVerticalGroup(
            pnGrafico2bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        edAnoVenc.setBackground(new java.awt.Color(255, 255, 204));
        edAnoVenc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edAnoVenc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edAnoVenc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edAnoVencItemStateChanged(evt);
            }
        });
        edAnoVenc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edAnoVencPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edAnoVencPopupMenuWillBecomeVisible(evt);
            }
        });
        edAnoVenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edAnoVencActionPerformed(evt);
            }
        });

        btAtuGrafico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Atualizar_30.png"))); // NOI18N
        btAtuGrafico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtuGrafico2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGrafico2Layout = new javax.swing.GroupLayout(pnGrafico2);
        pnGrafico2.setLayout(pnGrafico2Layout);
        pnGrafico2Layout.setHorizontalGroup(
            pnGrafico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGrafico2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGrafico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGrafico2Layout.createSequentialGroup()
                        .addGroup(pnGrafico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edAnoVenc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnGrafico2b, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnGrafico2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnGrafico2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addComponent(btAtuGrafico2))))
        );
        pnGrafico2Layout.setVerticalGroup(
            pnGrafico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGrafico2Layout.createSequentialGroup()
                .addGroup(pnGrafico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAtuGrafico2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edAnoVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnGrafico2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnGrafico3.setBackground(new java.awt.Color(255, 255, 255));
        pnGrafico3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 33, 33));
        jLabel7.setText("Últimos:");

        edUltimos.setBackground(new java.awt.Color(255, 255, 204));
        edUltimos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edUltimos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edUltimos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                edUltimosItemStateChanged(evt);
            }
        });
        edUltimos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                edUltimosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                edUltimosPopupMenuWillBecomeVisible(evt);
            }
        });
        edUltimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edUltimosActionPerformed(evt);
            }
        });

        pnGrafico3a.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnGrafico3aLayout = new javax.swing.GroupLayout(pnGrafico3a);
        pnGrafico3a.setLayout(pnGrafico3aLayout);
        pnGrafico3aLayout.setHorizontalGroup(
            pnGrafico3aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnGrafico3aLayout.setVerticalGroup(
            pnGrafico3aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        btAtuGrafico3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Atualizar_30.png"))); // NOI18N
        btAtuGrafico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtuGrafico3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGrafico3Layout = new javax.swing.GroupLayout(pnGrafico3);
        pnGrafico3.setLayout(pnGrafico3Layout);
        pnGrafico3Layout.setHorizontalGroup(
            pnGrafico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGrafico3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGrafico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnGrafico3a, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(edUltimos, 0, 380, Short.MAX_VALUE)
                    .addGroup(pnGrafico3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGrafico3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAtuGrafico3))
        );
        pnGrafico3Layout.setVerticalGroup(
            pnGrafico3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGrafico3Layout.createSequentialGroup()
                .addComponent(btAtuGrafico3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edUltimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnGrafico3a, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton3.setBackground(new java.awt.Color(243, 243, 243));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publico/Cancelar_15.png"))); // NOI18N
        jButton3.setText("Sair");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnGrafico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnGrafico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnGrafico3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnGrafico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnGrafico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edAnoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edAnoPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_edAnoPopupMenuWillBecomeInvisible

    private void edAnoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edAnoPopupMenuWillBecomeVisible
        /*ComboItens itemSelec = (ComboItens) edEstado.getSelectedItem();
         edEstado.removeAllItems();
         CombosDAO wCombosDAO = new CombosDAO();
         wCombosDAO.popularCombo("estado","codigo, nome", "", "nome", edEstado);

         if (itemSelec!=null) {
         wCombosDAO.definirItemCombo(edEstado, itemSelec);
         }*/
    }//GEN-LAST:event_edAnoPopupMenuWillBecomeVisible

    private void edAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edAnoActionPerformed

    }//GEN-LAST:event_edAnoActionPerformed

    private void edTipoPedidoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edTipoPedidoPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edTipoPedidoPopupMenuWillBecomeInvisible

    private void edTipoPedidoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edTipoPedidoPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edTipoPedidoPopupMenuWillBecomeVisible

    private void edTipoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edTipoPedidoActionPerformed

    }//GEN-LAST:event_edTipoPedidoActionPerformed

    private void edMesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edMesPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edMesPopupMenuWillBecomeInvisible

    private void edMesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edMesPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edMesPopupMenuWillBecomeVisible

    private void edMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edMesActionPerformed

    private void edUltimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edUltimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edUltimosActionPerformed

    private void edUltimosPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edUltimosPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edUltimosPopupMenuWillBecomeVisible

    private void edUltimosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edUltimosPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edUltimosPopupMenuWillBecomeInvisible

    private void edAnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edAnoItemStateChanged

    }//GEN-LAST:event_edAnoItemStateChanged

    private void edTipoPedidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edTipoPedidoItemStateChanged

    }//GEN-LAST:event_edTipoPedidoItemStateChanged

    private void edMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edMesItemStateChanged

    }//GEN-LAST:event_edMesItemStateChanged

    private void edUltimosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edUltimosItemStateChanged
        ComboItens ci = (ComboItens) edUltimos.getSelectedItem();
        if (ci != null) {
            try {
                criaGraficoPedidoAno();
            } catch (SQLException ex) {
                Logger.getLogger(GraficosF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_edUltimosItemStateChanged

    private void edAnoVencItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_edAnoVencItemStateChanged

    }//GEN-LAST:event_edAnoVencItemStateChanged

    private void edAnoVencPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edAnoVencPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edAnoVencPopupMenuWillBecomeInvisible

    private void edAnoVencPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_edAnoVencPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_edAnoVencPopupMenuWillBecomeVisible

    private void edAnoVencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edAnoVencActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edAnoVencActionPerformed

    private void btAtuGrafico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtuGrafico1ActionPerformed
        try {
            criaGraficoPedido();
        } catch (SQLException ex) {
            Logger.getLogger(GraficosF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAtuGrafico1ActionPerformed

    private void btAtuGrafico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtuGrafico2ActionPerformed
        try {
            criaGraficoParcelasMes();
        } catch (SQLException ex) {
            Logger.getLogger(GraficosF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAtuGrafico2ActionPerformed

    private void btAtuGrafico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtuGrafico3ActionPerformed
        try {
            criaGraficoPedidoAno();
        } catch (SQLException ex) {
            Logger.getLogger(GraficosF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAtuGrafico3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void criaGraficoPedidoAno() throws SQLException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ResultSet resultadoQ = null;

        ComboItens ci = (ComboItens) edUltimos.getSelectedItem();
        int wAno = ci.getCodigo() + 1;

        String wWhere = "";
        if (wAno > 0) {
            wWhere = " AND Extract('Year' From data_pedido) > (Extract('Year' From NOW()) - " + wAno + ")";
        }

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                    "SELECT Extract('Year' From data_pedido) as ano, sum(valor_total) AS valor_total"
                    + " FROM pedido "
                    + " WHERE pedido.tipo = 'C'"
                    + wWhere
                    + " GROUP BY ano");

            while (resultadoQ.next()) {
                dataset.addValue(resultadoQ.getFloat("valor_total"), "Compras", "Ano " + resultadoQ.getInt("ano"));
            }

            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                    "SELECT Extract('Year' From data_pedido) as ano, sum(valor_total) AS valor_total"
                    + " FROM pedido "
                    + " WHERE pedido.tipo = 'V'"
                    + wWhere
                    + " GROUP BY ano");

            while (resultadoQ.next()) {
                dataset.addValue(resultadoQ.getFloat("valor_total"), "Vendas", "Ano " + resultadoQ.getInt("ano"));
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        JFreeChart chart = ChartFactory.createBarChart("Pedidos últimos " + ci.getDescricao(),
                "Ano", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel painel = new ChartPanel(chart);

        pnGrafico3a.removeAll();
        pnGrafico3a.add(painel);

        painel.setLocation(0, 0);
        painel.setSize(380, 329);

        pnGrafico3a.validate();
        pnGrafico3a.repaint();

        /*try {
            OutputStream png = new FileOutputStream("Grafico.png");
            ChartUtilities.writeChartAsPNG(png, chart, 500, 400);
            png.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }*/
    }

    private void criaGraficoParcelasMes() throws SQLException {
        DefaultPieDataset dataset = new DefaultPieDataset();

        ResultSet resultadoQ = null;

        ComboItens ci = (ComboItens) edAnoVenc.getSelectedItem();
        int wAno = ci.getCodigo();

        ComboItens ci2 = (ComboItens) edMes.getSelectedItem();
        int wMes = ci2.getCodigo();

        String wWhereMes = "";
        if (wMes > 0) {
            wWhereMes = " AND Extract('Month' From data_vencimento) = " + wMes;
        }

        String wWhereAno = "";
        if (wAno > 0) {
            wWhereAno = " AND Extract('year' From data_vencimento) = " + wAno;
        }

        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                    "SELECT count(*) as parcelas"
                    + " FROM movimentacao_financ "
                    + " INNER JOIN pedido ON pedido.id_pedido = movimentacao_financ.id_pedido"
                    + " WHERE pedido.tipo = 'V'"
                    + " AND data_quitacao is not null"
                    + wWhereMes
                    + wWhereAno);

            while (resultadoQ.next()) {
                dataset.setValue("Quitadas", resultadoQ.getInt("parcelas"));
            }

            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                    "SELECT count(*) as parcelas"
                    + " FROM movimentacao_financ "
                    + " INNER JOIN pedido ON pedido.id_pedido = movimentacao_financ.id_pedido"
                    + " WHERE pedido.tipo = 'V'"
                    + " AND data_quitacao is null"
                    + wWhereMes
                    + wWhereAno);

            while (resultadoQ.next()) {
                dataset.setValue("Em aberto", resultadoQ.getInt("parcelas"));
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        JFreeChart chart = ChartFactory.createPieChart("Situação das parcelas", dataset, true, true, false);

        ChartPanel painel = new ChartPanel(chart);
        pnGrafico2b.removeAll();
        pnGrafico2b.add(painel);

        painel.setLocation(0, 0);
        painel.setSize(380, 300);

        pnGrafico2b.validate();
        pnGrafico2b.repaint();

        /*try {
            OutputStream png = new FileOutputStream("Grafico.png");
            ChartUtilities.writeChartAsPNG(png, chart, 500, 400);
            png.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }*/
    }

    private void criaGraficoPedido() throws SQLException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ResultSet resultadoQ = null;

        ComboItens ci = (ComboItens) edAno.getSelectedItem();
        int wAno = ci.getCodigo();

        ComboItens ci2 = (ComboItens) edTipoPedido.getSelectedItem();
        int wTipo = ci2.getCodigo();

        String wWhere = "";
        if (wAno > 0) {
            wWhere = " AND data_pedido between '" + wAno + "-01-01' and '" + wAno + "-12-31' ";
        }

        try {
            if ((wTipo == 0) || (wTipo == 2)) {
                resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                        "SELECT Extract('Month' From data_pedido) as mes, sum(valor_total) AS valor_total"
                        + " FROM pedido "
                        + " WHERE tipo = 'C'"
                        + wWhere
                        + " GROUP BY mes");

                while (resultadoQ.next()) {
                    dataset.addValue(resultadoQ.getFloat("valor_total"), "Compras", "Mês " + resultadoQ.getInt("mes"));
                }
            }

            if ((wTipo == 0) || (wTipo == 1)) {
                resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                        "SELECT Extract('Month' From data_pedido) as mes, sum(valor_total) AS valor_total"
                        + " FROM pedido "
                        + " WHERE tipo = 'V'"
                        + wWhere
                        + " GROUP BY mes");

                while (resultadoQ.next()) {
                    dataset.addValue(resultadoQ.getFloat("valor_total"), "Vendas", "Mês " + resultadoQ.getInt("mes"));
                }
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        JFreeChart chart = ChartFactory.createLineChart("Pedidos por anos", "Mês", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel painel = new ChartPanel(chart);
        pnGrafico1a.removeAll();
        pnGrafico1a.add(painel);

        painel.setLocation(0, 0);
        painel.setSize(380, 300);

        pnGrafico1a.validate();
        pnGrafico1a.repaint();

        /*try {
            OutputStream png = new FileOutputStream("Grafico.png");
            ChartUtilities.writeChartAsPNG(png, chart, 500, 400);
            png.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }*/
    }

    public void popularComboAno(JComboBox combo) {
        try {
            ComboItens item;

            ResultSet resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                    "SELECT distinct Extract('year' From data_pedido) as ano"
                    + " FROM pedido ");

            while (resultadoQ.next()) {
                item = new ComboItens();
                item.setCodigo(resultadoQ.getInt("ano"));
                item.setDescricao(resultadoQ.getInt("ano") + "");

                combo.addItem(item);
            }

        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void popularComboAnoVenc(JComboBox combo) {

        try {
            ComboItens item = new ComboItens();
            item.setCodigo(0);
            item.setDescricao("Selecione");
            combo.addItem(item);

            ResultSet resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(
                    "SELECT  distinct Extract('year' From data_vencimento) as ano"
                    + " FROM movimentacao_financ ");

            if (resultadoQ.isBeforeFirst()) {
                while (resultadoQ.next()) {
                    item = new ComboItens();
                    item.setCodigo(resultadoQ.getInt("ano"));
                    item.setDescricao(resultadoQ.getString("ano"));

                    combo.addItem(item);
                }
            }

        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void popularComboTipoPedido(JComboBox combo) {
        try {
            String mes[] = {"Selecione", "Vendas", "Compras"};

            for (int i = 0; i < 3; i++) {
                ComboItens item = new ComboItens();
                item.setCodigo(i);
                item.setDescricao(mes[i]);
                combo.addItem(item);
            }

        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void popularComboMes(JComboBox combo) {
        try {
            String mes[] = {"Selecione", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

            for (int i = 0; i < 13; i++) {
                ComboItens item = new ComboItens();
                item.setCodigo(i);
                item.setDescricao(mes[i]);
                combo.addItem(item);
            }

        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void popularComboUltimos(JComboBox combo) {
        try {
            String mes[] = {"Selecione", "2 anos", "3 anos", "4 anos", "5 anos", "6 anos", "7 anos", "8 anos", "9 anos", "10 anos"};

            for (int i = 0; i < 7; i++) {
                ComboItens item = new ComboItens();
                item.setCodigo(i);
                item.setDescricao(mes[i]);
                combo.addItem(item);
            }

        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtuGrafico1;
    private javax.swing.JButton btAtuGrafico2;
    private javax.swing.JButton btAtuGrafico3;
    private javax.swing.JComboBox<String> edAno;
    private javax.swing.JComboBox<String> edAnoVenc;
    private javax.swing.JComboBox<String> edMes;
    private javax.swing.JComboBox<String> edTipoPedido;
    private javax.swing.JComboBox<String> edUltimos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnGrafico1;
    private javax.swing.JPanel pnGrafico1a;
    private javax.swing.JPanel pnGrafico2;
    private javax.swing.JPanel pnGrafico2b;
    private javax.swing.JPanel pnGrafico3;
    private javax.swing.JPanel pnGrafico3a;
    // End of variables declaration//GEN-END:variables
}
