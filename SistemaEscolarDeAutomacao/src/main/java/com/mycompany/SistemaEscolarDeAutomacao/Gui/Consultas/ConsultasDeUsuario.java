package com.mycompany.SistemaEscolarDeAutomacao.Gui.Consultas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.UserDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PreencherTabelas;
import java.util.List;

public class ConsultasDeUsuario extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultasDeUsuario.class.getName());

    private static ConsultasDeUsuario instance;

    public static ConsultasDeUsuario getInstance() {
        if (instance == null) {
            instance = new ConsultasDeUsuario();
        }
        return instance;
    }

    public static void setInstance(ConsultasDeUsuario instance) {
        ConsultasDeUsuario.instance = instance;
    }

    public ConsultasDeUsuario() {
        initComponents();
        PlaceHolder.addPlaceHolder(Identificador);
        PlaceHolder.addPlaceHolder(nomeUsuario);
        PlaceHolder.addPlaceHolderComboBox(permissaoUsuario);
        PlaceHolder.addPlaceHolder(emailUsuario);
        PlaceHolder.addPlaceHolder(telefoneUsuario);
        PlaceHolder.addPlaceHolder(dataCadastro);
        PlaceHolder.addPlaceHolder(horaCadastro);
        List<User> lista = UserDAO.buscarUsuarios();
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        horaCadastro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telefoneUsuario = new javax.swing.JTextField();
        dataCadastro = new javax.swing.JTextField();
        permissaoUsuario = new javax.swing.JComboBox<>();
        nomeUsuario = new javax.swing.JTextField();
        emailUsuario = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Identificador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(818, 562));

        horaCadastro.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        horaCadastro.setText("HH:mm:ss (Hora do cadastro)");
        horaCadastro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                horaCadastroCaretUpdate(evt);
            }
        });
        horaCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                horaCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                horaCadastroFocusLost(evt);
            }
        });
        horaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaCadastroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); 
        jLabel1.setText("Usuários Cadastrados");

        jLabel2.setText("Selecione os critérios de busca:");

        telefoneUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        telefoneUsuario.setText("Telefone");
        telefoneUsuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                telefoneUsuarioCaretUpdate(evt);
            }
        });
        telefoneUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefoneUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefoneUsuarioFocusLost(evt);
            }
        });
        telefoneUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneUsuarioActionPerformed(evt);
            }
        });

        dataCadastro.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        dataCadastro.setText("--/--/---- (Data de cadastro)");
        dataCadastro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dataCadastroCaretUpdate(evt);
            }
        });
        dataCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataCadastroFocusLost(evt);
            }
        });
        dataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCadastroActionPerformed(evt);
            }
        });

        permissaoUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        permissaoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a permissão", "Diretor", "Secretário", "Professor" }));
        permissaoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                permissaoUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                permissaoUsuarioFocusLost(evt);
            }
        });
        permissaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissaoUsuarioActionPerformed(evt);
            }
        });

        nomeUsuario.setText("Nome");
        nomeUsuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nomeUsuarioCaretUpdate(evt);
            }
        });
        nomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeUsuarioFocusLost(evt);
            }
        });
        nomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioActionPerformed(evt);
            }
        });

        emailUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        emailUsuario.setText("Email");
        emailUsuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                emailUsuarioCaretUpdate(evt);
            }
        });
        emailUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailUsuarioFocusLost(evt);
            }
        });
        emailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUsuarioActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jButton2.setText("Ver log");

        Identificador.setText("Identificador");
        Identificador.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                IdentificadorCaretUpdate(evt);
            }
        });
        Identificador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IdentificadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdentificadorFocusLost(evt);
            }
        });
        Identificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificadorActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(permissaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(dataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(telefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(permissaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void horaCadastroFocusGained(java.awt.event.FocusEvent evt) {
        if (horaCadastro.getText().equals("HH:mm:ss (Hora do cadastro)")) {
            horaCadastro.setText(null);
            horaCadastro.requestFocus();
            PlaceHolder.removePlaceHolder(horaCadastro);
        }
    }

    private void horaCadastroFocusLost(java.awt.event.FocusEvent evt) {
        if (horaCadastro.getText().isEmpty()) {
            horaCadastro.setText("HH:mm:ss (Hora do cadastro)");
            PlaceHolder.addPlaceHolder(horaCadastro);
        }
    }

    private void horaCadastroActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void telefoneUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void dataCadastroActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void nomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void emailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        ConsultasDeUsuario.setInstance(null);
        UserDAO.closeMan();
        DAO.closeMan();
        Consultas.getInstance().setVisible(true);
    }

    private void nomeUsuarioFocusGained(java.awt.event.FocusEvent evt) {
        if (nomeUsuario.getText().equals("Nome")) {
            nomeUsuario.setText(null);
            nomeUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(nomeUsuario);
        }
    }

    private void nomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {
        if (nomeUsuario.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(nomeUsuario);
            nomeUsuario.setText("Nome");
        }
    }

    private void permissaoUsuarioFocusGained(java.awt.event.FocusEvent evt) {
        if (permissaoUsuario.getSelectedItem().toString().equals("Selecione a permissão")) {
            permissaoUsuario.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(permissaoUsuario);
        }
    }

    private void permissaoUsuarioFocusLost(java.awt.event.FocusEvent evt) {
        if (permissaoUsuario.getSelectedItem().toString().equals("Selecione a permissão")) {
            PlaceHolder.addPlaceHolderComboBox(permissaoUsuario);
        }
    }

    private void dataCadastroFocusGained(java.awt.event.FocusEvent evt) {
        if (dataCadastro.getText().equals("--/--/---- (Data de cadastro)")) {
            dataCadastro.setText(null);
            dataCadastro.requestFocus();
            PlaceHolder.removePlaceHolder(dataCadastro);
        }
    }

    private void dataCadastroFocusLost(java.awt.event.FocusEvent evt) {
        if (dataCadastro.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(dataCadastro);
            dataCadastro.setText("--/--/---- (Data de cadastro)");
        }
    }

    private void telefoneUsuarioFocusGained(java.awt.event.FocusEvent evt) {
        if (telefoneUsuario.getText().equals("Telefone")) {
            telefoneUsuario.setText(null);
            telefoneUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(telefoneUsuario);
        }
    }

    private void telefoneUsuarioFocusLost(java.awt.event.FocusEvent evt) {
        if (telefoneUsuario.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(telefoneUsuario);
            telefoneUsuario.setText("Telefone");
        }
    }

    private void emailUsuarioFocusGained(java.awt.event.FocusEvent evt) {
        if (emailUsuario.getText().equals("Email")) {
            emailUsuario.setText(null);
            emailUsuario.requestFocus();
            PlaceHolder.removePlaceHolder(emailUsuario);
        }
    }

    private void emailUsuarioFocusLost(java.awt.event.FocusEvent evt) {
        if (emailUsuario.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(emailUsuario);
            emailUsuario.setText("Email");
        }
    }

    private void nomeUsuarioCaretUpdate(javax.swing.event.CaretEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void permissaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void dataCadastroCaretUpdate(javax.swing.event.CaretEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void telefoneUsuarioCaretUpdate(javax.swing.event.CaretEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void emailUsuarioCaretUpdate(javax.swing.event.CaretEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void horaCadastroCaretUpdate(javax.swing.event.CaretEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void IdentificadorCaretUpdate(javax.swing.event.CaretEvent evt) {
        List<User> lista = UserDAO.buscarUsuariosParaTabela(Identificador.getText(), nomeUsuario.getText(), permissaoUsuario.getSelectedItem().toString(), emailUsuario.getText(), telefoneUsuario.getText(), dataCadastro.getText(), horaCadastro.getText());
        PreencherTabelas.PreencherTabelaDeUsuarios(jTable1, lista);
    }

    private void IdentificadorFocusGained(java.awt.event.FocusEvent evt) {
        if (Identificador.getText().equals("Identificador")) {
            Identificador.setText(null);
            Identificador.requestFocus();
            PlaceHolder.removePlaceHolder(Identificador);
        }
    }

    private void IdentificadorFocusLost(java.awt.event.FocusEvent evt) {
        if (Identificador.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(Identificador);
            Identificador.setText("Identificador");
        }
    }

    private void IdentificadorActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
    	try {
			FlatDarkLaf.setup();
			new ConsultasDeUsuario().setVisible(true);
		} catch (Exception ex) {
			logger.log(java.util.logging.Level.SEVERE, null, ex);
		}
    }

    
    private javax.swing.JTextField Identificador;
    private javax.swing.JTextField dataCadastro;
    private javax.swing.JTextField emailUsuario;
    private javax.swing.JTextField horaCadastro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeUsuario;
    private javax.swing.JComboBox<String> permissaoUsuario;
    private javax.swing.JTextField telefoneUsuario;
    private javax.swing.JButton voltar;
    
}
