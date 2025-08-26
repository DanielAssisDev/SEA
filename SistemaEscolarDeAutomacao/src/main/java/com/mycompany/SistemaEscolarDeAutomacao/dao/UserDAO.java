/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.dao;

import com.mycompany.SistemaEscolarDeAutomacao.entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class UserDAO {
    
    EntityManager man = JPAUtil.getman();

    public void cadastrarJPA(User u) {
        try {
            man.getTransaction().begin();
            man.persist(u);
            man.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro, tente novamente.");
        }
    }
}
