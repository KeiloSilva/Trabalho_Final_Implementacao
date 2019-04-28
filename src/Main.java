import java.io.File;
import java.util.Set;
import java.util.List;
import model.domain.Lote;
import java.util.Map;
import model.dao.DAOGenerico;
import model.domain.ClienteImportacao;
import java.util.Arrays;

import model.service.Service;
/**
 *
 * @author Keilo
 */
public class Main {
    
    public static void main(String args[]) throws Exception {
	String directory = System.getProperty("user.directory") + "/src/arquivos/";
        File arquivos[];
             
        ListarArquivos ls = new ListarArquivos();
        arquivos= ls.getArquivos(directory);
        
        LeituraArquivo leitura = new LeituraArquivo();
        ProcessadoraArquivoLeitura processadora;
                
        for(int i=0;i<arquivos.length;i++){         
             
             List<String> lista = leitura.lerArquivo(directory + arquivos[i].getName());
             String nomeArquivo=  leitura.getNomeArquivoLeitura();
               
             processadora = new ProcessadoraArquivoLeitura( TipoProcessador.valueOf(nomeArquivo).getProcessadorLinha());
	     List<Lote> result = processadora.processaArquivo(lista);
               
                
            Service.setDados_Banco(result);
            lista.clear();
            result.clear();
        }
                
              
	}
}
