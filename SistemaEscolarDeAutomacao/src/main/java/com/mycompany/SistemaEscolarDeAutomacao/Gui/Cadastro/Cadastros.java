package com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro;
import com.mycompany.SistemaEscolarDeAutomacao.Gui.Inicio.Ops;

public class Cadastros extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cadastros.class.getName());
     
    private static Cadastros instance;

    public static Cadastros getInstance() {
        if (instance == null) {
            instance = new Cadastros();
        } else {
            Cadastros.setInstance(null);
        }
        return instance;
    }

    public static void setInstance(Cadastros instance) {
        Cadastros.instance = instance;
    }
    
    public Cadastros() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastroProfs = new javax.swing.JButton();
        cadastroAlunos = new javax.swing.JButton();
        cadastroUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        voltar.setText("Voltar");
        voltar.setMaximumSize(new java.awt.Dimension(89, 24));
        voltar.setMinimumSize(new java.awt.Dimension(160, 24));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel2.setText("Sistema Escolar De Automação");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel3.setText("Selecione uma das seguintes operações para prosseguir");

        cadastroProfs.setText("Cadastro de professores");
        cadastroProfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProfsActionPerformed(evt);
            }
        });

        cadastroAlunos.setText("Cadastro de alunos");
        cadastroAlunos.setPreferredSize(new java.awt.Dimension(190, 24));
        cadastroAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroAlunosActionPerformed(evt);
            }
        });

        cadastroUsers.setText("Cadastro de usuários");
        cadastroUsers.setMaximumSize(new java.awt.Dimension(89, 24));
        cadastroUsers.setMinimumSize(new java.awt.Dimension(160, 24));
        cadastroUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cadastroProfs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cadastroProfs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsersActionPerformed
        // TODO add your handling code here:
        dispose();
        Cadastros.setInstance(null);
        CadastroUser.getInstance().setVisible(true);
    }//GEN-LAST:event_cadastroUsersActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
        Cadastros.setInstance(null);
        Ops.getInstance().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void cadastroAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroAlunosActionPerformed
        // TODO add your handling code here:
        dispose();
        Cadastros.setInstance(null);
        CadastroAluno.getInstance().setVisible(true);
    }//GEN-LAST:event_cadastroAlunosActionPerformed

    private void cadastroProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProfsActionPerformed
        // TODO add your handling code here:
        dispose();
        Cadastros.setInstance(null);
        CadastroProfs.getInstance().setVisible(true);
    }//GEN-LAST:event_cadastroProfsActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(() -> new Cadastros().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroAlunos;
    private javax.swing.JButton cadastroProfs;
    private javax.swing.JButton cadastroUsers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
