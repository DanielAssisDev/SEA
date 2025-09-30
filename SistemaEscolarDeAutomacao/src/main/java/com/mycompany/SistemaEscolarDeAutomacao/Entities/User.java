package com.mycompany.SistemaEscolarDeAutomacao.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String permissao;
    private String email;
    private String telefone;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @Column(name = "hora_cadastro")
    private LocalTime horaCadastro;

    private String login;
    private String senha;

    @Column(columnDefinition = "LONGTEXT")
    private String log;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public User() {
    }

    public User(String nome, String permissao, String email, String telefone, LocalDate dataCadastro, LocalTime horaCadastro, String login, String senha, String log) {
        this.nome = nome;
        this.permissao = permissao;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
        this.horaCadastro = horaCadastro;
        this.login = login;
        this.senha = senha;
        this.log = log;
    }
}
