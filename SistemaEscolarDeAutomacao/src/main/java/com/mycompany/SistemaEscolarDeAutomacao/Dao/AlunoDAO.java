/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Aluno;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mrdaniel
 */
public class AlunoDAO {

    private static AlunoDAO instance;

    public static AlunoDAO getInstance() {
        if (instance == null) {
            instance = new AlunoDAO();
        }
        return instance;
    }

    public static void setInstance(AlunoDAO instance) {
        AlunoDAO.instance = instance;
    }

    EntityManager man = JPAUtil.getman();

    public void cadastrarAluno(Aluno a) {
        try {
            man.getTransaction().begin();
            man.persist(a);
            man.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o aluno, tente novamente.");
        }
    }

}
