/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Keilo
 */
public class Conection {
  
    private static EntityManagerFactory emf;
    private static Conection conexao;
    
    private Conection(){
        emf= Persistence.createEntityManagerFactory("SistemaImportacaoArquivosPU");
    }
    public synchronized static EntityManager getEntityManager(){
        if(conexao== null){
            conexao = new Conection();
        }
        return emf.createEntityManager();
    }
}
