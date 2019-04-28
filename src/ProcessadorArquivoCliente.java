import java.text.ParseException;
import model.domain.ClienteImportacao;
import java.util.List;
import java.text.SimpleDateFormat;

/**
*
* @author Keilo
*/

public class ProcessadorArquivoCliente implements ProcessadorRowArquivo<ClienteImportacao> {
	
	@Override
	public ClienteImportacao getLinha(String linha, String cabecalho) throws ParseException {
		ClienteImportacao dadosCliente = new ClienteImportacao();
		
		dadosCliente.setTipo(linha.charAt(1));
		dadosCliente.setCpf(linha.substring(2,13));
		dadosCliente.setNome(linha.substring(13,43).trim());
		dadosCliente.setEndereco(linha.substring(43,73).trim());
		dadosCliente.setBairro(linha.substring(73,103).trim());
		dadosCliente.setCidade(linha.substring(103,133).trim());
		dadosCliente.setEstado(linha.substring(133,135));
		String dataCadastro = linha.substring(135,143);
		String horaCadastro = linha.substring(143,149);
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
		dadosCliente.setDataHoraCadastro(sdf.parse(dataCadastro+" "+horaCadastro));
		dadosCliente.setTipoLote(dadosCliente.getTipoLote());
		dadosCliente.setNumeroLote(cabecalho.substring(1,4));
		return dadosCliente;
	}
}
