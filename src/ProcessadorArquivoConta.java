import java.util.List;
import model.domain.ContaImportacao;
import java.text.ParseException;

/**
*
* @author Keilo
*/
public class ProcessadorArquivoConta implements ProcessadorRowArquivo<ContaImportacao> {
	
	@Override
	public ContaImportacao getLinha(String linha,String headConta) throws ParseException {
		ContaImportacao dadosConta = new ContaImportacao();
		
		dadosConta.setTipo(linha.charAt(1));
		dadosConta.setCpf(linha.substring(2,13));						
		dadosConta.setValorLimite(new Double(linha.substring(13,25)) / 100d);
		String dia = linha.substring(25,27);
		if (!dia.equals("__")) {
			dadosConta.setDiaVencimentoFatura(new Integer(dia));	
		} else {
			dadosConta.setDiaVencimentoFatura(null);
		}
		dadosConta.setNumeroConta(linha.substring(27,33));
		dadosConta.setLote(headConta.substring(1,4));
		dadosConta.setTipoLote(dadosConta.getTipoLote());
		return dadosConta;
	}
	
}
