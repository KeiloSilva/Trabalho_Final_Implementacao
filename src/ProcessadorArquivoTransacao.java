import java.util.Date;
import java.text.ParseException;
import model.domain.TransacaoImportacao;
import java.text.SimpleDateFormat;
import java.util.List;


/**
 *
 * @author Keilo
 */
public class ProcessadorArquivoTransacao implements ProcessadorRowArquivo<TransacaoImportacao>{

    @Override
    public TransacaoImportacao getLinha(String linha,String cabecalho) throws ParseException {
        TransacaoImportacao dadosTransacao = new TransacaoImportacao();
        dadosTransacao.setDetalhe(linha.charAt(0));
        dadosTransacao.setNumeroconta(linha.substring(1, 8));
        dadosTransacao.setNumeroplastico(linha.substring(8,15));
        double valor_transacao = Double.parseDouble(linha.substring(15,27));
        dadosTransacao.setValortransacao(valor_transacao/100d);
     
        String dia, mes,ano,data;
        dia= linha.substring(27,29);
        mes= linha.substring(29,31);
        ano= linha.substring(31,35);
        data=dia+"/"+mes+"/"+ano;
        dadosTransacao.setDatatransacao(data);
        String hora= linha.substring(35,37);
        String min= linha.substring(37,39);
        String seg= linha.substring(39,41);
        String horario= hora+":"+min+":"+seg+"";
        
        dadosTransacao.setHoratransacao(horario);
        dadosTransacao.setCodigoestabelecimento(linha.substring(41,47));
        dadosTransacao.setNumeroLote(cabecalho.substring(1,4));
        dadosTransacao.setTipoLote(dadosTransacao.getTipoLote());
        return dadosTransacao;
    }   
}
