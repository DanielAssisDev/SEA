package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaDAO {

    private static MateriaDAO instance;

    public static MateriaDAO getInstance() {
        if (instance == null) {
            instance = new MateriaDAO();
        }
        return instance;
    }

    public static void setInstance(MateriaDAO instance) {
        MateriaDAO.instance = instance;
    }

    static EntityManager man = JPAUtil.getman();

    public static Materia buscarMateriasNome(String nomeMateria) {
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
