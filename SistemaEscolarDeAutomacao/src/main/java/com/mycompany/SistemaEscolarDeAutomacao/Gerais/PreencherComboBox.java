/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Gerais;

import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAOOperacoes;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author mrdaniel
 */
public class PreencherComboBox {
     private static PreencherComboBox instance;

    public static PreencherComboBox getInstance() {
        if (instance == null) {
            instance = new PreencherComboBox();
        } 
        return instance;
    }

    public static void setInstance(PreencherComboBox instance) {
        PreencherComboBox.instance = instance;
    }
    
    public static void PreencherComboBoxSalas(JComboBox caixa) {
        List<Sala> lista = DAOOperacoes.buscarSalas();
        for(Sala s : lista) {
            caixa.addItem(s.getNome());
        }
    }
    
}
