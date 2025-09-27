/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author mrdaniel
 */
public class UserDAO {

    private static UserDAO instance;

    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

    public static void setInstance(UserDAO instance) {
        UserDAO.instance = instance;
    }

    EntityManager man = JPAUtil.getman();

    public User Autenticacao(String login, String senha) {
        User user = new User();
        try {
            TypedQuery<User> consulta = man.createQuery("SELECT u from User u WHERE u.login=: login AND u.senha =: senha", User.class);
            consulta.setParameter("login", login);
            consulta.setParameter("senha", senha);
            user = consulta.getSingleResult();
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
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
}
