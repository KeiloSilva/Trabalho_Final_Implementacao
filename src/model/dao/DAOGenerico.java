/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.persistence.EntityManager;
import model.domain.Lote;

/**
 *
 * @author Keilo
 */
public class DAOGenerico<T extends Lote> {
    
    public void salvarAtualizar(T obj){
        
        EntityManager manager = Conection.getEntityManager();
        try{
            manager.getTransaction().begin();
            if(obj.getId() == null){
                
                 manager.persist(obj);
            }else{
                manager.merge(obj);
            }
            manager.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            manager.getTransaction().rollback();
        }
    }
}
