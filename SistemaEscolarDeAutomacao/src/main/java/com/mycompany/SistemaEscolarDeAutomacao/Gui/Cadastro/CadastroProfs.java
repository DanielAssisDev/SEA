
package com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.HorarioDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.MateriaDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.SalaDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.UserDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Professor;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PreencherComboBox;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroProfs extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroProfs.class.getName());

    private static CadastroProfs instance;

    public static CadastroProfs getInstance() {
        if (instance == null) {
            instance = new CadastroProfs();
        }
        return instance;
    }

    public static void setInstance(CadastroProfs instance) {
        CadastroProfs.instance = instance;
    }

    
    public CadastroProfs() {
        initComponents();
        PlaceHolder.addPlaceHolder(nomeProfessor);
        PlaceHolder.addPlaceHolder(idadeProfessor);
        PlaceHolder.addPlaceHolder(cpfProfessor);
        PlaceHolder.addPlaceHolder(dataNascimento);
        PlaceHolder.addPlaceHolder(urlCurriculo);
        PlaceHolder.addPlaceHolder(salarioProfessor);
        PlaceHolder.addPlaceHolder(formacaoProfessor);
        PlaceHolder.addPlaceHolderComboBox(salaHorario);
        PlaceHolder.addPlaceHolderComboBox(materiaProfessor);
        PlaceHolder.addPlaceHolderComboBox(usuarioProfessor);
        PlaceHolder.addPlaceHolderComboBox(horarioProfessor);

        PreencherComboBox.PreencherComboBoxMaterias(materiaProfessor);
        PreencherComboBox.PreencherComboBoxSalas(salaHorario);
        PreencherComboBox.PreencherComboUsuarios(usuarioProfessor);
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        idadeProfessor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomeProfessor = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salaHorario = new javax.swing.JComboBox<>();
        Cadastrar1 = new javax.swing.JButton();
        Cadastrar2 = new javax.swing.JButton();
        materiaProfessor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        usuarioProfessor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        horarioProfessor = new javax.swing.JComboBox<>();
        cpfProfessor = new javax.swing.JTextField();
        dataNascimento = new javax.swing.JTextField();
        urlCurriculo = new javax.swing.JTextField();
        formacaoProfessor = new javax.swing.JTextField();
        salarioProfessor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idadeProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        idadeProfessor.setText("Idade");
        idadeProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idadeProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idadeProfessorFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); 
        jLabel1.setText("Cadastro de professores");

        nomeProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        nomeProfessor.setText("Nome");
        nomeProfessor.setNextFocusableComponent(idadeProfessor);
        nomeProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeProfessorFocusLost(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); 
        jLabel2.setText("Selecionar horário");

        jLabel3.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); 
        jLabel3.setText("Dados pessoais");

        jLabel4.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); 
        jLabel4.setText("Adicionar matéria");

        salaHorario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        salaHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a sala" }));
        salaHorario.setNextFocusableComponent(horarioProfessor);
        salaHorario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salaHorarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salaHorarioFocusLost(evt);
            }
        });
        salaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaHorarioActionPerformed(evt);
            }
        });

        Cadastrar1.setText("Confirmar horário");
        Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar1ActionPerformed(evt);
            }
        });

        Cadastrar2.setText("Confirmar matéria");
        Cadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar2ActionPerformed(evt);
            }
        });

        materiaProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        materiaProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a matéria" }));
        materiaProfessor.setNextFocusableComponent(salaHorario);
        materiaProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                materiaProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                materiaProfessorFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); 
        jLabel5.setText("Selecionar o usuário");

        usuarioProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        usuarioProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o usuário correspondente" }));
        usuarioProfessor.setNextFocusableComponent(voltar);
        usuarioProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioProfessorFocusLost(evt);
            }
        });
        usuarioProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioProfessorActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar usuário");

        horarioProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        horarioProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o horário" }));
        horarioProfessor.setNextFocusableComponent(usuarioProfessor);
        horarioProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                horarioProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                horarioProfessorFocusLost(evt);
            }
        });

        cpfProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        cpfProfessor.setText("CPF");
        cpfProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfProfessorFocusLost(evt);
            }
        });

        dataNascimento.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        dataNascimento.setText("--/--/---- (Data de nascimento)");
        dataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataNascimentoFocusLost(evt);
            }
        });

        urlCurriculo.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        urlCurriculo.setText("URL do currículo");
        urlCurriculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                urlCurriculoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                urlCurriculoFocusLost(evt);
            }
        });

        formacaoProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        formacaoProfessor.setText("Formação");
        formacaoProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formacaoProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formacaoProfessorFocusLost(evt);
            }
        });

        salarioProfessor.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        salarioProfessor.setText("Salário");
        salarioProfessor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salarioProfessorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salarioProfessorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(materiaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(usuarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(horarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(6, 6, 6)
                        .addComponent(Cadastrar)
                        .addGap(6, 6, 6)
                        .addComponent(Cadastrar2)
                        .addGap(6, 6, 6)
                        .addComponent(Cadastrar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urlCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urlCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(salarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materiaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(usuarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(voltar)
                    .addComponent(Cadastrar1)
                    .addComponent(Cadastrar2)
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
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
            idadeProfessor.setText("Idade");
            PlaceHolder.addPlaceHolder(idadeProfessor);
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
            nomeProfessor.setText("Nome");
            PlaceHolder.addPlaceHolder(nomeProfessor);
        }
    }

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
        
        dispose();
        DAO.closeMan();
        HorarioDAO.closeMan();
        MateriaDAO.closeMan();
        CadastroProfs.setInstance(null);
        Cadastros.getInstance().setVisible(true);
    }

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (!DAO.getMan().isOpen()) {
            DAO.setMan();
        }
        if (!HorarioDAO.getMan().isOpen()) {
            HorarioDAO.setMan();
        }
        if (!MateriaDAO.getMan().isOpen()) {
            MateriaDAO.setMan();
        }

        String nome = nomeProfessor.getText();
        int idade = Integer.parseInt(idadeProfessor.getText());
        String cpf = cpfProfessor.getText();

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataNascimento.getText(), formatadorData);

        LocalDate dataCad = LocalDate.now();
        LocalTime hora = LocalTime.now();

        String url = urlCurriculo.getText();
        String formacao = formacaoProfessor.getText();
        Double salario = Double.parseDouble(salarioProfessor.getText());

        List<Materia> listaMaterias = new ArrayList<>();
        listaMaterias.add(MateriaDAO.buscarMateriasNome(materiaProfessor.getSelectedItem().toString()));
        List<Horario> listaHorarios = new ArrayList<>();
        listaHorarios.add(HorarioDAO.buscarHorarioID(Integer.parseInt(horarioProfessor.getSelectedItem().toString())));
        User u = UserDAO.buscarUsuarioNome(usuarioProfessor.getSelectedItem().toString());

        boolean camposPreenchidos = !nome.equals("Nome") && !idadeProfessor.getText().equals("Idade") && !cpf.equals("CPF") && !dataNascimento.getText().equals("") && !url.isEmpty() && !formacao.isEmpty() && !salarioProfessor.getText().isEmpty();
        boolean comboBoxesSelecionadas = !materiaProfessor.getSelectedItem().toString().equals("Selecione a matéria") && !salaHorario.getSelectedItem().toString().equals("Selecione a sala") && !horarioProfessor.getSelectedItem().toString().equals("Selecione o horário") && !usuarioProfessor.getSelectedItem().toString().equals("Selecione o usuário correspodente");

        try {
            if (!camposPreenchidos) {
                JOptionPane.showMessageDialog(null, "Todos os campos de dados pessoais devem estar preenchidos.");
            }

            if (!comboBoxesSelecionadas) {
                JOptionPane.showMessageDialog(null, "Todas as combo boxes devem estar com seleções válidas para que o cadastro ocorra.");
            }

            if (camposPreenchidos && comboBoxesSelecionadas) {
                Professor p = new Professor(nome, idade, cpf, url, listaMaterias, listaHorarios, salario, formacao, data, dataCad, hora, u);
                DAO.cadastrarJPA(p);
                JOptionPane.showMessageDialog(null, "Cadastro bem sucedido.");
                nomeProfessor.setText("Nome");
                PlaceHolder.addPlaceHolder(nomeProfessor);
                idadeProfessor.setText("Idade");
                PlaceHolder.addPlaceHolder(idadeProfessor);
                cpfProfessor.setText("CPF");
                PlaceHolder.addPlaceHolder(cpfProfessor);
                dataNascimento.setText("--/--/---- (Data de nascimento)");
                PlaceHolder.addPlaceHolder(dataNascimento);
                urlCurriculo.setText("URL do currículo");
                PlaceHolder.addPlaceHolder(urlCurriculo);
                salarioProfessor.setText("Salário");
                PlaceHolder.addPlaceHolder(salarioProfessor);
                formacaoProfessor.setText("Formação");
                PlaceHolder.addPlaceHolder(formacaoProfessor);
                salaHorario.setSelectedIndex(0);
                PlaceHolder.addPlaceHolderComboBox(salaHorario);
                materiaProfessor.setSelectedIndex(0);
                PlaceHolder.addPlaceHolderComboBox(materiaProfessor);
                usuarioProfessor.setSelectedIndex(0);
                PlaceHolder.addPlaceHolderComboBox(usuarioProfessor);
                horarioProfessor.setSelectedIndex(0);
                PlaceHolder.addPlaceHolderComboBox(horarioProfessor);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro, preencha todos os campos e tente novamente!");
            System.out.println(e.getMessage());
        }
        DAO.closeMan();
        HorarioDAO.closeMan();
        MateriaDAO.closeMan();
        DAO.setInstance(null);
    }

    private void Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        

    }

    private void Cadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void usuarioProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (usuarioProfessor.getSelectedItem().toString().equals("Selecione o usuário correspondente")) {
            usuarioProfessor.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(usuarioProfessor);
        }
    }

    private void usuarioProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (usuarioProfessor.getSelectedItem().toString().equals("Selecione o usuário correspondente")) {
            PlaceHolder.addPlaceHolderComboBox(usuarioProfessor);
        }
    }

    private void materiaProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (materiaProfessor.getSelectedItem().toString().equals("Selecione a matéria")) {
            PlaceHolder.addPlaceHolderComboBox(materiaProfessor);
        }
    }

    private void materiaProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (materiaProfessor.getSelectedItem().toString().equals("Selecione a matéria")) {
            materiaProfessor.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(materiaProfessor);
        }
    }

    private void salaHorarioFocusLost(java.awt.event.FocusEvent evt) {
        
        if (salaHorario.getSelectedItem().toString().equals("Selecione a sala")) {
            PlaceHolder.addPlaceHolderComboBox(salaHorario);
        }
    }

    private void salaHorarioFocusGained(java.awt.event.FocusEvent evt) {
        
        if (salaHorario.getSelectedItem().toString().equals("Selecione a sala")) {
            salaHorario.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(salaHorario);
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

    private void salaHorarioActionPerformed(java.awt.event.ActionEvent evt) {
    	PreencherComboBox.EsvaziarComboBoxes(horarioProfessor);
    	PreencherComboBox.PreencherComboBoxHorarios(salaHorario.getSelectedItem().toString(), horarioProfessor);
    }

    private void usuarioProfessorActionPerformed(java.awt.event.ActionEvent evt) {
        
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
            cpfProfessor.setText("CPF");
            PlaceHolder.addPlaceHolder(cpfProfessor);
        }
    }

    private void dataNascimentoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (dataNascimento.getText().equals("--/--/---- (Data de nascimento)")) {
            dataNascimento.setText(null);
            dataNascimento.requestFocus();
            PlaceHolder.removePlaceHolder(dataNascimento);
        }
    }

    private void dataNascimentoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (dataNascimento.getText().isEmpty()) {
            dataNascimento.setText("--/--/---- (Data de nascimento)");
            PlaceHolder.addPlaceHolder(dataNascimento);
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
            urlCurriculo.setText("URL do currículo");
            PlaceHolder.addPlaceHolder(urlCurriculo);
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

    private void salarioProfessorFocusGained(java.awt.event.FocusEvent evt) {
        
        if (salarioProfessor.getText().equals("Salário")) {
            salarioProfessor.setText(null);
            salarioProfessor.requestFocus();
            PlaceHolder.removePlaceHolder(salarioProfessor);
        }
    }

    private void salarioProfessorFocusLost(java.awt.event.FocusEvent evt) {
        
        if (salarioProfessor.getText().isEmpty()) {
            salarioProfessor.setText("Salário");
            PlaceHolder.addPlaceHolder(salarioProfessor);
        }
    }
    
    public static void main(String args[]) {
        try {
            FlatDarkLaf.setup();
            new CadastroProfs().setVisible(true); 
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Cadastrar1;
    private javax.swing.JButton Cadastrar2;
    private javax.swing.JTextField cpfProfessor;
    private javax.swing.JTextField dataNascimento;
    private javax.swing.JTextField formacaoProfessor;
    private javax.swing.JComboBox<String> horarioProfessor;
    private javax.swing.JTextField idadeProfessor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> materiaProfessor;
    private javax.swing.JTextField nomeProfessor;
    private javax.swing.JComboBox<String> salaHorario;
    private javax.swing.JTextField salarioProfessor;
    private javax.swing.JTextField urlCurriculo;
    private javax.swing.JComboBox<String> usuarioProfessor;
    private javax.swing.JButton voltar;
    
}
