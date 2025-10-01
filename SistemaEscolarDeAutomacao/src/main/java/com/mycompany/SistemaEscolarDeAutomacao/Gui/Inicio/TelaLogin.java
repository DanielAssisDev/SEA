package com.mycompany.SistemaEscolarDeAutomacao.Gui.Inicio;

import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.UserDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro.CadastroUser;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.SEA;

public class TelaLogin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());

    private static TelaLogin instance;

    public static TelaLogin getInstance() {
        if (instance == null) {
            instance = new TelaLogin();
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
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginUsuario = new javax.swing.JTextField();
        Apagar = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();
        senhaEsquecida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastroInicial = new javax.swing.JLabel();
        senhaUsuario = new javax.swing.JPasswordField();
        visualizacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); 
        jLabel1.setText("Faça log-in em sua conta");

        loginUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
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

        senhaEsquecida.setForeground(new java.awt.Color(28, 213, 255));
        senhaEsquecida.setText("Esqueci a senha");
        senhaEsquecida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaEsquecidaMouseClicked(evt);
            }
        });

        jLabel3.setText("Não possui conta?");

        cadastroInicial.setForeground(new java.awt.Color(28, 213, 255));
        cadastroInicial.setText("Cadastre-se");
        cadastroInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroInicialMouseClicked(evt);
            }
        });

        senhaUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
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
                    .addComponent(senhaEsquecida)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastroInicial)))
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
                .addComponent(senhaEsquecida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cadastroInicial))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void senhaEsquecidaMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void cadastroInicialMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        DAO.closeMan();
        UserDAO.closeMan();
        TelaLogin.setInstance(null);
        CadastroUser.getInstance().setVisible(true);
    }

    private void loginUsuarioFocusGained(java.awt.event.FocusEvent evt) {
        if (loginUsuario.getText().equals("Log-in")) {
            loginUsuario.setText(null);
            loginUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(loginUsuario);
        }
    }

    private void loginUsuarioFocusLost(java.awt.event.FocusEvent evt) {
        if (loginUsuario.getText().isEmpty()) {
            loginUsuario.setText("Log-in");
            PlaceHolder.addPlaceHolder(loginUsuario);
        }
    }

    private void senhaUsuarioFocusGained(java.awt.event.FocusEvent evt) {
        if (senhaUsuario.getText().equals("Senha")) {
            senhaUsuario.setText(null);
            senhaUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(senhaUsuario);
        }
    }

    private void senhaUsuarioFocusLost(java.awt.event.FocusEvent evt) {
        if (senhaUsuario.getText().isEmpty()) {
            senhaUsuario.setText("Senha");
            PlaceHolder.addPlaceHolder(senhaUsuario);
        }
    }

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {
        DAO.setMan();
        UserDAO.setMan();
        String l = loginUsuario.getText();
        String s = DAO.getSHA2(DAO.getMD5(senhaUsuario.getText()));

        User user = UserDAO.Autenticacao(l, s);
        SEA.setUser(user);

        if (user != null) {
            this.dispose();
            TelaLogin.setInstance(null);
            DAO.closeMan();
            UserDAO.closeMan();
            Ops.getInstance().setVisible(true);
        }
    }

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {
        loginUsuario.setText("Log-in");
        PlaceHolder.addPlaceHolder(loginUsuario);
        senhaUsuario.setText("Senha");
        PlaceHolder.addPlaceHolder(senhaUsuario);

    }

    private void visualizacaoActionPerformed(java.awt.event.ActionEvent evt) {
        if (senhaUsuario.getEchoChar() == '\u2022') {
            senhaUsuario.setEchoChar((char) 0);
        } else {
            senhaUsuario.setEchoChar('\u2022');
        }
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
    }

    public static void main(String args[]) {
    	try {
        	FlatDarkLaf.setup();
            new TelaLogin().setVisible(true);
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel cadastroInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginUsuario;
    private javax.swing.JLabel senhaEsquecida;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JButton visualizacao;
    

}
