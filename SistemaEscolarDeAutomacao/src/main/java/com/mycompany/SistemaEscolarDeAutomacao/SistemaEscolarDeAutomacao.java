/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.SistemaEscolarDeAutomacao;

import com.mycompany.SistemaEscolarDeAutomacao.Dao.DAOOperacoes;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Horario;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Materia;
import com.mycompany.SistemaEscolarDeAutomacao.Entities.Sala;
import com.mycompany.SistemaEscolarDeAutomacao.Gui.Inicio.Inicio;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class SistemaEscolarDeAutomacao {

    public static void main(String[] args) {

        /*É muito importante deixar claro que o que se vê a seguir é uma solução manual não oficial*/
        // Fazendo o cadastro manual das entidades: Sala, Materia e Horario
        // Sala's:
        Sala sala1A = new Sala();
        sala1A.setNome("1A");

        // Cadastrando Sala:
        DAOOperacoes.cadastrarJPA(sala1A);

        // Materia's:
        Materia matematica = new Materia();
        matematica.setNome("Matemática");

        Materia portugues = new Materia();
        portugues.setNome("Português");

        Materia quimica = new Materia();
        quimica.setNome("Química");

        Materia biologia = new Materia();
        biologia.setNome("Biologia");

        Materia fisica = new Materia();
        fisica.setNome("Física");

        Materia geografia = new Materia();
        geografia.setNome("Geografia");

        Materia historia = new Materia();
        historia.setNome("História");

        // Cadastrando Materia's:
        DAOOperacoes.cadastrarJPA(matematica);
        DAOOperacoes.cadastrarJPA(portugues);
        DAOOperacoes.cadastrarJPA(quimica);
        DAOOperacoes.cadastrarJPA(biologia);
        DAOOperacoes.cadastrarJPA(fisica);
        DAOOperacoes.cadastrarJPA(geografia);
        DAOOperacoes.cadastrarJPA(historia);

        // Criando os horários:
        // Primeira hora da segunda:
        Horario Horario11A = new Horario();
        Horario11A.setDiaSemana("Segunda-feira");

        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime hora1 = LocalTime.parse("07:10:00", formatadorHora);
        Horario11A.setHoras(hora1);

        Horario11A.setOrdem(1);
        Horario11A.setMateriaDoHorario(matematica);
        Horario11A.setSala(sala1A);
        Horario11A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario11A);

        // Segunda hora da segunda:
        Horario Horario21A = new Horario();
        Horario21A.setDiaSemana("Segunda-feira");

        LocalTime hora2 = LocalTime.parse("08:00:00", formatadorHora);
        Horario21A.setHoras(hora2);

        Horario21A.setOrdem(2);
        Horario21A.setMateriaDoHorario(portugues);
        Horario21A.setSala(sala1A);
        Horario21A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario21A);

        // Terceira hora da segunda:
        Horario Horario31A = new Horario();
        Horario31A.setDiaSemana("Segunda-feira");

        LocalTime hora3 = LocalTime.parse("08:50:00", formatadorHora);
        Horario31A.setHoras(hora3);

        Horario31A.setOrdem(3);
        Horario31A.setMateriaDoHorario(biologia);
        Horario31A.setSala(sala1A);
        Horario31A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario31A);

        // Quarta hora da segunda:
        Horario Horario41A = new Horario();
        Horario41A.setDiaSemana("Segunda-feira");

        LocalTime hora4 = LocalTime.parse("10:10:00", formatadorHora);
        Horario41A.setHoras(hora4);

        Horario41A.setOrdem(4);
        Horario41A.setMateriaDoHorario(quimica);
        Horario41A.setSala(sala1A);
        Horario41A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario41A);

        // Quinta hora da segunda:
        Horario Horario51A = new Horario();
        Horario51A.setDiaSemana("Segunda-feira");

        LocalTime hora5 = LocalTime.parse("11:00:00", formatadorHora);
        Horario51A.setHoras(hora5);

        Horario51A.setOrdem(5);
        Horario51A.setMateriaDoHorario(fisica);
        Horario51A.setSala(sala1A);
        Horario51A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario51A);

        // Primeira hora da terça:
        Horario Horario61A = new Horario();
        Horario61A.setDiaSemana("Terça-feira");

        LocalTime hora6 = LocalTime.parse("07:10:00", formatadorHora);
        Horario61A.setHoras(hora6);

        Horario61A.setOrdem(1);
        Horario61A.setMateriaDoHorario(matematica);
        Horario61A.setSala(sala1A);
        Horario61A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario61A);

        // Segunda hora da terça:
        Horario Horario71A = new Horario();
        Horario71A.setDiaSemana("Terça-feira");

        LocalTime hora7 = LocalTime.parse("08:00:00", formatadorHora);
        Horario71A.setHoras(hora7);

        Horario71A.setOrdem(2);
        Horario71A.setMateriaDoHorario(portugues);
        Horario71A.setSala(sala1A);
        Horario71A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario71A);

        // Terceira hora da terça:
        Horario Horario81A = new Horario();
        Horario81A.setDiaSemana("Terça-feira");

        LocalTime hora8 = LocalTime.parse("08:50:00", formatadorHora);
        Horario81A.setHoras(hora8);

        Horario81A.setOrdem(3);
        Horario81A.setMateriaDoHorario(biologia);
        Horario81A.setSala(sala1A);
        Horario81A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario81A);

        // Quarta hora da terça:
        Horario Horario91A = new Horario();
        Horario91A.setDiaSemana("Terça-feira");

        LocalTime hora9 = LocalTime.parse("10:10:00", formatadorHora);
        Horario91A.setHoras(hora9);

        Horario91A.setOrdem(4);
        Horario91A.setMateriaDoHorario(quimica);
        Horario91A.setSala(sala1A);
        Horario91A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario91A);

        // Quinta hora da terça:
        Horario Horario101A = new Horario();
        Horario101A.setDiaSemana("Terça-feira");

        LocalTime hora10 = LocalTime.parse("11:00:00", formatadorHora);
        Horario101A.setHoras(hora10);

        Horario101A.setOrdem(5);
        Horario101A.setMateriaDoHorario(fisica);
        Horario101A.setSala(sala1A);
        Horario101A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario101A);

        // Primeira hora da quarta:
        Horario Horario111A = new Horario();
        Horario111A.setDiaSemana("Quarta-feira");

        LocalTime hora11 = LocalTime.parse("07:10:00", formatadorHora);
        Horario111A.setHoras(hora11);

        Horario111A.setOrdem(1);
        Horario111A.setMateriaDoHorario(matematica);
        Horario111A.setSala(sala1A);
        Horario111A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario111A);

        // Segunda hora da quarta:
        Horario Horario121A = new Horario();
        Horario121A.setDiaSemana("Quarta-feira");

        LocalTime hora12 = LocalTime.parse("08:00:00", formatadorHora);
        Horario121A.setHoras(hora12);

        Horario121A.setOrdem(2);
        Horario121A.setMateriaDoHorario(portugues);
        Horario121A.setSala(sala1A);
        Horario121A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario121A);

        // Terceira hora da quarta:
        Horario Horario131A = new Horario();
        Horario131A.setDiaSemana("Quarta-feira");

        LocalTime hora13 = LocalTime.parse("08:50:00", formatadorHora);
        Horario131A.setHoras(hora13);

        Horario131A.setOrdem(3);
        Horario131A.setMateriaDoHorario(biologia);
        Horario131A.setSala(sala1A);
        Horario131A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario131A);

        // Quarta hora da quarta:
        Horario Horario141A = new Horario();
        Horario141A.setDiaSemana("Quarta-feira");

        LocalTime hora14 = LocalTime.parse("10:10:00", formatadorHora);
        Horario141A.setHoras(hora14);

        Horario141A.setOrdem(4);
        Horario141A.setMateriaDoHorario(quimica);
        Horario141A.setSala(sala1A);
        Horario141A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario141A);

        // Quinta hora da quarta:
        Horario Horario151A = new Horario();
        Horario151A.setDiaSemana("Quarta-feira");

        LocalTime hora15 = LocalTime.parse("11:00:00", formatadorHora);
        Horario151A.setHoras(hora15);

        Horario151A.setOrdem(5);
        Horario151A.setMateriaDoHorario(fisica);
        Horario151A.setSala(sala1A);
        Horario151A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario151A);

        // Primeira hora da quinta:
        Horario Horario161A = new Horario();
        Horario161A.setDiaSemana("Quinta-feira");

        LocalTime hora16 = LocalTime.parse("07:10:00", formatadorHora);
        Horario161A.setHoras(hora16);

        Horario161A.setOrdem(1);
        Horario161A.setMateriaDoHorario(matematica);
        Horario161A.setSala(sala1A);
        Horario161A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario161A);

        // Segunda hora da quinta:
        Horario Horario171A = new Horario();
        Horario171A.setDiaSemana("Quinta-feira");

        LocalTime hora17 = LocalTime.parse("08:00:00", formatadorHora);
        Horario171A.setHoras(hora17);

        Horario171A.setOrdem(2);
        Horario171A.setMateriaDoHorario(portugues);
        Horario171A.setSala(sala1A);
        Horario171A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario171A);

        // Terceira hora da quinta:
        Horario Horario181A = new Horario();
        Horario181A.setDiaSemana("Quinta-feira");

        LocalTime hora18 = LocalTime.parse("08:50:00", formatadorHora);
        Horario181A.setHoras(hora18);

        Horario181A.setOrdem(3);
        Horario181A.setMateriaDoHorario(biologia);
        Horario181A.setSala(sala1A);
        Horario181A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario181A);

        // Quarta hora da quinta:
        Horario Horario191A = new Horario();
        Horario191A.setDiaSemana("Quinta-feira");

        LocalTime hora19 = LocalTime.parse("10:10:00", formatadorHora);
        Horario191A.setHoras(hora19);

        Horario191A.setOrdem(4);
        Horario191A.setMateriaDoHorario(quimica);
        Horario191A.setSala(sala1A);
        Horario191A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario191A);

        // Quinta hora da quinta:
        Horario Horario201A = new Horario();
        Horario201A.setDiaSemana("Quinta-feira");

        LocalTime hora20 = LocalTime.parse("11:00:00", formatadorHora);
        Horario201A.setHoras(hora20);

        Horario201A.setOrdem(5);
        Horario201A.setMateriaDoHorario(fisica);
        Horario201A.setSala(sala1A);
        Horario201A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario201A);

        // Primeira hora da sexta:
        Horario Horario211A = new Horario();
        Horario211A.setDiaSemana("Sexta-feira");

        LocalTime hora21 = LocalTime.parse("07:10:00", formatadorHora);
        Horario211A.setHoras(hora21);

        Horario211A.setOrdem(1);
        Horario211A.setMateriaDoHorario(matematica);
        Horario211A.setSala(sala1A);
        Horario211A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario211A);

        // Segunda hora da sexta:
        Horario Horario221A = new Horario();
        Horario221A.setDiaSemana("Sexta-feira");

        LocalTime hora22 = LocalTime.parse("08:00:00", formatadorHora);
        Horario221A.setHoras(hora22);

        Horario221A.setOrdem(2);
        Horario221A.setMateriaDoHorario(portugues);
        Horario221A.setSala(sala1A);
        Horario221A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario221A);

        // Terceira hora da sexta:
        Horario Horario231A = new Horario();
        Horario231A.setDiaSemana("Sexta-feira");

        LocalTime hora23 = LocalTime.parse("08:50:00", formatadorHora);
        Horario231A.setHoras(hora23);

        Horario231A.setOrdem(3);
        Horario231A.setMateriaDoHorario(biologia);
        Horario231A.setSala(sala1A);
        Horario231A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario231A);

        // Quarta hora da sexta:
        Horario Horario241A = new Horario();
        Horario241A.setDiaSemana("Sexta-feira");

        LocalTime hora24 = LocalTime.parse("10:10:00", formatadorHora);
        Horario241A.setHoras(hora24);

        Horario241A.setOrdem(4);
        Horario241A.setMateriaDoHorario(quimica);
        Horario241A.setSala(sala1A);
        Horario241A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario241A);

        // Quinta hora da Sexta:
        Horario Horario251A = new Horario();
        Horario251A.setDiaSemana("Sexta-feira");

        LocalTime hora25 = LocalTime.parse("11:00:00", formatadorHora);
        Horario251A.setHoras(hora25);

        Horario251A.setOrdem(5);
        Horario251A.setMateriaDoHorario(fisica);
        Horario251A.setSala(sala1A);
        Horario251A.setTurno("M");

        DAOOperacoes.cadastrarJPA(Horario251A);

        // Adicionando a lista de Horario's em Sala (sala1A)
        List<Horario> listaHorarios = new ArrayList<>();
        listaHorarios.add(Horario11A);
        listaHorarios.add(Horario21A);
        listaHorarios.add(Horario31A);
        listaHorarios.add(Horario41A);
        listaHorarios.add(Horario51A);
        listaHorarios.add(Horario61A);
        listaHorarios.add(Horario71A);
        listaHorarios.add(Horario81A);
        listaHorarios.add(Horario91A);
        listaHorarios.add(Horario101A);
        listaHorarios.add(Horario111A);
        listaHorarios.add(Horario121A);
        listaHorarios.add(Horario131A);
        listaHorarios.add(Horario141A);
        listaHorarios.add(Horario151A);
        listaHorarios.add(Horario161A);
        listaHorarios.add(Horario171A);
        listaHorarios.add(Horario181A);
        listaHorarios.add(Horario191A);
        listaHorarios.add(Horario201A);
        listaHorarios.add(Horario211A);
        listaHorarios.add(Horario221A);
        listaHorarios.add(Horario231A);
        listaHorarios.add(Horario241A);
        listaHorarios.add(Horario251A);

        sala1A.setHorarios(listaHorarios);

        Inicio.getInstance().setVisible(true);
    }
}
