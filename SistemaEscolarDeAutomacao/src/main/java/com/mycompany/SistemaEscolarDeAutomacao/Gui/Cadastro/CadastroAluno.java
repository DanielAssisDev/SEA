
package com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.AlunoDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.SalaDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Aluno;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PreencherComboBox;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class CadastroAluno extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroAluno.class.getName());

    private static CadastroAluno instance;

    public static CadastroAluno getInstance() {
        if (instance == null) {
            instance = new CadastroAluno();
        }
        return instance;
    }

    public static void setInstance(CadastroAluno instance) {
        CadastroAluno.instance = instance;
    }

    PreencherComboBox pcb = new PreencherComboBox();

    
    public CadastroAluno() {
        initComponents();
        PlaceHolder.addPlaceHolder(nomeAluno);
        PlaceHolder.addPlaceHolder(idadeAluno);
        PlaceHolder.addPlaceHolder(cpfAluno);
        PlaceHolder.addPlaceHolder(dataNascimento);
        PlaceHolder.addPlaceHolderComboBox(salaAluno);
        PlaceHolder.addPlaceHolderComboBox(turnoAluno);
        pcb.PreencherComboBoxSalas(salaAluno);
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        dataNascimento = new javax.swing.JTextField();
        cpfAluno = new javax.swing.JTextField();
        idadeAluno = new javax.swing.JTextField();
        turnoAluno = new javax.swing.JComboBox<>();
        salaAluno = new javax.swing.JComboBox<>();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); 
        jLabel1.setText("Cadastro de alunos");

        nomeAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        nomeAluno.setText("Nome");
        nomeAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeAlunoFocusLost(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
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
        dataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoActionPerformed(evt);
            }
        });

        cpfAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        cpfAluno.setText("CPF");
        cpfAluno.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                cpfAlunoComponentRemoved(evt);
            }
        });
        cpfAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfAlunoFocusLost(evt);
            }
        });
        cpfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfAlunoActionPerformed(evt);
            }
        });

        idadeAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        idadeAluno.setText("Idade");
        idadeAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idadeAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idadeAlunoFocusLost(evt);
            }
        });

        turnoAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        turnoAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o turno", "M", "V", "N" }));
        turnoAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                turnoAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnoAlunoFocusLost(evt);
            }
        });

        salaAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        salaAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a sala" }));
        salaAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salaAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salaAlunoFocusLost(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(6, 6, 6)
                        .addComponent(Cadastrar))
                    .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(turnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(voltar))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void nomeAlunoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (nomeAluno.getText().equals("Nome")) {
            nomeAluno.setText(null);
            nomeAluno.requestFocus();
            PlaceHolder.removePlaceHolder(nomeAluno);
        }
    }

    private void nomeAlunoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (nomeAluno.getText().isEmpty()) {
            nomeAluno.setText("Nome");
            PlaceHolder.addPlaceHolder(nomeAluno);
        }
    }

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (!DAO.getMan().isOpen()) {
            DAO.setMan();
        }
        if (!SalaDAO.getMan().isOpen()) {
            SalaDAO.setMan();
        }

        String nome = nomeAluno.getText();
        int idade = Integer.parseInt(idadeAluno.getText());
        String cpf = cpfAluno.getText();
        String turno = turnoAluno.getSelectedItem().toString();

        LocalDate dataCad = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNas = LocalDate.parse(dataNascimento.getText(), formatadorData);

        Sala sala = SalaDAO.buscarSalaNome(salaAluno.getSelectedItem().toString());

        boolean camposPreenchidos = !nome.equals("Nome") && !idadeAluno.getText().equals("Idade") && !cpf.equals("CPF") && !dataNascimento.getText().equals("--/--/---- (Data de nascimento)");
        boolean comboBoxesSelecionadas = !salaAluno.getSelectedItem().toString().equals("Selecione a sala") && !turno.equals("Selecione o turno");

        try {
            if (!camposPreenchidos) {
                JOptionPane.showMessageDialog(null, "Todos os campos de dados pessoais devem estar preenchidos.");
            }

            if (!comboBoxesSelecionadas) {
                JOptionPane.showMessageDialog(null, "Todas as combo boxes devem estar com seleções válidas para que o cadastro ocorra.");
            }

            if (camposPreenchidos && comboBoxesSelecionadas) {
                Aluno aluno = new Aluno(nome, idade, cpf, dataNas, dataCad, hora, sala, turno);
                DAO.cadastrarJPA(aluno);
                JOptionPane.showMessageDialog(null, "Cadastro bem sucedido.");
                nomeAluno.setText("Nome");
                PlaceHolder.addPlaceHolder(nomeAluno);
                idadeAluno.setText("Idade");
                PlaceHolder.addPlaceHolder(idadeAluno);
                cpfAluno.setText("CPF");
                PlaceHolder.addPlaceHolder(cpfAluno);
                dataNascimento.setText("--/--/---- (Data de nascimento)");
                PlaceHolder.addPlaceHolder(dataNascimento);
                salaAluno.setSelectedIndex(0);
                PlaceHolder.addPlaceHolderComboBox(salaAluno);
                turnoAluno.setSelectedIndex(0);
                PlaceHolder.addPlaceHolderComboBox(turnoAluno);
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro, preencha todos os campos e tente novamente!");
            System.out.println(e.getMessage());
        }
        DAO.closeMan();
        SalaDAO.closeMan();
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

    private void dataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void cpfAlunoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (cpfAluno.getText().equals("CPF")) {
            cpfAluno.setText(null);
            cpfAluno.requestFocus();
            PlaceHolder.removePlaceHolder(cpfAluno);
        }
    }

    private void cpfAlunoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (cpfAluno.getText().isEmpty()) {
            cpfAluno.setText("CPF");
            PlaceHolder.addPlaceHolder(cpfAluno);
        }
    }

    private void cpfAlunoActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void cpfAlunoComponentRemoved(java.awt.event.ContainerEvent evt) {
        
    }

    private void idadeAlunoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (idadeAluno.getText().equals("Idade")) {
            idadeAluno.setText(null);
            idadeAluno.requestFocus();
            PlaceHolder.removePlaceHolder(idadeAluno);
        }
    }

    private void idadeAlunoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (idadeAluno.getText().isEmpty()) {
            idadeAluno.setText("Idade");
            PlaceHolder.addPlaceHolder(idadeAluno);
        }
    }

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
        
        dispose();
        DAO.closeMan();
        SalaDAO.closeMan();
        CadastroAluno.setInstance(null);
        Cadastros.getInstance().setVisible(true);
    }

    private void salaAlunoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (salaAluno.getSelectedItem().toString().equals("Selecione a sala")) {
            salaAluno.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(salaAluno);
        }
    }

    private void salaAlunoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (salaAluno.getSelectedItem().toString().equals("Selecione a sala")) {
            PlaceHolder.addPlaceHolderComboBox(salaAluno);
        }
    }

    private void turnoAlunoFocusLost(java.awt.event.FocusEvent evt) {
        
        if (turnoAluno.getSelectedItem().toString().equals("Selecione o turno")) {
            PlaceHolder.addPlaceHolderComboBox(turnoAluno);
        }
    }

    private void turnoAlunoFocusGained(java.awt.event.FocusEvent evt) {
        
        if (turnoAluno.getSelectedItem().toString().equals("Selecione o turno")) {
            turnoAluno.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(turnoAluno);
        }
    }

    
    public static void main(String args[]) {
    	try {
			FlatDarkLaf.setup();
			new CadastroAluno().setVisible(true);
		} catch (Exception ex) {
			logger.log(java.util.logging.Level.SEVERE, null, ex);
		}
    }

    
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField cpfAluno;
    private javax.swing.JTextField dataNascimento;
    private javax.swing.JTextField idadeAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JComboBox<String> salaAluno;
    private javax.swing.JComboBox<String> turnoAluno;
    private javax.swing.JButton voltar;
    
}
