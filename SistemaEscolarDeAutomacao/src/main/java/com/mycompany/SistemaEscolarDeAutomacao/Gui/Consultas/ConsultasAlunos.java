package com.mycompany.SistemaEscolarDeAutomacao.Gui.Consultas;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.AlunoDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Aluno;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PreencherTabelas;
import java.util.List;

public class ConsultasAlunos extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultasAlunos.class.getName());

    private static ConsultasAlunos instance;

    public static ConsultasAlunos getInstance() {
        if (instance == null) {
            instance = new ConsultasAlunos();
        }
        return instance;
    }

    public static void setInstance(ConsultasAlunos instance) {
        ConsultasAlunos.instance = instance;
    }

    public ConsultasAlunos() {
        initComponents();
        PlaceHolder.addPlaceHolder(nomeAluno);
        PlaceHolder.addPlaceHolder(idadeAluno);
        PlaceHolder.addPlaceHolder(cpfAluno);
        PlaceHolder.addPlaceHolderComboBox(turnoAluno);
        PlaceHolder.addPlaceHolderComboBox(salaAluno);
        PlaceHolder.addPlaceHolder(dataNascimentoAluno);
        PlaceHolder.addPlaceHolder(dataCadastroAluno);
        PlaceHolder.addPlaceHolder(horaCadastroAluno);
        List<Aluno> lista = AlunoDAO.buscarAlunos();
        PreencherTabelas.PreencherTabelaDeAlunos(jTable1, lista);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cpfAluno = new javax.swing.JTextField();
        nomeAluno = new javax.swing.JTextField();
        idadeAluno = new javax.swing.JTextField();
        salaAluno = new javax.swing.JComboBox<>();
        dataCadastroAluno = new javax.swing.JTextField();
        dataNascimentoAluno = new javax.swing.JTextField();
        horaCadastroAluno = new javax.swing.JTextField();
        turnoAluno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        identificadorAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(818, 542));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); 
        jLabel1.setText("Alunos Cadastrados");

        cpfAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        cpfAluno.setText("CPF");
        cpfAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfAlunoFocusLost(evt);
            }
        });

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

        dataCadastroAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        dataCadastroAluno.setText("--/--/---- (Data de cadastro)");
        dataCadastroAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataCadastroAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataCadastroAlunoFocusLost(evt);
            }
        });

        dataNascimentoAluno.setText("--/--/---- (Data de nascimento)");
        dataNascimentoAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataNascimentoAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataNascimentoAlunoFocusLost(evt);
            }
        });

        horaCadastroAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        horaCadastroAluno.setText("HH:mm:ss (Hora do cadastro)");
        horaCadastroAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                horaCadastroAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                horaCadastroAlunoFocusLost(evt);
            }
        });

        turnoAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        turnoAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o turno" }));
        turnoAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                turnoAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnoAlunoFocusLost(evt);
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

        identificadorAluno.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
        identificadorAluno.setText("Identificador");
        identificadorAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                identificadorAlunoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                identificadorAlunoFocusLost(evt);
            }
        });

        jLabel2.setText("Selecione os critérios de busca:");

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
                    .addComponent(voltar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(horaCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(turnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(identificadorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
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
                    .addComponent(cpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificadorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar)
                .addContainerGap())
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
            PlaceHolder.addPlaceHolder(nomeAluno);
            nomeAluno.setText("Nome");
        }
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
            PlaceHolder.addPlaceHolder(idadeAluno);
            idadeAluno.setText("Idade");
        }
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
            PlaceHolder.addPlaceHolder(cpfAluno);
            cpfAluno.setText("CPF");
        }
    }

    private void turnoAlunoFocusGained(java.awt.event.FocusEvent evt) {
        if (turnoAluno.getSelectedItem().toString().equals("Selecione o turno")) {
            turnoAluno.requestFocus();
            PlaceHolder.removePlaceHolderComboBox(turnoAluno);
        }
    }

    private void turnoAlunoFocusLost(java.awt.event.FocusEvent evt) {
        if (turnoAluno.getSelectedItem().toString().equals("Selecione o turno")) {
            PlaceHolder.addPlaceHolderComboBox(turnoAluno);
        }
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

    private void dataNascimentoAlunoFocusGained(java.awt.event.FocusEvent evt) {
        if (dataNascimentoAluno.getText().equals("--/--/---- (Data de nascimento)")) {
            dataNascimentoAluno.setText(null);
            dataNascimentoAluno.requestFocus();
            PlaceHolder.removePlaceHolder(dataNascimentoAluno);
        }

    }

    private void dataNascimentoAlunoFocusLost(java.awt.event.FocusEvent evt) {
        if (dataNascimentoAluno.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(dataNascimentoAluno);
            dataNascimentoAluno.setText("--/--/---- (Data de nascimento)");
        }

    }

    private void dataCadastroAlunoFocusGained(java.awt.event.FocusEvent evt) {
        if (dataCadastroAluno.getText().equals("--/--/---- (Data de cadastro)")) {
            dataCadastroAluno.setText(null);
            dataCadastroAluno.requestFocus();
            PlaceHolder.removePlaceHolder(dataCadastroAluno);
        }
    }

    private void dataCadastroAlunoFocusLost(java.awt.event.FocusEvent evt) {
        if (dataCadastroAluno.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(dataCadastroAluno);
            dataCadastroAluno.setText("--/--/---- (Data de cadastro)");
        }
    }

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        ConsultasAlunos.setInstance(null);
        AlunoDAO.closeMan();
        DAO.closeMan();
        Consultas.getInstance().setVisible(true);
    }

    private void horaCadastroAlunoFocusGained(java.awt.event.FocusEvent evt) {
        if (horaCadastroAluno.getText().equals("HH:mm:ss (Hora do cadastro)")) {
            horaCadastroAluno.setText(null);
            horaCadastroAluno.requestFocus();
            PlaceHolder.removePlaceHolder(horaCadastroAluno);
        }
    }

    private void horaCadastroAlunoFocusLost(java.awt.event.FocusEvent evt) {
        if (horaCadastroAluno.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(horaCadastroAluno);
            horaCadastroAluno.setText("HH:mm:ss (Hora do cadastro)");
        }
    }

    private void identificadorAlunoFocusGained(java.awt.event.FocusEvent evt) {
        if (identificadorAluno.getText().equals("Identificador")) {
            identificadorAluno.setText(null);
            identificadorAluno.requestFocus();
            PlaceHolder.removePlaceHolder(identificadorAluno);
        }
    }

    private void identificadorAlunoFocusLost(java.awt.event.FocusEvent evt) {
        if (identificadorAluno.getText().isEmpty()) {
            PlaceHolder.addPlaceHolder(identificadorAluno);
            identificadorAluno.setText("Identificador");
        }
    }

    public static void main(String args[]) {
    	try {
			FlatDarkLaf.setup();
			new ConsultasAlunos().setVisible(true);
		} catch (Exception ex) {
			logger.log(java.util.logging.Level.SEVERE, null, ex);
		}
    }

    
    private javax.swing.JTextField cpfAluno;
    private javax.swing.JTextField dataCadastroAluno;
    private javax.swing.JTextField dataNascimentoAluno;
    private javax.swing.JTextField horaCadastroAluno;
    private javax.swing.JTextField idadeAluno;
    private javax.swing.JTextField identificadorAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JComboBox<String> salaAluno;
    private javax.swing.JComboBox<String> turnoAluno;
    private javax.swing.JButton voltar;
    
}
