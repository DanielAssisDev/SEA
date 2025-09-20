/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Gerais;

import com.mycompany.SistemaEscolarDeAutomacao.Entities.User;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrdaniel
 */
public class PreencherTabelas {
    
    private static PreencherTabelas instance;

    public static PreencherTabelas getInstance() {
        if (instance == null) {
            instance = new PreencherTabelas();
        } 
        return instance;
    }

    public static void setInstance(PreencherTabelas instance) {
        PreencherTabelas.instance = instance;
    }
    
    
    public static void PreencherTabelaDeUsuarios (JTable tabela, List<User> lista) {
        String colunas[] = {"Identificador", "Nome", "Permissão", "Email", "Telefone", "Data de Cadastro", "Hora de cadastro"};
        String dados[][] = new String[lista.size()][colunas.length];
       
        int index=0;
        for(User u: lista) {
            dados[index] = new String[]{
              String.valueOf(u.getId()),
                u.getNome(),
                u.getPermissao(),
                u.getEmail(),
                u.getTelefone(),
                u.getDataCadastro().toString(),
                u.getHoraCadastro().toString()
            };
            index++;
        }
        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);
        tabela.setModel(modeloTabela);
    }
}
