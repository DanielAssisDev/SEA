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

    EntityManager man = JPAUtil.getman();

}
