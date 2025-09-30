package com.mycompany.SistemaEscolarDeAutomacao.Gui.Inicio;

import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.UserDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.SistemaEscolarDeAutomacao;

public class TelaLogin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());

    private static TelaLogin instance;

    public static TelaLogin getInstance() {
        if (instance == null) {
            instance = new TelaLogin();
        } else {
            TelaLogin.setInstance(null);
        }
        return instance;
    }

    public static void setInstance(TelaLogin instance) {
        TelaLogin.instance = instance;
    }

    public TelaLogin() {
        initComponents();
        PlaceHolder.addPlaceHolder(loginUsuario);
        PlaceHolder.addPlaceHolder(senhaUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginUsuario = new javax.swing.JTextField();
        Apagar = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();
        Esqueci_a_senha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cadastre_se = new javax.swing.JLabel();
        senhaUsuario = new javax.swing.JPasswordField();
        visualizacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel1.setText("Faça log-in em sua conta");

        loginUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); // NOI18N
        loginUsuario.setText("Log-in");
        loginUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUsuarioFocusLost(evt);
            }
        });

        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Esqueci_a_senha.setForeground(new java.awt.Color(28, 213, 255));
        Esqueci_a_senha.setText("Esqueci a senha");
        Esqueci_a_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Esqueci_a_senhaMouseClicked(evt);
            }
        });

        jLabel3.setText("Não possui conta?");

        Cadastre_se.setForeground(new java.awt.Color(28, 213, 255));
        Cadastre_se.setText("Cadastre-se");
        Cadastre_se.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cadastre_seMouseClicked(evt);
            }
        });

        senhaUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); // NOI18N
        senhaUsuario.setText("Senha");
        senhaUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaUsuarioFocusLost(evt);
            }
        });

        visualizacao.setText("👁");
        visualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Apagar)
                        .addGap(6, 6, 6)
                        .addComponent(visualizacao)
                        .addGap(6, 6, 6)
                        .addComponent(Entrar))
                    .addComponent(Esqueci_a_senha)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastre_se)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apagar)
                    .addComponent(Entrar)
                    .addComponent(visualizacao))
                .addGap(18, 18, 18)
                .addComponent(Esqueci_a_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cadastre_se))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Esqueci_a_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esqueci_a_senhaMouseClicked

    }//GEN-LAST:event_Esqueci_a_senhaMouseClicked

    private void Cadastre_seMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cadastre_seMouseClicked

    }//GEN-LAST:event_Cadastre_seMouseClicked

    private void loginUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsuarioFocusGained
        if (loginUsuario.getText().equals("Log-in")) {
            loginUsuario.setText(null);
            loginUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(loginUsuario);
        }
    }//GEN-LAST:event_loginUsuarioFocusGained

    private void loginUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsuarioFocusLost
        if (loginUsuario.getText().isEmpty()) {
            loginUsuario.setText("Log-in");
            PlaceHolder.addPlaceHolder(loginUsuario);
        }
    }//GEN-LAST:event_loginUsuarioFocusLost

    private void senhaUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaUsuarioFocusGained
        if (senhaUsuario.getText().equals("Senha")) {
            senhaUsuario.setText(null);
            senhaUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(senhaUsuario);
        }
    }//GEN-LAST:event_senhaUsuarioFocusGained

    private void senhaUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaUsuarioFocusLost
        if (senhaUsuario.getText().isEmpty()) {
            senhaUsuario.setText("Senha");
            PlaceHolder.addPlaceHolder(senhaUsuario);
        }
    }//GEN-LAST:event_senhaUsuarioFocusLost

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        DAO.setMan();
        UserDAO.setMan();
        String l = loginUsuario.getText();
        String s = DAO.getSHA2(DAO.getMD5(senhaUsuario.getText()));

        User user = UserDAO.Autenticacao(l, s);
        SistemaEscolarDeAutomacao.setUser(user);

        if (user != null) {
            this.dispose();
            TelaLogin.setInstance(null);
            DAO.closeMan();
            UserDAO.closeMan();
            Ops.getInstance().setVisible(true);
        }
    }//GEN-LAST:event_EntrarActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        loginUsuario.setText("Log-in");
        PlaceHolder.addPlaceHolder(loginUsuario);
        senhaUsuario.setText("Senha");
        PlaceHolder.addPlaceHolder(senhaUsuario);

    }//GEN-LAST:event_ApagarActionPerformed

    private void visualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizacaoActionPerformed
        if (senhaUsuario.getEchoChar() == '\u2022') {
            senhaUsuario.setEchoChar((char) 0);
        } else {
            senhaUsuario.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_visualizacaoActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

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
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JLabel Cadastre_se;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Esqueci_a_senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginUsuario;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JButton visualizacao;
    // End of variables declaration//GEN-END:variables

}
