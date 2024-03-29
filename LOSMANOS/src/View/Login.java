/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        LabelTituloLogin = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        ButtonEntrar = new javax.swing.JButton();
        LabelPainelFundo = new javax.swing.JLabel();
        LabelLoginFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTituloLogin.setFont(new java.awt.Font("Courier 10 Pitch", 1, 48)); // NOI18N
        LabelTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelTituloLogin.setText("Login");
        getContentPane().add(LabelTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        LabelUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuario");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        TxtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 400, 40));

        LabelSenha.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha");
        getContentPane().add(LabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        TxtSenha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 400, 40));

        ButtonEntrar.setBackground(new java.awt.Color(164, 152, 152));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setActionCommand("ButtonEntrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 400, 50));

        LabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(LabelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 590, 520));

        LabelLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(LabelLoginFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 1060));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        // TODO add your handling code here:
        
        if (TxtUsuario.getText().equals("login")&& new String(TxtSenha.getPassword()).equals("senha")){
            JOptionPane.showMessageDialog(this, "ACESSO KKK");}
            
            else {JOptionPane.showMessageDialog(null,"ACESSO NEGADO");}
            
    }//GEN-LAST:event_ButtonEntrarActionPerformed
    
    
    
    
    private void TxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelLoginFundo;
    private javax.swing.JLabel LabelPainelFundo;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelTituloLogin;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JTextField TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
