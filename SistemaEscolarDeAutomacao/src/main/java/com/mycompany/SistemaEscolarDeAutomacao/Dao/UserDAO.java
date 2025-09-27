/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

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

    static EntityManager man = JPAUtil.getman();

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

    public static User buscarUsuarioNome(String nomeUser) {
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

    public static List<User> buscarUsuarios() {
        List<User> usuarios = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT u FROM User u");
            usuarios = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return usuarios;
    }

    public static List<User> buscarUsuariosParaTabela(String id, String nome, String permissao, String email, String telefone, String dataCadastro, String horaCadastro) {
        List<User> usuarios = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT u FROM User u "
                    + " WHERE (:id is null OR CAST(u.id AS String) LIKE :id) "
                    + " AND (:nome is null OR u.nome LIKE :nome) "
                    + " AND (:permissao is null OR u.permissao LIKE :permissao) "
                    + " AND (:email is null OR u.email LIKE :email) "
                    + " AND (:telefone is null OR u.telefone LIKE :telefone) "
                    + " AND (:dataCadastro is null OR CAST(u.dataCadastro AS String) LIKE :dataCadastro) "
                    + " AND (:horaCadastro is null OR CAST(u.horaCadastro AS String) LIKE :horaCadastro) "
            );

            consulta.setParameter("id", (id.equals("Identificador") || id.isEmpty()) ? null : "%" + id + "%");
            consulta.setParameter("nome", (nome.equals("Nome") || nome.isEmpty()) ? null : "%" + nome + "%");
            consulta.setParameter("permissao", (permissao.equals("Selecione a permissão") || permissao.isEmpty()) ? null : "%" + permissao + "%");
            consulta.setParameter("email", (email.equals("email") || email.isEmpty()) ? null : "%" + email + "%");
            consulta.setParameter("telefone", (telefone.equals("Telefone") || telefone.isEmpty()) ? null : "%" + telefone + "%");
            consulta.setParameter("dataCadastro", (dataCadastro.equals("--/--/---- (Data de cadastro)") || dataCadastro.isEmpty()) ? null : "%" + dataCadastro + "%");
            consulta.setParameter("horaCadastro", (horaCadastro.equals("HH:mm:ss (Hora do cadastro)") || horaCadastro.isEmpty()) ? null : "%" + horaCadastro + "%");

            usuarios = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return usuarios;
    }

}
