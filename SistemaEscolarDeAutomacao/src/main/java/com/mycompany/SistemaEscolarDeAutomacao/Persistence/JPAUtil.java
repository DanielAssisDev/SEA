/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaEscolarDeAutomacao.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static String persistenceUnit = "SistemaEscolar";
    private static EntityManager man;
    private static EntityManagerFactory fac;

    public static EntityManager getman() {
       if(fac == null || !fac.isOpen()){
           fac = Persistence.createEntityManagerFactory(persistenceUnit);
       }
        if(man == null || !man.isOpen()){
            man = fac.createEntityManager();
        }
        return man;
    }

    public static void closeMan(){
        if(man.isOpen() && man != null){
            man.close();
            fac.close();
        }
    }

}
