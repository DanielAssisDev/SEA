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
import jakarta.persistence.Table;
import java.time.LocalTime;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 *
 * @author daniel
 */
@Entity
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dia_semana")
    private String diaSemana;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    
    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
    
    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;
    
    @JdbcTypeCode(SqlTypes.TIME)
    private LocalTime horas;

    private String turno;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Professor getProfessorDoHorario() {
        return professor;
    }

    public void setProfessorDoHorario(Professor professorDoHorario) {
        this.professor = professorDoHorario;
    }

    public Materia getMateriaDoHorario() {
        return materia;
    }

    public void setMateriaDoHorario(Materia materiaDoHorario) {
        this.materia = materiaDoHorario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public LocalTime getHoras() {
        return horas;
    }

    public void setHoras(LocalTime horas) {
        this.horas = horas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Horario() {
    }
    
    public Horario(int id, String diaSemana, Professor professor, Sala sala, Materia materia, LocalTime horas, String turno) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.professor = professor;
        this.sala = sala;
        this.materia = materia;
        this.horas = horas;
        this.turno = turno;
    }
    
}
