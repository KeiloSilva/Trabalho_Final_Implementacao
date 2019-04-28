
import java.util.Arrays;
import java.io.File;

/**
 *
 * @author Keilo
 */
public class ListarArquivos {
    
	private File documentos_leitura;
	private File arquivos_leitura[];
       
    public File[] getArquivos(String diretorio){  
    	//TODO Desenvolver lógica do método getArquivos
    	 diretorio = System.getProperty("user.dir") + "/arquivos/";
         this.documentos_leitura = new File(diretorio);
         this.arquivos_leitura= documentos_leitura.listFiles();
         Arrays.sort(arquivos_leitura);
         return arquivos_leitura;
    }
}
