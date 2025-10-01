package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Professor;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfessorDAO {

    static EntityManager man = JPAUtil.getman();

    public static List<Professor> buscarProfessores() {
        if (!ProfessorDAO.getMan().isOpen()) {
            ProfessorDAO.setMan();
        }
        List<Professor> professores = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT p from Professor p");
            professores = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return professores;
    }

    public static List<Professor> buscarProfessoresParaTabela(String id, String nome, String idade, String cpf, String urlCurriculo, String formacao, String dataNascimento, String dataCadastro, String horaCadastro, String usuario) {
        if (!DAO.getMan().isOpen()) {
            DAO.setMan();
        }

        if (!ProfessorDAO.getMan().isOpen()) {
            ProfessorDAO.setMan();
        }

        List<Professor> professores = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT p from Professor p"
                    + " WHERE (:id is null OR CAST(p.id AS String) LIKE :id) "
                    + " AND (:nome is null OR p.nome LIKE :nome) "
                    + " AND (:idade is null OR CAST(p.idade AS String) LIKE :idade) "
                    + " AND (:cpf is null OR p.cpf LIKE :cpf) "
                    + " AND (:urlCurriculo is null OR p.urlCurriculo LIKE :urlCurriculo) "
                    + " AND (:formacao is null OR p.formacao LIKE :formacao) "
                    + " AND (:dataNascimento is null OR CAST(p.dataNascimento AS String) LIKE :dataNascimento) "
                    + " AND (:dataCadastro is null OR CAST(p.dataCadastro AS String) LIKE :dataCadastro) "
                    + " AND (:horaCadastro is null OR CAST(p.horaCadastro AS String) LIKE :horaCadastro) "
                    + " AND (:usuario is null OR p.usuario.nome LIKE :usuario) "
            );
            consulta.setParameter("id", (id.equals("Identificador") || id.isEmpty()) ? null : "%" + id + "%");
            consulta.setParameter("nome", (nome.equals("Nome") || nome.isEmpty()) ? null : "%" + nome + "%");
            consulta.setParameter("idade", (idade.equals("Idade") || idade.isEmpty()) ? null : "%" + idade + "%");
            consulta.setParameter("cpf", (cpf.equals("CPF") || cpf.isEmpty()) ? null : "%" + cpf + "%");
            consulta.setParameter("urlCurriculo", (urlCurriculo.equals("URL do currículo") || urlCurriculo.isEmpty()) ? null : "%" + urlCurriculo + "%");
            consulta.setParameter("formacao", (formacao.equals("Formação") || formacao.isEmpty()) ? null : "%" + formacao + "%");
            consulta.setParameter("dataNascimento", (dataNascimento.equals("--/--/---- (Data de nascimento)") || dataNascimento.isEmpty()) ? null : "%" + dataNascimento + "%");
            consulta.setParameter("dataCadastro", (dataCadastro.equals("--/--/---- (Data de cadastro)") || dataCadastro.isEmpty()) ? null : "%" + dataCadastro + "%");
            consulta.setParameter("horaCadastro", (horaCadastro.equals("HH:mm:ss (Hora do cadastro)") || horaCadastro.isEmpty()) ? null : "%" + horaCadastro + "%");
            consulta.setParameter("usuario", (usuario.equals("Nome de usuário") || usuario.isEmpty()) ? null : "%" + usuario + "%");

            professores = consulta.getResultList();
            return professores;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
            return null;
        }
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
