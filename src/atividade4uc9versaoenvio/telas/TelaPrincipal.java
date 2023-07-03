
package atividade4uc9versaoenvio.telas;

import atividade4uc9versaoenvio.GravarMedicao;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaPrincipal extends javax.swing.JFrame {

    GravarMedicao historico = new GravarMedicao();

    public TelaPrincipal() {
        initComponents();
        gerarAcessibilidade();
    }

    public void gerarAcessibilidade() {

        
        btnSalvar.setMnemonic(KeyEvent.VK_D);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblData = new javax.swing.JLabel();
        jTextData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextSistolica = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDiastolica = new javax.swing.JTextField();
        jcbEstresse = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLblData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLblData.setForeground(new java.awt.Color(255, 255, 255));
        jLblData.setText("Data:");
        jLblData.setToolTipText("Insira a data no formato dd/mm/aaaa");

        jTextData.setBackground(new java.awt.Color(0, 0, 51));
        jTextData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextData.setForeground(new java.awt.Color(255, 255, 255));
        jTextData.setToolTipText("dd/mm/aaaa");
        jTextData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 3));
        jTextData.setMargin(null);
        jTextData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextDataKeyPressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora:");
        jLabel2.setToolTipText("Insira a hora no formato hh:mm");

        jTextHora.setBackground(new java.awt.Color(0, 0, 51));
        jTextHora.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextHora.setForeground(new java.awt.Color(255, 255, 255));
        jTextHora.setToolTipText("hh:mm");
        jTextHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 3));
        jTextHora.setDisabledTextColor(new java.awt.Color(0, 0, 51));
        jTextHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextHoraKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pressão sistólica:");
        jLabel3.setToolTipText("Insira a pressão sistólica  no formato: xx");

        jTextSistolica.setBackground(new java.awt.Color(0, 0, 51));
        jTextSistolica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextSistolica.setForeground(new java.awt.Color(255, 255, 255));
        jTextSistolica.setToolTipText("xx");
        jTextSistolica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 3));
        jTextSistolica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextSistolicaKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pressão diastólica:");
        jLabel4.setToolTipText("Insira a pressão diastólica no formato: xx");

        jTextDiastolica.setBackground(new java.awt.Color(0, 0, 51));
        jTextDiastolica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextDiastolica.setForeground(new java.awt.Color(255, 255, 255));
        jTextDiastolica.setToolTipText("xx");
        jTextDiastolica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 3, true));
        jTextDiastolica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextDiastolicaKeyPressed(evt);
            }
        });

        jcbEstresse.setBackground(new java.awt.Color(0, 0, 51));
        jcbEstresse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbEstresse.setForeground(new java.awt.Color(255, 255, 255));
        jcbEstresse.setText("Situação de estresse?");
        jcbEstresse.setToolTipText("Click caso haja uma situação de estresse");
        jcbEstresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbEstresseKeyPressed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 255, 51));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Ctrl + D");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbEstresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jTextSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDiastolica, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextData, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblData)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextHora))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextDiastolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstresse)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {

            this.validaData(jTextData);
            if (!historico.getData().isEmpty()) {
                jTextArea1.append("Data: " + historico.getData() + "\n");

            } else {
                JOptionPane.showMessageDialog(null, "***//////Prencha o campo Data no formato: dd/mm/aaaa***");
            }

            this.validaHora(jTextHora);
            if (!historico.getHora().isEmpty()) {
                jTextArea1.append("Hora: " + historico.getHora() + "\n");

            } else {
                JOptionPane.showMessageDialog(null, "Prrencha o campo hora no formato: hh:mm");
            }

            this.aferirPressao(jTextSistolica);
            if (historico.getpSistolica() >= 0) {
                jTextArea1.append("Preessão sistólica: " + historico.getpSistolica() + "\n");

            } else {
                JOptionPane.showMessageDialog(null, "Preencha o campo pressão sistólica corretamente!");
            }

            this.aferirPressaoD(jTextDiastolica);
            if (historico.getpDiastolica() >= 0) {
                jTextArea1.append("Preessão diastolica: " + historico.getpDiastolica() + "\n");

            }

            if (this.verificaEstresse(jcbEstresse) == true) {
                jTextArea1.append("Situação de estresse no momento\n=========***============\n");

            } else {
                jTextArea1.append("Sem situação de estresse\n==============***=============\n");
            }
            
            historico.atualizarMedicoes(historico.getData(), historico.getHora(), historico.getpSistolica(), historico.getpDiastolica(), historico.isEstresse());
            historico.addMrdicoes();

            this.limpa();
            
            try {
                this.gravarArquivo();
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Erro ao preencher um dos campos!");
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jTextDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDataKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextHora.requestFocus();
        }
    }//GEN-LAST:event_jTextDataKeyPressed

    private void jTextHoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextHoraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextSistolica.requestFocus();
        }
    }//GEN-LAST:event_jTextHoraKeyPressed

    private void jTextSistolicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSistolicaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextDiastolica.requestFocus();
        }
    }//GEN-LAST:event_jTextSistolicaKeyPressed

    private void jTextDiastolicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDiastolicaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jcbEstresse.requestFocus();
        }
    }//GEN-LAST:event_jTextDiastolicaKeyPressed

    private void jcbEstresseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbEstresseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.requestFocus();
        }
    }//GEN-LAST:event_jcbEstresseKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    public String validaData(JTextField jTextData) {
        try {

            if (!jTextData.getText().isEmpty()) {
                String strData = jTextData.getText();

                boolean data = strData.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");

                if (data == false) {
                    JOptionPane.showMessageDialog(null, "Data e false");
                } else {
                    String res = String.valueOf(strData);
                    historico.setData(String.valueOf(res));
                }

            } else {
                JOptionPane.showMessageDialog(null, "O campo Data não pode estar vazio");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
        }

        return historico.getData();
    }

    public String validaHora(JTextField jTextHora) {
        try {

            if (!jTextHora.getText().isEmpty()) {
                String strHora = jTextHora.getText();
                boolean hora = strHora.matches("[0-9]{2}[:][0-9]{2}");

                if (hora == false) {
                    JOptionPane.showMessageDialog(null, "Preencha o camo Hora com o formato: hh:mm");

                } else {

                    String res = String.valueOf(strHora);
                    historico.setHora(res);

                }
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro 404 Campo Hora" + e.getMessage());
        }
        return historico.getHora();
    }

    public int aferirPressao(JTextField jTextSistolica) {
        try {

            if (!jTextSistolica.getText().isEmpty()) {
                String strSistolica = jTextSistolica.getText();
                boolean sistolica = strSistolica.matches("[0-9]{2}");

                if (sistolica == false) {
                    JOptionPane.showMessageDialog(null, "Prrencha o campo Pressão sistólica no formato: xx");

                } else {
                    String res = String.valueOf(strSistolica);
                    historico.setpSistolica(Integer.parseInt(res));
                }

            }

        } catch (HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Prrencher o campo Pressão !" + e.getMessage());
        }
        return historico.getpSistolica();
    }

    public int aferirPressaoD(JTextField jTextDiastolica) {
        try {

            if (!jTextDiastolica.getText().isEmpty()) {
                String strDiastolica = jTextDiastolica.getText();
                boolean diastolica = strDiastolica.matches("[0-9]{2}");

                if (diastolica == false) {
                    JOptionPane.showMessageDialog(null, "Prrencha o campo Pressão sistólica no formato: xx");

                } else {
                    String res = String.valueOf(strDiastolica);
                    historico.setpDiastolica(Integer.parseInt(res));
                }

            }

        } catch (HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Prrencher o campo Pressão !" + e.getMessage());
        }
        return historico.getpDiastolica();
    }

    public boolean verificaEstresse(JCheckBox jcbEstresse) {
        try {

            if (jcbEstresse.isSelected()) {
                historico.setEstresse(true);
                return true;
            } else {
                historico.setEstresse(false);
                return false;
            }

        } catch (Exception e) {

        }
        return false;

    }

    public void limpa() {
        jTextData.setText("");
        jTextHora.setText("");
        jTextSistolica.setText("");
        jTextDiastolica.setText("");
        jcbEstresse.setSelected(false);
    }
    
    public void gravarArquivo() throws IOException{
        
        try {
            FileWriter write = new FileWriter("C://Atividade4-UC9//registros", true);
            
            
            
            //historico.atualizarMedicoes(historico.getData(), historico.getHora(), historico.getpSistolica(), historico.getpDiastolica(), historico.isEstresse());
            write.write("\nData : " + historico.getData() + "\nHora: " + historico.getHora() + "\nPressão sistólica: " + historico.getpSistolica() + "\nPressão diastólica: " +  historico.getpDiastolica() + "\nSituação: " + historico.isEstresse() + "\n");
            JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
            write.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro as salvar o arquivo!");

        }
    }
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextDiastolica;
    private javax.swing.JTextField jTextHora;
    private javax.swing.JTextField jTextSistolica;
    private javax.swing.JCheckBox jcbEstresse;
    // End of variables declaration//GEN-END:variables
}
