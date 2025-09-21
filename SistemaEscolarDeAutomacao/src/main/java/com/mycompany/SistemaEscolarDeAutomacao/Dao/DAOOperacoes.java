/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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

    EntityManager man = JPAUtil.getman();

    public void cadastrarJPA(Object obj) {
        try {
            man.getTransaction().begin();
            man.persist(obj);
            man.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro, tente novamente.");
        }
    }

    public List<User> buscarUsuarios() {
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

    public List<Sala> buscarSalas() {
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

    public Sala buscarSalaNome(String nomeSala) {
        Sala sala = new Sala();
        try {
            TypedQuery<Sala> consulta = man.createQuery("SELECT s from Sala s where s.nome = :nome", Sala.class);
            consulta.setParameter("nome", nomeSala);
            sala = consulta.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return sala;
    }
    
    public List<Sala> buscarSalasNome(String nomeSala) {
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
    
     public Materia buscarMateriasNome(String nomeMateria) {
        Materia m = new Materia();
        try {
            TypedQuery<Materia> consulta = man.createQuery("SELECT m from Materia m where m.nome = :nome", Materia.class);
            consulta.setParameter("nome", nomeMateria);
            m = consulta.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return m;
    }
     
     
      public User buscarUsuarioNome(String nomeUser) {
        User u = new User();
        try {
            TypedQuery<User> consulta = man.createQuery("SELECT u from User u where u.nome = :nome", User.class);
            consulta.setParameter("nome", nomeUser);
            u = consulta.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return u;
    }
     
     public Horario buscarHorarioID(int id) {
        Horario h = new Horario();
        try {
            TypedQuery<Horario> consulta = man.createQuery("SELECT h from Horario h where h.id = :id", Horario.class);
            consulta.setParameter("id", id);
            h = consulta.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return h;
    }

     
     
    public List<Materia> buscarMaterias() {
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

    public List<Horario> buscarHorarios() {
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

    public void setMan() {
        man = JPAUtil.getman();
    }

    public static void closeMan() {
        JPAUtil.closeMan();
    }
    
    
}
