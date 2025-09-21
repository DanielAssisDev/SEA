/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Gerais;

import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAOOperacoes;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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

    DAOOperacoes dao = new DAOOperacoes();
    
    public static void setInstance(PreencherComboBox instance) {
        PreencherComboBox.instance = instance;
    }
    
    public void PreencherComboBoxSalas(JComboBox caixa) {
        List<Sala> lista = dao.buscarSalas();
        for(Sala s : lista) {
            caixa.addItem(s.getNome());
        }
    }
    
    public void PreencherComboBoxMaterias(JComboBox caixa) {
        List<Materia> lista = dao.buscarMaterias();
        for(Materia m : lista) {
            caixa.addItem(m.getNome());
        }
    }
   
    public void PreencherComboBoxHorarios(String nomeSala, JComboBox caixa) {
        List<Sala> lista = dao.buscarSalasNome(nomeSala);
        for(Sala s : lista) {
            for(Horario h : s.getHorarios()) {
                caixa.addItem(h.getId()/* + "Ordem: " + h.getOrdem() + "° - " + h.getDiaSemana() + " - " + h.getTurno() + " - " + h.getSala().getNome() + " - " + h.getMateriaDoHorario().getNome()*/);
            }
        }
    }
    
    public void PreencherComboUsuarios(JComboBox caixa) {
        List<User> lista = dao.buscarUsuarios();
        for(User u : lista) {
            caixa.addItem(u.getNome() /* + " " + u.getPermissao() */);
        }
    }
    
    public void EsvaziarComboBoxes(JComboBox caixa) {
        List<String> listaVazia = new ArrayList<>();
        listaVazia.add("Selecione o horário");
        PlaceHolder.addPlaceHolderComboBox(caixa);
        caixa.setModel(new DefaultComboBoxModel(listaVazia.toArray()));
    }
}
