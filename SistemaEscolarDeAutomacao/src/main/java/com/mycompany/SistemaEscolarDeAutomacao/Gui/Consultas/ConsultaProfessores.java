
package com.mycompany.SistemaEscolarDeAutomacao.Gui.Consultas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.ProfessorDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Professor;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PreencherComboBox;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PreencherTabelas;
import com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro.CadastroUser;

import java.util.List;


public class ConsultaProfessores extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultaProfessores.class.getName());

    private static ConsultaProfessores instance;

    public static ConsultaProfessores getInstance() {
        if (instance == null) {
            instance = new ConsultaProfessores();
        }
        return instance;
    }

    public static void setInstance(ConsultaProfessores instance) {
        ConsultaProfessores.instance = instance;
    }

    
    public ConsultaProfessores() {
        initComponents();
        PlaceHolder.addPlaceHolder(identificadorProfessor);
        PlaceHolder.addPlaceHolder(nomeProfessor);
        PlaceHolder.addPlaceHolder(idadeProfessor);
        PlaceHolder.addPlaceHolder(cpfProfessor);
        PlaceHolder.addPlaceHolder(formacaoProfessor);
        PlaceHolder.addPlaceHolderComboBox(turnoProfessor);
        PlaceHolder.addPlaceHolderComboBox(salaProfessor);
        PlaceHolder.addPlaceHolderComboBox(materiaProfessor);
        PlaceHolder.addPlaceHolderComboBox(horarioProfessor);
        PlaceHolder.addPlaceHolder(nomeUsuarioProfessor);

        PlaceHolder.addPlaceHolder(dataNascimentoProfessor);
        PlaceHolder.addPlaceHolder(dataCadastroProfessor);
        PlaceHolder.addPlaceHolder(horaCadastroProfessor);
        PlaceHolder.addPlaceHolder(salarioProfessor);
        PlaceHolder.addPlaceHolder(urlCurriculo);

        List<Professor> lista = ProfessorDAO.buscarProfessores();
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cpfProfessor = new javax.swing.JTextField();
        urlCurriculo = new javax.swing.JTextField();
        idadeProfessor = new javax.swing.JTextField();
        salaProfessor = new javax.swing.JComboBox<>();
        dataCadastroProfessor = new javax.swing.JTextField();
        dataNascimentoProfessor = new javax.swing.JTextField();
        horaCadastroProfessor = new javax.swing.JTextField();
        turnoProfessor = new javax.swing.JComboBox<>();
        materiaProfessor = new javax.swing.JComboBox<>();
        horarioProfessor = new javax.swing.JComboBox<>();
        voltar = new javax.swing.JButton();
        identificadorProfessor = new javax.swing.JTextField();
        salarioProfessor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeProfessor = new javax.swing.JTextField();
        formacaoProfessor = new javax.swing.JTextField();
        nomeUsuarioProfessor = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); 
        jLabel1.setText("Professores Cadastrados");

        cpfProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        cpfProfessor.setText("CPF");
        cpfProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cpfProfessorCaretUpdate(evt);
            }
        });
        cpfProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfProfessorFocusLost(evt);
            }
        });

        urlCurriculo.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        urlCurriculo.setText("URL do currículo");
        urlCurriculo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                urlCurriculoCaretUpdate(evt);
            }
        });
        urlCurriculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                urlCurriculoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                urlCurriculoFocusLost(evt);
            }
        });

        idadeProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        idadeProfessor.setText("Idade");
        idadeProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                idadeProfessorCaretUpdate(evt);
            }
        });
        idadeProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idadeProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idadeProfessorFocusLost(evt);
            }
        });

        salaProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        salaProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a sala" }));
        salaProfessor.setEnabled(false);
        salaProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salaProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salaProfessorFocusLost(evt);
            }
        });

        dataCadastroProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        dataCadastroProfessor.setText("--/--/---- (Data de cadastro)");
        dataCadastroProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dataCadastroProfessorCaretUpdate(evt);
            }
        });
        dataCadastroProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataCadastroProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataCadastroProfessorFocusLost(evt);
            }
        });

        dataNascimentoProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        dataNascimentoProfessor.setText("--/--/---- (Data de nascimento)");
        dataNascimentoProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                dataNascimentoProfessorCaretUpdate(evt);
            }
        });
        dataNascimentoProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataNascimentoProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataNascimentoProfessorFocusLost(evt);
            }
        });

        horaCadastroProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        horaCadastroProfessor.setText("HH:mm:ss (Hora do cadastro)");
        horaCadastroProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                horaCadastroProfessorCaretUpdate(evt);
            }
        });
        horaCadastroProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                horaCadastroProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                horaCadastroProfessorFocusLost(evt);
            }
        });

        turnoProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        turnoProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o turno" }));
        turnoProfessor.setEnabled(false);
        turnoProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                turnoProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnoProfessorFocusLost(evt);
            }
        });

        materiaProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        materiaProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a matéria" }));
        materiaProfessor.setEnabled(false);
        materiaProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                materiaProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                materiaProfessorFocusLost(evt);
            }
        });

        horarioProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        horarioProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o horário" }));
        horarioProfessor.setEnabled(false);
        horarioProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                horarioProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                horarioProfessorFocusLost(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        identificadorProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        identificadorProfessor.setText("Identificador");
        identificadorProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                identificadorProfessorCaretUpdate(evt);
            }
        });
        identificadorProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                identificadorProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                identificadorProfessorFocusLost(evt);
            }
        });

        salarioProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        salarioProfessor.setText("Salário");
        salarioProfessor.setEnabled(false);
        salarioProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salarioProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salarioProfessorFocusLost(evt);
            }
        });

        jLabel2.setText("Selecione os critérios de busca:");

        nomeProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        nomeProfessor.setText("Nome");
        nomeProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nomeProfessorCaretUpdate(evt);
            }
        });
        nomeProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeProfessorFocusLost(evt);
            }
        });

        formacaoProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        formacaoProfessor.setText("Formação");
        formacaoProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                formacaoProfessorCaretUpdate(evt);
            }
        });
        formacaoProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formacaoProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formacaoProfessorFocusLost(evt);
            }
        });

        nomeUsuarioProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        nomeUsuarioProfessor.setText("Nome de usuário");
        nomeUsuarioProfessor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nomeUsuarioProfessorCaretUpdate(evt);
            }
        });
        nomeUsuarioProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeUsuarioProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeUsuarioProfessorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(identificadorProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(idadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataNascimentoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(horaCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(formacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(urlCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nomeUsuarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(materiaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(horarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(turnoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(voltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(cpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificadorProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascimentoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaCadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materiaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUsuarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
        
        dispose();
        ConsultaProfessores.setInstance(null);
        ProfessorDAO.closeMan();
        DAO.closeMan();
        Consultas.getInstance().setVisible(true);
    }

    private void identificadorProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (identificadorProfessor.getText().equals("Identificador")) {
            identificadorProfessor.setText(null);
            identificadorProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(identificadorProfessor);
        }
    }

    private void identificadorProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (identificadorProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(identificadorProfessor);
            identificadorProfessor.setText("Identificador");
        }
    }

    private void idadeProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (idadeProfessor.getText().equals("Idade")) {
            idadeProfessor.setText(null);
            idadeProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(idadeProfessor);
        }
    }

    private void idadeProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (idadeProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(idadeProfessor);
            idadeProfessor.setText("Idade");
        }
    }

    private void cpfProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (cpfProfessor.getText().equals("CPF")) {
            cpfProfessor.setText(null);
            cpfProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(cpfProfessor);
        }
    }

    private void cpfProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (cpfProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(cpfProfessor);
            cpfProfessor.setText("CPF");
        }
    }

    private void dataNascimentoProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (dataNascimentoProfessor.getText().equals("--/--/---- (Data de nascimento)")) {
            dataNascimentoProfessor.setText(null);
            dataNascimentoProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(dataNascimentoProfessor);
        }
    }

    private void dataNascimentoProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (dataNascimentoProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(dataNascimentoProfessor);
            dataNascimentoProfessor.setText("--/--/---- (Data de nascimento)");
        }
    }

    private void dataCadastroProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (dataCadastroProfessor.getText().equals("--/--/---- (Data de cadastro)")) {
            dataCadastroProfessor.setText(null);
            dataCadastroProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(dataCadastroProfessor);
        }
    }

    private void dataCadastroProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (dataCadastroProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(dataCadastroProfessor);
            dataCadastroProfessor.setText("--/--/---- (Data de cadastro)");
        }
    }

    private void horaCadastroProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (horaCadastroProfessor.getText().equals("HH:mm:ss (Hora do cadastro)")) {
            horaCadastroProfessor.setText(null);
            horaCadastroProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(horaCadastroProfessor);
        }
    }

    private void horaCadastroProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (horaCadastroProfessor.getText().isEmpty()) {
            horaCadastroProfessor.setText("HH:mm:ss (Hora do cadastro)");
            PlaceHolder.addPlaceHolder(horaCadastroProfessor);
        }
    }

    private void salaProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (salaProfessor.getSelectedItem().toString().equals("Selecione a sala")) {
            salaProfessor.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(salaProfessor);
        }
    }

    private void salaProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (salaProfessor.getSelectedItem().toString().equals("Selecione a sala")) {
            PlaceHolder.addPlaceHolderComboBox(salaProfessor);
        }
    }

    private void materiaProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (materiaProfessor.getSelectedItem().toString().equals("Selecione a matéria")) {
            materiaProfessor.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(materiaProfessor);
        }
    }

    private void materiaProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (materiaProfessor.getSelectedItem().toString().equals("Selecione a matéria")) {
            PlaceHolder.addPlaceHolderComboBox(materiaProfessor);
        }
    }

    private void horarioProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (horarioProfessor.getSelectedItem().toString().equals("Selecione o horário")) {
            horarioProfessor.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(horarioProfessor);
        }
    }

    private void horarioProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (horarioProfessor.getSelectedItem().toString().equals("Selecione o horário")) {
            PlaceHolder.addPlaceHolderComboBox(horarioProfessor);
        }
    }

    private void turnoProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (turnoProfessor.getSelectedItem().toString().equals("Selecione o turno")) {
            turnoProfessor.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(turnoProfessor);
        }
    }

    private void turnoProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (turnoProfessor.getSelectedItem().toString().equals("Selecione o turno")) {
            PlaceHolder.addPlaceHolderComboBox(turnoProfessor);
        }
    }

    private void salarioProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (salarioProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(salarioProfessor);
            salarioProfessor.setText("Salário");
        }
    }

    private void salarioProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (salarioProfessor.getText().equals("Salário")) {
            salarioProfessor.setText(null);
            salarioProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(salarioProfessor);
        }

    }

    private void urlCurriculoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (urlCurriculo.getText().equals("URL do currículo")) {
            urlCurriculo.setText(null);
            urlCurriculo.requestFocus();
            PlaceHolder.removePlaceHolder(urlCurriculo);
        }
    }

    private void urlCurriculoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (urlCurriculo.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(urlCurriculo);
            urlCurriculo.setText("URL do currículo");
        }
    }

    private void nomeProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (nomeProfessor.getText().equals("Nome")) {
            nomeProfessor.setText(null);
            nomeProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(nomeProfessor);
        }
    }

    private void nomeProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (nomeProfessor.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(nomeProfessor);
            nomeProfessor.setText("Nome");
        }
    }

    private void formacaoProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (formacaoProfessor.getText().equals("Formação")) {
            formacaoProfessor.setText(null);
            formacaoProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(formacaoProfessor);
        }

    }

    private void formacaoProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (formacaoProfessor.getText().isEmpty()) {
            formacaoProfessor.setText("Formação");
            PlaceHolder.addPlaceHolder(formacaoProfessor);
        }

    }

    private void identificadorProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void nomeProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void idadeProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void cpfProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void dataNascimentoProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void dataCadastroProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void horaCadastroProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void formacaoProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void urlCurriculoCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void nomeUsuarioProfessorCaretUpdate(javax.swing.event.CaretEvent evt) {
        
        List<Professor> lista = ProfessorDAO.buscarProfessoresParaTabela(identificadorProfessor.getText(), nomeProfessor.getText(), idadeProfessor.getText(), cpfProfessor.getText(), urlCurriculo.getText(), formacaoProfessor.getText(), dataNascimentoProfessor.getText(), dataCadastroProfessor.getText(), horaCadastroProfessor.getText(), nomeUsuarioProfessor.getText());
        PreencherTabelas.PreencherTabelaDeProfessores(jTable1, lista);
    }

    private void nomeUsuarioProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (nomeUsuarioProfessor.getText().equals("Nome de usuário")) {
            nomeUsuarioProfessor.setText(null);
            nomeUsuarioProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(nomeUsuarioProfessor);
        }
    }

    private void nomeUsuarioProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (nomeUsuarioProfessor.getText().isEmpty()) {
            nomeUsuarioProfessor.setText("Nome de usuário");
            PlaceHolder.addPlaceHolder(nomeUsuarioProfessor);
        }
    }

    
    public static void main(String args[]) {
    	try {
			FlatDarkLaf.setup();
			new ConsultaProfessores().setVisible(true);
		} catch (Exception ex) {
			logger.log(java.util.logging.Level.SEVERE, null, ex);
		}
    }

    
    private javax.swing.JTextField cpfProfessor;
    private javax.swing.JTextField dataCadastroProfessor;
    private javax.swing.JTextField dataNascimentoProfessor;
    private javax.swing.JTextField formacaoProfessor;
    private javax.swing.JTextField horaCadastroProfessor;
    private javax.swing.JComboBox<String> horarioProfessor;
    private javax.swing.JTextField idadeProfessor;
    private javax.swing.JTextField identificadorProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> materiaProfessor;
    private javax.swing.JTextField nomeProfessor;
    private javax.swing.JTextField nomeUsuarioProfessor;
    private javax.swing.JComboBox<String> salaProfessor;
    private javax.swing.JTextField salarioProfessor;
    private javax.swing.JComboBox<String> turnoProfessor;
    private javax.swing.JTextField urlCurriculo;
    private javax.swing.JButton voltar;
    
}
