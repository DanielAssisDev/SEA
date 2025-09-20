/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class DAOOperacoes {

    private static DAOOperacoes instance;

    public static DAOOperacoes getInstance() {
        if (instance == null) {
            instance = new DAOOperacoes();
        }
        return instance;
    }

    public static void setInstance(DAOOperacoes instance) {
        DAOOperacoes.instance = instance;
    }

    static EntityManager man = JPAUtil.getman();

    public static void cadastrarJPA(Object obj) {
        try {
            man.getTransaction().begin();
            man.persist(obj);
            man.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro, tente novamente.");
        }
    }

    public static List<User> buscarUsuarios() {
        List<User> usuarios = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT u from User u");
            usuarios = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return usuarios;
    }

    public static List<Sala> buscarSalas() {
        List<Sala> salas = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT s from Sala s");
            salas = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return salas;
    }

    public static List<Sala> buscarSalasNome(String nomeSala) {
        List<Sala> salas = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT s from Sala s where s.nome = :nome", Sala.class);
            consulta.setParameter("nome", nomeSala);
            salas = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return salas;
    }

    public static List<Materia> buscarMaterias() {
        List<Materia> materias = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT m from Materia m");
            materias = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return materias;
    }

    public static List<Horario> buscarHorarios() {
        List<Horario> horarios = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT h from Horario h");
            horarios = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return horarios;
    }

}
