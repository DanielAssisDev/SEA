/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Dao;

/**
 *
 * @author mrdaniel
 */
public class AlunoDAO {

    private static AlunoDAO instance;

    public static AlunoDAO getInstance() {
        if (instance == null) {
            instance = new AlunoDAO();
        }
        return instance;
    }

    public static void setInstance(AlunoDAO instance) {
        AlunoDAO.instance = instance;
    }

    
}
