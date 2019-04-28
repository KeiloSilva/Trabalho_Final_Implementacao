import java.text.ParseException;
import java.util.List;
import model.domain.PlasticoImportacao;


/**
 *
 * @author Keilo
 */
public class ProcessadorArquivoPlastico implements ProcessadorRowArquivo<PlasticoImportacao>{

    @Override
    public PlasticoImportacao getLinha(String linha,String cabecalho) throws ParseException {
        PlasticoImportacao dadosPlastico = new PlasticoImportacao();
        dadosPlastico.setCpf(linha.substring(38, 49));
        dadosPlastico.setDetalhe(linha.charAt(0));
        dadosPlastico.setNumerodaconta(linha.substring(1, 8));
        dadosPlastico.setNome_inserido_plastico(linha.substring(8, 38));
        dadosPlastico.setNumero_plastico_gerado(linha.substring(49,56));
        dadosPlastico.setLote(cabecalho.substring(1,4));
        dadosPlastico.setTipoLote(dadosPlastico.getTipoLote());
        return dadosPlastico;       
        
    }
}
