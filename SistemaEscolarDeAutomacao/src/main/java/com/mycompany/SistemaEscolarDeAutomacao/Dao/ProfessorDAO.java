/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Professor;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mrdaniel
 */
public class ProfessorDAO {

    private static ProfessorDAO instance;

    public static ProfessorDAO getInstance() {
        if (instance == null) {
            instance = new ProfessorDAO();
        }
        return instance;
    }

    public static void setInstance(ProfessorDAO instance) {
        ProfessorDAO.instance = instance;
    }

    static EntityManager man = JPAUtil.getman();

    public static List<Professor> buscarProfessores() {
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

    public List<Professor> buscarProfessoresParaTabela(String id, String nome, String idade, String cpf, String urlCurriculo, String formacao, String dataNascimento, String dataCadastro, String horaCadastro, String usuario) {
        List<Professor> professores = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT p from Professor p"
                    + " WHERE (:id is null OR CAST(p.id AS String) LIKE :id) "
                    + " AND (:nome is null OR p.nome LIKE :nome) "
                    + " AND (:idade is null OR CAST(p.idade AS String) LIKE :idade) "
                    + " AND (:cpf is null OR p.cpf LIKE :cpf) "
                    + " AND (:urlCurriculo is null OR p.UrlCurriculo LIKE :UrlCurriculo) "
                    + " AND (:formacao is null OR p.formacao LIKE :formacao) "
                    + " AND (:dataNascimento is null OR CAST(p.dataNascimento AS String) LIKE :dataNascimento) "
                    + " AND (:dataCadastro is null OR CAST(p.dataCadastro AS String) LIKE :dataCadastro) "
                    + " AND (:horaCadastro is null OR CAST(p.horaCadastro AS String) LIKE :horaCadastro) "
                    + " AND (:usuario is null OR p.usuario.nome LIKE :usuario) "
            );
            professores = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return professores;
    }

}
