/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author daniel
 */
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private int idade;
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @Column(name = "hora_cadastro")
    private LocalTime horaCadastro;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    private String turno;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Aluno(int id, String nome, int idade, String cpf, LocalDate dataNascimento, LocalDate dataCadastro, LocalTime horaCadastro, Sala sala, String turno) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.horaCadastro = horaCadastro;
        this.sala = sala;
        this.turno = turno;
    }

    public Aluno() {
    }

    public Aluno(String nome, int idade, String cpf, LocalDate dataNascimento, LocalDate dataCadastro, LocalTime horaCadastro, Sala sala, String turno) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.horaCadastro = horaCadastro;
        this.sala = sala;
        this.turno = turno;
    }

}
