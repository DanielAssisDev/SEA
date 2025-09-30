package com.mycompany.SistemaEscolarDeAutomacao.Gerais;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PlaceHolder {

    private static PlaceHolder instance;

    public static PlaceHolder getInstance() {
        if (instance == null) {
            instance = new PlaceHolder();
        } else {
            PlaceHolder.setInstance(null);
        }
        return instance;
    }

    public static void setInstance(PlaceHolder instance) {
        PlaceHolder.instance = instance;
    }

    public static void addPlaceHolder(JTextField campo) {
        Font font = campo.getFont();
        font = font.deriveFont(Font.ITALIC);
        campo.setFont(font);
        campo.setForeground(Color.GRAY);
    }

    public static void removePlaceHolder(JTextField campo) {
        Font font = campo.getFont();
        font = font.deriveFont(Font.PLAIN);
        campo.setFont(font);
        campo.setForeground(Color.BLACK);
    }

    public static void addPlaceHolderComboBox(JComboBox caixa) {
        Font font = caixa.getFont();
        font = font.deriveFont(Font.ITALIC);
        caixa.setFont(font);
        caixa.setForeground(Color.GRAY);

    }

    public static void removePlaceHolderComboBox(JComboBox caixa) {
        Font font = caixa.getFont();
        font = font.deriveFont(Font.PLAIN);
        caixa.setFont(font);
        caixa.setForeground(Color.BLACK);
    }
}
