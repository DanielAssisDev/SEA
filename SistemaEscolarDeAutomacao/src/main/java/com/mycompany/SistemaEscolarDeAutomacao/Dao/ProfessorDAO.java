/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;

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

    EntityManager man = JPAUtil.getman();
}
