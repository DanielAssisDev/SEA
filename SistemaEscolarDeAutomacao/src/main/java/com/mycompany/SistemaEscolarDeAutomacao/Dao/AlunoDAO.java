package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Aluno;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunoDAO {

	static EntityManager man = JPAUtil.getman();

	public static List<Aluno> buscarAlunosParaTabela(String id, String nome, String idade, String cpf,
			String dataNascimento, String dataCadastro, String horaCadastro, String sala, String turno) {

		if (!DAO.getMan().isOpen()) {
			DAO.setMan();
		}
		
		if (!AlunoDAO.getMan().isOpen()) {
			AlunoDAO.setMan();
		}
		
		List<Aluno> alunos = new ArrayList<>();
		try {
			Query consulta = man
					.createQuery("SELECT a from Aluno a" + " WHERE (:id is null OR CAST(a.id AS String) LIKE :id) "
							+ " AND (:nome is null OR a.nome LIKE :nome) "
							+ " AND (:idade is null OR CAST(a.idade AS String) LIKE :idade) "
							+ " AND (:cpf is null OR a.cpf LIKE :cpf) "
							+ " AND (:dataNascimento is null OR CAST(a.dataNascimento AS String) LIKE :dataNascimento) "
							+ " AND (:dataCadastro is null OR CAST(a.dataCadastro AS String) LIKE :dataCadastro) "
							+ " AND (:horaCadastro is null OR CAST(a.horaCadastro AS String) LIKE :horaCadastro) "
							+ " AND (:sala is null OR a.sala.nome LIKE :sala) "
							+ " AND (:turno is null OR a.turno LIKE :turno) ");
			alunos = consulta.getResultList();
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,
					"Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
		}
		return alunos;
	}

	public static List<Aluno> buscarAlunos() {
		List<Aluno> alunos = new ArrayList<>();
		try {
			Query consulta = man.createQuery("SELECT a from Aluno a");
			alunos = consulta.getResultList();
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null,
					"Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
		}
		return alunos;
	}

	public static void setMan() {
		man = JPAUtil.getman();
	}

	public static void closeMan() {
		JPAUtil.closeMan();
	}

	public static EntityManager getMan() {
		return man;
	}

}
