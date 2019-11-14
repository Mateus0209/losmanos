/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiago
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelServico = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCliente = new javax.swing.JComboBox<>();
        txtServico = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtHora = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonAgendar = new javax.swing.JButton();
        ButtonAgendar1 = new javax.swing.JButton();
        ButtonAgendar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        LabelAgendaPainelFundo = new javax.swing.JLabel();
        LabelAgendaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Agenda");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, 60));

        LabelId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Id");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        LabelCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        LabelServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Serviço");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        LabelValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        LabelData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        LabelHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        LabelObservacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtID.setText("0");
        txtID.setToolTipText("");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 40));

        txtCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alan", "Afonso", "Abigail", "Alexandro" }));
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 280, 40));

        txtServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barba", "Barba + Corte", "Corte", " " }));
        getContentPane().add(txtServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 280, 40));

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValor.setText("0");
        txtValor.setToolTipText("");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 280, 40));

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 280, 40));

        txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 280, 40));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 610, 280));

        ButtonAgendar.setBackground(new java.awt.Color(255, 51, 51));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Remover");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 170, 50));

        ButtonAgendar1.setBackground(new java.awt.Color(60, 233, 106));
        ButtonAgendar1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar1.setText("Agendar");
        ButtonAgendar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendar1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 200, 50));

        ButtonAgendar2.setBackground(new java.awt.Color(102, 102, 102));
        ButtonAgendar2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar2.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar2.setText("Modificar");
        ButtonAgendar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendar2ActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 180, 50));

        TableAgendamentos.setFont(new java.awt.Font("Humanst521 Lt BT", 0, 14)); // NOI18N
        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Alan", "Corte", "10", "22/04/2018", "08:00", ""},
                {"2", "Abigail", "Barba", "20", "22/04/2018", "09:00", "Pode se Atrazar um pouco"},
                {"3", "Pedro", "Barba", "20", "23/04/2018", "08:00", null},
                {"4", "Teste", "Barba + Corte", "30", "23/04/2018", "09:00", null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(TableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 1120, 330));

        LabelAgendaPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        LabelAgendaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void ButtonAgendar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendar1ActionPerformed
        // TODO add your handling code here:
        
        txtID.getText();
        txtCliente.getSelectedItem();
        txtServico.getSelectedItem();
        txtValor.getText();
        txtData.getText();
        txtHora.getText();
        
       Object[] c;
        c=new Object[6];
        c[0]="ID";
        c[1]="Cliente";
        c[2]="Serviço";
        c[3]="Valor";
        c[4]="Data";
        c[5]="Hora";
        c[6]="Observaçao";
        
        Object[][] l;
        l=new Object[0][6];
        for (int i = 0; i < 10; i++) {
            {
           //[0]=JTextArea.getValueAt();
            //[1]=jTable2.getValueAt(atual, 1);
            //[2]=jTable2.getValueAt(atual, 2); 
            //[3]=jTable2.getValueAt(atual, 3); 
          // [4]=jTable2.getValueAt(atual, 4); 
           // atual++;
       // }
       // l[atual][0]=txtNome.getText();
        //l[atual][1]=txtTexto.getText();
        //l[atual][2]=txtAltura.getText();
       // l[atual][3]=cbTreino.getSelectedItem();
       // l[atual][4]=txtIMC.getText();
       // txtNome.setText("");
       // txtTexto.setText("");
       // txtAltura.setText("");
       // txtIMC.setText("");
        //quant++;
       // jTable2.setModel(new DefaultTableModel(l, c));
       }}
       
        
        
        
        
    }//GEN-LAST:event_ButtonAgendar1ActionPerformed

    private void ButtonAgendar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgendar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JButton ButtonAgendar1;
    private javax.swing.JButton ButtonAgendar2;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelAgendaFundo;
    private javax.swing.JLabel LabelAgendaPainelFundo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> txtCliente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtID;
    private javax.swing.JComboBox<String> txtServico;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}