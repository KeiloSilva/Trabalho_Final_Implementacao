

import java.text.ParseException;

import model.domain.Lote;

public interface ProcessadorRowArquivo<E extends Lote> {
	
	public E getLinha(String linha,String cabecalho) throws ParseException;

}
