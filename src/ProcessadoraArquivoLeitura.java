import model.domain.Lote;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.dao.DAOGenerico;

/**
*
* @author Keilo
*/
public class ProcessadoraArquivoLeitura<E extends Lote> {	
	private ProcessadorRowArquivo<E> processaArquivoLeitura;

	public ProcessadoraArquivoLeitura(ProcessadorRowArquivo<E> processa) {
		this.processaArquivoLeitura = processa;
	}
      
	public List<E> processaArquivo(List<String> listaString)
		throws IOException,ParseException,FileNotFoundException{
		    List<E> listaConta = new ArrayList<>();
			String headArquivo = listaString.get(0);
			listaString.remove(0);
		
			for (String linhaArquivo: listaString) {
				listaConta.add(processaArquivoLeitura.getLinha(linhaArquivo, headArquivo));
			}
		return listaConta; 		
	}
}
