/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.util.List;
import model.dao.DAOGenerico;
import model.domain.Lote;

/**
 *
 * @author Keilo
 */
public class Service {
    
    private static DAOGenerico dt = new DAOGenerico();;
    
    public static void setDados_Banco(List<Lote> dados){
        
        for(int i=0;i<dados.size();i++){
              dt.salvarAtualizar(dados.get(i));
                    
        }
    }
}
