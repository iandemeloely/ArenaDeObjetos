/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Guerreiro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.GuerreiroServicos;
import servicos.ServicosFactory;

/**
 *
 * @author 182310085
 */
public class JFGuerreiro extends javax.swing.JFrame {

    int idEdit;

    /**
     * Creates new form JFGuerreiro1
     */
    public JFGuerreiro() {
        initComponents();
        addRowToTable();
        jbeditarguerreiro.setVisible(false);
        jbdeletarguerreiro.setVisible(false);
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtGuerreiro.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        //cria vetor de 5 posições que corresponde as colunas da tabela
        Object rowData[] = new Object[6];
        GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
        //percorer lista e popula vetor e add vetor e tabela
        for (Guerreiro guerreiro : guerreiroS.listaguerreiro()) {
            rowData[0] = guerreiro.getId();
            rowData[1] = guerreiro.getNome();
            rowData[2] = guerreiro.getOlho();
            //if ternary operator
            rowData[3] = guerreiro.isSexo() == false ? "Feminino" : "Masculino";
            rowData[4] = guerreiro.getPontosDeVida();
            rowData[5] = guerreiro.getArmamento();
            model.addRow(rowData);

        }
    }//fim addrowToTable

    private void limpaCampos() {
        jtfnomeguerreiro.setText("");
        jtfcabeloguerreiro.setText("");
        jtfolhoguerreiro.setText("");
        jtfpeleguerreiro.setText("");
        jtarmamento.setText("");
        bgSexoGuerreiro.clearSelection();
        jtfnomeguerreiro.requestFocus();

    }

    private boolean validainputs() {
        if (jtfnomeguerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "preencher nome");
            jtfnomeguerreiro.requestFocus();
            return false;
        }

        if (jtarmamento.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "preencher armamento");
            jtarmamento.requestFocus();
            return false;
        }

        if (jtfolhoguerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "preencher olho");
            jtfolhoguerreiro.requestFocus();
            return false;
        }

        if (jtfcabeloguerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "preencher cabelo");
            jtfcabeloguerreiro.requestFocus();
            return false;
        }

        if (jtfpeleguerreiro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "preencher pele");
            jtfpeleguerreiro.requestFocus();
            return false;
        }

        if (!jrbFemininoGuerreiro.isSelected() && !jrbMasculinoGuerreiro.isSelected()) {
            JOptionPane.showMessageDialog(this, "selecionar sexo");
            return false;

        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtGuerreiros = new javax.swing.JTable();
        bgSexoGuerreiro = new javax.swing.ButtonGroup();
        jtfCabeloVitima = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfnomeguerreiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfcabeloguerreiro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfolhoguerreiro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfpeleguerreiro = new javax.swing.JTextField();
        jrbFemininoGuerreiro = new javax.swing.JRadioButton();
        jrbMasculinoGuerreiro = new javax.swing.JRadioButton();
        jLSexoGuerreiro = new javax.swing.JLabel();
        jbsalvarguerreiro = new javax.swing.JButton();
        jbLimparguerreiro = new javax.swing.JButton();
        jbdeletarguerreiro = new javax.swing.JButton();
        jbeditarguerreiro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtarmamento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtGuerreiro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jtGuerreiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Olho", "Sexo", "HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtGuerreiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGuerreirosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtGuerreiros);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nome:");

        jtfnomeguerreiro.setName("jtfNome Vitima"); // NOI18N
        jtfnomeguerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnomeguerreiroActionPerformed(evt);
            }
        });

        jLabel3.setText("Cabelo:");

        jtfcabeloguerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcabeloguerreiroActionPerformed(evt);
            }
        });

        jLabel4.setText("Olho:");

        jLabel5.setText("Pele:");

        jrbFemininoGuerreiro.setText("Feminino");

        jrbMasculinoGuerreiro.setText("Maculino");
        jrbMasculinoGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMasculinoGuerreiroActionPerformed(evt);
            }
        });

        jLSexoGuerreiro.setText("Sexo:");

        jbsalvarguerreiro.setText("Salvar");
        jbsalvarguerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarguerreiroActionPerformed(evt);
            }
        });

        jbLimparguerreiro.setText("Limpar");
        jbLimparguerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparguerreiroActionPerformed(evt);
            }
        });

        jbdeletarguerreiro.setText("Deletar");
        jbdeletarguerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdeletarguerreiroActionPerformed(evt);
            }
        });

        jbeditarguerreiro.setText("Editar");
        jbeditarguerreiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbeditarguerreiroMouseClicked(evt);
            }
        });
        jbeditarguerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditarguerreiroActionPerformed(evt);
            }
        });

        jLabel7.setText("Armamento");

        jtarmamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtarmamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtfCabeloVitimaLayout = new javax.swing.GroupLayout(jtfCabeloVitima);
        jtfCabeloVitima.setLayout(jtfCabeloVitimaLayout);
        jtfCabeloVitimaLayout.setHorizontalGroup(
            jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                        .addComponent(jbsalvarguerreiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimparguerreiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbdeletarguerreiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbeditarguerreiro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                        .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                                        .addComponent(jtfcabeloguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                                        .addComponent(jtfpeleguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLSexoGuerreiro)))
                                .addGap(18, 18, 18)
                                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                                        .addComponent(jrbFemininoGuerreiro)
                                        .addGap(27, 27, 27)
                                        .addComponent(jrbMasculinoGuerreiro))
                                    .addComponent(jtfolhoguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jtfnomeguerreiro))))))
            .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtarmamento))
        );
        jtfCabeloVitimaLayout.setVerticalGroup(
            jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtfCabeloVitimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfnomeguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtarmamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfolhoguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfcabeloguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFemininoGuerreiro)
                    .addComponent(jrbMasculinoGuerreiro)
                    .addComponent(jLSexoGuerreiro)
                    .addComponent(jtfpeleguerreiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jtfCabeloVitimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsalvarguerreiro)
                    .addComponent(jbLimparguerreiro)
                    .addComponent(jbdeletarguerreiro)
                    .addComponent(jbeditarguerreiro)))
        );

        jtGuerreiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Olho", "Sexo", "HP", "Armamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtGuerreiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGuerreiroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtGuerreiro);
        if (jtGuerreiro.getColumnModel().getColumnCount() > 0) {
            jtGuerreiro.getColumnModel().getColumn(0).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(1).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(2).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(3).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(4).setResizable(false);
            jtGuerreiro.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastro de Guerreiro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfCabeloVitima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(8, 8, 8))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfCabeloVitima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnomeguerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnomeguerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnomeguerreiroActionPerformed

    private void jtfcabeloguerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcabeloguerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcabeloguerreiroActionPerformed

    private void jrbMasculinoGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMasculinoGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMasculinoGuerreiroActionPerformed

    private void jbsalvarguerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarguerreiroActionPerformed
        if (jbsalvarguerreiro.getText().equals("salvar")) {

            if (validainputs()) {
                Guerreiro g = new Guerreiro();
                g.setNome(jtfnomeguerreiro.getText().toUpperCase());
                g.setArmamento(jtarmamento.getText().toUpperCase());
                g.setOlho(jtfolhoguerreiro.getText().toUpperCase());
                g.setCabelo(jtfcabeloguerreiro.getText().toUpperCase());
                g.setPele(jtfpeleguerreiro.getText().toUpperCase());
                if (jrbFemininoGuerreiro.isSelected() || jrbMasculinoGuerreiro.isSelected()) {
                    g.setSexo(!jrbFemininoGuerreiro.isSelected());
                }
                GuerreiroServicos GuerreiroS = ServicosFactory.getGuerreiroServicos();
                GuerreiroS.cadastrarguerreiro(g);
                addRowToTable();
                limpaCampos();

            }//fim do salvar
        } else {
            //codigo update
            Guerreiro g = new Guerreiro();
            g.setId(idEdit);
            g.setNome(jtfnomeguerreiro.getText());
            g.setArmamento(jtarmamento.getText());
            g.setCabelo(jtfcabeloguerreiro.getText());
            g.setOlho(jtfolhoguerreiro.getText());
            g.setPele(jtfpeleguerreiro.getText());
            GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
            guerreiroS.cadastrarguerreiro(g);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "guerreiro atualizada com sucesso! ");
            jbDefault();

        }//fim do update
    }//GEN-LAST:event_jbsalvarguerreiroActionPerformed

    private void jbDefault() {

        jbsalvarguerreiro.setText("salvar");
        jLSexoGuerreiro.setVisible(true);
        jrbFemininoGuerreiro.setVisible(true);
        jrbMasculinoGuerreiro.setVisible(true);
        jbLimparguerreiro.setVisible(true);
        jbdeletarguerreiro.setVisible(false);
        jbdeletarguerreiro.setText("Deletar");
        jbdeletarguerreiro.setVisible(false);
    }

    private void jbLimparguerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparguerreiroActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jbLimparguerreiroActionPerformed

    private void jbdeletarguerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdeletarguerreiroActionPerformed

        if (jbdeletarguerreiro.getText().equals("Deletar")) {
            int linha = jtGuerreiro.getSelectedRow();
            int id = (int) jtGuerreiro.getValueAt(linha, 0);
            String nome = (String) jtGuerreiro.getValueAt(linha, 1);
            Object[] btnMSG = {"Sim", "Não"};
            int resp = JOptionPane.showOptionDialog(this, "Deseja mesmo deletar? " + nome, ".:Deletar:.", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG);
            if (resp == 0) {
                GuerreiroServicos guerreirosS = ServicosFactory.getGuerreiroServicos();
                guerreirosS.deletarguerreiro(id);
                JOptionPane.showMessageDialog(this, "Guerreiro " + nome + " deletada com sucesso ");
                addRowToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Ok, delete cancelado pelo usuario com sucesso");
            }

        } else {

            jbDefault();
            limpaCampos();

        }
    }//GEN-LAST:event_jbdeletarguerreiroActionPerformed

    private void jbeditarguerreiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbeditarguerreiroMouseClicked

    }//GEN-LAST:event_jbeditarguerreiroMouseClicked

    private void jbeditarguerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditarguerreiroActionPerformed
        jbLimparguerreiro.setEnabled(false);
        jbsalvarguerreiro.setText("Atualizar");
        jrbFemininoGuerreiro.setVisible(false);
        jrbMasculinoGuerreiro.setVisible(false);
        jLSexoGuerreiro.setVisible(false);
        jbdeletarguerreiro.setText("cancelar");

        // Buscar guerreiro e carregar nos campos
        int linha = jtGuerreiro.getSelectedRow();
        idEdit = (int) jtGuerreiro.getValueAt(linha, 0);
//        idEdit = 17;
        GuerreiroServicos guerreiroS = ServicosFactory.getGuerreiroServicos();
        Guerreiro guerreiro = guerreiroS.getGuerreirobyID(idEdit);
        jtfnomeguerreiro.setText(guerreiro.getNome());
        jtarmamento.setText(guerreiro.getArmamento());
        jtfcabeloguerreiro.setText(guerreiro.getCabelo());
        jtfolhoguerreiro.setText(guerreiro.getOlho());
        jtfpeleguerreiro.setText(guerreiro.getPele());

    }//GEN-LAST:event_jbeditarguerreiroActionPerformed

    private void jtGuerreirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGuerreirosMouseClicked

    }//GEN-LAST:event_jtGuerreirosMouseClicked

    private void jtGuerreiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGuerreiroMouseClicked
        jbeditarguerreiro.setVisible(true);
        jbdeletarguerreiro.setVisible(true);
    }//GEN-LAST:event_jtGuerreiroMouseClicked

    private void jtarmamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtarmamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtarmamentoActionPerformed

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
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGuerreiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGuerreiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexoGuerreiro;
    private javax.swing.JLabel jLSexoGuerreiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbLimparguerreiro;
    private javax.swing.JButton jbdeletarguerreiro;
    private javax.swing.JButton jbeditarguerreiro;
    private javax.swing.JButton jbsalvarguerreiro;
    private javax.swing.JRadioButton jrbFemininoGuerreiro;
    private javax.swing.JRadioButton jrbMasculinoGuerreiro;
    private javax.swing.JTable jtGuerreiro;
    private javax.swing.JTable jtGuerreiros;
    private javax.swing.JTextField jtarmamento;
    private javax.swing.JPanel jtfCabeloVitima;
    private javax.swing.JTextField jtfcabeloguerreiro;
    private javax.swing.JTextField jtfnomeguerreiro;
    private javax.swing.JTextField jtfolhoguerreiro;
    private javax.swing.JTextField jtfpeleguerreiro;
    // End of variables declaration//GEN-END:variables
}
