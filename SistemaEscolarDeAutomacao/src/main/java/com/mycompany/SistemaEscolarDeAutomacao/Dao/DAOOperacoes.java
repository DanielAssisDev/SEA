/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.Aluno;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Professor;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import com.mycompany.SistemaEscolarDeAutomacao.Persistence.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
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

 

    public Sala buscarSalaNome(String nomeSala) {
        Sala sala = new Sala();
        try {
            TypedQuery<Sala> consulta = man.createQuery("SELECT s from Sala s WHERE s.nome = :nome", Sala.class);
            consulta.setParameter("nome", nomeSala);
            sala = consulta.getSingleResult();
            return sala;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
            return null;
        }
    }

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

    public List<User> buscarUsuarios() {
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

    public List<User> buscarUsuariosParaTabela(String id, String nome, String permissao, String email, String telefone, String dataCadastro, String horaCadastro) {
        List<User> usuarios = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT u FROM User u "
                    + " WHERE (:id is null OR CAST(u.id AS String) LIKE :id) "
                    + " OR (:nome is null OR u.nome LIKE :nome) "
                    + " OR (:permissao is null OR u.permissao LIKE :permissao) "
                    + " OR (:email is null OR u.email LIKE :email) "
                    + " OR (:telefone is null OR u.telefone LIKE :telefone) "
                    + " OR (:dataCadastro is null OR CAST(u.dataCadastro AS String) LIKE :dataCadastro) "
                    + " OR (:horaCadastro is null OR CAST(u.horaCadastro AS String) LIKE :horaCadastro) "
            );

            consulta.setParameter("id", id.isEmpty() ? null : "%" + id + "%");
            consulta.setParameter("nome", nome.isEmpty() ? null : "%" + nome + "%");
            consulta.setParameter("permissao", permissao.isEmpty() ? null : "%" + permissao + "%");
            consulta.setParameter("email", email.isEmpty() ? null : "%" + email + "%");
            consulta.setParameter("telefone", telefone.isEmpty() ? null : "%" + telefone + "%");
            consulta.setParameter("dataCadastro", dataCadastro.isEmpty() ? null : "%" + dataCadastro + "%");
            consulta.setParameter("horaCadastro", horaCadastro.isEmpty() ? null : "%" + horaCadastro + "%");

            usuarios = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return usuarios;
    }

    public List<Professor> buscarProfessores() {
        List<Professor> professores = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT p from Professor p");
            professores = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return professores;
    }

    public List<Professor> buscarProfessoresParaTabela(String id, String nome, String idade, String cpf, String urlCurriculo, String formacao, String dataNascimento, String dataCadastro, String horaCadastro, String usuario) {
        List<Professor> professores = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT p from Professor p"
                    + " WHERE (:id is null OR CAST(p.id AS String) LIKE :id) "
                    + " AND (:nome is null OR p.nome LIKE :nome) "
                    + " AND (:idade is null OR CAST(p.idade AS String) LIKE :idade) "
                    + " AND (:cpf is null OR p.cpf LIKE :cpf) "
                    + " AND (:urlCurriculo is null OR p.UrlCurriculo LIKE :UrlCurriculo) "
                    + " AND (:formacao is null OR p.formacao LIKE :formacao) "
                    + " AND (:dataNascimento is null OR CAST(p.dataNascimento AS String) LIKE :dataNascimento) "
                    + " AND (:dataCadastro is null OR CAST(p.dataCadastro AS String) LIKE :dataCadastro) "
                    + " AND (:horaCadastro is null OR CAST(p.horaCadastro AS String) LIKE :horaCadastro) "
                    + " AND (:usuario is null OR p.usuario.nome LIKE :usuario) "
            );
            professores = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return professores;
    }

    public List<Aluno> buscarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT a from Aluno a");
            alunos = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return alunos;
    }

    public List<Aluno> buscarAlunosParaTabela(String id, String nome, String idade, String cpf, String dataNascimento, String dataCadastro, String horaCadastro, String sala, String turno) {
        List<Aluno> alunos = new ArrayList<>();
        try {
            Query consulta = man.createQuery("SELECT a from Aluno a"
                    + " WHERE (:id is null OR CAST(a.id AS String) LIKE :id) "
                    + " AND (:nome is null OR a.nome LIKE :nome) "
                    + " AND (:idade is null OR CAST(a.idade AS String) LIKE :idade) "
                    + " AND (:cpf is null OR a.cpf LIKE :cpf) "
                    + " AND (:dataNascimento is null OR CAST(a.dataNascimento AS String) LIKE :dataNascimento) "
                    + " AND (:dataCadastro is null OR CAST(a.dataCadastro AS String) LIKE :dataCadastro) "
                    + " AND (:horaCadastro is null OR CAST(a.horaCadastro AS String) LIKE :horaCadastro) "
                    + " AND (:sala is null OR a.sala.nome LIKE :sala) "
                    + " AND (:turno is null OR a.turno LIKE :turno) "
            );
            alunos = consulta.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente mais tarde, ou entre em contato com o suporte.");
        }
        return alunos;
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

    public static String getMD5(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(senha.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            String hash = no.toString(16);
            while (hash.length() < 32) {
                hash = "0" + hash;
            }
            return hash;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao encontrar sua senha.");
            return null;
        }

    }

    public static String getSHA2(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(senha.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            String hash = no.toString(16);
            while (hash.length() < 32) {
                hash = "0" + hash;
            }
            return hash;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao encontrar sua senha.");
            return null;

        }

    }
}
