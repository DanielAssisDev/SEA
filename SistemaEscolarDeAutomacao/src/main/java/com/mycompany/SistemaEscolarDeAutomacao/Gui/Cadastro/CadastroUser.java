package com.mycompany.SistemaEscolarDeAutomacao.Gui.Cadastro;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.SistemaEscolarDeAutomacao.SEA;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAO;
import com.mycompany.SistemaEscolarDeAutomacao.Dao.UserDAO;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Gerais.PlaceHolder;
import com.mycompany.SistemaEscolarDeAutomacao.Gui.Inicio.TelaLogin;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class CadastroUser extends javax.swing.JFrame {

	private static final java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(CadastroUser.class.getName());

	private static CadastroUser instance;

	public static CadastroUser getInstance() {
		if (instance == null) {
			instance = new CadastroUser();
		}
		return instance;
	}

	public static void setInstance(CadastroUser instance) {
		CadastroUser.instance = instance;
	}

	public CadastroUser() {
		initComponents();
		PlaceHolder.addPlaceHolder(nomeUsuario);
		PlaceHolder.addPlaceHolder(emailUsuario);
		PlaceHolder.addPlaceHolder(telefoneUsuario);
		PlaceHolder.addPlaceHolder(loginUsuario);
		PlaceHolder.addPlaceHolder(senhaUsuario);
		PlaceHolder.addPlaceHolderComboBox(comboPermissoes);
	}

	@SuppressWarnings("unchecked")
	
	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		nomeUsuario = new javax.swing.JTextField();
		comboPermissoes = new javax.swing.JComboBox<>();
		loginUsuario = new javax.swing.JTextField();
		voltar = new javax.swing.JButton();
		senhaUsuario = new javax.swing.JPasswordField();
		telefoneUsuario = new javax.swing.JTextField();
		emailUsuario = new javax.swing.JTextField();
		Cadastrar = new javax.swing.JButton();
		visualizacao = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); 
		jLabel1.setText("Cadastro de usuários");

		nomeUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
		nomeUsuario.setText("Nome");
		nomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				nomeUsuarioFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				nomeUsuarioFocusLost(evt);
			}
		});

		comboPermissoes.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
		comboPermissoes.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Selecione a permissão", "Diretor", "Secretário", "Professor" }));
		comboPermissoes.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				comboPermissoesFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				comboPermissoesFocusLost(evt);
			}
		});
		comboPermissoes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				comboPermissoesActionPerformed(evt);
			}
		});

		loginUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
		loginUsuario.setText("Login");
		loginUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				loginUsuarioFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				loginUsuarioFocusLost(evt);
			}
		});

		voltar.setText("Voltar");
		voltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				voltarActionPerformed(evt);
			}
		});

		senhaUsuario.setText("Senha");
		senhaUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				senhaUsuarioFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				senhaUsuarioFocusLost(evt);
			}
		});
		senhaUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				senhaUsuarioActionPerformed(evt);
			}
		});

		telefoneUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
		telefoneUsuario.setText("Telefone (Exemplo: (27)981026479)");
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

		emailUsuario.setFont(new java.awt.Font("Noto Sans", 2, 13)); 
		emailUsuario.setText("Email (nome@exemplo.dominio)");
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

		Cadastrar.setText("Cadastrar");
		Cadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CadastrarActionPerformed(evt);
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
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(100, 100, 100)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
								.addComponent(comboPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(telefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addComponent(visualizacao).addGap(6, 6, 6)
										.addComponent(voltar).addGap(6, 6, 6).addComponent(Cadastrar))
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(100, 100, 100)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLabel1).addGap(18, 18, 18)
						.addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(comboPermissoes, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(telefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(6, 6, 6)
						.addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(12, 12, 12)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(visualizacao).addComponent(voltar).addComponent(Cadastrar))
						.addGap(25, 25, 25)));

		pack();
		setLocationRelativeTo(null);
	}

	private void comboPermissoesActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void voltarActionPerformed(java.awt.event.ActionEvent evt) {
		
		dispose();
		DAO.closeMan();
		UserDAO.closeMan();
		CadastroUser.setInstance(null);
		if (SEA.getUser() == null) {
			TelaLogin.getInstance().setVisible(true);
		} else {
			Cadastros.getInstance().setVisible(true);
		}
	}

	private void telefoneUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void emailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
		
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
			nomeUsuario.setText("Nome");
			PlaceHolder.addPlaceHolder(nomeUsuario);
		}
	}

	private void emailUsuarioFocusGained(java.awt.event.FocusEvent evt) {
		
		if (emailUsuario.getText().equals("Email (nome@exemplo.dominio)")) {
			emailUsuario.setText(null);
			emailUsuario.requestFocus();
			PlaceHolder.removePlaceHolder(emailUsuario);
		}
	}

	private void emailUsuarioFocusLost(java.awt.event.FocusEvent evt) {
		
		if (emailUsuario.getText().isEmpty()) {
			emailUsuario.setText("Email (nome@exemplo.dominio)");
			PlaceHolder.addPlaceHolder(emailUsuario);
		}
	}

	private void telefoneUsuarioFocusGained(java.awt.event.FocusEvent evt) {
		
		if (telefoneUsuario.getText().equals("Telefone (Exemplo: (27)981026479)")) {
			telefoneUsuario.setText(null);
			telefoneUsuario.requestFocus();
			PlaceHolder.removePlaceHolder(telefoneUsuario);
		}
	}

	private void telefoneUsuarioFocusLost(java.awt.event.FocusEvent evt) {
		
		if (telefoneUsuario.getText().isEmpty()) {
			telefoneUsuario.setText("Telefone (Exemplo: (27)981026479)");
			PlaceHolder.addPlaceHolder(telefoneUsuario);
		}
	}

	private void loginUsuarioFocusGained(java.awt.event.FocusEvent evt) {
		
		if (loginUsuario.getText().equals("Login")) {
			loginUsuario.setText(null);
			loginUsuario.requestFocus();
			PlaceHolder.removePlaceHolder(loginUsuario);
		}
	}

	private void loginUsuarioFocusLost(java.awt.event.FocusEvent evt) {
		
		if (loginUsuario.getText().isEmpty()) {
			loginUsuario.setText("Login");
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

	private void senhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void comboPermissoesFocusGained(java.awt.event.FocusEvent evt) {
		
		if (comboPermissoes.getSelectedItem().toString().equals("Selecione a permissão")) {
			comboPermissoes.requestFocus();
			PlaceHolder.removePlaceHolderComboBox(comboPermissoes);
		}
	}

	private void comboPermissoesFocusLost(java.awt.event.FocusEvent evt) {
		
		if (comboPermissoes.getSelectedItem().toString().equals("Selecione a permissão")) {
			PlaceHolder.addPlaceHolderComboBox(comboPermissoes);
		}
	}

	private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		
		if (!DAO.getMan().isOpen()) {
			DAO.setMan();
		}

		if (!UserDAO.getMan().isOpen()) {
			UserDAO.setMan();
		}

		String nome = nomeUsuario.getText();
		String permissao = comboPermissoes.getSelectedItem().toString();
		String email = emailUsuario.getText();
		String telefone = telefoneUsuario.getText();
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		String login = loginUsuario.getText();

		String senha = DAO.getSHA2(DAO.getMD5(senhaUsuario.getText()));

		String log = "Início do log de: " + nome + " (" + permissao + ").";

		boolean camposPreenchidos = !nome.equals("Nome") && !email.equals("Email (nome@exemplo.dominio)")
				&& !telefone.equals("Telefone (Exemplo: (27)981026479)") && !login.equals("Login")
				&& !senha.equals("Senha");
		boolean comboBoxSelecionada = !permissao.equals("Selecione a permissão");

		try {
			if (!camposPreenchidos) {
				JOptionPane.showMessageDialog(null, "Todos os campos de dados pessoais devem estar preenchidos.");
			}

			if (!comboBoxSelecionada) {
				JOptionPane.showMessageDialog(null,
						"Todas as combo boxes devem estar com seleções válidas para que o cadastro ocorra.");
			}

			if (camposPreenchidos && comboBoxSelecionada) {
				User u = new User(nome, permissao, email, telefone, data, hora, login, senha, log);

				DAO.cadastrarJPA(u);

				nomeUsuario.setText("Nome");
				PlaceHolder.addPlaceHolder(nomeUsuario);
				comboPermissoes.setSelectedIndex(0);
				PlaceHolder.addPlaceHolderComboBox(comboPermissoes);
				emailUsuario.setText("Email (nome@exemplo.dominio)");
				PlaceHolder.addPlaceHolder(emailUsuario);
				telefoneUsuario.setText("Telefone (Exemplo: (27)981026479)");
				PlaceHolder.addPlaceHolder(telefoneUsuario);
				loginUsuario.setText("Login");
				PlaceHolder.addPlaceHolder(loginUsuario);
				senhaUsuario.setText("Senha");
				PlaceHolder.addPlaceHolder(senhaUsuario);
				JOptionPane.showMessageDialog(null, "Cadastro bem sucedido.");
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro, preencha todos os campos e tente novamente!");
			System.out.println(e);
		}
		DAO.closeMan();
		UserDAO.closeMan();
	}

	private void visualizacaoActionPerformed(java.awt.event.ActionEvent evt) {
		
		if (senhaUsuario.getEchoChar() == '\u2022') {
			senhaUsuario.setEchoChar((char) 0);
		} else {
			senhaUsuario.setEchoChar('\u2022');
		}
	}

	public static void main(String args[]) {
		try {
			FlatDarkLaf.setup();
			new CadastroUser().setVisible(true);
		} catch (Exception ex) {
			logger.log(java.util.logging.Level.SEVERE, null, ex);
		}
	}

	
	private javax.swing.JButton Cadastrar;
	private javax.swing.JComboBox<String> comboPermissoes;
	private javax.swing.JTextField emailUsuario;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField loginUsuario;
	private javax.swing.JTextField nomeUsuario;
	private javax.swing.JPasswordField senhaUsuario;
	private javax.swing.JTextField telefoneUsuario;
	private javax.swing.JButton visualizacao;
	private javax.swing.JButton voltar;
	
}
