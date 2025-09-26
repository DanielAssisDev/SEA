/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
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
public class SalaDAO {

      private static SalaDAO instance;

    public static SalaDAO getInstance() {
        if (instance == null) {
            instance = new SalaDAO();
        }
        return instance;
    }

    public static void setInstance(SalaDAO instance) {
        SalaDAO.instance = instance;
    }
    
    EntityManager man = JPAUtil.getman();

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
}
