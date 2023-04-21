/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.ControllerAlunos;
import javax.swing.JOptionPane;
import model.Alunos;

/**
 *
 * @author p.silva.de.araujo
 */
public class cadastroScreenAlunos extends javax.swing.JDialog {        
    
       ControllerAlunos controlealunos;
    /**
     * Creates new form cadastroScreenAlunos
     */
    public cadastroScreenAlunos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        controlealunos = new ControllerAlunos();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jLabelnomecompleto = new javax.swing.JLabel();
        jLabelendereco = new javax.swing.JLabel();
        jTextFieldnomecompleto = new javax.swing.JTextField();
        jTextFieldendereco = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelusuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelsenha = new javax.swing.JLabel();
        jTextFieldsenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 0, 0));

        jPanel.setBackground(new java.awt.Color(51, 0, 51));

        jLabelnomecompleto.setBackground(new java.awt.Color(255, 102, 102));
        jLabelnomecompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelnomecompleto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnomecompleto.setText("Nome Completo");

        jLabelendereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelendereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelendereco.setText("Endere�o");

        jTextFieldendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldenderecoActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");

        jLabelusuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setText("Usu�rio");

        jLabelsenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelsenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelsenha.setText("Senha");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnomecompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelendereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldnomecompleto)
                    .addComponent(jTextFieldendereco)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEmail)
                    .addComponent(jLabelusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jLabelsenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldsenha))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelnomecompleto)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldnomecompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelendereco)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmail)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelusuario)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelsenha)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FA�A O SEU CADASTRO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.setAlignmentY(0.0F);
        jButtonCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldenderecoActionPerformed

    private void jButtonCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseClicked

try{
    
      if(!jTextFieldnomecompleto.getText().equals("")
        && !jTextFieldendereco.getText().equals("")
        &&  !jTextFieldEmail.getText().equals("")
        &&  !jTextFieldUsuario.getText().equals("")
        &&  !jTextFieldsenha.getText().equals("")     
              
              ){  
         
      
           Alunos alunos = new Alunos();
           alunos.setNomecompleto(jTextFieldnomecompleto.getText());
           alunos.setEndereco(jTextFieldendereco.getText());
           alunos.setEmail(jTextFieldEmail.getText());
           alunos.setUsuario(jTextFieldUsuario.getText());
           alunos.setSenha(jTextFieldsenha.getText());           
           controlealunos.salvar(alunos);
           JOptionPane.showMessageDialog(rootPane,"Aluno salvo com sucesso");
           
      }else{
           JOptionPane.showMessageDialog(rootPane,"Por Favor ,preencha todos os campos");
      }
}catch(Exception ex){
    throw new RuntimeException("Erro ao Salvar Aluno",ex);
}















        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(cadastroScreenAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroScreenAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroScreenAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroScreenAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cadastroScreenAlunos dialog = new cadastroScreenAlunos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelendereco;
    private javax.swing.JLabel jLabelnomecompleto;
    private javax.swing.JLabel jLabelsenha;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldendereco;
    private javax.swing.JTextField jTextFieldnomecompleto;
    private javax.swing.JTextField jTextFieldsenha;
    // End of variables declaration//GEN-END:variables
}
