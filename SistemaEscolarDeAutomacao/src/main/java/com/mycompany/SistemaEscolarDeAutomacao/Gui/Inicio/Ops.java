package com.mycompany.SistemaEscolarDeAutomacao.Gui.Inicio;

import com.mycompany.SistemaEscolarDeAutomacao.Gui.Consultas.Consultas;
import com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro.Cadastros;
import com.mycompany.SistemaEscolarDeAutomacao.SistemaEscolarDeAutomacao;

public class Ops extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ops.class.getName());

    private static Ops instance;

    public static Ops getInstance() {
        if (instance == null) {
            instance = new Ops();
        } else {
            Ops.setInstance(null);
        }
        return instance;
    }

    public static void setInstance(Ops instance) {
        Ops.instance = instance;
    }

    public Ops() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastros = new javax.swing.JButton();
        consultas = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Quem somos");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel2.setText("Sistema Escolar De Automação");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel3.setText("Selecione uma das seguintes operações para prosseguir");

        cadastros.setText("Cadastrar");
        cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosActionPerformed(evt);
            }
        });

        consultas.setText("Consultas");
        consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasActionPerformed(evt);
            }
        });

        logout.setText("Log-out");
        logout.setMaximumSize(new java.awt.Dimension(89, 24));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
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
                    .addComponent(cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(cadastros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosActionPerformed
        this.dispose();
        Ops.setInstance(null);
        Cadastros.getInstance().setVisible(true);
    }//GEN-LAST:event_cadastrosActionPerformed

    private void consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasActionPerformed
        this.dispose();
        Ops.setInstance(null);
        Consultas.getInstance().setVisible(true);
    }//GEN-LAST:event_consultasActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        Ops.setInstance(null);
        SistemaEscolarDeAutomacao.setUser(null);
        TelaLogin.getInstance().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new Ops().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastros;
    private javax.swing.JButton consultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
