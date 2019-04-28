import model.domain.ClienteImportacao;
import model.domain.ContaImportacao;
import model.domain.PlasticoImportacao;
import model.domain.TransacaoImportacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Keilo
 */
public enum TipoProcessador {
    
    CLIENTE(new ProcessadorArquivoCliente()),
    CONTA(new ProcessadorArquivoConta()),
    TRANSACAO(new ProcessadorArquivoTransacao()),
    PLASTICO(new ProcessadorArquivoPlastico());
   
    private ProcessadorRowArquivo processadorLinha;
    
    TipoProcessador(ProcessadorRowArquivo processador){
       
       this.processadorLinha=processador;
     }
    /**
     * @return the processadorLinha
     */
    public ProcessadorRowArquivo getProcessadorLinha() {
        return processadorLinha;
    }
    
}
