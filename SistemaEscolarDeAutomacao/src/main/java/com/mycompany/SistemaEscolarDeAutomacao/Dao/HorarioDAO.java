package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HorarioDAO {

    private static HorarioDAO instance;

    public static HorarioDAO getInstance() {
        if (instance == null) {
            instance = new HorarioDAO();
        }
        return instance;
    }

    public static void setInstance(HorarioDAO instance) {
        HorarioDAO.instance = instance;
    }

    static EntityManager man = JPAUtil.getman();

    public static void confirmarHorario(Horario h) {
        try {
            man.getTransaction().begin();
            man.persist(h);
            man.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível confirmar o horário, tente novamente.");
        }
    }

    public static Horario buscarHorarioID(int id) {
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
