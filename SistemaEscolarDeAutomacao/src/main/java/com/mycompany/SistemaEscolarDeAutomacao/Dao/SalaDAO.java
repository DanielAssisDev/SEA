package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SalaDAO {

    static EntityManager man = JPAUtil.getman();

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

    public static Sala buscarSalaNome(String nomeSala) {
        Sala sala = new Sala();
        try {
            TypedQuery<Sala> consulta = man.createQuery("SELECT s from Sala s WHERE s.nome = :nome", Sala.class);
            consulta.setParameter("nome", nomeSala);
            sala = consulta.getSingleResult();
            return sala;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static List<Sala> buscarSalasNome(String nomeSala) {
        List<Sala> salas = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT s from Sala s where s.nome LIKE :nome", Sala.class);
            consulta.setParameter("nome", nomeSala);
            salas = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return salas;
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
